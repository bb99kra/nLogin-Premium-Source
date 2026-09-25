package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.protocol.nbt.NBT;
import com.nickuc.login.lib.packetevents.api.protocol.nbt.NBTCompound;
import com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketTypeCommon;
import com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType.Play.Client;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import com.nickuc.login.lib.packetevents.api.resources.ResourceLocation;
import com.nickuc.login.lib.packetevents.api.wrapper.configuration.client.WrapperConfigClientCustomClickAction;
import com.nickuc.login.lib.packetevents.api.wrapper.play.client.WrapperPlayClientCustomClickAction;
import io.netty.channel.Channel;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_225 implements NLoginInterface_003 {
   private static int db = Integer.reverse(0);
   private static int br = Integer.reverse(1207959552);
   private static int r = Integer.reverse(Integer.MIN_VALUE);
   private static int ax = Integer.reverse(1879048192);
   private static long cy = Long.reverse(2706628125522234899L);
   private static long c;
   private static int dg = 864 >>> 101 | 864 << ~101 + 1;
   private static int cg = Integer.reverse(-402653184);
   private static int ad = (2359296 >>> 18 | 2359296 << -18) & -1;
   private static int w = (458752 >>> 16 | 458752 << ~16 + 1) & -1;
   private static int i = (16777216 >>> 120 | 16777216 << -120) & -1;
   private static int s = (1024 >>> 74 | 1024 << ~74 + 1) & -1;
   private static int ao = Integer.reverse(1073741824);
   private static int cl = Integer.reverse(0);
   private static int a = (0 >>> 181 | 0 << ~181 + 1) & -1;
   private static long bh = Long.reverse(6741853391646199315L);
   private static long aj = Long.reverse(2706628125522234899L);
   private static long bc = Long.reverse(2706628125522234899L);
   private static long bz = Long.reverse(2706628125522234899L);
   private static String[] ZKM_STR_B = new String[dg];
   private static int cr = (0 >>> 174 | 0 << -174) & -1;
   private static int h = 512 >>> 9 | 512 << -9;
   private static long az = Long.reverse(8646911284551352320L);
   private static int cd = Integer.reverse(1744830464);
   private static int cp = 0 >>> 81 | 0 << -81;
   private static long cb = Long.reverse(6741853391646199315L);
   private static long ab = Long.reverse(2706628125522234899L);
   private static int al = Integer.reverse(-805306368);
   private static long an = Long.reverse(2706628125522234899L);
   private static int t = (393216 >>> 16 | 393216 << ~16 + 1) & -1;
   private static int bd = Integer.reverse(134217728);
   private static int aa = (-1 >>> 22 | -1 << ~22 + 1) & -1;
   private static int j = (3145728 >>> 180 | 3145728 << ~180 + 1) & -1;
   private static int ac = -1 >>> 177 | -1 << ~177 + 1;
   private static long aq = Long.reverse(6741853391646199315L);
   private static long bw = Long.reverse(2706628125522234899L);
   private static long cc = Long.reverse(8646911284551352320L);
   private static String[] ZKM_STR_A = new String[NLoginCore_225.df];
   private static int ak = 8 >>> 131 | 8 << -131;
   private static int bp = Integer.reverse(Integer.MIN_VALUE);
   private static int cv = 16 >>> 132 | 16 << -132;
   private static int bg = Integer.reverse(-2013265920);
   private static int be = -1 >>> 211 | -1 << -211;
   private static int by = Integer.reverse(-1);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static long af = Long.reverse(8646911284551352320L);
   private static long x = Long.reverse(6741853391646199315L);
   private static int bo = Integer.reverse(0);
   private static int at = (1744830464 >>> 155 | 1744830464 << ~155 + 1) & -1;
   private static int bj = 0 >>> 76 | 0 << ~76 + 1;
   private static long au = Long.reverse(6741853391646199315L);
   private static int as = Integer.reverse(-1073741824);
   private static long o = Long.reverse(8646911284551352320L);
   private static long n = Long.reverse(6741853391646199315L);
   private static int ca = 1342177281 >>> 188 | 1342177281 << -188;
   private static int bn = (33554432 >>> 57 | 33554432 << -57) & -1;
   private static long ce = Long.reverse(6741853391646199315L);
   private static int bu = Integer.reverse(Integer.MIN_VALUE);
   private static int co = 0 >>> 230 | 0 << ~230 + 1;
   private static int dc = 0 >>> 41 | 0 << -41;
   private static int bx = Integer.reverse(671088640);
   private static int ck = Integer.reverse(0);
   private static long g = Long.reverse(2706628125522234899L);
   private static long e = Long.reverse(8646911284551352320L);
   private static int bq = Integer.reverse(Integer.MIN_VALUE);
   private static int am = -1 >>> 20 | -1 << -20;
   private static int cs = Integer.reverse(402653184);
   private static int cz = 1703936 >>> 240 | 1703936 << -240;
   private static int bv = (1245184 >>> 80 | 1245184 << ~80 + 1) & -1;
   private static int cn = (0 >>> 251 | 0 << -251) & -1;
   private static int ah = (10485760 >>> 116 | 10485760 << ~116 + 1) & -1;
   private static int de = 2 >>> 225 | 2 << -225;
   private static long bs = Long.reverse(6741853391646199315L);
   private static long l = Long.reverse(2706628125522234899L);
   private static int bk = Integer.reverse(Integer.MIN_VALUE);
   private static long bf = Long.reverse(2706628125522234899L);
   private static long bt = Long.reverse(8646911284551352320L);
   private static long ae = Long.reverse(6741853391646199315L);
   private static int df = Integer.reverse(-671088640);
   private static int u = Integer.reverse(-1);
   private static int cj = (0 >>> 85 | 0 << -85) & -1;
   private static int p = Integer.reverse(-1610612736);
   private static int f = (4194304 >>> 213 | 4194304 << -213) & -1;
   private static int bb = (62914560 >>> 214 | 62914560 << ~214 + 1) & -1;
   private static int ag = Integer.reverse(0);
   private static int m = '耀' >>> 237 | 32768 << -237;
   private static int cw = 0 >>> 17 | 0 << -17;
   private static long ay = Long.reverse(6741853391646199315L);
   private static int z = Integer.reverse(268435456);
   private static long ar = Long.reverse(8646911284551352320L);
   private static long av = Long.reverse(8646911284551352320L);
   private static long da = Long.reverse(2706628125522234899L);
   private static long d = Long.reverse(6741853391646199315L);
   private static int aw = Integer.reverse(536870912);
   private static int ai = (-1 >>> 85 | -1 << ~85 + 1) & -1;
   private static int bl = 0 >>> 33 | 0 << -33;
   private static int cq = (2 >>> 193 | 2 << ~193 + 1) & -1;
   private static int cm = 0 >>> 125 | 0 << ~125 + 1;
   private static long ct = Long.reverse(6741853391646199315L);
   private static int ba = Integer.reverse(Integer.MIN_VALUE);
   private static long q = Long.reverse(2706628125522234899L);
   private static long y = Long.reverse(8646911284551352320L);
   private static int cx = Integer.reverse(-1744830464);
   private static long bi = Long.reverse(8646911284551352320L);
   private static int k = (-1 >>> 108 | -1 << ~108 + 1) & -1;
   private static int ch = Integer.reverse(-1);
   private static int dd = (33554432 >>> 89 | 33554432 << ~89 + 1) & -1;
   private static int bm = 0 >>> 35 | 0 << -35;
   private static int ap = Integer.reverse(805306368);
   private static long cf = Long.reverse(8646911284551352320L);
   private static long b = Long.reverse(2706628125522234899L);
   private static long cu = Long.reverse(8646911284551352320L);
   private static long ci = Long.reverse(2706628125522234899L);
   private static long v = Long.reverse(2706628125522234899L);

   private String a(User var1, ResourceLocation var2, NBT var3, @Nullable Object var4, Channel var5, boolean var6) {
      if (!(var3 instanceof NBTCompound)) {
         return a(w, x ^ y);
      } else {
         NBTCompound var7 = (NBTCompound)var3;
         NLoginCore_277 var8 = var4 != null ? NLoginCore_206.a(this.b).b().a(var4) : null;
         if (var6 && var8 == null) {
            return a(z & aa, ab);
         } else {
            if (var8 != null) {
               NLoginCore_509 var9 = NLoginCore_206.a(this.b).a().b(var8);
               if (var9.a().b(NLoginCore_077.e)) {
                  return null;
               }
            }

            String var19 = var2.getKey();
            int var10 = ac;
            switch (var19.hashCode()) {
               case -1792388092:
                  if (var19.equals(a(ah & ai, aj))) {
                     var10 = ak;
                  }
                  break;
               case -1434679030:
                  if (var19.equals(a(at, au ^ av))) {
                     var10 = aw;
                  }
                  break;
               case 266377754:
                  if (var19.equals(a(ad, ae ^ af))) {
                     var10 = ag;
                  }
                  break;
               case 397861054:
                  if (var19.equals(a(al & am, an))) {
                     var10 = ao;
                  }
                  break;
               case 963182420:
                  if (var19.equals(a(ap, aq ^ ar))) {
                     var10 = as;
                  }
            }

            switch (var10) {
               case 0:
               case 1:
                  if (!a(ax, ay ^ az).equals(var2.getKey())) {
                     if (var6) {
                        NLoginCore_509 var24 = NLoginCore_206.a(this.b).a().b(var8);
                        var24.a(NLoginCore_567.v, Boolean.valueOf((ba != 0)));
                        return null;
                     }

                     return a(bb, bc);
                  } else {
                     NLoginInterface_017 var23 = NLoginCore_206.a(this.b, var1, var5);
                     if (var23 == null) {
                        return null;
                     } else {
                        String var25 = var7.getStringTagValueOrNull(a(bd & be, bf));
                        if (var25 == null) {
                           return a(bg, bh ^ bi);
                        } else {
                           ForceRegisterConfig var26 = var23.a();
                           if (!var26.s()) {
                              return NLoginCore_150.a(NLoginCore_487.t);
                           } else if (var26.t() && NLoginCore_329.n.ar()) {
                              return null;
                           } else {
                              if (!NLoginCore_206.a(this.b).a().a(var26, var25)) {
                                 Long var28 = NLoginCore_206.a(this.b).a().a(var26, var26.h(), var1.getAddress().getAddress().getHostAddress());
                                 if (var28 != null) {
                                    NLoginCore_487 var31 = NLoginCore_487.S;
                                    Object[] var32 = new Object[bk];
                                    var32[bl] = NLoginCore_189.b(var28);
                                    return NLoginCore_150.a(var31, var32);
                                 }

                                 return NLoginCore_150.a(NLoginCore_487.Q);
                              }

                              if (var6) {
                                 NLoginCore_509 var27 = NLoginCore_206.a(this.b).a().b(var8);
                                 NLoginCore_206.a(this.b).b().a(var26, var8, var27, var25, (bn != 0), (bo != 0));
                              } else {
                                 var23.b(var25, null);
                              }

                              return null;
                           }
                        }
                     }
                  }
               case 2:
                  if (var6) {
                     NLoginCore_509 var21 = NLoginCore_206.a(this.b).a().b(var8);
                     var21.a(NLoginCore_567.v, Boolean.valueOf((bp != 0)));
                     var21.a(NLoginCore_567.w, Boolean.valueOf((bq != 0)));
                  } else {
                     NLoginInterface_017 var22 = NLoginCore_206.a(this.b, var1, var5);
                     if (var22 == null) {
                        return null;
                     }

                     var22.g();
                  }

                  return null;
               case 3:
               case 4:
                  if (!a(br, bs ^ bt).equals(var2.getKey())) {
                     if (var6) {
                        NLoginCore_509 var20 = NLoginCore_206.a(this.b).a().b(var8);
                        var20.a(NLoginCore_567.v, Boolean.valueOf((bu != 0)));
                        return null;
                     }

                     return a(bv, bw);
                  } else {
                     NLoginInterface_017 var11 = NLoginCore_206.a(this.b, var1, var5);
                     if (var11 == null) {
                        return null;
                     } else {
                        String var12 = var7.getStringTagValueOrNull(a(bx & by, bz));
                        if (var12 == null) {
                           return a(ca, cb ^ cc);
                        } else {
                           String var13 = var7.getStringTagValueOrNull(a(cd, ce ^ cf));
                           if (var13 == null) {
                              return a(cg & ch, ci);
                           } else {
                              int var14 = var12.length();
                              if (var14 <= NLoginCore_477.T.r()) {
                                 return NLoginCore_150.a(NLoginCore_487.L);
                              } else if (var14 >= NLoginCore_477.U.r()) {
                                 return NLoginCore_150.a(NLoginCore_487.K);
                              } else if (NLoginCore_477.V.ar() && !BCryptHashProvider.b().matcher(var12).matches()) {
                                 return NLoginCore_150.a(NLoginCore_487.M);
                              } else if (!var12.equals(var13)) {
                                 return NLoginCore_150.a(NLoginCore_487.N);
                              } else {
                                 ForceRegisterConfig var15 = var11.a();
                                 if (var15.s()) {
                                    return NLoginCore_150.a(NLoginCore_487.H);
                                 } else {
                                    NLoginCore_229 var16 = var15.a();
                                    if (var16 != NLoginCore_229.a && var16 != NLoginCore_229.c) {
                                       String var17 = ((InetSocketAddress)var5.remoteAddress()).getAddress().getHostAddress();
                                       if (NLoginCore_477.M.ar() && !NLoginCore_477.S.a(new Object[co]).contains(var17)) {
                                          NLoginCore_576 var18 = NLoginCore_206.a(this.b).a().a(var17);
                                          if (var18 == null) {
                                             return NLoginCore_150.a(NLoginCore_487.w);
                                          }

                                          if (var18.a(NLoginCore_477.N.r())) {
                                             NLoginCore_487 var10000 = NLoginCore_487.v;
                                             Object[] var10001 = new Object[cq];
                                             var10001[cr] = var18.a().stream().map(NLoginCore_216::getName).collect(Collectors.joining(a(cs, ct ^ cu)));
                                             return NLoginCore_150.a(var10000, var10001);
                                          }
                                       }
                                    }

                                    String var29 = BCryptHashProvider.b().w(var12);
                                    if (var6) {
                                       NLoginCore_509 var30 = NLoginCore_206.a(this.b).a().b(var8);
                                       NLoginCore_206.a(this.b).b().a(var15, var8, var30, var12, var29, (cv != 0), (cw != 0));
                                    } else {
                                       var11.b(var12, var29);
                                    }

                                    return null;
                                 }
                              }
                           }
                        }
                     }
                  }
               default:
                  return a(cx, cy) + var2.getKey() + a(cz, da);
            }
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_225.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_138.E("ӮԐԒӲԖԵԭՃԯӾԼԲՀԺԃԨՊՉՁՇՁԖ", (byte)10, 69), NLoginCore_225.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_173.C("жутЅхсмхѐпЌъючъѐВަޣޣޯޟީޣޝЦ", (byte)10, 67) + var1 + NLoginCore_092.E("Ԁ", (byte)10, 69) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   @Override
   public void a(PacketReceiveEvent var1) {
      PacketTypeCommon var2 = var1.getPacketType();
      if (var2 == Client.CUSTOM_CLICK_ACTION) {
         if (BCryptHashProvider.a() != NLoginCore_175.d) {
            return;
         }

         WrapperPlayClientCustomClickAction var3 = new WrapperPlayClientCustomClickAction(var1);
         ResourceLocation var4 = var3.getId();
         if (!a(a, b).equals(var4.getNamespace())) {
            return;
         }

         Channel var5 = (Channel)var1.getChannel();
         NLoginCore_096 var6 = var5.hasAttr(NLoginCore_096.c) ? (NLoginCore_096)var5.attr(NLoginCore_096.c).get() : null;
         User var7 = var1.getUser();
         if (var7 == null) {
            return;
         }

         if (var6 == null) {
            NLoginCore_206.a(this.b, var7);
            NLoginCore_234.i(var7, a(c, d ^ e));
            return;
         }

         Object var8 = var1.getPlayer();
         if (var8 == null) {
            NLoginCore_206.a(this.b, var7);
            NLoginCore_234.i(var7, a(f, g));
            return;
         }

         var1.setCancelled((h != 0));
         NLoginCore_206.a(this.b).b((i != 0)).a(() -> {
            if (var5.isActive()) {
               String var7x = this.a(var7, var4, var3.getPayload(), var8, (Channel)var1.getChannel(), (de != 0));
               if (var7x != null) {
                  NLoginCore_206.a(this.b, var7);
                  NLoginCore_234.i(var7, var7x);
               } else {
                  NLoginCore_206.a(this.b, var7);
               }
            }
         });
      } else {
         if (var2 != com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType.Configuration.Client.CUSTOM_CLICK_ACTION) {
            throw new IllegalArgumentException(a(t & u, v) + var1.getPacketType());
         }

         if (BCryptHashProvider.a() != NLoginCore_175.c) {
            return;
         }

         WrapperConfigClientCustomClickAction var9 = new WrapperConfigClientCustomClickAction(var1);
         ResourceLocation var10 = var9.getId();
         if (!a(j & k, l).equals(var10.getNamespace())) {
            return;
         }

         User var11 = var1.getUser();
         if (var11 == null) {
            return;
         }

         Channel var12 = (Channel)var1.getChannel();
         NLoginCore_096 var13 = var12.hasAttr(NLoginCore_096.c) ? (NLoginCore_096)var12.attr(NLoginCore_096.c).get() : null;
         if (var13 == null) {
            NLoginCore_206.a(this.b, var11);
            NLoginCore_234.i(var11, a(m, n ^ o));
            return;
         }

         if (var13.a == null) {
            NLoginCore_206.a(this.b, var11);
            NLoginCore_234.i(var11, a(p, q));
            return;
         }

         var1.setCancelled((r != 0));
         NLoginCore_206.a(this.b).b((s != 0)).a(() -> {
            if (var12.isActive()) {
               String var6x = this.a(var11, var10, var9.getPayload(), null, var12, (db != 0));
               if (var6x != null) {
                  NLoginCore_206.a(this.b, var11);
                  if (!var6x.isEmpty()) {
                     NLoginCore_234.i(var11, var6x);
                  } else {
                     NLoginCore_206.a(this.b, var11);
                     var11.closeConnection();
                  }

                  var13.a.resume((dc != 0));
               } else {
                  var12.attr(NLoginCore_096.c).set(null);
                  var13.a.resume((dd != 0));
                  NLoginCore_206.a(this.b, var11);
               }
            }
         });
      }
   }

   public NLoginCore_225(NLoginCore_206 var1) {
      this.b = var1;
   }

   private static String a(int var0, long var1) {
      var1 ^= 30L;
      var1 ^= -3808096011769041116L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(61 + 7),
                     (byte)(40 + 29),
                     (byte)(7 + 76),
                     47,
                     (byte)(8 + 59),
                     (byte)(53 + 13),
                     (byte)(26 + 41),
                     47,
                     (byte)(33 + 47),
                     (byte)(23 + 52),
                     (byte)(3 + 64),
                     (byte)(34 + 49),
                     (byte)(19 + 34),
                     (byte)(60 + 20),
                     (byte)(41 + 56),
                     (byte)(34 + 66),
                     (byte)(34 + 66),
                     (byte)(53 + 52),
                     (byte)(32 + 78),
                     (byte)(27 + 76)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(23 + 45), 69, (byte)(71 + 12)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_201.A("ļŉňċŋŇłŋŖŅĒŐŔōŐŖĘҬҩҩҵҥүҩң", (byte)45, 65));
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

   private static void b() {
      c = -4003230469624958534L;
      long var0 = c ^ -3808096011769041116L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(65 + 3),
               (byte)(36 + 33),
               (byte)(76 + 7),
               (byte)(28 + 19),
               (byte)(44 + 23),
               (byte)(51 + 15),
               (byte)(28 + 39),
               (byte)(12 + 35),
               (byte)(18 + 62),
               (byte)(25 + 50),
               (byte)(55 + 12),
               (byte)(15 + 68),
               53,
               (byte)(56 + 24),
               97,
               (byte)(75 + 25),
               (byte)(42 + 58),
               (byte)(6 + 99),
               (byte)(64 + 46),
               (byte)(74 + 29)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(22 + 47), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_091.F("ՂԩՒԨՇՎԱԴԚՎՇԢ", (byte)30, 70);
               ZKM_STR_B[1] = NLoginCore_530.D("оіҀ҇ѧѭѹхҊ҃ҁҊҌґѱю҄ѶѺғюѺҍёҎѱџҜҞ҂ҢѣѲҙѧҡҧѺѼҏѦ҇ҠґҮѬҠҕҐѸѴѲҩѯқѷҼһҔҕҙҲҥҲҟӅѼӄӁҍҨ҈ӃҜҐҏӅӔҐҶҢғҶӒӋҥҢң", (byte)30, 68);
               ZKM_STR_B[2] = NLoginCore_446.E("ԉԡՋՒԲԸՄԐՕՎՌՕ\u0557՜ԼԙՏՁՅ՞ԙՅ\u0558ԜՙԼԪէթՍխԮԽդԲլղՅՇ՚ԱՒի՜չԷիՠ՛ՃԿԽմՂՂ\u058bթ՟փՈՊիխզՊըֈ։ճ֗ֈդձՎեբ", (byte)30, 69);
               ZKM_STR_B[3] = NLoginCore_223.C("ѷў҇ѝѼ҃Ѧѩя҃Ѽї", (byte)30, 67);
               ZKM_STR_B[4] = NLoginCore_201.E(
                  "ԉԡՋՒԲԸՄԐՕՎՌՕ\u0557՜ԼԙՏՁՅ՞ԙՅ\u0558ԜՙԼԪէթՍխԮԽդԲլղՅՇ՚ԱՒի՜չԷիՠ՛ՃԿԽմԺզՂևֆ՟ՠդսհսժ\u0590Շ֏\u058c\u0558ճՓ֎է՛՚\u0590֟՛ցխ՞ց֖֝հխծ", (byte)30, 69
               );
               ZKM_STR_B[5] = NLoginCore_553.D("оіҀ҇ѧѭѹхҊ҃ҁҊҌґѱю҄ѶѺғюѺҍёҎѱџҜҞ҂ҢѣѲҙѧҡҧѺѼҏѦ҇ҠґҮѬҠҕҐѸѴѲҩҽҶҝҹѺѴҢӃҲҢӂҖқҗҠҝӀ҇ҭҽҥӅӍҨӂӒӕґұӄӔҫҥҢң", (byte)30, 68);
               ZKM_STR_B[6] = NLoginCore_110.E("ՌԝԧՐՐԠԦՏՕԩ\u0530ԵԸՐՒՂԲԬԥՑգ՞՟ԧՀԩԫ՞հՄՏՑԳդդծաՋՇՋՓդշՂ", (byte)30, 69);
               ZKM_STR_B[7] = NLoginCore_451.F("ԉԡՋՒԲԸՄԐՕՎՌՕ\u0557՜ԼԙՏՁՅ՞ԙՅ\u0558ԜՙԼԪէթՍխԮԽդԲլղՅՇ՚ԱՒի՜չԷիՠ՛ՃԿԽմԾպղաՉջեշքւ֊ճղե֔ՠ\u0557ՔլզևՔբ", (byte)30, 70);
               ZKM_STR_B[8] = NLoginCore_141.A("êĂĬĳēęĥñĶįĭĶĸĽĝúİĢĦĿúĦĹýĺĝċňŊĮŎďĞŅēōœĦĨĻĒĳŌĽŚĘŌŁļĤĠĞŕģģŬŊŀŤĩīŌŎŇīŉũŪŔŸũŅŒįņŃ", (byte)30, 65);
               ZKM_STR_B[9] = NLoginCore_521.B("ĆĦįīöĺĢùĸīĈđīĀýģğķĳĳĤđĎď", (byte)30, 66);
               ZKM_STR_B[10] = NLoginCore_232.B("ĞĨĊķćČđ÷ĻĹīĻėėĽńĤġĺńĥķĎď", (byte)30, 66);
               ZKM_STR_B[11] = NLoginCore_232.F("ԧՏԒԎ\u0557ԪԓԩՊՑԚԙԬԛԡԪՃՐ\u0530Ի՛զԭԮ", (byte)30, 70);
               ZKM_STR_B[12] = NLoginCore_138.E("ԡԟԵ\u0557ԡՈՔՑ\u0558Ԧ\u0558ԱԬԫՍԹԕ՛ՆԟԦՄ՟՜ՄԿթՀՃկԫՁ", (byte)30, 69);
               ZKM_STR_B[13] = NLoginCore_232.C("ієѪҌіѽ҉҆ҍћҍѨҀҏѷ҉җыѱѳѸѵѢѣ", (byte)30, 67);
               ZKM_STR_B[14] = NLoginCore_092.D("њѺ҃ѿъҎѶэҌѿќѥѿєёѷѳҋ҇҇ѸѥѢѣ", (byte)30, 68);
               ZKM_STR_B[15] = NLoginCore_384.D("҅ѤѩѧѨѽѣѽѽѭѦї", (byte)30, 68);
               ZKM_STR_B[16] = NLoginCore_324.C("ѹ҃ѹѿућѦхѺѱҁћѲѶҖҍҌҌѪ҄҆ҋѢѣ", (byte)30, 67);
               ZKM_STR_B[17] = NLoginCore_559.C("оіҀ҇ѧѭѹхҊ҃ҁҊҌґѱю҄ѶѺғюѺҍёҎѱџҜҞ҂ҢѣѲҙѧҡҧѺѼҏѦ҇ҠґҮѬҠҕҐѸѴѲҩҽҶҝҹѺѴҢӃҲҢӂҞ҇ҙҪҟһӍҟҤҹҨҋӏҴҍӄҠҐӈӛғҥҢң", (byte)30, 67);
               ZKM_STR_B[18] = NLoginCore_397.A("ĂĀĖĸĂĩĵĲĹćĹĒčČĮĚöļħĀćĥŀĽĥĠŊġĤŐČĢ", (byte)30, 65);
               ZKM_STR_B[19] = NLoginCore_553.D("҅ѤѩѧѨѽѣѽѽѭѦї", (byte)30, 68);
               ZKM_STR_B[20] = NLoginCore_559.D("ѹ҃ѹѿућѦхѺѱҀъѭѴҖҘҖҎђѨҘқѢѣ", (byte)30, 68);
               ZKM_STR_B[21] = NLoginCore_530.F("ԉԡՋՒԲԸՄԐՕՎՌՕ\u0557՜ԼԙՏՁՅ՞ԙՅ\u0558ԜՙԼԪէթՍխԮԽդԲլղՅՇ՚ԱՒի՜չԷիՠ՛ՃԿԽմֈցըքՅԿխ֎սխ֍թՒդյժֆ֘ժկքղֈժշ\u0558֕մքտղռ֖խծ", (byte)30, 70);
               ZKM_STR_B[22] = NLoginCore_553.F("ՄՎՄՊԎԦԱԐՅԼՋԕՙԫԡԹԠԴԢեբ\u0530ԭԮ", (byte)30, 70);
               ZKM_STR_B[23] = NLoginCore_559.A("êĂĬĳēęĥñĶįĭĶĸĽĝúİĢĦĿúĦĹýĺĝċňŊĮŎďĞŅēōœĦĨĻĒĳŌĽŚĘŌŁļĤĠĞŕũŢŉťĦĠŎůŞŎŮŊĳŅŖŋŧŹŋŐťŕıŋŵūŘŘļŐƆšƇŎŏ", (byte)30, 65);
               ZKM_STR_B[24] = NLoginCore_397.B("ìĖĆĆĳôīĨĭīùă", (byte)30, 66);
               ZKM_STR_B[25] = NLoginCore_223.F("ԉԡՋՒԲԸՄԐՕՎՌՕ\u0557՜ԼԙՏՁՅ՞ԙՅ\u0558ԜՙԼԪէթՍխԮԽդԲլղՅՇ՚ԱՒի՜չԷիՠ՛ՃԿԽմԾպղաՉջեշքւ֊֓\u058cՏլֈխՔ֒խք\u0558բ", (byte)30, 70);
               ZKM_STR_B[26] = NLoginCore_453.A("ĪģĬĘĬąđĚĸôĞă", (byte)30, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_575.C("тѤѢљѫҁўѢѥќњѩѳғҊҌѪѤҌѭїѥѢѣ", (byte)30, 67);
               ZKM_STR_B[1] = NLoginCore_141.F(
                  "ԉԡՋՒԲԸՄԐՕՎՌՕ\u0557՜ԼԙՏՁՅ՞ԙՅ\u0558ԜՙԼԪէթՍխԮԽդԲլղՅՇ՚ԱՒի՜չԷիՠ՛ՃԿԽմԺզՂևֆ՟ՠդսհսժ\u0590Շ֏\u058c\u0558ճՓ֎է\u0558թ՛՝արա֚ա֢ջրխծ", (byte)30, 70
               );
               ZKM_STR_B[2] = NLoginCore_559.C("оіҀ҇ѧѭѹхҊ҃ҁҊҌґѱю҄ѶѺғюѺҍёҎѱџҜҞ҂ҢѣѲҙѧҡҧѺѼҏѦ҇ҠґҮѬҠҕҐѸѴѲҩѷѷӀҞҔҸѽѿҠҢқҠҝҫҥҖҺӏӌҟӈӅҌӂҔӀҠҶҵҬӍҖҥҢң", (byte)30, 67);
               ZKM_STR_B[3] = NLoginCore_110.F("ՇԠԵՑԍՓՁՅԓ\u0530ՌԬՓԾաԛՕԣԯաԦՀԭԮ", (byte)30, 70);
               ZKM_STR_B[4] = NLoginCore_397.C("оіҀ҇ѧѭѹхҊ҃ҁҊҌґѱю҄ѶѺғюѺҍёҎѱџҜҞ҂ҢѣѲҙѧҡҧѺѼҏѦ҇ҠґҮѬҠҕҐѸѴѲҩѯқѷҼһҔҕҙҲҥҲҟӅѼӄӁҍҨ҈ӃҜҍҦҞҍӔҿґҦҤӍӆҵҢң", (byte)30, 67);
               ZKM_STR_B[5] = NLoginCore_397.C("оіҀ҇ѧѭѹхҊ҃ҁҊҌґѱю҄ѶѺғюѺҍёҎѱџҜҞ҂ҢѣѲҙѧҡҧѺѼҏѦ҇ҠґҮѬҠҕҐѸѴѲҩҽҶҝҹѺѴҢӃҲҢӂҖқҗҠҝӀ҇ҭҽҥӅҲӎҌҷҶҏҋҫҺӚӋҢң", (byte)30, 67);
               ZKM_STR_B[6] = NLoginCore_138.B("ĭþĈııāćİĶĊđĖęıĳģēčĆĲńĿŀĈġĊČĿőĥİĲĪıĿœīĤĶńĺķĕģ", (byte)30, 66);
               ZKM_STR_B[7] = NLoginCore_387.F("ԉԡՋՒԲԸՄԐՕՎՌՕ\u0557՜ԼԙՏՁՅ՞ԙՅ\u0558ԜՙԼԪէթՍխԮԽդԲլղՅՇ՚ԱՒի՜չԷիՠ՛ՃԿԽմԾպղաՉջեշքւ֊թՆէ\u0590֗ճ֊ժոք\u058bբ", (byte)30, 70);
               ZKM_STR_B[8] = NLoginCore_138.B("êĂĬĳēęĥñĶįĭĶĸĽĝúİĢĦĿúĦĹýĺĝċňŊĮŎďĞŅēōœĦĨĻĒĳŌĽŚĘŌŁļĤĠĞŕģģŬŊŀŤĩīŌŎŇıŧľŦŮŔŴźŲŸŸŎűũłŤŌşŗřŁőŎŏ", (byte)30, 66);
               ZKM_STR_B[9] = NLoginCore_027.D("њѺ҃ѿъҎѶэҌѿњѭѮѝџҗєѥ҄ҕҝҋѢѣ", (byte)30, 68);
               ZKM_STR_B[10] = NLoginCore_183.F("ԽՇԩՖԦԫ\u0530Ԗ՚\u0558ՈԗՉՔԭՍՔ՜\u0530ՑԞՖԭԮ", (byte)30, 70);
               ZKM_STR_B[11] = NLoginCore_553.C("ќ҄чуҌџшўѿ҆э҅ѡѥѰғіҌѤѷєҎҕїҕҐҞѸ҄҄Ѥџ", (byte)30, 67);
               ZKM_STR_B[12] = NLoginCore_521.A("ĂĀĖĸĂĩĵĲĹćĹĒčČĮĚöļħĀćģłėĢćĖİĉĿħĿ", (byte)30, 65);
               ZKM_STR_B[13] = NLoginCore_446.E("ԡԟԵ\u0557ԡՈՔՑ\u0558ԦՙԕԱՒԽԠՌ՚ԱՎաԣՈժԦԢՅԹԨ՛ԱՒ", (byte)30, 69);
               ZKM_STR_B[14] = NLoginCore_530.D("њѺ҃ѿъҎѶэҌѿњҍѴҀҊҎѐҕѹҌђқѢѣ", (byte)30, 68);
               ZKM_STR_B[15] = NLoginCore_027.C("҄њѩћѡ҉҄҄ҊѼѢї", (byte)30, 67);
               ZKM_STR_B[16] = NLoginCore_183.B("ĥįĥīïćĒñĦĝįħĝĭċĭěĵĂăćķĎď", (byte)30, 66);
               ZKM_STR_B[17] = NLoginCore_324.D("оіҀ҇ѧѭѹхҊ҃ҁҊҌґѱю҄ѶѺғюѺҍёҎѱџҜҞ҂ҢѣѲҙѧҡҧѺѼҏѦ҇ҠґҮѬҠҕҐѸѴѲҩҽҶҝҹѺѴҢӃҲҢӂҞ҇ҙҪҟһӍҟҤҹҩҩҋҽҰҟҐҪӆҚҮӋҢң", (byte)30, 68);
               ZKM_STR_B[18] = NLoginCore_223.A("ĂĀĖĸĂĩĵĲĹćĹĒčČĮĚöļħĀćĵĊŁĖĜĦĮĥěįō", (byte)30, 65);
               ZKM_STR_B[19] = NLoginCore_387.B("ĥĨĢėďĕĆĳòđĖă", (byte)30, 66);
               ZKM_STR_B[20] = NLoginCore_241.E("ՄՎՄՊԎԦԱԐՅԼՎԔՌՒԛԯՙՌԛՑ՜ՖԭԮ", (byte)30, 69);
               ZKM_STR_B[21] = NLoginCore_384.D("оіҀ҇ѧѭѹхҊ҃ҁҊҌґѱю҄ѶѺғюѺҍёҎѱџҜҞ҂ҢѣѲҙѧҡҧѺѼҏѦ҇ҠґҮѬҠҕҐѸѴѲҩҽҶҝҹѺѴҢӃҲҢӂҞ҇ҙҪҟһӍҟҤҹҦҮӋӅҎӑӅӈҙғҴҵҢң", (byte)30, 68);
               ZKM_STR_B[22] = NLoginCore_173.F("ՄՎՄՊԎԦԱԐՅԼՎՕԬԪՙԼդՏ\u0530\u0558Դ\u0530ԭԮ", (byte)30, 70);
               ZKM_STR_B[23] = NLoginCore_110.E("ԉԡՋՒԲԸՄԐՕՎՌՕ\u0557՜ԼԙՏՁՅ՞ԙՅ\u0558ԜՙԼԪէթՍխԮԽդԲլղՅՇ՚ԱՒի՜չԷիՠ՛ՃԿԽմֈցըքՅԿխ֎սխ֍թՒդյժֆ֘ժկքմղշՠսնտռ՜ձ֒րխծ", (byte)30, 69);
               ZKM_STR_B[24] = NLoginCore_471.D("цпѵфєѭѫяюѧўї", (byte)30, 68);
               ZKM_STR_B[25] = NLoginCore_076.A("êĂĬĳēęĥñĶįĭĶĸĽĝúİĢĦĿúĦĹýĺĝċňŊĮŎďĞŅēōœĦĨĻĒĳŌĽŚĘŌŁļĤĠĞŕğśœłĪŜņŘťţūŵũţŤťųŨŕŖŚŸŃ", (byte)30, 65);
               ZKM_STR_B[26] = NLoginCore_004.B("ăċħĭąĒďĳĬĳĒă", (byte)30, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_201.F("ԦԧԾԾԣԔՔԺՐԼ\u0557ՐԿԮՠՁԭԱՓա՟\u0530ԭԮ", (byte)30, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_173.B("ĲĠćďīāôĦĔķĻþğİĺĿİńĞăĖġĎď", (byte)30, 66);
         }
      }
   }
}
