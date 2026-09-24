package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.protocol.ConnectionState;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.CommonDialogData;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.DialogAction;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.MultiActionDialog;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.action.DynamicCustomAction;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.body.DialogBody;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.body.PlainMessage;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.body.PlainMessageDialogBody;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.button.ActionButton;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.button.CommonButtonData;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.input.Input;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.input.TextInputControl;
import com.nickuc.login.lib.packetevents.api.protocol.player.ClientVersion;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import com.nickuc.login.lib.packetevents.api.resources.ResourceLocation;
import com.nickuc.login.lib.packetevents.api.wrapper.configuration.server.WrapperConfigServerClearDialog;
import com.nickuc.login.lib.packetevents.api.wrapper.configuration.server.WrapperConfigServerShowDialog;
import com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerClearDialog;
import com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerShowDialog;
import io.netty.channel.Channel;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.kyori.adventure.text.TextComponent;

public class αλμΣΩτψφγζηθξψ {
   private static int di = (-1 >>> 193 | -1 << ~193 + 1) & -1;
   private static long ey = Long.reverse(-6200075944422168365L);
   private static long da = Long.reverse(-2738188573441261568L);
   private static int s = 10485760 >>> 149 | 10485760 << ~149 + 1;
   private static int er = Integer.reverse(0);
   private static long bs = Long.reverse(-6200075944422168365L);
   private static int bi = (-1 >>> 9 | -1 << ~9 + 1) & -1;
   private static int bv = Integer.reverse(0);
   private static int ct = (67108864 >>> 250 | 67108864 << -250) & -1;
   private static int bx = (600 >>> 1 | 600 << -1) & -1;
   private static long fd = Long.reverse(-2738188573441261568L);
   private static long m = Long.reverse(8355558051239274707L);
   private static int bn = Integer.reverse(1879048192);
   private static int dv = Integer.reverse(1073741824);
   private static int ba = Integer.reverse(1342177280);
   private static int bt = Integer.reverse(0);
   private static int j = 0 >>> 96 | 0 << -96;
   private static long q = Long.reverse(-6200075944422168365L);
   private static int ez = Integer.reverse(0);
   private static long cp = Long.reverse(-2738188573441261568L);
   private static long bf = Long.reverse(-6200075944422168365L);
   private static int be = -1342177280 >>> 188 | -1342177280 << ~188 + 1;
   private static long bc = Long.reverse(-6200075944422168365L);
   private static int bg = (3 >>> 64 | 3 << ~64 + 1) & -1;
   private static long bj = Long.reverse(-6200075944422168365L);
   private static int ce = Integer.reverse(0);
   private static int by = 65536 >>> 208 | 65536 << ~208 + 1;
   private static int b = Integer.reverse(0);
   private static int eb = Integer.reverse(Integer.MIN_VALUE);
   private static int dw = (0 >>> 182 | 0 << ~182 + 1) & -1;
   private static int en = Integer.reverse(-1);
   private static int fi = 0 >>> 80 | 0 << -80;
   private static int cy = Integer.reverse(-1476395008);
   private static int t = Integer.reverse(0);
   private static String[] a = new String[αλμΣΩτψφγζηθξψ.fw];
   private static long bm = Long.reverse(-6200075944422168365L);
   private static int ej = Integer.reverse(880803840);
   private static int e = 0 >>> 10 | 0 << ~10 + 1;
   private static long dg = Long.reverse(-6200075944422168365L);
   private static int dh = 23 >>> 128 | 23 << -128;
   private static int ak = 25165824 >>> 22 | 25165824 << ~22 + 1;
   private static int c = Integer.reverse(0);
   private static int es = Integer.reverse(0);
   private static long al = Long.reverse(8355558051239274707L);
   private static long z = Long.reverse(8355558051239274707L);
   private static long cx = Long.reverse(-6200075944422168365L);
   private static int dl = (9830400 >>> 48 | 9830400 << ~48 + 1) & -1;
   private static int fe = Integer.reverse(-2080374784);
   private static int a = (0 >>> 128 | 0 << -128) & -1;
   private static int cq = (77824 >>> 140 | 77824 << ~140 + 1) & -1;
   private static int fj = Integer.reverse(1073741824);
   private static long n = Long.reverse(-2738188573441261568L);
   private static int fh = Integer.reverse(Integer.MIN_VALUE);
   private static int dc = Integer.reverse(0);
   private static long fc = Long.reverse(8355558051239274707L);
   private static int db = (256 >>> 168 | 256 << -168) & -1;
   private static int o = Integer.reverse(Integer.MIN_VALUE);
   private static long eo = Long.reverse(-6200075944422168365L);
   private static int p = Integer.reverse(-1);
   public final ςΨνςηττωγκξψς a = new ςΨνςηττωγκξψς(this);
   private final ΨγημιδξΓτοθαζ v;
   private static int cm = ('阀' >>> 232 | 38400 << -232) & -1;
   private static int df = (88 >>> 194 | 88 << ~194 + 1) & -1;
   private static int fv = (0 >>> 176 | 0 << -176) & -1;
   private static int y = 402653184 >>> 187 | 402653184 << -187;
   private static int ci = Integer.reverse(33554432);
   private static int ac = Integer.reverse(536870912);
   public final ςξνψηπιβ a;
   private static int aj = Integer.reverse(536870912);
   private static int bu = (536870912 >>> 189 | 536870912 << -189) & -1;
   private static int cl = Integer.reverse(0);
   private static int de = (1073741830 >>> 27 | 1073741830 << -27) & -1;
   private static int et = (1073741830 >>> 91 | 1073741830 << ~91 + 1) & -1;
   private static long c;
   private static long w = Long.reverse(-2738188573441261568L);
   private static int dr = 262144 >>> 114 | 262144 << ~114 + 1;
   private static int ek = Integer.reverse(0);
   private static int ag = (167772160 >>> 57 | 167772160 << -57) & -1;
   private static int bk = Integer.reverse(536870912);
   private static int cd = 4800 >>> 100 | 4800 << -100;
   private static int bb = -1 >>> 73 | -1 << ~73 + 1;
   private static int ab = Integer.reverse(1073741824);
   private static long cb = Long.reverse(8355558051239274707L);
   private static int ea = Integer.reverse(0);
   private static int x = Integer.reverse(Integer.MIN_VALUE);
   private static int d = (0 >>> 235 | 0 << ~235 + 1) & -1;
   private static long fp = Long.reverse(-6200075944422168365L);
   private static long cs = Long.reverse(-2738188573441261568L);
   private static int eq = Integer.reverse(Integer.MIN_VALUE);
   private static long ap = Long.reverse(-2738188573441261568L);
   private static int du = (1228800 >>> 108 | 1228800 << ~108 + 1) & -1;
   private static int l = Integer.reverse(0);
   private static int bz = (0 >>> 205 | 0 << ~205 + 1) & -1;
   private static long co = Long.reverse(8355558051239274707L);
   private static long ai = Long.reverse(-6200075944422168365L);
   private static int bl = Integer.reverse(-1342177280);
   private static int af = -2147483647 >>> 127 | -2147483647 << -127;
   private static int g = Integer.reverse(0);
   private static int bd = Integer.reverse(1073741824);
   private static int eh = -1 >>> 153 | -1 << -153;
   private static int dm = 393216 >>> 46 | 393216 << -46;
   private static int dq = (0 >>> 166 | 0 << ~166 + 1) & -1;
   private static int az = Integer.reverse(Integer.MIN_VALUE);
   private static int dk = (0 >>> 14 | 0 << ~14 + 1) & -1;
   private static int ax = Integer.reverse(-1);
   private static long ei = Long.reverse(-6200075944422168365L);
   private static int cv = (1258291200 >>> 87 | 1258291200 << ~87 + 1) & -1;
   private static long dy = Long.reverse(-6200075944422168365L);
   private static int cu = Integer.reverse(0);
   private static int em = (116 >>> 130 | 116 << ~130 + 1) & -1;
   private static int dt = Integer.reverse(0);
   private static int fl = -1 >>> 167 | -1 << ~167 + 1;
   private static int el = (8 >>> 227 | 8 << -227) & -1;
   private static long ae = Long.reverse(-2738188573441261568L);
   private static int cj = Integer.reverse(1073741824);
   private static int an = 1835008 >>> 50 | 1835008 << -50;
   private static long cz = Long.reverse(8355558051239274707L);
   private static int fq = Integer.reverse(0);
   private static int ex = (3968 >>> 103 | 3968 << ~103 + 1) & -1;
   private static int ar = Integer.reverse(-1);
   private static long dp = Long.reverse(-6200075944422168365L);
   private static int bw = Integer.reverse(0);
   private static long ch = Long.reverse(-6200075944422168365L);
   private static int ca = (65536 >>> 12 | 65536 << -12) & -1;
   private static long fg = Long.reverse(-2738188573441261568L);
   private static long bp = Long.reverse(-6200075944422168365L);
   private static int ef = Integer.reverse(Integer.MIN_VALUE);
   private static long ad = Long.reverse(8355558051239274707L);
   private static int bq = 245760 >>> 46 | 245760 << -46;
   private static String[] b = new String[αλμΣΩτψφγζηθξψ.fx];
   private static long as = Long.reverse(-6200075944422168365L);
   private static int dz = Integer.reverse(880803840);
   private static int bo = -1 >>> 178 | -1 << -178;
   private static int eg = (448 >>> 100 | 448 << ~100 + 1) & -1;
   private static int ah = Integer.reverse(-1);
   public final βΓτξΦΓψδ a = new βΓτξΦΓψδ(this);
   private static int bh = Integer.reverse(805306368);
   private static long v = Long.reverse(8355558051239274707L);
   private static long dj = Long.reverse(-6200075944422168365L);
   private static long ao = Long.reverse(8355558051239274707L);
   private static int fu = Integer.reverse(0);
   private static int fx = Integer.reverse(603979776);
   private static int fs = Integer.reverse(0);
   private static int cn = Integer.reverse(1207959552);
   private static int aq = (16777216 >>> 53 | 16777216 << -53) & -1;
   private static int ft = Integer.reverse(0);
   private static long cr = Long.reverse(8355558051239274707L);
   private static int ep = (1048576 >>> 238 | 1048576 << ~238 + 1) & -1;
   private static int fw = '退' >>> '\n' | 36864 << ~10 + 1;
   private static long ff = Long.reverse(8355558051239274707L);
   private static int fr = (0 >>> 254 | 0 << -254) & -1;
   private static int au = -2147483646 >>> 127 | -2147483646 << -127;
   private static long am = Long.reverse(-2738188573441261568L);
   private static int fa = Integer.reverse(1761607680);
   private static int cw = 335544320 >>> 24 | 335544320 << -24;
   private static int at = 0 >>> 13 | 0 << ~13 + 1;
   private static int eu = (15 >>> 31 | 15 << -31) & -1;
   private static int br = (-1 >>> 224 | -1 << -224) & -1;
   private static int ec = (432 >>> 4 | 432 << ~4 + 1) & -1;
   private static long cc = Long.reverse(-2738188573441261568L);
   private static int aw = 18 >>> 1 | 18 << ~1 + 1;
   private static long aa = Long.reverse(-2738188573441261568L);
   private static int fo = (140 >>> 162 | 140 << ~162 + 1) & -1;
   private static int h = (67108864 >>> 250 | 67108864 << ~250 + 1) & -1;
   private static int fb = Integer.reverse(67108864);
   private static int fk = 570425344 >>> 56 | 570425344 << ~56 + 1;
   private static int u = 8388608 >>> 182 | 8388608 << -182;
   private static int k = Integer.reverse(Integer.MIN_VALUE);
   private static long dn = Long.reverse(-6200075944422168365L);
   private static int dd = (0 >>> 99 | 0 << ~99 + 1) & -1;
   private static int ee = Integer.reverse(33554432);
   private static long ay = Long.reverse(-6200075944422168365L);
   private static long ew = Long.reverse(-2738188573441261568L);
   private static int av = 0 >>> 213 | 0 << -213;
   private static int ds = (0 >>> 149 | 0 << -149) & -1;
   private static int do = Integer.reverse(-1744830464);
   private static int f = Integer.reverse(0);
   private static int fn = 1073741824 >>> 62 | 1073741824 << -62;
   private static int ck = (0 >>> 151 | 0 << ~151 + 1) & -1;
   public final ξρΨυφεθεβντναΣυ a = new ξρΨυφεθεβντναΣυ();
   private static int r = Integer.reverse(0);
   private static long ed = Long.reverse(-6200075944422168365L);
   private static int dx = '퀀' >>> '+' | 53248 << ~43 + 1;
   private static int cf = (256 >>> 72 | 256 << -72) & -1;
   private static int i = 0 >>> 90 | 0 << ~90 + 1;
   private static int cg = Integer.reverse(-2013265920);
   private static long fm = Long.reverse(-6200075944422168365L);
   private static long ev = Long.reverse(8355558051239274707L);

