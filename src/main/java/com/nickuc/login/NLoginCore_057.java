package com.nickuc.login;

import com.nickuc.login.lib.jda.api.EmbedBuilder;
import com.nickuc.login.lib.jda.api.JDA;
import com.nickuc.login.lib.jda.api.JDABuilder;
import com.nickuc.login.lib.jda.api.OnlineStatus;
import com.nickuc.login.lib.jda.api.components.MessageTopLevelComponent;
import com.nickuc.login.lib.jda.api.components.actionrow.ActionRow;
import com.nickuc.login.lib.jda.api.components.actionrow.ActionRowChildComponent;
import com.nickuc.login.lib.jda.api.components.buttons.Button;
import com.nickuc.login.lib.jda.api.entities.Activity;
import com.nickuc.login.lib.jda.api.entities.Message;
import com.nickuc.login.lib.jda.api.entities.MessageEmbed;
import com.nickuc.login.lib.jda.api.interactions.commands.OptionType;
import com.nickuc.login.lib.jda.api.interactions.commands.build.CommandData;
import com.nickuc.login.lib.jda.api.interactions.commands.build.Commands;
import com.nickuc.login.lib.jda.api.managers.Presence;
import com.nickuc.login.lib.jda.api.requests.restaction.CommandListUpdateAction;
import com.nickuc.login.lib.jda.api.utils.messages.MessageCreateBuilder;
import com.nickuc.login.lib.jda.api.utils.messages.MessageCreateData;
import com.nickuc.login.lib.jda.internal.utils.IOUtil;
import com.nickuc.login.lib.jda.lib.okhttp3.Credentials;
import com.nickuc.login.lib.jda.lib.okhttp3.OkHttpClient.Builder;
import java.awt.Color;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_057 implements NLoginInterface_038 {
   private static long d = Long.reverse(49987063873036120L);
   private static long as = Long.reverse(-238243312278675624L);
   private static int by = 0 >>> 192 | 0 << -192;
   private static long dt = Long.reverse(-288230376151711744L);
   private static int dk = Integer.reverse(1610612736);
   private static int q = Integer.reverse(-1);
   private static long ev = Long.reverse(-288230376151711744L);
   private static long cd = Long.reverse(49987063873036120L);
   private static int ek = Integer.reverse(0);
   private static long eu = Long.reverse(49987063873036120L);
   private static long w = Long.reverse(-238243312278675624L);
   private static int y = Integer.reverse(-1);
   private static int di = Integer.reverse(Integer.MIN_VALUE);
   private static int ca = (24 >>> 160 | 24 << ~160 + 1) & -1;
   private final NLoginCore_308 b;
   private static int at = 16384 >>> 138 | 16384 << -138;
   private static long r = Long.reverse(-238243312278675624L);
   private static long ax = Long.reverse(49987063873036120L);
   private static int ao = (224 >>> 228 | 224 << ~228 + 1) & -1;
   private static int du = Integer.reverse(Integer.MIN_VALUE);
   private static int s = Integer.reverse(-536870912);
   private static int v = Integer.reverse(-1);
   private static long ad = Long.reverse(49987063873036120L);
   private static int cl = 872415232 >>> 217 | 872415232 << -217;
   private static int dl = Integer.reverse(-671088640);
   private static int db = (0 >>> 227 | 0 << -227) & -1;
   private static int cw = Integer.reverse(Integer.MIN_VALUE);
   private static long bo = Long.reverse(-6917529027641081856L);
   private static long ds = Long.reverse(49987063873036120L);
   private static long z = Long.reverse(-238243312278675624L);
   private static int ec = Integer.reverse(-1);
   private static long n = Long.reverse(-238243312278675624L);
   private static int dj = Integer.reverse(0);
   private static long ag = Long.reverse(-238243312278675624L);
   private static int aw = Integer.reverse(-2013265920);
   private static int eh = (31744 >>> 74 | 31744 << ~74 + 1) & -1;
   private static int af = (6 >>> 223 | 6 << ~223 + 1) & -1;
   private static long au = Long.reverse(49987063873036120L);
   private static int ah = Integer.reverse(-1342177280);
   private static long bb = Long.reverse(-238243312278675624L);
   private static long cm = Long.reverse(49987063873036120L);
   private static long ab = Long.reverse(-238243312278675624L);
   private static long br = Long.reverse(49987063873036120L);
   private JDA a;
   private static long bh = Long.reverse(-238243312278675624L);
   private static int am = Integer.reverse(Integer.MIN_VALUE);
   private static int da = (8192 >>> 141 | 8192 << -141) & -1;
   private static long ae = Long.reverse(-288230376151711744L);
   private static String[] b = new String[NLoginCore_057.ex];
   private static int dr = 1879048192 >>> 218 | 1879048192 << -218;
   private static long em = Long.reverse(49987063873036120L);
   private static long bv = Long.reverse(-288230376151711744L);
   private static long ei = Long.reverse(49987063873036120L);
   private static long ai = Long.reverse(-238243312278675624L);
   private static int bz = 2097152 >>> 245 | 2097152 << -245;
   private static long k = Long.reverse(-238243312278675624L);
   private static long t = Long.reverse(-238243312278675624L);
   private static long dm = Long.reverse(-238243312278675624L);
   private static long bs = Long.reverse(-288230376151711744L);
   private static int cz = 0 >>> 150 | 0 << ~150 + 1;
   private static long cb = Long.reverse(-238243312278675624L);
   private static int eb = Integer.reverse(2013265920);
   private static int cy = (65536 >>> 48 | 65536 << -48) & -1;
   private static long dy = Long.reverse(-238243312278675624L);
   private static int bg = Integer.reverse(-1);
   private static int dp = Integer.reverse(Integer.MIN_VALUE);
   private boolean aC;
   private static int j = Integer.reverse(536870912);
   private static int dz = 8 >>> 99 | 8 << -99;
   private static int bw = Integer.reverse(0);
   private static int p = (6144 >>> 138 | 6144 << -138) & -1;
   private static String[] a = new String[NLoginCore_057.ew];
   private final NLoginType_008 H;
   private static int cv = 0 >>> 65 | 0 << ~65 + 1;
   private static int cs = Integer.reverse(0);
   private static long ed = Long.reverse(-238243312278675624L);
   private static int aa = Integer.reverse(1342177280);
   private static int l = Integer.reverse(-1610612736);
   private static int h = (384 >>> 231 | 384 << -231) & -1;
   private static long es = Long.reverse(-288230376151711744L);
   private static int bq = ('뀀' >>> 235 | 45056 << -235) & -1;
   private static int et = Integer.reverse(-1006632960);
   private static int dw = Integer.reverse(-1207959552);
   private static long e = Long.reverse(-288230376151711744L);
   private static int m = Integer.reverse(-1);
   private static long cn = Long.reverse(-288230376151711744L);
   private static int eq = Integer.reverse(1140850688);
   private static int dx = -1 >>> 163 | -1 << ~163 + 1;
   private static int a = Integer.reverse(0);
   private static int bt = Integer.reverse(-402653184);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int cu = Integer.reverse(Integer.MIN_VALUE);
   private static int bj = Integer.reverse(-1);
   private static int bl = (0 >>> 129 | 0 << -129) & -1;
   private static int ci = Integer.reverse(0);
   private static int bf = 655360 >>> 143 | 655360 << -143;
   private static int az = Integer.reverse(1207959552);
   private static long i = Long.reverse(-238243312278675624L);
   private static int f = Integer.reverse(1073741824);
   private static long bk = Long.reverse(-238243312278675624L);
   private static long b = Long.reverse(-238243312278675624L);
   private static long bu = Long.reverse(49987063873036120L);
   private static int ex = Integer.reverse(603979776);
   private static long bd = Long.reverse(49987063873036120L);
   private static long en = Long.reverse(-288230376151711744L);
   private static int cr = 0 >>> 211 | 0 << ~211 + 1;
   private static int cp = Integer.reverse(0);
   private static int u = Integer.reverse(268435456);
   private static int dq = (0 >>> 80 | 0 << ~80 + 1) & -1;
   private static int dv = (0 >>> 44 | 0 << ~44 + 1) & -1;
   private static long bx = Long.reverse(-4611686018427387904L);
   private static long ej = Long.reverse(-288230376151711744L);
   private static int bp = Integer.reverse(0);
   private static long be = Long.reverse(-288230376151711744L);
   private static int ar = 983040 >>> 48 | 983040 << ~48 + 1;
   private static int dc = (1 >>> 32 | 1 << ~32 + 1) & -1;
   private static int o = Integer.reverse(0);
   private static int ct = (0 >>> 193 | 0 << ~193 + 1) & -1;
   private static long ep = Long.reverse(-238243312278675624L);
   private static int eg = Integer.reverse(0);
   private static int ba = Integer.reverse(-1);
   private static int de = 16384 >>> 14 | 16384 << ~14 + 1;
   private static int ef = (128 >>> 231 | 128 << -231) & -1;
   private static int cx = Integer.reverse(0);
   private static int ea = 0 >>> 91 | 0 << ~91 + 1;
   private static int ee = 0 >>> 20 | 0 << ~20 + 1;
   private static int dn = (8388608 >>> 215 | 8388608 << -215) & -1;
   private static int df = Integer.reverse(0);
   private static int cc = Integer.reverse(-1744830464);
   private static int el = 1 >>> 155 | 1 << -155;
   private static long ay = Long.reverse(-288230376151711744L);
   private static int cj = Integer.reverse(0);
   private static int ch = (0 >>> 14 | 0 << -14) & -1;
   private static long er = Long.reverse(49987063873036120L);
   private static int cf = Integer.reverse(0);
   private static int bc = (-1073741820 >>> 62 | -1073741820 << ~62 + 1) & -1;
   private static long aq = Long.reverse(-288230376151711744L);
   private static int co = Integer.reverse(0);
   private static long av = Long.reverse(-288230376151711744L);
   private static int al = (0 >>> 110 | 0 << -110) & -1;
   private static int bm = 1048576 >>> 116 | 1048576 << -116;
   private static int aj = 524288 >>> 147 | 524288 << ~147 + 1;
   private static int ew = (-1879048192 >>> 186 | -1879048192 << -186) & -1;
   private static int bn = Integer.reverse(Integer.MIN_VALUE);
   private static int dh = Integer.reverse(0);
   private static int bi = Integer.reverse(-1476395008);
   private static int dd = Integer.reverse(0);
   private static long ce = Long.reverse(-288230376151711744L);
   private static int ck = (0 >>> 107 | 0 << ~107 + 1) & -1;
   private static int x = Integer.reverse(-1879048192);
   private static int var_do = (0 >>> 172 | 0 << -172) & -1;
   private static int an = 0 >>> 240 | 0 << -240;
   private static int ac = 704 >>> 198 | 704 << ~198 + 1;
   private static long g = Long.reverse(-238243312278675624L);
   private static int dg = (64 >>> 230 | 64 << -230) & -1;
   private static int ak = 16 >>> 228 | 16 << ~228 + 1;
   private static int eo = 69206016 >>> 85 | 69206016 << ~85 + 1;
   private static int cg = Integer.reverse(0);
   private static long c;
   private static int cq = 0 >>> 244 | 0 << ~244 + 1;
   private static long ap = Long.reverse(49987063873036120L);

   @Override
   public void b(ForceRegisterConfig var1, NLoginCore_277 var2, String var3) {
      String var4 = var1.a().m();
      NLoginCore_487 var10000 = NLoginCore_487.bd;
      Object[] var10002 = new Object[cu];
      var10002[cv] = var3;
      String var5 = NLoginCore_150.a(var10000, var2, var10002);
      var10000 = NLoginCore_487.bc;
      var10002 = new Object[cw];
      var10002[cx] = var3;
      String var6 = NLoginCore_150.a(var10000, var2, var10002);
      var10000 = NLoginCore_487.be;
      var10002 = new Object[cy];
      var10002[cz] = var3;
      String var7 = NLoginCore_150.a(var10000, var2, var10002);
      var10000 = NLoginCore_487.bf;
      var10002 = new Object[da];
      var10002[db] = var3;
      String var8 = NLoginCore_150.a(var10000, var2, var10002);
      this.a(var1, NLoginCore_137.b, var4, var6, var5, var7, var8, null, null);
   }

   public void a(String var1, MessageCreateData var2, @Nullable Consumer<Message> var3) {
      this.a.retrieveUserById(var1).queue(var2x -> {
         if (var2x != null) {
            var2x.openPrivateChannel().queue(var2xx -> var2xx.sendMessage(var2).queue(var3));
         }
      });
   }

   @Override
   public void c(ForceRegisterConfig var1, NLoginCore_277 var2, String var3) {
      String var4 = var1.a().m();
      NLoginCore_487 var10000 = NLoginCore_487.bh;
      Object[] var10002 = new Object[dc];
      var10002[dd] = var3;
      String var5 = NLoginCore_150.a(var10000, var2, var10002);
      var10000 = NLoginCore_487.bg;
      var10002 = new Object[de];
      var10002[df] = var3;
      String var6 = NLoginCore_150.a(var10000, var2, var10002);
      var10000 = NLoginCore_487.bi;
      var10002 = new Object[dg];
      var10002[dh] = var3;
      String var7 = NLoginCore_150.a(var10000, var2, var10002);
      var10000 = NLoginCore_487.bj;
      var10002 = new Object[di];
      var10002[dj] = var3;
      String var8 = NLoginCore_150.a(var10000, var2, var10002);
      this.a(var1, NLoginCore_137.b, var4, var6, var5, var7, var8, null, null);
   }

   @Generated
   public JDA a() {
      return this.a;
   }

   private EmbedBuilder a(String var1, String var2, String var3, String var4) {
      EmbedBuilder var5 = new EmbedBuilder();
      var5.setTitle(var1);
      var5.setDescription(var2);
      if (!var3.isEmpty()) {
         var5.setThumbnail(var3);
      }

      if (var4.length() == dk) {
         var4 = a(dl, dm) + var4;
      }

      Color var6;
      try {
         var6 = Color.decode(var4);
      } catch (NumberFormatException var8) {
         var6 = Color.GRAY;
      }

      var5.setColor(var6);
      return var5;
   }

   @Generated
   public NLoginCore_057(NLoginType_008 var1, NLoginCore_308 var2) {
      this.H = var1;
      this.b = var2;
   }

   @Generated
   @Override
   public boolean aF() {
      return this.aC;
   }

   @Generated
   public NLoginType_008 b() {
      return this.H;
   }

   @Override
   public void a(ForceRegisterConfig var1, NLoginCore_277 var2, String var3) {
      throw new UnsupportedOperationException(a(ca, cb));
   }

   @Override
   public void a(ForceRegisterConfig var1, NLoginCore_277 var2) {
      String var3 = var1.a().m();
      if (!NLoginCore_311.e.b(var1, NLoginCore_137.c)) {
         NLoginCore_311.e.a(var1, a(cc, cd ^ ce), NLoginCore_137.c);
         String var4 = NLoginCore_150.a(NLoginCore_487.aR, var2);
         String var5 = NLoginCore_150.a(NLoginCore_487.aQ, var2);
         String var6 = NLoginCore_150.a(NLoginCore_487.aS, var2);
         String var7 = NLoginCore_150.a(NLoginCore_487.aT, var2);
         String var8 = NLoginCore_150.a(NLoginCore_487.aU, var2);
         String var9 = NLoginCore_150.a(NLoginCore_487.aV, var2);
         this.a(var1, NLoginCore_137.c, var3, var5, var4, var6, var7, var8, var9);
      }

      NLoginType_019.l.put(var3, var2.getName());
   }

   public void a(ForceRegisterConfig var1, NLoginCore_137 var2, String var3, String var4, String var5, String var6, String var7, String var8, String var9) {
      this.a(var3, this.a(var4, var5, var6, var7, var8, var9).build(), var2x -> NLoginCore_311.e.a(var1, var2x.getId(), var2));
   }

   public MessageCreateBuilder a(String var1, String var2, String var3, String var4) {
      return this.a(var1, var2, var3, var4, null, null);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_057.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_091.E("\u0557չջ՛տ֖֞֬֘է֥֛֣֩լְֲֳ֑֪֪տ", (byte)115, 69), NLoginCore_057.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_387.A("ǈǕǔƗǗǓǎǗǢǑƞǜǠǙǜǢƤԷԸԛ\u0530ԴԺՅԯƸ", (byte)115, 65) + var1 + NLoginCore_004.F("թ", (byte)115, 70) + var2.toString(), var4
         );
      }
   }

   public MessageCreateBuilder a(String var1, String var2, String var3, String var4, String var5, String var6) {
      MessageCreateBuilder var7 = new MessageCreateBuilder();
      EmbedBuilder var8 = this.a(var1, var2, var3, var4);
      MessageEmbed[] var10001 = new MessageEmbed[dn];
      var10001[var_do] = var8.build();
      var7.setEmbeds(var10001);
      if (var5 != null && var6 != null) {
         MessageTopLevelComponent[] var11 = new MessageTopLevelComponent[dp];
         int var10003 = dq;
         Button var10004 = Button.primary(a(dr, ds ^ dt), var5);
         ActionRowChildComponent[] var10005 = new ActionRowChildComponent[du];
         var10005[dv] = Button.secondary(a(dw & dx, dy), var6);
         var11[var10003] = ActionRow.of(var10004, var10005);
         var7.setComponents(var11);
      } else if (var5 != null) {
         MessageTopLevelComponent[] var9 = new MessageTopLevelComponent[dz];
         var9[ea] = ActionRow.of(Button.primary(a(eb & ec, ed), var5), new ActionRowChildComponent[ee]);
         var7.setComponents(var9);
      } else if (var6 != null) {
         MessageTopLevelComponent[] var10 = new MessageTopLevelComponent[ef];
         var10[eg] = ActionRow.of(Button.secondary(a(eh, ei ^ ej), var6), new ActionRowChildComponent[ek]);
         var7.setComponents(var10);
      }

      return var7;
   }

   static {
      b();
   }

   @Override
   public boolean aE() {
      if (this.a != null) {
         this.a.shutdown();
         if (!this.a.awaitShutdown(bx, TimeUnit.SECONDS)) {
            this.a.shutdownNow();
            this.a.awaitShutdown();
         }
      }

      this.a = null;
      this.aC = (boolean)by;
      return (boolean)bz;
   }

   @Override
   public void aH() {
      NLoginCore_219 var1 = this.b.b();
      if (var1 == null) {
         throw new IllegalStateException(this + a(a, b));
      } else {
         String var2 = var1.a(a(c, d ^ e), var1.a(a(f, g), a(h, i)));
         boolean var3 = NLoginCore_150.j();
         if (var2.isEmpty()) {
            NLoginCore_370.c(var3 ? a(j, k) : a(l & m, n));
         } else {
            Builder var4 = IOUtil.newHttpClientBuilder();
            if (var1.d(a(p & q, r))) {
               String var5 = var1.b(a(s, t));
               int var6 = var1.a((String)a(u & v, w));
               if (var5 != null && !var5.isEmpty() && !a(x & y, z).equals(var5)) {
                  System.setProperty(a(aa, ab), a(ac, ad ^ ae));
                  var4.proxy(new Proxy(Type.HTTP, new InetSocketAddress(var5, var6)));
                  String var7 = var1.b(a(af, ag));
                  String var8 = var1.b(a(ah, ai));
                  if (var7 != null && var8 != null) {
                     var4.proxyAuthenticator((var2x, var3x) -> var3x.request().newBuilder().header(a(et, eu ^ ev), Credentials.basic(var7, var8)).build());
                  }
               }
            }

            try {
               JDABuilder var10001 = JDABuilder.createDefault(var2).setAutoReconnect((boolean)aj).setStatus(OnlineStatus.ONLINE).setHttpClientBuilder(var4);
               Object[] var10002 = new Object[ak];
               var10002[al] = new NLoginType_019(this.H, this);
               this.a = var10001.addEventListeners(var10002).build().awaitReady();
               CommandListUpdateAction var10000 = this.a.updateCommands();
               CommandData[] var10 = new CommandData[am];
               var10[an] = Commands.slash(a(ao, ap ^ aq), var3 ? a(ar, as) : a(at, au ^ av))
                  .addOption(OptionType.STRING, a(aw, ax ^ ay), var3 ? a(az & ba, bb) : a(bc, bd ^ be));
               var10000.addCommands(var10).queue();
               NLoginCore_370.e(var3 ? a(bf & bg, bh) : a(bi & bj, bk));
               this.aC = (boolean)bm;
               this.H.b((boolean)bn).a(var2x -> {
                  if (this.a == null) {
                     var2x.Z();
                  } else {
                     Presence var3x = this.a.getPresence();
                     String var4x = var1.a(a(el, em ^ en), var1.a(a(eo, ep), a(eq, er ^ es)));
                     if (!var4x.isEmpty()) {
                        var3x.setActivity(Activity.playing(var4x));
                     }

                     var3x.setStatus(OnlineStatus.ONLINE);
                  }
               }, 0L, bo, TimeUnit.SECONDS);
            } catch (IllegalArgumentException | IllegalStateException | InterruptedException var9) {
               this.aC = (boolean)bp;
               NLoginCore_370.c(var3 ? a(bq, br ^ bs) : a(bt, bu ^ bv), var9);
            }
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 63L;
      var1 ^= 6132385733021754696L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(10 + 58),
                     (byte)(6 + 63),
                     (byte)(37 + 46),
                     (byte)(15 + 32),
                     (byte)(18 + 49),
                     66,
                     (byte)(39 + 28),
                     47,
                     (byte)(62 + 18),
                     (byte)(45 + 30),
                     (byte)(2 + 65),
                     (byte)(62 + 21),
                     (byte)(5 + 48),
                     (byte)(7 + 73),
                     (byte)(59 + 38),
                     (byte)(77 + 23),
                     (byte)(69 + 31),
                     (byte)(4 + 101),
                     (byte)(61 + 49),
                     (byte)(25 + 78)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(37 + 31), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_387.B("ŎśŚĝŝřŔŝŨŗĤŢŦşŢŨĪҽҾҡҶҺӀӋҵ", (byte)54, 66));
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

   @Override
   public void b(ForceRegisterConfig var1, NLoginCore_277 var2) {
      String var3 = var1.a().m();
      if (!NLoginCore_311.e.b(var1, NLoginCore_137.b)) {
         NLoginCore_311.e.a(var1, a(cl, cm ^ cn), NLoginCore_137.b);
         String var4 = NLoginCore_150.a(NLoginCore_487.aX, var2);
         String var5 = NLoginCore_150.a(NLoginCore_487.aW, var2);
         String var6 = NLoginCore_150.a(NLoginCore_487.aY, var2);
         String var7 = NLoginCore_150.a(NLoginCore_487.aZ, var2);
         String var8 = NLoginCore_150.a(NLoginCore_487.ba, var2);
         String var9 = NLoginCore_150.a(NLoginCore_487.bb, var2);
         this.a(var1, NLoginCore_137.b, var3, var5, var4, var6, var7, var8, var9);
      }

      NLoginType_019.l.put(var3, var2.getName());
   }

   @Generated
   public NLoginCore_308 a() {
      return this.b;
   }

   private static void b() {
      c = 1943903031920266496L;
      long var0 = c ^ 6132385733021754696L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(46 + 22),
               (byte)(54 + 15),
               (byte)(10 + 73),
               (byte)(4 + 43),
               67,
               (byte)(58 + 8),
               (byte)(8 + 59),
               (byte)(7 + 40),
               (byte)(42 + 38),
               (byte)(45 + 30),
               (byte)(62 + 5),
               83,
               (byte)(2 + 51),
               (byte)(56 + 24),
               (byte)(33 + 64),
               (byte)(2 + 98),
               (byte)(10 + 90),
               (byte)(102 + 3),
               (byte)(42 + 68),
               (byte)(73 + 30)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(39 + 29), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_092.B("ŸŜżĹłŹĿťŕŦųņŊŮŻťƃƁňŒţƇƖƐŪůŲŴśƒŴƟ", (byte)68, 66);
               b[1] = NLoginCore_138.A("ŵőłƀŽźŲŃŶŉşŃŃŖƏŦŚƅťōŵŮƌƉƌƐŴƐƉŻŪƗ", (byte)68, 65);
               b[2] = NLoginCore_553.A("żƀƃŎŘšƀŠŃźŁųƍƉŢŞţŰŚƂŦƆƒƇŐŖŹŔťžƝƀ", (byte)68, 65);
               b[3] = NLoginCore_232.E("ՎծչղՕ՝հՑ՚Ի\u0557Ո", (byte)68, 69);
               b[4] = NLoginCore_521.C(
                  "ӏӜӛӔӿԀӫӵӗԂҺӗҽӾӒԆӜӟӔӭӗӷӇӢӽӥӿӢӶӟԑӢӮӦԒӰԑӿԍӵӶԑԃԠԏԔӚԖԪԃөԙԈԚԁӮԜӰԈӮԷԎԶԯԄԨԘԪԧԾԫԮԓԶԜԿԜԀԗԖԈՊԛԈԋԈԸՏԠՀԡՎԑԢԢԭ\u0557ՐԫԗՒՕ՝ՔԭԞբ՜ՁԽՙԧԷԳժԪՊԾԺծըՏՍԳՆՍՙծՅմլԻէՎՋՋվո՞Ղբ\u0557յ։պ֊օ\u0558գ՞՜էՈթգՌշ։խթֆըքօձհ֍տո՚֕չ֏ռ֢ՠվդ֚֗ո֟փ֑ֈ։ִ֑և֑րֱ֢֓մմ֦׀ֱֱ֫֘֘։",
                  (byte)68,
                  67
               );
               b[5] = NLoginCore_521.A(
                  "ŕŢšŚƅƆűŻŝƈŀƁƉšŗżŜōžƔšűƌŦŐŷŴťƗƝŖſşůƗƓƠśƖƨƢƊƟƣżŭŶƊƎƉūťƆƢƁƠƮƇƑƩƱųŹƱƸƑſƋƳưǇƜƑƣƢƺǄƸǂƷǍƛƪǐƠƝǈǔǅƔǘƙǔǓǆǟƚƾưƟƹƛƶƤǓƠƹǠǬǉƥǬƩƯǐǨǲǂƳǔƱƳǘǘǥǝǇƶǼƷǘǌǟǱǺǶȆǘȃǩǡȊǪȇǽǪǪȀǦȀȑȒǳǦǻǘȜȊȆȖǯǪȏǕȜǾȜǽǽǤǡǝțȕțȍȩȀȦȂǲȍǺǻ",
                  (byte)68,
                  65
               );
               b[6] = NLoginCore_138.A("ŵőłƀŽźŲŃŶŉŞťŗƂƉţŭŤƈőŏœƁŶƀŰŕŨƓƔƛƝƞśƐŠŮƄƀŷƆŨŲů", (byte)68, 65);
               b[7] = NLoginCore_173.C("ӯӋҼӺӷӴӬҽӰӃӘӟӑӼԃӝӧӞԂӋӉӍӪӞԒԁӳӎԃӎӡӦӹԋӵӾԊӱӫӬӸԁӟө", (byte)68, 67);
               b[8] = NLoginCore_559.E("ծՊԻչնճիԼկՂ\u0557՞Րջւ՜զ՝ցՊՈՀտ՚՜աՑդըֈ\u058b\u0557֏դևկ՜֖֗ՙին֝ը", (byte)68, 69);
               b[9] = NLoginCore_110.A("ŐŵĿŽŖŔļŴŨŅŔƇŶƍƍżƁŉƀŴƊƌŶƄŦŷţƅűŪűŨ", (byte)68, 65);
               b[10] = NLoginCore_092.B("ŰŰŢōŀĿŖżŧƀŉŨņŧşƆŦƐƃŋŠűƃŤŊƘƚƍƜƔũųƝŶƒůƚƀŲƑƐƑƕŪŪƤŦƧŨƎƓŽƋƳźŻ", (byte)68, 66);
               b[11] = NLoginCore_427.D("ӏӯӺӳӖӞӱӒӛҼӘӉ", (byte)68, 68);
               b[12] = NLoginCore_232.E("ծՊԻչնճիԼկՂ\u0557՞Րջւ՜զ՝ցՊՈՍբ՟ժՋ\u058cճ՝քթ\u058b֓նղՓ\u058c֚֙շ֣֡իը", (byte)68, 69);
               b[13] = NLoginCore_530.F("ծՊԻչնճիԼկՂ\u0557՞Րջւ՜զ՝ցՊՈ֏սՐջիՒՔՒճդձբբ֊ֈ\u058cոպղհա֙ը", (byte)68, 70);
               b[14] = NLoginCore_433.D("ӪӤӊӸӾӭӏӼӰӳӔӉ", (byte)68, 68);
               b[15] = NLoginCore_530.C("ӏӈҺӐӎӘӖӻӰӴӯӱӧӾӰӽӹԂԄӪӅӉӐӞӮӍӮӔԐӍԍӸԇԕԛӝӝӶӶԗӡԄӽӶӥԥԈӴԔԈӺԬӼԘԦӨӱӥԍӬԁԬԠԊ", (byte)68, 67);
               b[16] = NLoginCore_223.A("śŲŐľƁŀƆůŝşŠňŵŭŗƆƃźŬƋżŽƕŠŦŨƛƋƚŽƞƀƁůƍƘźƆƁƏŢơŴųƔƤƢƗƀƌŪƜƃůƶưƢŹƧƋƮƽƎƿ", (byte)68, 65);
               b[17] = NLoginCore_091.C("ӔӛӇөӔӉӗӿӠӿӶӉ", (byte)68, 67);
               b[18] = NLoginCore_201.E("մՅԴՅ՚զկծԹփձՖ\u0557սՐրՖըֆաՅնշբՎջծ։դՑՠ֕֒ն\u0590մհ՜\u0557֞կբճ\u0590հ֏է֧ֈղ֪֟ը֙ռի֫֊ְְ֮֕ղֶֺ֦֢֦֮֬ն֎ֳֿ֗ֈ", (byte)68, 69);
               b[19] = NLoginCore_076.D("ӪӼҷәӷӰӎӸӎӻӱӂӟӾԄӞӇӿӡԋӣԊӎԉӲӟӝӥԈԅԋԏԕӛӽӰӼӵԔәԍԣԔԦԙԨӞөԥӷԍԤӺԭӴӵ", (byte)68, 68);
               b[20] = NLoginCore_091.E("ԫշէՍկՋԾղյՖլմՄցզ՛նսչժջՍֆիաիՠ։՟դ֓Պ֔֊մ֔֍֕՜խչ֡֗բ֛զկ֙մ֓մզְ֛֭ցպ֑֒֩խտքկֺ֍ֲֺ־ָ֖֍ֿ֛֩֙ռ֛׆֧֦ֈׂ֝׀ּ֓֔", (byte)68, 69);
               b[21] = NLoginCore_141.C("ҬӸӨӎӰӌҿӳӶӗӭӵӅԂӧӜӷӾӺӫӼԐԋӠԒӾӮӒӡӉԄԃөԔӽԎԙӗԐԉӵԕӚӳӵԥӸӟԀӿӧӶӿӪӢԁԃӰԡԔԎԮԶԆԑԨԤԳӴӽԳԳԮԑԟԷԗԂՂԤԖԪԈԜԻԟԾԃՎ\u0530\u0530ԞՂՒԕԮ", (byte)68, 67);
               b[22] = NLoginCore_091.E(
                  "Վ՛՚ՓվտժմՖցԵչՂէ՛չՔ՟լՕբևէՏ֑Մֈ֏ՓհկՒհօ՚\u0557Օհս՛լ֑֗֗օ՝մ֝բ֜ւ֘ր֣֦֛օְֱխ֍ֶձ\u0590ֱ֧\u058bֱ֛ֈָղ֍֏׀ֹֻ֦֝օׁ֊ֺ֟֗\u05cc֓֔", (byte)68, 69
               );
               b[23] = NLoginCore_138.A("ŕŢšŚƅƆűŻŝƈļŹƈŗřƂŘŮŧœŒƆŞŮœƏŸŔƑƞƋŜŪŷƃƀƘƘŻƢŦŲƟƌƞŪƋơžƧƍŬƑƬƆƵƏŹŹƗƮƫƝƜ", (byte)68, 65);
               b[24] = NLoginCore_446.F("բՏՇԺՑԵՖՋ\u0558ԹնջՒտՂչռգ\u0557\u058bՙգփզռ֓խաք֑ՓՊ֒֎֘ռմ֊֚֕֞֕ջը", (byte)68, 70);
               b[25] = NLoginCore_521.E("ճԬըեէ՛Պ՛ՕլջՖճւՓ՚թթ՟վց\u058cՓՔ", (byte)68, 69);
               b[26] = NLoginCore_453.D("ӴҭөӦӨӜӋӜӖӭӼӗӴԃӔӛӪӪӠӿԂԍӔӕ", (byte)68, 68);
               b[27] = NLoginCore_575.F("ՁՈ՜էՊՓՏջՑՌսՈ", (byte)68, 70);
               b[28] = NLoginCore_471.D("ҴӄӖӷӼӨӽӯӽӢӮӉ", (byte)68, 68);
               b[29] = NLoginCore_141.B("ŎŝŵŽřŞŹœżŁŒŏ", (byte)68, 66);
               b[30] = NLoginCore_138.D("ҴӄӖӷӼӨӽӯӽӢӮӉ", (byte)68, 68);
               b[31] = NLoginCore_471.B("ŎŝŵŽřŞŹœżŁŒŏ", (byte)68, 66);
               b[32] = NLoginCore_427.C("ӯӋҼӺӷӴӬҽӰӃӘӟӑӼԃӝӧӞԂӋӉԏӭӣӎԑԏӎӈӪӰӳ", (byte)68, 67);
               b[33] = NLoginCore_127.A("ŪŵƀŋŬŤŤŶũŅŜņƉŽƀƌōšŊŉŐŎōşƃŸŲŪūŖƖŗ", (byte)68, 65);
               b[34] = NLoginCore_232.E("ՎծչղՕ՝հՑ՚Ի\u0557Ո", (byte)68, 69);
               b[35] = NLoginCore_559.B("ůŠŎśƅĻſőŖźŚƌŜŻśŏŪƒťŮžŏƒƒƇŒƊƏƚűƔŨ", (byte)68, 66);
               break;
            case 1:
               b[0] = NLoginCore_433.A("ŸŜżĹłŹĿťŕŦųņŊŮŻťƃƁňŒţƈŧƇŖƕƛŭŵƌŐŪşŘųƏŭƘŤŹƠŨƘů", (byte)68, 65);
               b[1] = NLoginCore_427.E("ծՊԻչնճիԼկՂ\u0558ԼԼՏֈ՟Փվ՞Նծծ՝ՊիՒ՛՝֏ղօյն֊ծՔնՕծչ֗րտը", (byte)68, 69);
               b[2] = NLoginCore_387.F("յչռՇՑ՚չՙԼճԺլֆւ՛\u0557՜թՓջ՟ևՙֆրՋ՛֑և\u058c֘Պ", (byte)68, 70);
               b[3] = NLoginCore_397.C("ӱӗӌӇҽӯӗӶӍӂӜӉ", (byte)68, 67);
               b[4] = NLoginCore_223.B(
                  "ŕŢšŚƅƆűŻŝƈŀŝŃƄŘƌŢťŚųŝŽōŨƃūƅŨżťƗŨŴŬƘŶƗƅƓŻżƗƉƦƕƚŠƜưƉůƟƎƠƇŴƢŶƎŴƽƔƼƵƊƮƞưƭǄƱƴƙƼƢǅƢƆƝƜƎǐơƎƑƎƾǕƦǆƧǔƗƨƨƳǝǖƱƝǘǛǣǚƳƤǨǢǇǃǟƭƽƹǰưǐǄǀǴǮǕǓƹǌǓǟǴǋǺǲǁǭǔǑǑȄǾǤǈǨǝǻȏȀȐȋǞǩǤǢǭǎǯǩǒǽȏǳǯȌǮȊȋǷǶȓȅǾǠțǿȕȂȨǦȄǪȝȠǾȥȉȗȎȏȗȺȍȗȆȨǸȚǸǹǿȏȰȨȕɁɋȶȉȩȜȍȺȤȳɐȣɓȚț",
                  (byte)68,
                  66
               );
               b[5] = NLoginCore_027.C(
                  "ӏӜӛӔӿԀӫӵӗԂҺӻԃӛӑӶӖӇӸԎӛӫԆӠӊӱӮӟԑԗӐӹәөԑԍԚӕԐԢԜԄԙԝӶӧӰԄԈԃӥӟԀԜӻԚԨԁԋԣԫӭӳԫԲԋӹԅԭԪՁԖԋԝԜԴԾԲԼԱՇԕԤՊԚԗՂՎԿԎՒԓՎՍՀՙԔԸԪԙԳԕ\u0530ԞՍԚԳ՚զՃԟզԣԩՊբլԼԭՎԫԭՒՒ՟\u0557Ձ\u0530նԱՒՆՙիմհրՒսգ՛քդցշդդպՠպ\u058b\u058cխՠյՒ֖քր\u0590թդ։Տ֖ո֖շշ՞՜տ֑֒՚՛բ֜ց֫ծ֝մյ",
                  (byte)68,
                  67
               );
               b[6] = NLoginCore_324.F("ծՊԻչնճիԼկՂ\u0557՞Րջւ՜զ՝ցՊՈՌպկչթՎա\u058c֍֖֔\u0590Ռ֎ի֔պլը\u0558ՠ՚ը", (byte)68, 70);
               b[7] = NLoginCore_110.F("ծՊԻչնճիԼկՂ\u0557՞Րջւ՜զ՝ցՊՈՌթ՝֑րղՍւՍՠե֕\u0558Ս֜\u0557֞\u0557յ֡֒֙ը", (byte)68, 70);
               b[8] = NLoginCore_324.C("ӯӋҼӺӷӴӬҽӰӃӘӟӑӼԃӝӧӞԂӋӉӁԀӛӝӢӒӥөԉԌӘԐӻӹӜӻӗӞԏԡӮӼө", (byte)68, 67);
               b[9] = NLoginCore_004.A("ŐŵĿŽŖŔļŴŨŅŔƇŶƍƍżƁŉƀŴƊƃƑƏŤƏƎƎƐŵżũ", (byte)68, 65);
               b[10] = NLoginCore_324.F("թթ՛ՆԹԸՏյՠչՂաԿՠ\u0558տ՟։ռՄՙժռ՝Ճ֑֓ֆ֕֍բլ֖կ\u058bը֓չի֊։֊\u0590՞ռջ֝ա֜օ֙ի֍ո֪֤֭֙ևև֔֫հ֪", (byte)68, 70);
               b[11] = NLoginCore_451.D("ӆӑӺӈӑӐӼӛӵӟӔӉ", (byte)68, 68);
               b[12] = NLoginCore_183.C("ӯӋҼӺӷӴӬҽӰӃӘӟӑӼԃӝӧӞԂӋӉӎӣӠӫӌԍӴӞԅӪԌԊӕӼӳԒӚԀԟӳԁӰԒԝӴԖԥԈӫԩԋӮӷӴӵ", (byte)68, 67);
               b[13] = NLoginCore_384.D("ӯӋҼӺӷӴӬҽӰӃӘӟӑӼԃӝӧӞԂӋӉԐӾӑӼӬӓӕӓӴӥӲӢӲԙӬӕӵӸӿӲԁӜԐԥӣԇԧӻӷԪԨӺԇӴӵ", (byte)68, 68);
               b[14] = NLoginCore_223.B("œŏūŽŏŸƂŢťŵŕŢřńžōŹƒőůœƃŚś", (byte)68, 66);
               b[15] = NLoginCore_387.C("ӏӈҺӐӎӘӖӻӰӴӯӱӧӾӰӽӹԂԄӪӅӉӐӞӮӍӮӔԐӍԍӸԇԕԛӝӝӶӶԗӡԄӽӶӥԥԈӴԔԈӺԬӼԏԩӱԎӯԥԌԗӭӮԹԣԼԘԥԊԇԿԔԓԷԾԉ", (byte)68, 67);
               b[16] = NLoginCore_384.B("śŲŐľƁŀƆůŝşŠňŵŭŗƆƃźŬƋżŽƕŠŦŨƛƋƚŽƞƀƁůƍƘźƆƁƏŢơŴųƔƤƢƗƀƌŪƜƃŵƵƃƠƏŹƱƄƅƆƚ", (byte)68, 66);
               b[17] = NLoginCore_433.C("ӍҺҵӋӪӗӐӻӞӞӶӉ", (byte)68, 67);
               b[18] = NLoginCore_530.E("մՅԴՅ՚զկծԹփձՖ\u0557սՐրՖըֆաՅնշբՎջծ։դՑՠ֕֒ն\u0590մհ՜\u0557֞կբճ\u0590հ֏է֧ֈղ֪֟ը֙ռի֫֊ְְ֮֕ղ֦֑\u058cխֶ֥֭׀րջֵ֭ֈ", (byte)68, 69);
               b[19] = NLoginCore_201.D("ӪӼҷәӷӰӎӸӎӻӱӂӟӾԄӞӇӿӡԋӣԊӎԉӲӟӝӥԈԅԋԏԕӛӽӰӼӵԔәԍԣԔԞԠԃԠԄԥԕӿӧӪԗԨԬԚӫԈԁԪԃԤԕ", (byte)68, 68);
               b[20] = NLoginCore_183.C(
                  "ҬӸӨӎӰӌҿӳӶӗӭӵӅԂӧӜӷӾӺӫӼӎԇӬӢӬӡԊӠӥԔӋԕԋӵԕԎԖӝӮӺԢԘӣԜӧӰԚӵԔӵӧԮԜԱԂӻԒԓԪӮԀԅӰԻԎԳԻԿԹԗԎԪՀԜԃ\u0530Ӿ\u0530ԺԛՋԚԷԭԏ\u0530ԎԥԧԜԯԡՍԨ\u0530", (byte)68, 67
               );
               b[21] = NLoginCore_397.D(
                  "ҬӸӨӎӰӌҿӳӶӗӭӵӅԂӧӜӷӾӺӫӼԐԋӠԒӾӮӒӡӉԄԃөԔӽԎԙӗԐԉӵԕӚӳӵԥӸӟԀӿӧӶӿӪӢԁԃӰԡԔԎԮԶԆԑԨԤԳӴӽԳԳԮԑԟԷԗԂՂԤԖԪԈԜԻԢԙԐՃԡ\u0530ԴՕՀՄՓԸՍԕԵՊ՞ԻԠՐԝԛԩ", (byte)68, 68
               );
               b[22] = NLoginCore_521.A("ŕŢšŚƅƆűŻŝƈļƀŉŮŢƀśŦųŜũƎŮŖƘŋƏƖŚŷŶřŷƌšŞŜŷƄŢųƘƞƞƌŤŻƤũƣƉƟƇƪƭƢƌƷƸŴƔƽŸƗƸƮƒƢƸƏƿŹƔƖǇƣƖƋƫƗǎƠƛƬƨƝƚƛ", (byte)68, 65);
               b[23] = NLoginCore_110.F("Վ՛՚ՓվտժմՖցԵղցՐՒջՑէՠՌՋտ\u0557էՌֈձՍ֊֗քՕգհռչ֑֑մ֛՟ի֘օ֗գք֚շ֠ֆե֊֞ի\u058b֍֜֍ֶָ֣֟յ֧\u058b֏֊ֽ֎\u0590ְ֭ովֈ", (byte)68, 70);
               b[24] = NLoginCore_433.D("ӣӐӈһӒҶӗӌәҺӷӼӓԀӃӺӽӤӘԌӚӤԄӧӽԔӮӢԅԒӔӋӦӛԓӰӯԌөӪӾԔӬө", (byte)68, 68);
               b[25] = NLoginCore_397.A("źĳůŬŮŢőŢŜųƁŇƄƎŇƉƆőŊƀŌŝŚś", (byte)68, 65);
               b[26] = NLoginCore_559.C("ӴҭөӦӨӜӋӜӖӭӺӗԂӸөӟӈӘӹҿԀӽӔӕ", (byte)68, 67);
               b[27] = NLoginCore_127.C("өҳӻӮҹӛӖҾӒӏӜӉ", (byte)68, 67);
               b[28] = NLoginCore_141.F("խհդԼե՚ըԽԾՂնգցչտՂ՜ՇՔ\u0558ՖզՓՔ", (byte)68, 70);
               b[29] = NLoginCore_127.C("ӚҶҺӱӴӪӵӓӬӹӌӉ", (byte)68, 67);
               b[30] = NLoginCore_092.D("ӗӱӷӨӾӒӶӏӾӋӾӉ", (byte)68, 68);
               b[31] = NLoginCore_530.B("ŠĺūļĽōĿŰƃŻŁŏ", (byte)68, 66);
               b[32] = NLoginCore_027.E("ծՊԻչնճիԼկՂ\u0557՞Րջւ՜զ՝ցՊՈՇորՊՠ։֕֕եի֒լ\u0558շռճֆից՛֜բը", (byte)68, 69);
               b[33] = NLoginCore_553.B("ŪŵƀŋŬŤŤŶũŅŜņƉŽƀƌōšŊŉŐƕƔŴŷƚŴƇƗŸūƟ", (byte)68, 66);
               b[34] = NLoginCore_397.D("ӋҭӭӻӌӬӼӑӢӋһӉ", (byte)68, 68);
               b[35] = NLoginCore_127.F("ըՙՇՔվԴոՊՏճՓօՕմՔՈգ\u058b՞էշՍ֊Րսռա֔ղ֓Ց֎", (byte)68, 70);
               break;
            case 2:
               b[0] = NLoginCore_453.C("ӕӑӒӘӞӪӶӱӘӫӜӉ", (byte)68, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_471.F("պմԲՉԳՏյղ՜Ձչ՞ՠեըՅճատ\u0557իզՓՔ", (byte)68, 70);
         }
      }
   }
}
