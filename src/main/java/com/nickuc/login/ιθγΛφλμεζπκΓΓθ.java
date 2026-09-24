package com.nickuc.login;

import com.nickuc.login.api.enums.ServerConnectType;
import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.api.event.velocity.connection.DefineAuthServerEvent;
import com.nickuc.login.api.event.velocity.connection.ServerPreConnectEvent;
import com.nickuc.login.proxy.velocity.nLoginVelocity;
import com.velocitypowered.api.event.PostOrder;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.player.PlayerChooseInitialServerEvent;
import com.velocitypowered.api.event.player.ServerPostConnectEvent;
import com.velocitypowered.api.event.player.ServerPreConnectEvent.ServerResult;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.ServerConnection;
import com.velocitypowered.api.proxy.server.RegisteredServer;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class ιθγΛφλμεζπκΓΓθ implements ωΩΩαομοΣψΩ {
   private static long f = Long.reverse(-3530781212475344562L);
   private static int bx = Integer.reverse(-2013265920);
   private static long as = Long.reverse(-7782220156096217088L);
   private static int ao = (-1 >>> 248 | -1 << -248) & -1;
   private static int ak = Integer.reverse(-805306368);
   private static int t = (-1 >>> 5 | -1 << -5) & -1;
   private static int ax = Integer.reverse(1073741824);
   private static long bw = Long.reverse(6557281952834566478L);
   private static int bj = 1610612736 >>> 29 | 1610612736 << -29;
   private static long m = Long.reverse(6557281952834566478L);
   private static int e = Integer.MIN_VALUE >>> 31 | Integer.MIN_VALUE << -31;
   private static long ac = Long.reverse(-7782220156096217088L);
   private static String[] b = new String[ιθγΛφλμεζπκΓΓθ.cl];
   private static int ck = 1610612738 >>> 253 | 1610612738 << ~253 + 1;
   private static long j = Long.reverse(6557281952834566478L);
   private static int ay = (0 >>> 89 | 0 << -89) & -1;
   private static int bb = Integer.reverse(-268435456);
   private final ΨγημιδξΓτοθαζ F;
   private static int cc = Integer.reverse(Integer.MIN_VALUE);
   private static long x = Long.reverse(6557281952834566478L);
   private static int ca = Integer.reverse(-1073741824);
   private static int bl = 128 >>> 167 | 128 << -167;
   private static int bs = (268435456 >>> 251 | 268435456 << -251) & -1;
   private static long am = Long.reverse(6557281952834566478L);
   private static int be = -1073741824 >>> 30 | -1073741824 << -30;
   private static int bg = Integer.reverse(Integer.MIN_VALUE);
   private static int at = Integer.reverse(0);
   private static int bi = Integer.reverse(0);
   private static int an = (6291456 >>> 51 | 6291456 << ~51 + 1) & -1;
   private static long ar = Long.reverse(-3530781212475344562L);
   private static int az = (448 >>> 101 | 448 << -101) & -1;
   private static int bh = Integer.reverse(1073741824);
   private static int ce = 0 >>> 177 | 0 << -177;
   private static int br = Integer.reverse(0);
   private static int z = Integer.reverse(0);
   private static int bo = Integer.reverse(0);
   private final nLoginVelocity e;
   private static long o = Long.reverse(6557281952834566478L);
   private static long ba = Long.reverse(6557281952834566478L);
   private static int q = Integer.reverse(-1);
   private static int bf = 0 >>> 26 | 0 << -26;
   private static int cd = 1048576 >>> 51 | 1048576 << -51;
   private static int by = Integer.reverse(-1);
   private static long bz = Long.reverse(6557281952834566478L);
   private static int au = Integer.reverse(-1073741824);
   private static int p = Integer.reverse(-1610612736);
   private static long c;
   private static int aj = Integer.reverse(0);
   private static long cj = Long.reverse(-7782220156096217088L);
   private static long ci = Long.reverse(-3530781212475344562L);
   private static int av = Integer.reverse(0);
   private static int y = 1024 >>> 106 | 1024 << ~106 + 1;
   private static int bp = (512 >>> 41 | 512 << ~41 + 1) & -1;
   private static int cg = Integer.reverse(0);
   private static long ab = Long.reverse(-3530781212475344562L);
   private static String[] a = new String[ck];
   private static long bd = Long.reverse(6557281952834566478L);
   private static int l = Integer.reverse(-1073741824);
   private static int bn = Integer.reverse(-1073741824);
   private static int ad = (1152 >>> 7 | 1152 << ~7 + 1) & -1;
   private static int bm = (2 >>> 64 | 2 << ~64 + 1) & -1;
   private static int n = Integer.reverse(536870912);
   private static int w = 14336 >>> 171 | 14336 << ~171 + 1;
   private static int k = 0 >>> 167 | 0 << -167;
   private static int cf = Integer.reverse(Integer.MIN_VALUE);
   private static int bc = -1 >>> 92 | -1 << -92;
   private static int v = (0 >>> 150 | 0 << ~150 + 1) & -1;
   private static long b = Long.reverse(-3530781212475344562L);
   private static int a = Integer.reverse(0);
   private static int aq = Integer.reverse(-1342177280);
   private static int bu = Integer.reverse(Integer.MIN_VALUE);
   private static long r = Long.reverse(6557281952834566478L);
   private static int aa = Integer.reverse(268435456);
   private static int ah = Integer.reverse(-1);
   private static int aw = (268435456 >>> 188 | 268435456 << -188) & -1;
   private static int bv = (512 >>> 229 | 512 << ~229 + 1) & -1;
   private static long ap = Long.reverse(6557281952834566478L);
   private static long u = Long.reverse(6557281952834566478L);
   private static int ch = Integer.reverse(1207959552);
   private static int cb = (0 >>> 35 | 0 << -35) & -1;
   private static int i = Integer.reverse(-1);
   private static int s = (24576 >>> 204 | 24576 << ~204 + 1) & -1;
   private static long af = Long.reverse(6557281952834566478L);
   private static long d = Long.reverse(-7782220156096217088L);
   private static int ae = (-1 >>> 148 | -1 << ~148 + 1) & -1;
   private static long ai = Long.reverse(6557281952834566478L);
   private static int bk = 0 >>> 140 | 0 << -140;
   private static int ag = Integer.reverse(1342177280);
   private static int cl = (805306369 >>> 124 | 805306369 << -124) & -1;
   private static long g = Long.reverse(-7782220156096217088L);
   private static int bt = 0 >>> 68 | 0 << -68;
   private static int bq = (16777216 >>> 87 | 16777216 << -87) & -1;
   private static int h = Integer.reverse(1073741824);
   private static int al = (-1 >>> 209 | -1 << -209) & -1;

   static {
      b();
   }

   @Subscribe(
      order = PostOrder.LAST
   )
   public void a(PlayerChooseInitialServerEvent var1) {
      try {
         this.b(var1);
      } catch (Throwable var3) {
         ψΓωτιμωκχψΛΨ.c(c<"㺀">(a, b ^ d) + var1.getClass().getSimpleName() + c<"㺃">(e, f ^ g) + var1.getPlayer().getUsername() + c<"㺆">(h & i, j), var3);
         var1.getPlayer().disconnect(ΩτωνοφχεΠ.a(c<"㺉">(l, m)));
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 41L;
      var1 ^= -339191670496359761L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(13 + 55),
                     (byte)(18 + 51),
                     (byte)(14 + 69),
                     (byte)(20 + 27),
                     67,
                     (byte)(5 + 61),
                     (byte)(47 + 20),
                     (byte)(34 + 13),
                     (byte)(79 + 1),
                     (byte)(30 + 45),
                     (byte)(10 + 57),
                     (byte)(42 + 41),
                     (byte)(15 + 38),
                     (byte)(24 + 56),
                     97,
                     (byte)(60 + 40),
                     (byte)(89 + 11),
                     (byte)(34 + 71),
                     (byte)(36 + 74),
                     (byte)(3 + 100)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(47 + 21), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(μζξτΩσσφυδεπλΨ.B("ôāĀÃăÿúăĎýÊĈČąĈĎÐћћїрѬѢѤўѠѫѦрсѧ", (byte)9, 66));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         a[var0] = new String(var3.doFinal(Base64.getDecoder().decode(b[var0])), StandardCharsets.UTF_8);
      }

      return a[var0];
   }

   private void b(PlayerChooseInitialServerEvent var1) {
      Player var2 = var1.getPlayer();
      ΨαχΨχΣλεΠψΦ var3 = this.e.b().a(var2);
      if (!var3.S()) {
         ιηοψσγξςΩγδ var4 = this.F.a().b(var3);
         if (!var4.a().b(οωλθςδυΛβσΨδγπ.f)) {
            Optional var5 = var1.getInitialServer();
            String var6 = var5.<String>map(var0 -> var0.getServerInfo().getName()).orElse(c<"㺀">(an & ao, ap));
            στΩξξχκι var7 = var4.a();
            boolean var8 = this.F.b().a().a(var3, var4, var7, var2.getUniqueId(), var2.isOnlineMode(), var2.getRemoteAddress());
            var4.a(πβκνλοΛκΠδΦτφλ.E, var8);
            if (var8) {
               if (ΨστμαυςτθΓΔ.g.ar()) {
                  String var9 = var7.a().a(c<"㺃">(aq, ar ^ as));
                  if (var9 != null && !this.e.a(var4, var9) && !ΨστμαυςτθΓΔ.h.a(new Object[at]).contains(var9)) {
                     Optional var10 = this.e.a().getServer(var9);
                     if (var10.isPresent()) {
                        RegisteredServer var11 = (RegisteredServer)var10.get();
                        ΨγημιδξΓτοθαζ var10000 = this.F;
                        EventEnum var10001 = EventEnum.SERVER_PRE_CONNECT;
                        Object[] var10002 = new Object[au];
                        var10002[av] = var3;
                        var10002[aw] = ServerConnectType.WITH_LAST_SERVER;
                        var10002[ax] = var11;
                        ServerPreConnectEvent var12 = var10000.a(var10001, var10002);
                        if (this.F.callEvent(var12)) {
                           var1.setInitialServer(var12.getServer());
                           return;
                        }
                     }
                  }
               }

               if (ΨστμαυςτθΓΔ.i.ar()) {
                  List var15 = ΨστμαυςτθΓΔ.j
                     .a(new Object[ay])
                     .stream()
                     .map(var1x -> this.e.a().getServer(var1x))
                     .map(var0 -> (RegisteredServer)var0.orElse(null))
                     .filter(Objects::nonNull)
                     .collect(Collectors.toList());
                  if (var15.isEmpty()) {
                     var1.setInitialServer(null);
                     String var20 = var4.j() ? c<"㺆">(az, ba) : c<"㺉">(bb & bc, bd);
                     Object[] var32 = new Object[be];
                     var32[bf] = var6;
                     var32[bg] = var15;
                     var32[bh] = ΨστμαυςτθΓΔ.a.a(new Object[bi]);
                     String var23 = String.format(var20, var32);
                     var2.disconnect(ΩτωνοφχεΠ.a(var23));
                     return;
                  }

                  RegisteredServer var18 = (RegisteredServer)var15.get(ιχωυζπψημωΔτΦθ.a().nextInt(var15.size()));
                  ΨγημιδξΓτοθαζ var25 = this.F;
                  EventEnum var28 = EventEnum.SERVER_PRE_CONNECT;
                  Object[] var33 = new Object[bj];
                  var33[bk] = var3;
                  var33[bl] = ServerConnectType.WITH_CONFIGURED_SERVER;
                  var33[bm] = var18;
                  ServerPreConnectEvent var21 = var25.a(var28, var33);
                  if (this.F.callEvent(var21)) {
                     var1.setInitialServer(var21.getServer());
                     return;
                  }
               }

               if (var5.isPresent()) {
                  ΨγημιδξΓτοθαζ var26 = this.F;
                  EventEnum var29 = EventEnum.SERVER_PRE_CONNECT;
                  Object[] var34 = new Object[bn];
                  var34[bo] = var3;
                  var34[bp] = ServerConnectType.WITH_PLATFORM_SERVER;
                  var34[bq] = var5.get();
                  ServerPreConnectEvent var16 = var26.a(var29, var34);
                  if (this.F.callEvent(var16)) {
                     var1.setInitialServer(var16.getServer());
                     return;
                  }
               }
            }

            if (ΨστμαυςτθΓΔ.d.ar()) {
               var5.<String>map(var0 -> var0.getServerInfo().getName())
                  .filter(var2x -> (boolean)(!this.e.a(var4, var2x) ? cf : cg))
                  .ifPresent(var1x -> var4.a(πβκνλοΛκΠδΦτφλ.L, var1x));
               List var17 = ΨστμαυςτθΓΔ.a
                  .a(new Object[br])
                  .stream()
                  .map(var1x -> this.e.a().getServer(var1x))
                  .map(var0 -> (RegisteredServer)var0.orElse(null))
                  .filter(Objects::nonNull)
                  .collect(Collectors.toList());
               RegisteredServer var19 = !var17.isEmpty() ? (RegisteredServer)var17.get(ιχωυζπψημωΔτΦθ.a().nextInt(var17.size())) : null;
               ΨγημιδξΓτοθαζ var27 = this.F;
               EventEnum var30 = EventEnum.DEFINE_AUTH_SERVER;
               Object[] var35 = new Object[bs];
               var35[bt] = var3;
               var35[bu] = var19;
               DefineAuthServerEvent var22 = var27.a(var30, var35);
               this.F.callEvent(var22);
               RegisteredServer var24 = (RegisteredServer)var22.getServer().orElse(null);
               if (var24 == null) {
                  String var13 = var4.j() ? c<"㺌">(bv, bw) : c<"㺏">(bx & by, bz);
                  Object[] var31 = new Object[ca];
                  var31[cb] = var6;
                  var31[cc] = var17;
                  var31[cd] = ΨστμαυςτθΓΔ.a.a(new Object[ce]);
                  String var14 = String.format(var13, var31);
                  var2.disconnect(ΩτωνοφχεΠ.a(var14));
                  return;
               }

               var4.a(πβκνλοΛκΠδΦτφλ.F, var24.getServerInfo().getName());
               var1.setInitialServer(var24);
            }
         }
      }
   }

   @Generated
   public ιθγΛφλμεζπκΓΓθ(nLoginVelocity var1, ΨγημιδξΓτοθαζ var2) {
      this.e = var1;
      this.F = var2;
   }

   @Subscribe
   public void a(ServerPostConnectEvent var1) {
      Player var2 = var1.getPlayer();

      try {
         ΨαχΨχΣλεΠψΦ var3 = this.e.b().a(var2);
         if (var3.S()) {
            return;
         }

         ((Ψογξκθθτ)this.F.b())
            .a(
               var3,
               ((ServerConnection)var2.getCurrentServer().orElseThrow(() -> new IllegalStateException(c<"㺀">(ch, ci ^ cj)))).getServerInfo().getName(),
               (boolean)(var1.getPreviousServer() == null ? y : z)
            );
      } catch (Throwable var4) {
         ψΓωτιμωκχψΛΨ.c(c<"㺀">(aa, ab ^ ac) + var1.getClass().getSimpleName() + c<"㺃">(ad & ae, af) + var2.getUsername() + c<"㺆">(ag & ah, ai), var4);
         var2.disconnect(ΩτωνοφχεΠ.a(c<"㺉">(ak & al, am)));
      }
   }

   @Subscribe(
      order = PostOrder.LAST
   )
   public void a(com.velocitypowered.api.event.player.ServerPreConnectEvent var1) {
      if (var1.getResult().isAllowed()) {
         Player var2 = var1.getPlayer();
         if (!var2.isActive()) {
            var1.setResult(ServerResult.denied());
         } else {
            try {
               ΨαχΨχΣλεΠψΦ var3 = this.e.b().a(var2);
               if (var3.S()) {
                  return;
               }

               ιηοψσγξςΩγδ var4 = this.F.a().b(var3);
               if (var4.a().b(οωλθςδυΛβσΨδγπ.f)) {
                  return;
               }

               Optional var5 = var1.getResult().getServer();
               if (!var5.isPresent() || !this.e.a(var4, ((RegisteredServer)var5.get()).getServerInfo().getName()) && !var4.d(πβκνλοΛκΠδΦτφλ.E)) {
                  var1.setResult(ServerResult.denied());
               }
            } catch (Throwable var6) {
               ψΓωτιμωκχψΛΨ.c(c<"㺀">(n, o) + var1.getClass().getSimpleName() + c<"㺃">(p & q, r) + var2.getUsername() + c<"㺆">(s & t, u), var6);
               var1.setResult(ServerResult.denied());
               var2.disconnect(ΩτωνοφχεΠ.a(c<"㺉">(w, x)));
            }
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ιθγΛφλμεζπκΓΓθ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(λΣΩσμφγχ.C("ЄЦШЈЬыуљхДђшіѐЙоѠџїѝїЬ", (byte)13, 67), ιθγΛφλμεζπκΓΓθ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            χΠξΦιζΨΣωΦσΨζ.F("ԬԹԸӻԻԷԲԻՆԵԂՀՄԽՀՆԈ\u0893\u0893\u088fࡸࢤ࢚࢜\u0896࢘ࢣ࢞ࡸࡹ࢟Ԣ", (byte)13, 70) + var1 + ςΦζσμτΓσ.F("ԃ", (byte)13, 70) + var2.toString(),
            var4
         );
      }
   }

   private static void b() {
      c = 8258778515460325619L;
      long var0 = c ^ -339191670496359761L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(59 + 9),
               (byte)(31 + 38),
               (byte)(26 + 57),
               (byte)(42 + 5),
               (byte)(9 + 58),
               (byte)(10 + 56),
               (byte)(29 + 38),
               47,
               (byte)(18 + 62),
               (byte)(50 + 25),
               (byte)(37 + 30),
               (byte)(75 + 8),
               (byte)(8 + 45),
               (byte)(11 + 69),
               (byte)(68 + 29),
               (byte)(90 + 10),
               100,
               (byte)(58 + 47),
               (byte)(40 + 70),
               (byte)(32 + 71)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(32 + 37), 83}, StandardCharsets.UTF_8));
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
               b[0] = ςπυηννναΣ.B("ǘǀƔǐƻǢǚǘƾǙƩƹǁƥǟƻǊƽǯǬǌǕƳǬǗǪǊǼǌǏǒǍ", (byte)116, 66);
               b[1] = ΨφιωσρΓδΔθ.B("ƗǌǠƻƹơƤǅƷǛǔƢƼǂǨǙƩƺƺǣǭǳƺƻ", (byte)116, 66);
               b[2] = ΣφδσΔζιΠρα.A("ǉǋƸƕƯǘǜǘƹǜǘƯ", (byte)116, 65);
               b[3] = ζοηκορΦνΣθγΩ.A("ƜǀǁǘǍǦǒƻƶǧǝƼǧƿƺƭǟǏǜǲǟǶǀƮǱƯưǻǵǔǟǼǋǎǚƺǯȆǰǨǺǂǈǘǫǋǞȆȊǨǤǒȏǵȅȆȒȖȖȆțǺȞǚȔȒǼȌȏȐǲȢǧȖȠȡȋȚǿǻǻȌȝǮȎȟȪȃȓǷǴȔȤȾȸț", (byte)116, 65);
               b[4] = βεξΠθρρςΔΦμ.B("ǘǀƔǐƻǢǚǘƾǙƩƹǁƥǟƻǊƽǯǬǌǕƳǬǗǪǊǼǌǏǒǍ", (byte)116, 66);
               b[5] = μεςΩΔΣγν.E("ՠ֕֩քւժխ֎ր֤֝իօ\u058bֱ֢ղփփֶּ֬փք", (byte)116, 69);
               b[6] = πψυκΠΨμΛΩβΣφμφσ.F("֒֔ց՞ո֥֡֡ւ֥֡ո", (byte)116, 70);
               b[7] = ΣφδσΔζιΠρα.F(
                  "ե։֊֖֛֡֯քտְ֦օְֈփնֻֿ֥֨֘֨։շֺոչׄ־ׅ֣֝֨֔֗փָ\u05cfֱֹ׃\u058bִ֑֧֡֔\u05cfדֱ֛֭ט־\u05ce\u05cfכןן\u05cfפ׃ק֣םכׅוטיֻ\u05ebְןשתהף\u05c8ׄׄוצַחר׳\u05ccל׀ֽם\u05ed؇\u0601פ",
                  (byte)116,
                  70
               );
               b[8] = ΣδτΠνεγοΓορητ.B("ǘǀƔǐƻǢǚǘƾǙƩƹǁƥǟƻǊƽǯǬǌǕƳǬǗǪǊǼǌǏǒǍ", (byte)116, 66);
               b[9] = λΣΩσμφγχ.F("ՠ֕֩քւժխ֎ր֤֝իօ\u058bֱ֢ղփփֶּ֬փք", (byte)116, 70);
               b[10] = θεωψξβΛσσ.D("ճյբԿՙւֆւգֆւՙ", (byte)116, 68);
               b[11] = οΩνΩρωλΨηΛδωδ.B("ƜǀǁǘǍǦǒƻƶǧǝƼǧƿƺƭǟǏǜǲǟǶǀƮǱƯưǻǵǔǟǼǋǎǚƺǯȆǰǨǺǂǈǘǫǋǞȆȊǨǤǒȏǵȅȆȒȖȖȆțǺȞǚȔȒǼȌȏȐǲȢǧȖȠȡȋȚǿǻǻȌȝǮȎȟȪȃȓǷǴȔȤȾȸț", (byte)116, 66);
               b[12] = ΠΛΨοδΩσμνΛγΦφβς.E("՟֤֙֘ըւժժխվտո", (byte)116, 69);
               b[13] = μζξτΩσσφυδεπλΨ.F("ռ֖֞ոշ֣կֲ֢լֆ֦էֳַ֤֧֪֭֕֗ֆփք", (byte)116, 70);
               b[14] = ΣφδσΔζιΠρα.D(
                  "Ղ\u058bՖ՛զՏ՚ք\u058cՊվւըօմղբֆ֖կ\u058bթպ֊՞֞֙գղզ֓ֈբւլլ֝֠քթֱթְյ֊֒ժֹօֈծ\u058c֩֊ׂ֮֠յ֜օ֏ֺ֗ևּ֪֚\u05cb\u05c9ֱ֢֮֫֩֫דחִ֧֭֠ח֚֫֔֝חָםׁ֭ףֱ֢ׅ\u05c9֜הס׃ָר֩\u05ce\u05c9קײֿקׇׁא\u05ed\u05caךִחֵֺֺֽ\u05ceס\u05ce\u05f6\u05fa؇؊ם׆פ\u05ff؍\u0601\u05ebלؓ\u0601\u05ecקשגؐק؉װײ\u05ec؎ל\u05fd\u061cכ؋\u05ffף\u0605צؕ\u0600״ب\u05f7؇أ\u05ecأ\u05feر؋؟\u05ee\u0603\u05f5؏ؒئة؍؎ػؘشؙدك\u05ff\u0600\u0605ؙظ\u0604آ؆ؤكلؚّيث؞اضه؟ذئعَدتىشٞؾٗلٛٝذ١ٗزؤٞىضاؾّٰٯٜٔـٱ٤ٷٲٌنٓ٭ٶػٕٞٓفّ٦٤٘كمٖ٥ٗلٽڀى١ِٰ٢ٵچڒٗٸڄڄٕڋښ٭٠ٗڎڐٝڒپڡڨږ",
                  (byte)116,
                  68
               );
               b[15] = βθκςνθΩθυμςτκχ.A(
                  "ƶǟƾǞǎƺǅǖơǥǟƴǊƩƽƦǮǨǤǋǩǎǷǁǇǫǹƻǬǒǶǳǻǀǸǮǥǝȁǞǺǺǡǵȋȁǜǜǫǈǦǋǟǨǱǔǯȁȏǗǕǓǝȊǷǫǚǝǞȒǷȗǤȆȠȧǶȊȧȣȚȨǨȇǿǽǲǮȦȫǳȚȲșǻȒȖȚɂȬȢǼȝȞȡȆȀțȝȜȩɇȂȲȽȎȏȪȑȠȒȣȸɐȲɈȲȞɍɋɛȺȺȞȸȥɀɄȷȝɅɫȽɎɘɯɨȼɃɮɍɤɠȶɲɸɨɒɕəɮɪɕɺʂɣɯɕɒɷɫɻɝəɞɆɎɾɿɒɔɶʕɟɖɒɰɸɨɥɻʝɚʑʌɣɡʎʅʞɤʉʓʂʈʘɷʆɬʠʌʅʇʟʄʥʲʱʸʤʍʐʏʮʒˁʀʭʐʦʡʙʜʕʝʶˋʙʧˉʞʏˀʐ˒ʝʚʛ",
                  (byte)116,
                  65
               );
               b[16] = μεςΩΔΣγν.D(
                  "Ղ\u058bՖ՛զՏ՚ք\u058cՊվւըօմղբֆ֖կ\u058bթպ֊՞֞֙գղզ֓ֈբւլլ֝֠քթֱթְյ֊֒ժֹօֈծ\u058c֩֊ׂ֮֠յ֜օ֏ֺ֗ևּ֪֚\u05cb\u05c9ֱֱֵ֢֪ׅ֮֮֫֩֒֟\u05caג֖דדכ֩אֵּ֥זֳיל֠ץך֫ם׆ןפנ֥ג\u05f6השיױד\u05eb֮\u05ec\u05cc\u05c8טַ\u0601מ\u0602ב\u05ee\u05ff׃׃\u05fdה\u05f9\u05faען\u05fb\u05f9؍ؒ؍ג\u05c8\u05ed\u05f9؏\u05ed؏ט؝\u05ecמ\u05f5ׯ\u05f7ײ\u05feئ\u0602י\u0601פ؋\u05ff\u0604ץإ\u0605؇ةؚ؞ب\u05ecذ\u05f6ثظث\u0603״ئؑع؉دظ\u061cؙع؎ذؘؔ؟؊،أَُب؍ٍمتّئةمةؑةضيؾؽسةدرّلْئ؟ٔاإؾإ٪ٛلكمٝهّقٍخٸي٭ػٰٔ٨٩ٷڂَٙفٲٗمٝ٦پؾم٩٠٪ڀ٧چًُ٬ٷ٩٩ڒٛږٗژّٹ٪ٟڗڞڃڧٺڝڪ",
                  (byte)116,
                  68
               );
               b[17] = ΦδφπθΩΩλζξ.F(
                  "տ֨և֧֗փ֎֟ժ֮֨ս֓ղֆկֱֲַ֭֔֗׀֊\u0590ִׂքֵּֿ֛֩ֆ֟׆ֿ։֗֜\u05cb\u05c9ֵָׂ֑֜ה\u0590֨\u05cf\u05ceא׆ִִ֨֩היׄץדֳָׁ\u05ca֢֫֫ן֢ױ֨\u05edֳ־\u05f5ׁקֵקף֮תרט\u05cc\u0600\u05fd׃כװ\u0600סע\u05fd\u05c8ם\u0601\u05cb\u05c8\u05faא؉\u05fbמא׳ؓ؈\u05edרؓ\u05fbי؞י؍נ؞םם\u061c\u05fd؎ס\u05faإ\u05f7ؙؖإؖ\u0603\u061cؐ،؛ث؝\u05feؤذ،؎،\u05f6غ\u05f8ضتؚد\u05f5ؿإقائعظ؇ظؾؚ\u061cٌ؉ؒ؋ِِيُِِ٘كمٗؼؗدؽرلٝءٗءٚء٩ٜ١ؽٖٯئؼجز٧ٌٖشضي٤٤يٳٵ٩ِٙځ٣پٚٱڇڃنٺڄٞڇ٫١ٌٟلچٲٔږڗږٔٙٸڔٕډ٬ٷڐڌښڝٴڟڤٻ",
                  (byte)116,
                  70
               );
               b[18] = λΣΩσμφγχ.B("ǡǌƿǣǏǍǖǙǞǒǢƸǄǖƥǊǫǊǎǮǫƧǅǓǄǪǖǇǨƼǦǶǉǷǺǽǣǥǻǘǘǱǿǻǤǪǋǭǧǜȂǮȌǟǌȖǑȃǺǻȏȈșȋȐǸȊǶǞȗǘȢȅȨǻȈȖȭȪȧȍǮȯǲȍȟȢȒȎȤȴȚȶȏȲȶ", (byte)116, 66);
               break;
            case 1:
               b[0] = λΣΩσμφγχ.F("֡։՝֙ք֣֫֡և֢ղւ֊ծ֨ք֓ֆֵָ֕֝֊֍֭֝׀վֱ֑֯־", (byte)116, 70);
               b[1] = ΦδφπθΩΩλζξ.C("Ձն֊եգՋՎկաօտծժկևղ։յշ֞֙֍դե", (byte)116, 67);
               b[2] = βεξΠθρρςΔΦμ.D("՚ս՟ըՇլՠՠաի֊ՙ", (byte)116, 68);
               b[3] = οοθδΨιοΦΠβδζ.A(
                  "ƜǀǁǘǍǦǒƻƶǧǝƼǧƿƺƭǟǏǜǲǟǶǀƮǱƯưǻǵǔǟǼǋǎǚƺǯȆǰǨǺǂǈǘǫǋǞȆȊǨǤǒȏǵȅȆȒȖȖȆțǺȞǚȔȒǼȌȏȐǲȢǧȖȠȡȋȚǿǻǻȌȝǮȎȓȠȷȖȳǵȲȺǶȬȲǺȗȓȳǽȠȑȆɂȄȦȏ", (byte)116, 65
               );
               b[4] = οοθδΨιοΦΠβδζ.E("֡։՝֙ք֣֫֡և֢ղւ֊ծ֨ք֓ֆֵָ֕֨\u058cրֹּ֯֯֍ց֟պֈ׀ֿ֜ׄ֎և\u05c8׃֨֊֘", (byte)116, 69);
               b[5] = ζοηκορΦνΣθγΩ.F("ՠ֕֩քւժխ֎ր֤֝լ֣֝ֈև֤֛֚֘յ֬փք", (byte)116, 70);
               b[6] = φΨαξωυθανΣφυκη.D("՚Յզ՚ՆիսՏտդՏՙ", (byte)116, 68);
               b[7] = βθκςνθΩθυμςτκχ.E(
                  "ե։֊֖֛֡֯քտְ֦օְֈփնֻֿ֥֨֘֨։շֺոչׄ־ׅ֣֝֨֔֗փָ\u05cfֱֹ׃\u058bִ֑֧֡֔\u05cfדֱ֛֭ט־\u05ce\u05cfכןן\u05cfפ׃ק֣םכׅוטיֻ\u05ebְןשתהף\u05c8ׄׄוצַחיך\u05edײ\u0600ֽׄ\u05ceט\u05fcֺ\u0605תתפ\u05eb\u0603؇קױ\u0605כט",
                  (byte)116,
                  69
               );
               b[8] = λΣΩσμφγχ.A("ǘǀƔǐƻǢǚǘƾǙƩƹǁƥǟƻǊƽǯǬǌǒƴǕǉƹǏǚǆǵǷƼ", (byte)116, 65);
               b[9] = φΨαξωυθανΣφυκη.C("Ձն֊եգՋՎկաօվըՎւձդ՚\u058cս\u0590՛շդե", (byte)116, 67);
               b[10] = ζβησεθωυγτ.C("ցջՖ՛ՌդտՐՈ՛դՙ", (byte)116, 67);
               b[11] = ντθΔζβΔζ.A("ƜǀǁǘǍǦǒƻƶǧǝƼǧƿƺƭǟǏǜǲǟǶǀƮǱƯưǻǵǔǟǼǋǎǚƺǯȆǰǨǺǂǈǘǫǋǞȆȊǨǤǒȏǵȅȆȒȖȖȆțǺȞǚȔȒǼȌȏȐǲȢǧȖȠȡȋȚǿǻǻȌȝǮȎȝȋȐǲȲȱȎȩȐȞȬȮȽȢȝȐȢɆȏȤȥɈȏ", (byte)116, 65);
               b[12] = χφπρψπφΦθμπ.B("ƮǍƚƬǁǍǃǥƲƺǊƯ", (byte)116, 66);
               b[13] = ιΠοθΩΦξκ.B("ƳǕǍƯƮǚƦǙǩƣƺǓƨǗƿǃǡǯƻǳǤǳƺƻ", (byte)116, 66);
               b[14] = φδχεθοκψαλΛογλ.B(
                  "ƘǡƬƱƼƥưǚǢƠǔǘƾǛǊǈƸǜǬǅǡƿǐǠƴǴǯƹǈƼǩǞƸǘǂǂǳǶǚƿȇƿȆǋǠǨǀȏǛǞǄǢǿǠǶȘȄǋǲǛǥȐǭǝȀȒǰȡȟȁȄȇǸǿȁȩȭǶǽȃȊȭȁǪǳǰȭȎȳȗȃȹȇǸțȟǲȪȷșȎȾǿȤȟȽɈȕȽȝȗȦɃȠȰȊȭȋȐȐȓȤȷȤɌɐɝɠȳȜȺɕɣɗɁȲɩɗɂȽȿȨɦȽɟɆɈɂɤȲɓɲȱɡɕȹɛȼɫɖɊɾɍɝɹɂɹɔʇɡɵɄəɋɥɨɼɿɣɤʑɮʊɯʅʙɕɖɛɯʎɚɸɜɺʙʚɰʧʠʁɴɽʌʝɵʆɼʏʤʅʀʟʊʴʔʭʚʱʳʆʷʭʈɺʴʟʌɽʔˆʧ˅ʪʲʖˇʺˍˈʢʜʩ˃ˌʑʫʴʩʗʧʼʺʮʙʛʬʻʭʚ˓˖ʟʷˆʦʸˋ˜˨ʭˎ˚˚ʫˡ˰ˊʳʱʸ˶ˊˏʻ˺ʻʼ",
                  (byte)116,
                  66
               );
               b[15] = ςΦζσμτΓσ.B(
                  "ƶǟƾǞǎƺǅǖơǥǟƴǊƩƽƦǮǨǤǋǩǎǷǁǇǫǹƻǬǒǶǳǻǀǸǮǥǝȁǞǺǺǡǵȋȁǜǜǫǈǦǋǟǨǱǔǯȁȏǗǕǓǝȊǷǫǚǝǞȒǷȗǤȆȠȧǶȊȧȣȚȨǨȇǿǽǲǮȦȫǳȚȲșǻȒȖȚɂȬȢǼȝȞȡȆȀțȝȜȩɇȂȲȽȎȏȪȑȠȒȣȸɐȲɈȲȞɍɋɛȺȺȞȸȥɀɄȷȝɅɫȽɎɘɯɨȼɃɮɍɤɠȶɲɸɨɒɕəɮɪɕɺʂɣɯɕɒɷɫɻɝəɞɆɎɾɿɒɔɶʕɟɖɒɰɸɨɥɻʝɚʑʌɣɡʎʅʞɤʉʓʂʈʘɷʆɬʠʌʅʇʟʄʥʲʱʸʤʍʐʏʮʒˁʀʭʐʦʡʙʜʕʝˆʾʉʽˁʉʣʄ˄ˎ˓ʚʛ",
                  (byte)116,
                  66
               );
               b[16] = πψυκΠΨμΛΩβΣφμφσ.D(
                  "Ղ\u058bՖ՛զՏ՚ք\u058cՊվւըօմղբֆ֖կ\u058bթպ֊՞֞֙գղզ֓ֈբւլլ֝֠քթֱթְյ֊֒ժֹօֈծ\u058c֩֊ׂ֮֠յ֜օ֏ֺ֗ևּ֪֚\u05cb\u05c9ֱֱֵ֢֪ׅ֮֮֫֩֒֟\u05caג֖דדכ֩אֵּ֥זֳיל֠ץך֫ם׆ןפנ֥ג\u05f6השיױד\u05eb֮\u05ec\u05cc\u05c8טַ\u0601מ\u0602ב\u05ee\u05ff׃׃\u05fdה\u05f9\u05faען\u05fb\u05f9؍ؒ؍ג\u05c8\u05ed\u05f9؏\u05ed؏ט؝\u05ecמ\u05f5ׯ\u05f7ײ\u05feئ\u0602י\u0601פ؋\u05ff\u0604ץإ\u0605؇ةؚ؞ب\u05ecذ\u05f6ثظث\u0603״ئؑع؉دظ\u061cؙع؎ذؘؔ؟؊،أَُب؍ٍمتّئةمةؑةضيؾؽسةدرّلْئ؟ٔاإؾإ٪ٛلكمٝهّقٍخٸي٭ػٰٔ٨٩ٷڂَٙفٲٗمٝ٦پؾم٩٠٪ڀ٧چًُ٬ٷ٩٩ڒٛږٗژڞ٘پڛٯ٤ڜٟڅڃڡ",
                  (byte)116,
                  68
               );
               b[17] = ΣδτΠνεγοΓορητ.E(
                  "տ֨և֧֗փ֎֟ժ֮֨ս֓ղֆկֱֲַ֭֔֗׀֊\u0590ִׂքֵּֿ֛֩ֆ֟׆ֿ։֗֜\u05cb\u05c9ֵָׂ֑֜ה\u0590֨\u05cf\u05ceא׆ִִ֨֩היׄץדֳָׁ\u05ca֢֫֫ן֢ױ֨\u05edֳ־\u05f5ׁקֵקף֮תרט\u05cc\u0600\u05fd׃כװ\u0600סע\u05fd\u05c8ם\u0601\u05cb\u05c8\u05faא؉\u05fbמא׳ؓ؈\u05edרؓ\u05fbי؞י؍נ؞םם\u061c\u05fd؎ס\u05faإ\u05f7ؙؖإؖ\u0603\u061cؐ،؛ث؝\u05feؤذ،؎،\u05f6غ\u05f8ضتؚد\u05f5ؿإقائعظ؇ظؾؚ\u061cٌ؉ؒ؋ِِيُِِ٘كمٗؼؗدؽرلٝءٗءٚء٩ٜ١ؽٖٯئؼجز٧ٌٖشضي٤٤يٳٵ٩ِٙځ٣پٚٱڇڃنٺڄٞڇ٫١ٌٟلچٲٔږڗږٔٙٸڔٕٶڠڏڕښڔڙٞڄړٟ",
                  (byte)116,
                  69
               );
               b[18] = θεωψξβΛσσ.C(
                  "\u058bնթ֍չշրփֈռ\u058cբծրՏմ֕մո֘֕Ցկսծ֔րձ֒զ\u0590֠ճ֤֧֡֍֏֥ււ֛֥֩֎֔յ֑֗ֆֶ֬֘։ն׀ջֲֹ֤֥֭׃ִֵֺ֢֠ֈׁւ\u05cc֯גֲ֥׀חהבַ֘יַ֜\u05ca֘י֯\u05cfף֢לֵּׁש\u05cc־\u05cb֥֩כֽׅ֮\u05ccֹ",
                  (byte)116,
                  67
               );
               break;
            case 2:
               b[0] = θεωψξβΛσσ.D("չՠիև՝ՁՊֆկ՜\u058bձՈֆ\u058bցճիհՕ֕֝դե", (byte)116, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = ΠΛΨοδΩσμνΛγΦφβς.E("֣ցշ֩֬էա֡ր֞֡֊\u0590֣֕և֍֓օ֔կ֖փք", (byte)116, 69);
         }
      }
   }
}