   public void a(User var1, String var2, boolean var3, @Nullable υηηΠχΛγξ var4) {
      TextComponent var5 = ΩτωνοφχεΠ.a(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.bE, var2, null));
      DialogBody[] var10000 = new DialogBody[bu];
      var10000[bv] = new PlainMessageDialogBody(new PlainMessage(ΩτωνοφχεΠ.a(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.bF, var2, null)), bx));
      ηζησΠΠωΓργπ var6 = ηζησΠΠωΓργπ.a(var10000);
      Input[] var10 = new Input[by];
      var10[bz] = new Input(
         c<"㺀">(ca, cb ^ cc), new TextInputControl(cd, ΩτωνοφχεΠ.a(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.bG, var2, null)), (boolean)cf, c<"㺃">(cg, ch), ci, null)
      );
      ηζησΠΠωΓργπ var7 = ηζησΠΠωΓργπ.a(var10);
      ηζησΠΠωΓργπ var8;
      if (var3) {
         ActionButton[] var11 = new ActionButton[cj];
         var11[ck] = new ActionButton(
            new CommonButtonData(ΩτωνοφχεΠ.a(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.bI, var2, null)), null, cm),
            new DynamicCustomAction(new ResourceLocation(c<"㺆">(cn, co ^ cp), c<"㺉">(cq, cr ^ cs)), null)
         );
         var11[ct] = new ActionButton(
            new CommonButtonData(ΩτωνοφχεΠ.a(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.bH, var2, null)), null, cv),
            new DynamicCustomAction(new ResourceLocation(c<"㺌">(cw, cx), c<"㺏">(cy, cz ^ da)), null)
         );
         var8 = ηζησΠΠωΓργπ.a(var11);
      } else {
         ActionButton[] var12 = new ActionButton[db];
         var12[dc] = new ActionButton(
            new CommonButtonData(ΩτωνοφχεΠ.a(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.bH, var2, null)), null, de),
            new DynamicCustomAction(new ResourceLocation(c<"㺒">(df, dg), c<"㺕">(dh & di, dj)), null)
         );
         var8 = ηζησΠΠωΓργπ.a(var12);
      }

      ActionButton var9 = new ActionButton(
         new CommonButtonData(ΩτωνοφχεΠ.a(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.bJ, var2, null)), null, dl),
         new DynamicCustomAction(new ResourceLocation(c<"㺘">(dm, dn), c<"㺛">(do, dp)), null)
      );
      this.a(var1, var5, var6, var7, var8, var9, var4);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  αλμΣΩτψφγζηθξψ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(μζξτΩσσφυδεπλΨ.E("ԋԭԯԏԳՒՊՠՌԛՙՏ՝\u0557ԠՅէզ՞դ՞Գ", (byte)39, 69), αλμΣΩτψφγζηθξψ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            θεωψξβΛσσ.B("İĽļÿĿĻĶĿŊĹĆńňŁńŊČҏҚҜ҄ҋҧҬҫҙҝҟҡҨҳĦ", (byte)39, 66) + var1 + ΠΛΨοδΩσμνΛγΦφβς.F("ԝ", (byte)39, 70) + var2.toString(), var4
         );
      }
   }

   public boolean a(User var1, υηηΠχΛγξ var2) {
      if (βδΔφμπθθγ.a() != ΠβππΓωΛΦυβΩμΔ.c) {
         return (boolean)a;
      } else if (this.v.a().p()) {
         return (boolean)b;
      } else if (var1.getClientVersion().isOlderThan(ClientVersion.V_1_21_6)) {
         return (boolean)c;
      } else if (this.v.b().a(var1).isOlderThan(ClientVersion.V_1_21_6)) {
         return (boolean)d;
      } else {
         Channel var3 = (Channel)var1.getChannel();
         νχιλΣΩμψιτβΔΣδμ var4 = this.a(var1, var3);
         if (var4 == null) {
            return (boolean)e;
         } else {
            στΩξξχκι var5 = var4.a();
            boolean var6 = var5.A();
            if (!var6) {
               if (κδΔΦφγμδξΨωψο.n.ar() && var5.t()) {
                  return (boolean)f;
               }

               if (this.v.a().a(var5, var1.getAddress().getAddress().getHostAddress()) == υΣαΛφΣυχΣιπωμ.d) {
                  return (boolean)g;
               }

               αεθζδβΨξςρπΩζθδ var7 = this.v.b().a();
               int var8 = !var4.e() && (var7 == null || !var7.a(var1.getUUID())) ? i : h;
               if (κδΔΦφγμδξΨωψο.k.ar() && var8 != 0) {
                  return (boolean)j;
               }
            }

            if (var6) {
               this.a(var1, var4.d(), var2);
            } else {
               this.a(var1, var4.d(), βολμςΦζΓψγτθΔΛ.a(this.v, var5), var2);
            }

            var3.eventLoop().schedule(() -> {
               boolean var8x = false /* VF: Semaphore variable */;

               label64: {
                  label63: {
                     label62: {
                        try {
                           var8x = true;
                           if (!var3.isActive()) {
                              var8x = false;
                              break label64;
                           }

                           if (!var3.hasAttr(ωΩμΩχδοωδΔΠΔδ.c)) {
                              var8x = false;
                              break label63;
                           }

                           ωΩμΩχδοωδΔΠΔδ var5x = (ωΩμΩχδοωδΔΠΔδ)var3.attr(ωΩμΩχδοωδΔΠΔδ.c).get();
                           if (var5x == null) {
                              var8x = false;
                              break label62;
                           }

                           if (var5x.a != null) {
                              this.a(var1);
                              αυμξτυζΩ.i(var1, εδδΠηδξΛΣχ.a(var6 ? πωιψγηξΓρφυ.ad : πωιψγηξΓρφυ.ac));
                              var8x = false;
                           } else {
                              var8x = false;
                           }
                        } finally {
                           if (var8x) {
                              var2.resume((boolean)fv);
                           }
                        }

                        var2.resume((boolean)fu);
                        return;
                     }

                     var2.resume((boolean)fs);
                     return;
                  }

                  var2.resume((boolean)fr);
                  return;
               }

               var2.resume((boolean)fq);
            }, ΣλνΨουΩΔοθεβ.E.r(), TimeUnit.SECONDS);
            return (boolean)k;
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void a(User var1, TextComponent var2, List<DialogBody> var3, List<Input> var4, List<ActionButton> var5, ActionButton var6, @Nullable υηηΠχΛγξ var7) {
      CommonDialogData var8 = new CommonDialogData(var2, null, (boolean)fh, (boolean)fi, DialogAction.CLOSE, var3, var4);
      MultiActionDialog var9 = new MultiActionDialog(var8, var5, var6, fj);
      switch (ςζξγηλΛωψΣ.M[var1.getEncoderState().ordinal()]) {
         case 1:
            var1.sendPacketSilently(new WrapperConfigServerShowDialog(var9));
            break;
         case 2:
            var1.sendPacketSilently(new WrapperPlayServerShowDialog(var9));
            break;
         default:
            throw new IllegalArgumentException(c<"㺀">(fk & fl, fm) + var1.getEncoderState());
      }

      Channel var10 = (Channel)var1.getChannel();
      var10.attr(ωΩμΩχδοωδΔΠΔδ.c).set(new ωΩμΩχδοωδΔΠΔδ(var7, (byte)fn, null));
   }

   private static void b() {
      c = -3812963298892632114L;
      long var0 = c ^ 4213250437649420002L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(31 + 37),
               (byte)(41 + 28),
               (byte)(50 + 33),
               (byte)(42 + 5),
               (byte)(47 + 20),
               (byte)(33 + 33),
               (byte)(5 + 62),
               (byte)(44 + 3),
               (byte)(34 + 46),
               (byte)(12 + 63),
               67,
               83,
               (byte)(52 + 1),
               (byte)(55 + 25),
               (byte)(70 + 27),
               (byte)(67 + 33),
               (byte)(90 + 10),
               (byte)(104 + 1),
               (byte)(63 + 47),
               (byte)(45 + 58)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), (byte)(2 + 67), 83}, StandardCharsets.UTF_8));
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
               b[0] = οοθδΨιοΦΠβδζ.F("ԚԽՄՏԞՊԍԹՍԳԫԦԩԛ՟ՙԲԠ՜ԖՐեՂՑԟԤՖՖՊՀՇ՜ԭՏՓդՉհՅբլԲՍՑՋչմՊսւՏճԷա՛ձսՆբ\u058bՠտգջ", (byte)28, 70);
               b[1] = ΣφδσΔζιΠρα.E("ԬՋՉՕԓԢԲ\u0557ԬՃՊՐԖԳԚՊՌ՝ՒԵԠՓԶէԳԷըԽՙԷԯգՁզԬմՓԨԲյդ՛ԹՔծՓհ՚ՌսԿՎՕՎՋՌ", (byte)28, 69);
               b[2] = ξψθρΣΠΣς.B("ĬăĉČĝÿčéöĐČćęćĩćğĶğþĢĝĊċ", (byte)28, 66);
               b[3] = χΠξΦιζΨΣωΦσΨζ.A("éĠêóĦðĀĄćôĬÿ", (byte)28, 65);
               b[4] = χΠξΦιζΨΣωΦσΨζ.A("ĝğăĎĮĆđİĘēĤÿ", (byte)28, 65);
               b[5] = λΣΩσμφγχ.C("лѲмхѸтђіљцѾё", (byte)28, 67);
               b[6] = φδχεθοκψαλΛογλ.E("ՈՇԤԊԣԓԸՙԬԌՏԜ\u0558ԛԼ՝ԙԙԼ՞ՐԹՂդԷ՜ԹըՕեԭԾՇԿՌՒթգԵԵՆՂոՍՍ՞պՕոԼՙՙւՎՋՌ", (byte)28, 69);
               b[7] = φδχεθοκψαλΛογλ.C("ыѮѵҀяѻоѪѾѤќїњьҐҊѣёҍчҁҖѳ҂ѐѕ҇҇ѻѱѸҍўҀ҄ҕѺҡѶғҝѣѾ҂ѼҪҥѻҮҳҀҤѨҒҌҢҮѷғҼґҰҔҬ", (byte)28, 67);
               b[8] = λΣΩσμφγχ.C("ѝѼѺ҆фѓѣ҈ѝѴѻҁчѤыѻѽҎ҃Ѧё҄ѧҘѤѨҙѮҊѨѠҔѲҗѝҥ҄љѣҦҕҌѪ҅ҟ҄ҡҋѽҮѰѿ҆ѿѼѽ", (byte)28, 67);
               b[9] = φΨαξωυθανΣφυκη.C("ѾѕћўѯёџлшѢўљѫљѻљѱ҈ѱѐѴѯќѝ", (byte)28, 67);
               b[10] = χφπρψπφΦθμπ.E("ԊՁԋԔՇԑԡԥԨԕՍԠ", (byte)28, 69);
               b[11] = οΩνΩρωλΨηΛδωδ.F("ԾՀԤԯՏԧԲՑԹԴՅԠ", (byte)28, 70);
               b[12] = ΨφιωσρΓδΔθ.B("éĠêóĦðĀĄćôĬÿ", (byte)28, 66);
               b[13] = ΣφδσΔζιΠρα.D("ѹѸѕлєфѩҊѝнҀэ҉ьѭҎъъѭҏҁѪѳҕѨҍѪҙ҆ҖўѯѸѰѽ҃ҚҔѦѦѷѳҩѾѾҏҫ҆ҩѭҊҊҳѿѼѽ", (byte)28, 68);
               b[14] = ΦδφπθΩΩλζξ.F("ՌԦՎԥՈԬԎԮԐԪՎԖՅԕՐՌԚՃաաԺԾԫԬ", (byte)28, 70);
               b[15] = φΨαξωυθανΣφυκη.A("þĜúİíĲĐĴĠģôúļõįĈüĉĖĝûįėĔĆĖňŇĺňŅģ", (byte)28, 65);
               b[16] = ΨΦνΨΦωυΩνβςμ.A("ĢèāċĀĕĒĳċïĶĳĊıĚõĖčľĀĝĳĊċ", (byte)28, 65);
               b[17] = ΣδτΠνεγοΓορητ.A("éĠêóĦðĀĄćôĬÿ", (byte)28, 65);
               b[18] = ΣερμΔσατσκ.B("ĬČĲīĳĉĬôăĵĂÿ", (byte)28, 66);
               b[19] = ΠΛΨοδΩσμνΛγΦφβς.D("ёоьсѕѷц҇хчџѣѬѿѸѐ҇ѣѦғҊѯќѝ", (byte)28, 68);
               b[20] = πηγμΣΔκκ.D("Ѿў҄ѽ҅ћѾцѕ҇єё", (byte)28, 68);
               b[21] = ΣερμΔσατσκ.A("ĘĥĈüīíĦĘĥĩħķĊøĽĝĖĚĠėöčĊċ", (byte)28, 65);
               b[22] = ςΦζσμτΓσ.E("ՍԭՓՌՔԪՍԕԤՖԣԠ", (byte)28, 69);
               b[23] = φΨαξωυθανΣφυκη.B("ĘĥĈüīíĦĘĥĩħķĊøĽĝĖĚĠėöčĊċ", (byte)28, 66);
               b[24] = οΩνΩρωλΨηΛδωδ.A("ĬČĲīĳĉĬôăĵĂÿ", (byte)28, 65);
               b[25] = βεξΠθρρςΔΦμ.F("ԍԦՓՎՊՊՊԤԶԙԩԳՉԘՔԷՠՂՒ՞ՅԮԫԬ", (byte)28, 70);
               b[26] = ςΦζσμτΓσ.E("ՃԉԢԬԡԶԳՔԬԐ\u0558ՓՐ՚ՔՁԾ՚ԮեՐդԫԬ", (byte)28, 69);
               b[27] = πηγμΣΔκκ.C("лѲмхѸтђіљцѾё", (byte)28, 67);
               b[28] = ΣερμΔσατσκ.E("ՃԉԢԬԡԶԳՔԬԐՕԻ՛ԭՒՖ՜ԼՌՃՎդԫԬ", (byte)28, 69);
               b[29] = ςΦζσμτΓσ.E("ԊՁԋԔՇԑԡԥԨԕՍԠ", (byte)28, 69);
               b[30] = οΩνΩρωλΨηΛδωδ.D("Ѿў҄ѽ҅ћѾцѕ҇єё", (byte)28, 68);
               b[31] = φΨαξωυθανΣφυκη.C("л҄ѥэ҃ѐ҇љќ҆ѬурѼьѣҎю҅џѤҐѵђјҗҏѯҞѪҘќ", (byte)28, 67);
               b[32] = ζοηκορΦνΣθγΩ.F("ՍԭՓՌՔԪՍԕԤՖԣԠ", (byte)28, 70);
               b[33] = ζβησεθωυγτ.B("éĲēûıþĵćĊĴěĭĖĆĲĲķĭĝĀüčĊċ", (byte)28, 66);
               b[34] = ιΠοθΩΦξκ.A("ģĎĥĨđëõāĕøĳùęľĈĬĖğŁýŃĂıĵğłŁņġăŌŏďħĞĨĴİĨĥĢĳđğ", (byte)28, 65);
               b[35] = ιΠοθΩΦξκ.D("ѵѠѷѺѣнчѓѧъ҅ыѫҐњѾѨѱғяҕє҃҇ѱҔғҘѳѕҞҡѡѹѰѺ҆҂ѺѷѴ҅ѣѱ", (byte)28, 68);
               break;
            case 1:
               b[0] = πψυκΠΨμΛΩβΣφμφσ.F("ԚԽՄՏԞՊԍԹՍԳԫԦԩԛ՟ՙԲԠ՜ԖՐեՂՑԟԤՖՖՊՀՇ՜ԭՏՓդՉհՅբլԲՍՑՋչմՊսւՏճԷ՞՟\u0558՟Փմֈք։ՈՋ", (byte)28, 70);
               b[1] = ιΠοθΩΦξκ.B("ċĪĨĴòāđĶċĢĩįõĒùĩīļıĔÿĲĕņĒĖŇĜĸĖĎłĠŅċœĲćđŔŃĺĕōěĽĔħşĹŌłĺœĪī", (byte)28, 66);
               b[2] = χφπρψπφΦθμπ.C("ѾѕћўѯёџлшѢќѹѠѥчѝќ҅ҀѦҌҕќѝ", (byte)28, 67);
               b[3] = πχσδΦΦνθΔπ.B("ĠćĝĀăðĵñĒëĚÿ", (byte)28, 66);
               b[4] = ντθΔζβΔζ.D("ѻѷѐ҆҄ѴўѸ҉҂ыё", (byte)28, 68);
               b[5] = ΨΦνΨΦωυΩνβςμ.A("þĨčĳĪòĂĢĎĎĸÿ", (byte)28, 65);
               b[6] = ΦδφπθΩΩλζξ.B("ħĦăéĂòėĸċëĮûķúěļøøěĽįĘġŃĖĻĘŇĴńČĝĦĞīıňłĔĔĥġŗĸœňĩĜĹĵĔĜŌţĪī", (byte)28, 66);
               b[7] = πψυκΠΨμΛΩβΣφμφσ.E("ԚԽՄՏԞՊԍԹՍԳԫԦԩԛ՟ՙԲԠ՜ԖՐեՂՑԟԤՖՖՊՀՇ՜ԭՏՓդՉհՅբլԲՍՑՋչմՊսւՏճԷճՠտ՞Ֆ՝թըրոՇ", (byte)28, 69);
               b[8] = θεωψξβΛσσ.C("ѝѼѺ҆фѓѣ҈ѝѴѻҁчѤыѻѽҎ҃Ѧё҄ѧҘѤѨҙѮҊѨѠҔѲҗѝҥ҄љѣҦҕҌѪқңѸҩѺѻҨҝҊҁҵѼѽ", (byte)28, 67);
               b[9] = ΦδφπθΩΩλζξ.C("ѾѕћўѯёџлшѢѝѦѹѰјѬўъѼчѶѯќѝ", (byte)28, 67);
               b[10] = ςΦζσμτΓσ.F("ՄՅԼՌԥԠԑՋ\u0557ՊԚԠ", (byte)28, 70);
               b[11] = ΨΦνΨΦωυΩνβςμ.A("ïģĭĝĤıĪĨîĖĴÿ", (byte)28, 65);
               b[12] = ΦδφπθΩΩλζξ.E("ՃԻԡԍՓԎԯԕԩԘՅԠ", (byte)28, 69);
               b[13] = πχσδΦΦνθΔπ.C("ѹѸѕлєфѩҊѝнҀэ҉ьѭҎъъѭҏҁѪѳҕѨҍѪҙ҆ҖўѯѸѰѽ҃ҚҔѦѦѷѳҧҦҜҍҢѧҪҮҔѯҤҏѼѽ", (byte)28, 67);
               b[14] = ζβησεθωυγτ.E("ՌԦՎԥՈԬԎԮԐԪՎԪ՝ՐԧԳԵՔԮԠ\u0558դԫԬ", (byte)28, 69);
               b[15] = πψυκΠΨμΛΩβΣφμφσ.C("ѐѮь҂п҄Ѣ҆ѲѵцьҎчҁњюћѨѯэѴѶҖѨҒѹѬѶѱѯѸ", (byte)28, 67);
               b[16] = βθκςνθΩθυμςτκχ.A("ĢèāċĀĕĒĳċïĵĸĨĉĎĲĐğłıęĳĊċ", (byte)28, 65);
               b[17] = ζοηκορΦνΣθγΩ.D("опѾѝуѤцҁїї҂ё", (byte)28, 68);
               b[18] = χΠξΦιζΨΣωΦσΨζ.A("ĝĭĨčíĵĒñõčěĈõĮċćēĕēĳĳĝĊċ", (byte)28, 65);
               b[19] = ΦδφπθΩΩλζξ.A("ÿìúïăĥôĵóõĊĚĲĪöøĐĎğġĖēąĿĀłňľľĮŎĤ", (byte)28, 65);
               b[20] = ντθΔζβΔζ.A("ĄñčîēĩĭíĩĒąĕĈĹöħĽĢþþĤĳĊċ", (byte)28, 65);
               b[21] = χφπρψπφΦθμπ.E("ԹՆԩԝՌԎՇԹՆՊՅԯԾԗԸԴԬԭՔԞԞ\u0557ԢԶՈԳԾՍՍՎՌկ", (byte)28, 69);
               b[22] = πψυκΠΨμΛΩβΣφμφσ.B("çĥìĝĔĶħĶĕģđĈóħĭğĘėķþŀĳĊċ", (byte)28, 66);
               b[23] = ΣερμΔσατσκ.E("ԹՆԩԝՌԎՇԹՆՊՆԥԲ՞՟ՋԓԘԵ՞ԮԾՑԠԦԠի՝ԽՆզՉ", (byte)28, 69);
               b[24] = οΩνΩρωλΨηΛδωδ.A("îêäČġďčĳģĳöąćĻěļòĎėþėčĊċ", (byte)28, 65);
               b[25] = πηγμΣΔκκ.D("ої҄ѿѻѻѻѕѧъњѵѠћҋѼѪѓѵ҂ю҅ќѝ", (byte)28, 68);
               b[26] = θεωψξβΛσσ.B("ĢèāċĀĕĒĳċïķĳĎĮĎĪıĖķĢĒčĊċ", (byte)28, 66);
               b[27] = δΛψπξκσβγςα.F("ՊԍՁՌՆԦՄԶԶՓԚԠ", (byte)28, 70);
               b[28] = λΣΩσμφγχ.D("ѴкѓѝђѧѤ҅ѝс҇ѸчѸьэќ҂҉ѽ҇џќѝ", (byte)28, 68);
               b[29] = βεξΠθρρςΔΦμ.C("ѶџќђѮјѨјѝіѬё", (byte)28, 67);
               b[30] = πηγμΣΔκκ.F("ՍԯԴԟՑՎԮՄՒՋԣՇՇ՚\u0557՜ԴԟԞՍԷԾԫԬ", (byte)28, 70);
               b[31] = πψυκΠΨμΛΩβΣφμφσ.F("ԊՓԴԜՒԟՖԨԫՕԻԒԏՋԛԲ՝ԝՔԮԳգ՜ԾՇ՝ՓՆՅԷ\u0557ձ", (byte)28, 70);
               b[32] = ντθΔζβΔζ.D("ҁѤѯѮхѻчѥѷѡєџѥѪѺѼёѰэєѴѯќѝ", (byte)28, 68);
               b[33] = δΛψπξκσβγςα.C("л҄ѥэ҃ѐ҇љќ҆ѵфѧѻќ҆ѩѠђѤѦџќѝ", (byte)28, 67);
               b[34] = πχσδΦΦνθΔπ.F("ՄԯՆՉԲԌԖԢԶԙՔԚԺ՟ԩՍԷՀբԞդԣՒՖՀգբէՂԤխհԽՏՉՏթՑձժԳՃթՀ", (byte)28, 70);
               b[35] = βεξΠθρρςΔΦμ.B("ģĎĥĨđëõāĕøĳùęľĈĬĖğŁýŃĂıĵğłŁņġăŌŏĎġĞČĴĤőŉĕŖńğ", (byte)28, 66);
               break;
            case 2:
               b[0] = ΣφδσΔζιΠρα.A("ĥíģēĮċĒĖĸĕĊÿ", (byte)28, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = ΠΛΨοδΩσμνΛγΦφβς.A("ĮûêêČĲÿïĦģĂĸĪĳěĿľċûěĸįŀļńħĂęĉĪňō", (byte)28, 65);
         }
      }
   }

   public void a(User var1, String var2, @Nullable υηηΠχΛγξ var3) {
      TextComponent var4 = ΩτωνοφχεΠ.a(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.bK, var2, null));
      DialogBody[] var10000 = new DialogBody[dr];
      var10000[ds] = new PlainMessageDialogBody(new PlainMessage(ΩτωνοφχεΠ.a(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.bL, var2, null)), du));
      ηζησΠΠωΓργπ var5 = ηζησΠΠωΓργπ.a(var10000);
      Input[] var9 = new Input[dv];
      var9[dw] = new Input(
         c<"㺀">(dx, dy), new TextInputControl(dz, ΩτωνοφχεΠ.a(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.bM, var2, null)), (boolean)eb, c<"㺃">(ec, ed), ee, null)
      );
      var9[ef] = new Input(
         c<"㺆">(eg & eh, ei), new TextInputControl(ej, ΩτωνοφχεΠ.a(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.bN, var2, null)), (boolean)el, c<"㺉">(em & en, eo), ep, null)
      );
      ηζησΠΠωΓργπ var6 = ηζησΠΠωΓργπ.a(var9);
      ActionButton[] var10 = new ActionButton[eq];
      var10[er] = new ActionButton(
         new CommonButtonData(ΩτωνοφχεΠ.a(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.bO, var2, null)), null, et),
         new DynamicCustomAction(new ResourceLocation(c<"㺌">(eu, ev ^ ew), c<"㺏">(ex, ey)), null)
      );
      ηζησΠΠωΓργπ var7 = ηζησΠΠωΓργπ.a(var10);
      ActionButton var8 = new ActionButton(
         new CommonButtonData(ΩτωνοφχεΠ.a(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.bP, var2, null)), null, fa),
         new DynamicCustomAction(new ResourceLocation(c<"㺒">(fb, fc ^ fd), c<"㺕">(fe, ff ^ fg)), null)
      );
      this.a(var1, var4, var5, var6, var7, var8, var3);
   }

   @Generated
   public αλμΣΩτψφγζηθξψ(ΨγημιδξΓτοθαζ var1) {
      this.a = new ςξνψηπιβ(this);
      this.v = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void a(User var1) {
      switch (ςζξγηλΛωψΣ.M[var1.getEncoderState().ordinal()]) {
         case 1:
            var1.sendPacketSilently(new WrapperConfigServerClearDialog());
            break;
         case 2:
            var1.sendPacketSilently(new WrapperPlayServerClearDialog());
            break;
         default:
            throw new IllegalArgumentException(c<"㺀">(fo, fp) + var1.getEncoderState());
      }
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 91L;
      var1 ^= 4213250437649420002L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(25 + 43),
                     (byte)(15 + 54),
                     (byte)(77 + 6),
                     (byte)(5 + 42),
                     (byte)(59 + 8),
                     (byte)(3 + 63),
                     (byte)(61 + 6),
                     (byte)(29 + 18),
                     (byte)(71 + 9),
                     (byte)(26 + 49),
                     (byte)(14 + 53),
                     (byte)(41 + 42),
                     (byte)(29 + 24),
                     (byte)(27 + 53),
                     (byte)(24 + 73),
                     (byte)(86 + 14),
                     (byte)(83 + 17),
                     (byte)(99 + 6),
                     110,
                     (byte)(53 + 50)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(11 + 57), 69, (byte)(76 + 7)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(πψυκΠΨμΛΩβΣφμφσ.E("ԬԹԸӻԻԷԲԻՆԵԂՀՄԽՀՆԈࢋ\u0896࢘ࢀࢇࢣࢨࢧ\u0895࢙࢛࢝ࢤࢯ", (byte)13, 69));
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

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   private νχιλΣΩμψιτβΔΣδμ a(User var1, Channel var2) {
      switch (ςζξγηλΛωψΣ.L[this.v.b().a().ordinal()]) {
         case 1:
            com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ var5 = (com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ)var2.attr(com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ.a).get();
            if (var5 == null) {
               String var6 = c<"㺀">(l, m ^ n) + var1.getName() + c<"㺃">(o & p, q);
               ψΓωτιμωκχψΛΨ.c(var6);
               this.a(var1);
               String[] var7 = new String[s];
               var7[t] = c<"㺆">(u, v ^ w);
               var7[x] = c<"㺉">(y, z ^ aa);
               var7[ab] = c<"㺌">(ac, ad ^ ae) + var6;
               var7[af] = c<"㺏">(ag & ah, ai);
               var7[aj] = c<"㺒">(ak, al ^ am);
               αυμξτυζΩ.a(var1, ΩτωνοφχεΠ.a(βιχγΓλχΠσπ.a(var7)));
               return null;
            }

            return var5;
         case 2:
         case 3:
            ωΦΛΩμυνθφςςκαα var3 = (ωΦΛΩμυνθφςςκαα)var2.attr(ωΦΛΩμυνθφςςκαα.f).get();
            if (var3 == null) {
               String var4 = c<"㺕">(an, ao ^ ap) + var1.getName() + c<"㺘">(aq & ar, as);
               ψΓωτιμωκχψΛΨ.c(var4);
               this.a(var1);
               String[] var10001 = new String[au];
               var10001[av] = c<"㺛">(aw & ax, ay);
               var10001[az] = c<"㺞">(ba & bb, bc);
               var10001[bd] = c<"㺡">(be, bf) + var4;
               var10001[bg] = c<"㺤">(bh & bi, bj);
               var10001[bk] = c<"㺧">(bl, bm);
               αυμξτυζΩ.a(var1, ΩτωνοφχεΠ.a(βιχγΓλχΠσπ.a(var10001)));
               return null;
            }

            return var3;
         default:
            throw new IllegalStateException(c<"㺪">(bn & bo, bp) + this.v.b().a() + c<"㺭">(bq & br, bs));
      }
   }
}
