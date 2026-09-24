package com.nickuc.login;

import com.nickuc.login.api.enums.ServerConnectType;
import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.api.event.bungee.connection.DefineAuthServerEvent;
import com.nickuc.login.api.event.bungee.connection.ServerPreConnectEvent;
import com.nickuc.login.proxy.bungee.nLoginBungee;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ServerConnectEvent;
import net.md_5.bungee.api.event.ServerConnectedEvent;
import net.md_5.bungee.api.event.ServerSwitchEvent;
import net.md_5.bungee.event.EventHandler;

public class ψηβμοσςυγΛεπ implements χιςζΓθωφρο {
   private static int ab = Integer.reverse(268435456);
   private static long t = Long.reverse(66902738432552077L);
   private static long be = Long.reverse(-1518364330401862515L);
   private static int q = (-1 >>> 252 | -1 << ~252 + 1) & -1;
   private static long n = Long.reverse(-1585267068834414592L);
   private static int p = Integer.reverse(536870912);
   private static int bb = 0 >>> 233 | 0 << ~233 + 1;
   private static int y = Integer.reverse(-536870912);
   private final ΨγημιδξΓτοθαζ C;
   private static int al = Integer.reverse(-805306368);
   private final nLoginBungee e;
   private static int by = 134217728 >>> 251 | 134217728 << ~251 + 1;
   private static int bt = Integer.reverse(Integer.MIN_VALUE);
   private static int aq = 0 >>> 7 | 0 << ~7 + 1;
   private static int ah = Integer.reverse(1342177280);
   private static long af = Long.reverse(66902738432552077L);
   private static int ar = Integer.reverse(Integer.MIN_VALUE);
   private static long c;
   private static long cb = Long.reverse(66902738432552077L);
   private static int k = 524288 >>> 51 | 524288 << ~51 + 1;
   private static int bm = Integer.reverse(0);
   private static int a = Integer.reverse(0);
   private static int ba = Integer.reverse(1073741824);
   private static long av = Long.reverse(-1518364330401862515L);
   private static int bj = 0 >>> 238 | 0 << ~238 + 1;
   private static int bd = Integer.reverse(-1);
   private static int j = 0 >>> 76 | 0 << ~76 + 1;
   private static long ad = Long.reverse(-1518364330401862515L);
   private static int s = 1280 >>> 136 | 1280 << ~136 + 1;
   private static long b = Long.reverse(66902738432552077L);
   private static int cm = Integer.reverse(-2013265920);
   private static String[] b = new String[cm];
   private static int cl = (-2013265920 >>> 251 | -2013265920 << -251) & -1;
   private static int az = (512 >>> 41 | 512 << -41) & -1;
   private static long z = Long.reverse(-1518364330401862515L);
   private static int ap = (8192 >>> 141 | 8192 << -141) & -1;
   private static int ao = (8388608 >>> 183 | 8388608 << -183) & -1;
   private static int l = Integer.reverse(-1073741824);
   private static int at = Integer.reverse(805306368);
   private static int cg = Integer.reverse(-1073741824);
   private static int bq = 67108864 >>> 25 | 67108864 << ~25 + 1;
   private static long cf = Long.reverse(-1518364330401862515L);
   private static int ax = Integer.reverse(-1073741824);
   private static int br = (1572864 >>> 83 | 1572864 << ~83 + 1) & -1;
   private static long g = Long.reverse(-1585267068834414592L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int bk = Integer.reverse(Integer.MIN_VALUE);
   private static int bs = Integer.reverse(0);
   private static long m = Long.reverse(66902738432552077L);
   private static long r = Long.reverse(-1518364330401862515L);
   private static int bn = 196608 >>> 48 | 196608 << -48;
   private static int cj = Integer.reverse(1073741824);
   private static int bl = 262144 >>> 113 | 262144 << -113;
   private static int bv = Integer.reverse(0);
   private static long w = Long.reverse(-1518364330401862515L);
   private static int bz = 1048576 >>> 180 | 1048576 << -180;
   private static int bx = (0 >>> 58 | 0 << -58) & -1;
   private static long bg = Long.reverse(66902738432552077L);
   private static long aj = Long.reverse(-1585267068834414592L);
   private static long d = Long.reverse(-1585267068834414592L);
   private static int au = -1 >>> 80 | -1 << ~80 + 1;
   private static int bo = Integer.reverse(0);
   private static int ci = 1048576 >>> 148 | 1048576 << ~148 + 1;
   private static String[] a = new String[cl];
   private static long i = Long.reverse(-1518364330401862515L);
   private static long bh = Long.reverse(-1585267068834414592L);
   private static int ae = Integer.reverse(-1879048192);
   private static int bf = Integer.reverse(1879048192);
   private static int ac = Integer.reverse(-1);
   private static int am = Integer.reverse(-1);
   private static long u = Long.reverse(-1585267068834414592L);
   private static long cc = Long.reverse(-1585267068834414592L);
   private static int cd = Integer.reverse(134217728);
   private static int aa = Integer.reverse(1061158912);
   private static int ch = Integer.reverse(0);
   private static int h = Integer.reverse(1073741824);
   private static long ag = Long.reverse(-1585267068834414592L);
   private static int bp = '耀' >>> 143 | 32768 << -143;
   private static long an = Long.reverse(-1518364330401862515L);
   private static long f = Long.reverse(66902738432552077L);
   private static int ay = (0 >>> 213 | 0 << ~213 + 1) & -1;
   private static int ce = (-1 >>> 83 | -1 << ~83 + 1) & -1;
   private static int ck = Integer.reverse(0);
   private static int ak = Integer.reverse(0);
   private static int x = 0 >>> 209 | 0 << -209;
   private static int bi = Integer.reverse(-1073741824);
   private static int aw = Integer.reverse(0);
   private static int bc = (436207616 >>> 249 | 436207616 << ~249 + 1) & -1;
   private static int as = Integer.reverse(Integer.MIN_VALUE);
   private static int bw = (1 >>> 159 | 1 << ~159 + 1) & -1;
   private static int v = Integer.reverse(1610612736);
   private static int o = Integer.reverse(1061158912);
   private static long ai = Long.reverse(66902738432552077L);
   private static int bu = Integer.reverse(1073741824);
   private static int ca = 960 >>> 134 | 960 << ~134 + 1;

   @EventHandler
   public void a(ServerSwitchEvent var1) {
      ProxiedPlayer var2 = var1.getPlayer();
      if (var2.isConnected()) {
         try {
            if (var2.getPendingConnection().getVersion() < o) {
               ΨαχΨχΣλεΠψΦ var3 = this.e.b().a(var2);
               if (var3.S()) {
                  return;
               }

               ιηοψσγξςΩγδ var4 = this.C.a().b(var3);
               ((Ψογξκθθτ)this.C.b()).a(var3, var2.getServer().getInfo().getName(), Boolean.TRUE.equals(var4.a(πβκνλοΛκΠδΦτφλ.M)));
            }
         } catch (Throwable var5) {
            ψΓωτιμωκχψΛΨ.c(c<"㺀">(p & q, r) + var1.getClass().getSimpleName() + c<"㺃">(s, t ^ u) + var2.getName() + c<"㺆">(v, w), var5);
            var2.disconnect(TextComponent.fromLegacyText(c<"㺉">(y, z)));
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ψηβμοσςυγΛεπ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ζβησεθωυγτ.B("ċĭįďĳŒŊŠŌěřŏŝŗĠŅŧŦŞŤŞĳ", (byte)50, 66), ψηβμοσςυγΛεπ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            οοθδΨιοΦΠβδζ.C("ҮһҺѽҽҹҴҽӈҷ҄ӂӆҿӂӈҊࠤࠔࠐࠛࠟࠤࠤࠨࠗࠀࠛࠧҢ", (byte)50, 67) + var1 + ΣδτΠνεγοΓορητ.C("҅", (byte)50, 67) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   @EventHandler
   public void a(ServerConnectedEvent var1) {
      ProxiedPlayer var2 = var1.getPlayer();
      if (var2.isConnected()) {
         try {
            if (var2.getPendingConnection().getVersion() >= aa) {
               ΨαχΨχΣλεΠψΦ var3 = this.e.b().a(var2);
               if (var3.S()) {
                  return;
               }

               ιηοψσγξςΩγδ var4 = this.C.a().b(var3);
               ((Ψογξκθθτ)this.C.b()).a(var3, var2.getServer().getInfo().getName(), Boolean.TRUE.equals(var4.a(πβκνλοΛκΠδΦτφλ.M)));
            }
         } catch (Throwable var5) {
            ψΓωτιμωκχψΛΨ.c(c<"㺀">(ab & ac, ad) + var1.getClass().getSimpleName() + c<"㺃">(ae, af ^ ag) + var2.getName() + c<"㺆">(ah, ai ^ aj), var5);
            var2.disconnect(TextComponent.fromLegacyText(c<"㺉">(al & am, an)));
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 87L;
      var1 ^= -4666097025701676201L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(18 + 50),
                     (byte)(19 + 50),
                     (byte)(21 + 62),
                     47,
                     (byte)(64 + 3),
                     (byte)(34 + 32),
                     (byte)(60 + 7),
                     (byte)(23 + 24),
                     (byte)(50 + 30),
                     (byte)(46 + 29),
                     (byte)(58 + 9),
                     (byte)(72 + 11),
                     (byte)(35 + 18),
                     (byte)(79 + 1),
                     (byte)(33 + 64),
                     100,
                     (byte)(27 + 73),
                     (byte)(89 + 16),
                     (byte)(49 + 61),
                     (byte)(90 + 13)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(52 + 16), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ζβησεθωυγτ.B("úćĆÉĉąĀĉĔăÐĎĒċĎĔÖѰѠќѧѫѰѰѴѣьѧѳ", (byte)12, 66));
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

   private void b(ServerConnectEvent var1) {
      ProxiedPlayer var2 = var1.getPlayer();
      ΨαχΨχΣλεΠψΦ var3 = this.e.b().a(var2);
      if (!var3.S()) {
         if (!var3.R()) {
            var1.setCancelled((boolean)ao);
         } else {
            ιηοψσγξςΩγδ var4 = this.C.a().b(var3);
            if (!var4.a().b(οωλθςδυΛβσΨδγπ.f)) {
               ServerInfo var5 = var1.getTarget();
               String var6 = var5.getName();
               int var7 = var2.getServer() == null ? ap : aq;
               if (var7 == 0) {
                  if (!this.e.a(var4, var6)) {
                     var1.setCancelled((boolean)ar);
                  }
               } else {
                  var4.a(πβκνλοΛκΠδΦτφλ.M, Boolean.valueOf((boolean)as));
                  στΩξξχκι var8 = var4.a();
                  boolean var9 = this.C
                     .b()
                     .a()
                     .a(var3, var4, var8, var2.getUniqueId(), var2.getPendingConnection().isOnlineMode(), (InetSocketAddress)var2.getSocketAddress());
                  if (var9) {
                     if (ΨστμαυςτθΓΔ.g.ar()) {
                        String var10 = var8.a().a(c<"㺀">(at & au, av));
                        if (var10 != null && !this.e.a(var4, var10) && !ΨστμαυςτθΓΔ.h.a(new Object[aw]).contains(var10)) {
                           ServerInfo var11 = this.e.a().getServerInfo(var10);
                           if (var11 != null) {
                              ΨγημιδξΓτοθαζ var10000 = this.C;
                              EventEnum var10001 = EventEnum.SERVER_PRE_CONNECT;
                              Object[] var10002 = new Object[ax];
                              var10002[ay] = var3;
                              var10002[az] = ServerConnectType.WITH_LAST_SERVER;
                              var10002[ba] = var11;
                              ServerPreConnectEvent var12 = var10000.a(var10001, var10002);
                              if (this.C.callEvent(var12)) {
                                 var1.setTarget(var12.getServer());
                                 return;
                              }
                           }
                        }
                     }

                     if (ΨστμαυςτθΓΔ.i.ar()) {
                        List var16 = ΨστμαυςτθΓΔ.j
                           .a(new Object[bb])
                           .stream()
                           .map(var1x -> this.e.a().getServerInfo(var1x))
                           .filter(Objects::nonNull)
                           .collect(Collectors.toList());
                        if (var16.isEmpty()) {
                           String var21 = var4.j() ? c<"㺃">(bc & bd, be) : c<"㺆">(bf, bg ^ bh);
                           Object[] var32 = new Object[bi];
                           var32[bj] = var6;
                           var32[bk] = var16;
                           var32[bl] = ΨστμαυςτθΓΔ.j.a(new Object[bm]);
                           BaseComponent[] var24 = TextComponent.fromLegacyText(String.format(var21, var32));
                           var2.disconnect(var24);
                           return;
                        }

                        ServerInfo var19 = (ServerInfo)var16.get(ιχωυζπψημωΔτΦθ.a().nextInt(var16.size()));
                        ΨγημιδξΓτοθαζ var25 = this.C;
                        EventEnum var28 = EventEnum.SERVER_PRE_CONNECT;
                        Object[] var33 = new Object[bn];
                        var33[bo] = var3;
                        var33[bp] = ServerConnectType.WITH_CONFIGURED_SERVER;
                        var33[bq] = var19;
                        ServerPreConnectEvent var22 = var25.a(var28, var33);
                        if (this.C.callEvent(var22)) {
                           var1.setTarget(var22.getServer());
                           return;
                        }
                     }

                     ΨγημιδξΓτοθαζ var26 = this.C;
                     EventEnum var29 = EventEnum.SERVER_PRE_CONNECT;
                     Object[] var34 = new Object[br];
                     var34[bs] = var3;
                     var34[bt] = ServerConnectType.WITH_PLATFORM_SERVER;
                     var34[bu] = var5;
                     ServerPreConnectEvent var17 = var26.a(var29, var34);
                     if (this.C.callEvent(var17)) {
                        var1.setTarget(var17.getServer());
                        return;
                     }
                  }

                  if (ΨστμαυςτθΓΔ.d.ar()) {
                     if (!this.e.a(var4, var6)) {
                        var4.a(πβκνλοΛκΠδΦτφλ.L, var6);
                     }

                     List var18 = ΨστμαυςτθΓΔ.a
                        .a(new Object[bv])
                        .stream()
                        .map(var1x -> this.e.a().getServerInfo(var1x))
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList());
                     ServerInfo var20 = !var18.isEmpty() ? (ServerInfo)var18.get(ιχωυζπψημωΔτΦθ.a().nextInt(var18.size())) : null;
                     ΨγημιδξΓτοθαζ var27 = this.C;
                     EventEnum var30 = EventEnum.DEFINE_AUTH_SERVER;
                     Object[] var35 = new Object[bw];
                     var35[bx] = var3;
                     var35[by] = var20;
                     DefineAuthServerEvent var23 = var27.a(var30, var35);
                     this.C.callEvent(var23);
                     ServerInfo var13 = (ServerInfo)var23.getServer().orElse(null);
                     if (var13 == null) {
                        var1.setCancelled((boolean)bz);
                        String var14 = var4.j() ? c<"㺉">(ca, cb ^ cc) : c<"㺌">(cd & ce, cf);
                        Object[] var31 = new Object[cg];
                        var31[ch] = var6;
                        var31[ci] = var18;
                        var31[cj] = ΨστμαυςτθΓΔ.a.a(new Object[ck]);
                        BaseComponent[] var15 = TextComponent.fromLegacyText(String.format(var14, var31));
                        var2.disconnect(var15);
                        return;
                     }

                     var4.a(πβκνλοΛκΠδΦτφλ.F, var13.getName());
                     var1.setTarget(var13);
                  }
               }
            }
         }
      }
   }

   private static void b() {
      c = -5676889146963675392L;
      long var0 = c ^ -4666097025701676201L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(37 + 31),
               (byte)(30 + 39),
               83,
               (byte)(6 + 41),
               (byte)(8 + 59),
               (byte)(19 + 47),
               (byte)(55 + 12),
               (byte)(17 + 30),
               (byte)(16 + 64),
               (byte)(14 + 61),
               (byte)(30 + 37),
               (byte)(30 + 53),
               (byte)(35 + 18),
               (byte)(52 + 28),
               (byte)(27 + 70),
               (byte)(80 + 20),
               (byte)(68 + 32),
               (byte)(103 + 2),
               110,
               (byte)(72 + 31)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(34 + 35), 83}, StandardCharsets.UTF_8));
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
               b[0] = βεξΠθρρςΔΦμ.F("֞րփծ֦ղ֕֝֊֘քըվցֈ֢֟խ֪֣֫ք֓֍ն֍ֆֳֺֺּ֗", (byte)109, 70);
               b[1] = ντθΔζβΔζ.C("էհկմ\u0558ծիպՐՓ՞ՠռ\u0558ՔՑՀԾհքզՒՏՐ", (byte)109, 67);
               b[2] = οοθδΨιοΦΠβδζ.C("ՀՅՌՆլբըոԳԴսՄ", (byte)109, 67);
               b[3] = μεςΩΔΣγν.D(
                  "նԳՎՊՆ\u0557ԹՖյՌկհնԹշք՛ՙմքթԼՄֈ՞ւեՌըծ՝խ֍Ց\u058bբգճ\u0558֊֒֎֎֓ձՔփ֜ատսց֖֧֝զթ֙ֆֈևժկ֔հվֈ֦֍֊֯\u0590֦\u058bռֱֲֵֶ֛֢֑֖֬֠֡\u058bֵ׀ք֡֏ׇ֥֒֯",
                  (byte)109,
                  68
               );
               b[4] = χφπρψπφΦθμπ.F("֞րփծ֦ղ֕֝֊֘քըվցֈ֢֟խ֪֣֫ք֓֍ն֍ֆֳֺֺּ֗", (byte)109, 70);
               b[5] = δΛψπξκσβγςα.C("էհկմ\u0558ծիպՐՓ՞ՠռ\u0558ՔՑՀԾհքզՒՏՐ", (byte)109, 67);
               b[6] = ΨΦνΨΦωυΩνβςμ.B("ƝƢƩƣǉƿǅǕƐƑǚơ", (byte)109, 66);
               b[7] = ΣφδσΔζιΠρα.D(
                  "նԳՎՊՆ\u0557ԹՖյՌկհնԹշք՛ՙմքթԼՄֈ՞ւեՌըծ՝խ֍Ց\u058bբգճ\u0558֊֒֎֎֓ձՔփ֜ատսց֖֧֝զթ֙ֆֈևժկ֔հվֈ֦֍֊֯\u0590֦\u058bռֱֲֵֶ֛֢֑֖֬֠֡\u058bֵ׀ք֡֏ׇ֥֒֯",
                  (byte)109,
                  68
               );
               b[8] = πχσδΦΦνθΔπ.D("ձՓՖՁչՅըհ՝ի\u0557ԻՑՔ՛յղՀսնվ\u0557զՠՉՠՙժ֏ֆ֍֍", (byte)109, 68);
               b[9] = πχσδΦΦνθΔπ.E("֔֝֜֡օ֛֧֘սր\u058b֍֩օցվխիֱ֝֓տռս", (byte)109, 69);
               b[10] = ΠΛΨοδΩσμνΛγΦφβς.B("ƝƢƩƣǉƿǅǕƐƑǚơ", (byte)109, 66);
               b[11] = ΣδτΠνεγοΓορητ.E(
                  "֣ՠջշճքզփ֢չ֣֜֝զֱ֤ֈֆֱ֖֡թձֵ\u058b֯֒չ֛֕֊ֺ֚վָ֏\u0590֠օַֻֻֿ׀֞ցְ\u05c9֎֪֮֬׃ה\u05ca֖֓׆ֳִֵֵׁ֗֜֝֫דַֺלֽדָ֩\u05c8ף\u05cfעין־׃מ\u05cd\u05ceָע\u05edֱ\u05ceּ״גֿל",
                  (byte)109,
                  69
               );
               b[12] = βθκςνθΩθυμςτκχ.C("ճլՇի\u0530նՓՖԹջՎ՞ո՝բՖ՝չզշջՒՏՐ", (byte)109, 67);
               b[13] = μεςΩΔΣγν.B(
                  "ǁƱƮƮƭƖƭƐƕƖƪƾƿƿƺƛƯǘǙƳƱǓƺǂƿƷǘƿƪǫƽǃǉǓǅǴǶǧǷǨǍǃǎƺǵǓƲǒȂǾǳǻǡǯǲǒȂȋȈǥǡȈǢǏȊǛȐȏǔǎǩȘȕǥȒțǲȝȘǰǛȜǲȗǼǺȟȝȣȋȈǬȡȟǿȀȦȬȁȄȫȊȴȌȲǷȔȮȔǵȀȶȔȲȒȖɄǿșɁȆǽɊȢɄȯɁȺȎȟȞɄɖȫȶȢɎȩɆɕȰɎɉɂșɁɒɒɚȰȸɣɅɠȷȵɠȹɠȬɌȽɍɂɐȴȮɲɲɼɘȶȸɳɻɔɱȾȿɓȿɕɃɨɉɖɜʉɩɣɿʉʌɒɌʏɐɉɥʁɒɣʘʔʈʊɚʁʞʜɮʆʀɰʅʤʉɣʂɦɬʰʟɾʡʨʮʟʨɿʘʋʫʅʶʬʋɼʊʴʯʍɾʶʡʤʤʓˁʨʜʵʦʎʰʺʄʽʔˏˌ˓ʥˎʸ˕ˌ˔ʬʶʺ˖ʶʡ˅ʞ˅ʱˢʡ˟ˋ˛ʭʪʹʼˀ",
                  (byte)109,
                  66
               );
               b[14] = οΩνΩρωλΨηΛδωδ.B(
                  "ƩƦƋǆǒƍƱǎǒƯǇƦƲƳƒƿƬǌǚǜǄǚǟǆƻǜǬǛǝǉǨǙǀƪǧǨǱǠƶǯǛǷǰƵƷǪǘǎǗȂƾǼǆǂǩǁǧȌǛǬǜȇǊǦǡǲȐǔȔǿȖǥǳȅȇǾȟǱǙǝǢȗǳǱǦǶǽȤȡǼșȢȇȤǺȣȪȈȭȝȈǯȉȴȯȭȧǸȾȱȐȻȱȴȓɁǸɆȾȥɂȷȟɅȬȍțȩȬȝɈȏɕȎȒɋȶȵɆȸɒȲȳȫɜɖȴȼȿɛɈɖȡɫɖȼȽɋɅɩɲȬȽȳɰɀɑɒȵɸȹɅɹȾɝȾȿʃɴəɶʅȿɿɾɓɤʀɈʊɫɧɈɛɬʇʌɴʉɓʛɴʋɳɳɹɨʙɽɣɝʀɠʙʨɨɵʈɪʉɻʦʢʯʥʨʱɴɴʖʱɴʴʙʔɻʋʉɺʙʷʒʡ˄ʗʵʌʍ",
                  (byte)109,
                  66
               );
               b[15] = ΨφιωσρΓδΔθ.A(
                  "ǁƱƮƮƭƖƭƐƕƖƪƾƿƿƺƛƯǘǙƳƱǓƺǂƿƷǘƿƪǫƽǃǉǓǅǴǶǧǷǨǍǃǎƺǵǓƲǒȂǾǳǻǡǯǲǒȂȋȈǥǡȈǢǏȊǛȐȏǔǎǩȘȕǥȔǶȍǬǙǛǴȄȀǵțǧǟǾǜǣȄȉȀǾȭȇǻȞǾȦȢȲȸȪȧǶȌȩȲȰǺȴȲȯɀșȖǾȑȉȼȡȄȧɊɎȜɌɇȨɐɍȑȶȱȗȲȹȦȯȺȰɒȩɀȴȹɦȢȼȹɒȵȽȵȨȦɗɋȩȫɒɏɉȬȰɦɷɵɓɏɲɵɿȸɹɒɘɬɷɂɐɽɣɶɺɝɌɝɢʉɰɧɢʋʊɬɟɦʏɥʈɯɹʍɵʠɛɚɭʟɿɵʀɠɠʞɻɥʉɤʟɭʲʨʜʕʁʍʬʬʏʻʭʅʑʹʛʕɸʹʬ˅˅ʑʒ˄˂ʆʳʔʼʼʞ˄ˁʤʞ˅ˌʔʕʴʢʖ˄ˈ˙˘ʚ˘ʵˋʞ˒ʶʳʷ˕˃ʲ˃ʸʼˎˬʿ˰",
                  (byte)109,
                  65
               );
               b[16] = ΣδτΠνεγοΓορητ.A(
                  "ƩƦƋǆǒƍƱǎǒƯǇƦƲƳƒƿƬǌǚǜǄǚǟǆƻǜǬǛǝǉǨǙƿǓǳǍǴƮƵǙǗǰǑƺǊǨǖǭǝǾȃǚǁǽǵȀǷȄǋǉǢǹǎǰǛǬȉǠǷȍȕȔȘțǰǱȉǘǷȖǟȂǠȄǠȁǷǩǨȊȧȀǶȜȏȄȁȳȌǮȴȋȀȤȎȑǶȍȩȹȗșȪǵȌȄȗȏȘȦȸȬȈȭɈȟȼȼȋȩȑȤȮɕȸȗȨȍȰȏɏɜȸɌɝɄɛɆȴɇɤɇȪɘɣɬɘɇɇȣȯȰɳȮɕȩȶɌɴɅȺɭəɝɍɰɡɰȻɼɟɴȿɡɤɳɪɷɊɘʑɝʎʏɑʐʉɸɕɲɳʇʒʌɔʑɳʜʣʎʄɿɾʏɼɶʧʬɿʍʘʥʄʒʉʫʐʄʑʢʭɹʑʤʊʵʧʍɻʾʊɽʓʴˇɹ˂ʪʵɽʙˎʠ˅ʱˏ",
                  (byte)109,
                  65
               );
               break;
            case 1:
               b[0] = λΣΩσμφγχ.D("ձՓՖՁչՅըհ՝ի\u0557ԻՑՔ՛յղՀսնվՠֆ\u058bռ՜։\u0590Ցփ֍֔", (byte)109, 68);
               b[1] = μζξτΩσσφυδεπλΨ.F("֔֝֜֡օ֛֧֘սրֈյջո֝֏րֲֶ֯փ֥ռս", (byte)109, 70);
               b[2] = ζοηκορΦνΣθγΩ.C("ղՍՂյ\u0530ՄՇպթ՝սՄ", (byte)109, 67);
               b[3] = φΨαξωυθανΣφυκη.A(
                  "ǓƐƫƧƣƴƖƳǒƩǌǍǓƖǔǡƸƶǑǡǆƙơǥƻǟǂƩǅǋƺǊǪƮǨƿǀǐƵǧǯǫǫǰǎƱǠǹƾǜǚǞǳȄǺǃǆǶǣǥǤǇǌǱǍǛǥȃǪǧȌǭȃǨǙǸȓǿȒȉȏǮǳȎǽǹȤǵȩșǩȃǫȨǬȆȱȊȌȠȡȉȤȘȹȲȜȁ", (byte)109, 65
               );
               b[4] = ξψθρΣΠΣς.D("ձՓՖՁչՅըհ՝ի\u0557ԻՑՔ՛յղՀսնվՠվԾվիգռձ՛ձՍ", (byte)109, 68);
               b[5] = χΠξΦιζΨΣωΦσΨζ.C("էհկմ\u0558ծիպՐՓ՛\u0557նԹոՖցՒճՔզՒՏՐ", (byte)109, 67);
               b[6] = βεξΠθρρςΔΦμ.B("ƾƐƋƎǕƩƲǓǌǙƓơ", (byte)109, 66);
               b[7] = ΠΛΨοδΩσμνΛγΦφβς.D(
                  "նԳՎՊՆ\u0557ԹՖյՌկհնԹշք՛ՙմքթԼՄֈ՞ւեՌըծ՝խ֍Ց\u058bբգճ\u0558֊֒֎֎֓ձՔփ֜ատսց֖֧֝զթ֙ֆֈևժկ֔հվֈ֦֍֊֯\u0590֦\u058bռֱֲֵֶ֛֢֑֖֬֠֘ֆֹ֧֖֢֫֜։ֲ֎\u05caׂאֱיֻ֪֤֚֘֕֘",
                  (byte)109,
                  68
               );
               b[8] = ΠΛΨοδΩσμνΛγΦφβς.B("ǎưƳƞǖƢǅǍƺǈƴƘƮƱƸǒǏƝǚǓǛƱƚǥǖƺƾǎƬǗƻǑǛǴǞǐǦǡǕǙǧǑǜǁ", (byte)109, 66);
               b[9] = ντθΔζβΔζ.F("֔֝֜֡օ֛֧֘սր֊֟֩ֈջ֪֤հִ֣֤֏ռս", (byte)109, 70);
               b[10] = ζοηκορΦνΣθγΩ.C("գկՊիԱշնըԻիՋՄ", (byte)109, 67);
               b[11] = ΠΛΨοδΩσμνΛγΦφβς.B(
                  "ǓƐƫƧƣƴƖƳǒƩǌǍǓƖǔǡƸƶǑǡǆƙơǥƻǟǂƩǅǋƺǊǪƮǨƿǀǐƵǧǯǫǫǰǎƱǠǹƾǜǚǞǳȄǺǃǆǶǣǥǤǇǌǱǍǛǥȃǪǧȌǭȃǨǙǸȓǿȒȉȏǮǳȎǽǻǨȄȔȡȫȌȅȧȈǿȤȧȕȎȀǰȓǫȘȗȌȁ", (byte)109, 66
               );
               b[12] = ΨΦνΨΦωυΩνβςμ.F("֠֙մ֘՝֣րփզ֨պթ֮ռ֮տֈ֟֩֊ծֵռս", (byte)109, 70);
               b[13] = ΦδφπθΩΩλζξ.E(
                  "֑ցվվսզսՠեզպ֎֏֏֊իտ֨֩փց֣֊֒֏և֨֏պֻ֍֣֓֙֕ׄ׆ַׇָ֝֓֞֊ׅ֣ւ֢ג\u05ce׃\u05cbֱֿׂ֢גכטֱֵטֲ֟ך֫נןֹ֤֞רץֵע\u05ebׂ\u05edר׀֫\u05ecׂק\u05cc\u05caׯ\u05ed׳כטּױׯ\u05cfא\u05f6\u05fcבה\u05fbך\u0604ל\u0602ׇפ\u05feפׅא؆פ\u0602עצؔ\u05cfשؑז\u05cdؚײؔ\u05ffؑ؊מׯ\u05eeؔئ\u05fb؆ײ؞\u05f9ؖإ\u0600؞ؙؒשؑآآت\u0600؈سؕذ؇\u0605ذ؉ذ\u05fc\u061c؍؝ؒؠ\u0604\u05feققٌب؆؈كًؤف؎؏أ؏إؓظؙئجٙعسُٜٙآ\u061cٟؠؙصّآس٨٤٘ٚتّٮ٬ؾِٖـٕٴٙسْضؼڀٯَٱٸپٯٸُ٨ٛٻٕچټٌٛٚڄٿَٝچٱٴٴ٣ڑٸ٬څٶٞڀڊٔڍ٤ڟڜڣٵڞڈڥڜڤټچڊڦچٱڕٮڕڅڃڢڷٵڇڷڙڰڝڰ",
                  (byte)109,
                  69
               );
               b[14] = βεξΠθρρςΔΦμ.C(
                  "ՌՉԮթյ\u0530ՔձյՒժՉՕՖԵբՏկստէսւթ՞տ֏վրլ\u058bռգՍ֊\u058b֔փՙ֒վ֚֓\u0558՚֍ջձպ֥ա֟թե\u058cդ֊֯վ֏տ֪խ։քֳ֕շַֹ֢ֈׂ֖֪֨֡֔ռրօֺ֖֔։ׇׇּׅ֪֙֠ׄ֟֝׆\u05cd֫א׀֫֒֬חגא\u05ca֛סהֳמהחֶפ֛שס\u05c8ץךׂר\u05cfְ־\u05cc\u05cf׀\u05ebֲ\u05f8ֱֵ\u05eeיטשכ\u05f5וז\u05ce\u05ff\u05f9חןע\u05fe\u05eb\u05f9ׄ؎\u05f9ןנ\u05eeר،ؕ\u05cfנזؓף״\u05f5ט؛לר\u061cס\u0600סעئؗ\u05fcؙبעآء\u05f6؇أ\u05ebح؎؊\u05eb\u05fe؏تدؗج\u05f6ؾؗخؖؖ\u061c؋ؼؠ؆\u0600أ\u0603ؼً؋ؘث؍ج؞ىمْؤًؗؗعٔؗٗؼظٌٗسِٖ١ؠكأؽ٘دذ",
                  (byte)109,
                  67
               );
               b[15] = θεωψξβΛσσ.C(
                  "դՔՑՑՐԹՐԳԸԹՍաբբ՝ԾՒջռՖՔն՝եբ՚ջբՍ֎ՠզլնը֗֙֊֚\u058bհզձ՝֘նՕյ֥֖֡֞ք֒֕յ֥֮֫ֈք֫օղ֭վֲֳշձ\u058cָֻֈְַ֙֏ռվ֧֣֗֘־֊ւ֡տֆ֧֣֬֡אׁ֪֞֡\u05c9ׅוכ\u05cd\u05ca֙֯\u05ccוד֝חוגףִֹּ֡֬ן֧ׄ\u05ca\u05edױֿׯת\u05cb׳װִיהֺול\u05c9גםד\u05f5\u05ccףחל؉ׅןל\u05f5טנט\u05cb\u05c9\u05fa\u05ee\u05cc\u05ce\u05f5ײ\u05ec\u05cfד؉ؘؚ\u05f6ײؘؕآכ\u061c\u05f5\u05fb؏ؚץ׳ؠ؆ؙ؝\u0600ׯ\u0600\u0605جؓ؊\u0605خح؏\u0602؉ز؈ثؒ\u061cذؘك\u05fe\u05fdؐقآؘأ\u0603\u0603ف؞؈ج؇قًٕؐؿظؤذُُزِٞبشٜؾظ؛ُٜ٨٨شص٧٥ةٖطٟٟف٧٤هف٨ٯطظٗمع٧٫ټٻؽٻ٘ٮفٵٖٙٞڈ١نٜمڄٍ٤ڏٴ",
                  (byte)109,
                  67
               );
               b[16] = φΨαξωυθανΣφυκη.D(
                  "ՌՉԮթյ\u0530ՔձյՒժՉՕՖԵբՏկստէսւթ՞տ֏վրլ\u058bռբն֖հ֗Ց\u0558ռպ֓մ՝խ\u058bչ\u0590ր֦֡սդ֣֧֚֠֘ծլօ֜ձ֓վ֏֬փְַָֻ֚־֓֔֬ջֹ֚ւ֥փ֧փ֤֚\u058c\u058b֭\u05caֲֿ֣֧֤֙ז֑֯חְֱִׇ֣֮֙\u05ccלֺּ\u05cdֲֺֻ֧֘֯\u05c9כ\u05cf֫א\u05ebׂןן֮\u05ccִׇב\u05f8כֺ\u05cbְדֲײ\u05ffכׯ\u0600ק\u05feשחת؇ת\u05cd\u05fb؆؏\u05fbתת׆גדؖב\u05f8\u05ccיׯؗרםؐ\u05fc\u0600װؓ\u0604ؓמ؟\u0602ؗע\u0604؇ؖ؍ؚ\u05ed\u05fbش\u0600رز״سج؛\u05f8ؕؖتصد\u05f7شؖؿنراآءز؟ؙيُآذػواصجَساشمِ\u061cشهح٘يذ؞١حؠضٗ٪ؠٚ١٥٠٥نؾٓٝؿ",
                  (byte)109,
                  68
               );
               break;
            case 2:
               b[0] = μζξτΩσσφυδεπλΨ.B("ƌƌƢƠǁǄƸƑǐƯƹƙǗƬƗǉƝƟƭƞơƾǕǟǧǊǞǁǇǯǱǪ", (byte)109, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = πψυκΠΨμΛΩβΣφμφσ.C("դԱՠՅլմձոՓՇՔՊշփԻն՞նՔգՖֈՏՐ", (byte)109, 67);
         }
      }
   }

   @Generated
   public ψηβμοσςυγΛεπ(nLoginBungee var1, ΨγημιδξΓτοθαζ var2) {
      this.e = var1;
      this.C = var2;
   }

   @EventHandler(
      priority = 32
   )
   public void a(ServerConnectEvent var1) {
      if (!var1.isCancelled()) {
         try {
            this.b(var1);
         } catch (Throwable var3) {
            ψΓωτιμωκχψΛΨ.c(c<"㺀">(a, b ^ d) + var1.getClass().getSimpleName() + c<"㺃">(e, f ^ g) + var1.getPlayer().getName() + c<"㺆">(h, i), var3);
            var1.setCancelled((boolean)k);
            var1.getPlayer().disconnect(TextComponent.fromLegacyText(c<"㺉">(l, m ^ n)));
         }
      }
   }
}
