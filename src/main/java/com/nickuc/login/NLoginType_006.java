package com.nickuc.login;

import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.api.enums.DatabaseType;
import com.nickuc.login.api.enums.ImplementationType;
import com.nickuc.login.api.enums.event.ChangePasswordSource;
import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.api.enums.event.UnregisterSource;
import com.nickuc.login.api.enums.event.UpdatePasswordSource;
import com.nickuc.login.api.exception.nLoginNotReadyException;
import com.nickuc.login.api.types.AccountData;
import com.nickuc.login.api.types.AccountDataImpl;
import com.nickuc.login.api.types.Identity;
import com.nickuc.login.lib.caffeine.cache.Cache;
import com.nickuc.login.lib.caffeine.cache.Caffeine;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public abstract class NLoginType_006 implements nLoginAPI {
   private static long ek = Long.reverse(-8470568011735617621L);
   private static int bk = Integer.reverse(Integer.MIN_VALUE);
   private static int az = Integer.reverse(-1073741824);
   private static int eo = Integer.reverse(-1);
   private static int ch = (0 >>> 29 | 0 << ~29 + 1) & -1;
   private static long dp = Long.reverse(-6741185754825347157L);
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static int bu = 655360 >>> 241 | 655360 << -241;
   private static long dn = Long.reverse(-8470568011735617621L);
   private static int b = (4 >>> 66 | 4 << ~66 + 1) & -1;
   private static long eu = Long.reverse(-8470568011735617621L);
   private static int ay = (4096 >>> 107 | 4096 << -107) & -1;
   private static int o = 0 >>> 147 | 0 << -147;
   private static int cj = 64 >>> 102 | 64 << -102;
   private static int ak = Integer.reverse(536870912);
   private static int t = Integer.reverse(-1);
   private static int s = 1572864 >>> 147 | 1572864 << -147;
   private static int bj = 0 >>> 106 | 0 << ~106 + 1;
   private static int cx = (0 >>> 223 | 0 << -223) & -1;
   private static int ag = 384 >>> 198 | 384 << ~198 + 1;
   private static int bf = Integer.reverse(-1879048192);
   private static long dw = Long.reverse(2882303761517117440L);
   private static int bc = Integer.reverse(0);
   private static long co = Long.reverse(-8470568011735617621L);
   private static long ah = Long.reverse(-6741185754825347157L);
   private static int bz = Integer.reverse(536870912);
   private static long f = Long.reverse(-6741185754825347157L);
   private static int bd = Integer.reverse(Integer.MIN_VALUE);
   private static int dr = Integer.reverse(671088640);
   private static int cq = -1 >>> 38 | -1 << -38;
   private static int cz = Integer.reverse(Integer.MIN_VALUE);
   private static int dl = 147456 >>> 141 | 147456 << -141;
   private static long br = Long.reverse(-6741185754825347157L);
   private static int de = (134217728 >>> 187 | 134217728 << ~187 + 1) & -1;
   private static long i = Long.reverse(-8470568011735617621L);
   private static int al = (0 >>> 190 | 0 << -190) & -1;
   private static int as = Integer.reverse(268435456);
   private static long ep = Long.reverse(-8470568011735617621L);
   private static int cn = (-2147483642 >>> 31 | -2147483642 << -31) & -1;
   private static int en = (28311552 >>> 212 | 28311552 << ~212 + 1) & -1;
   private static long bg = Long.reverse(-6741185754825347157L);
   private static int x = 0 >>> 0 | 0 << -0;
   private static int by = 1610612736 >>> 61 | 1610612736 << -61;
   private static int cy = Integer.reverse(Integer.MIN_VALUE);
   private static int ev = Integer.reverse(Integer.MIN_VALUE);
   private static int z = 64 >>> 228 | 64 << -228;
   private static int cw = 268435456 >>> 252 | 268435456 << ~252 + 1;
   private static int l = (0 >>> 249 | 0 << ~249 + 1) & -1;
   private static int aj = 0 >>> 53 | 0 << ~53 + 1;
   private static long er = Long.reverse(-6741185754825347157L);
   private static int be = (0 >>> 180 | 0 << ~180 + 1) & -1;
   private static int w = Integer.reverse(Integer.MIN_VALUE);
   private static int du = 1376256 >>> 80 | 1376256 << -80;
   private static int d = (176 >>> 164 | 176 << ~164 + 1) & -1;
   private static int bt = (0 >>> 157 | 0 << -157) & -1;
   private static int dh = Integer.reverse(0);
   private static int ck = Integer.reverse(0);
   private static int ej = Integer.reverse(1476395008);
   private static long dd = Long.reverse(2882303761517117440L);
   private static long aa = Long.reverse(-6741185754825347157L);
   private static int eg = Integer.reverse(-1744830464);
   private static int da = (0 >>> 196 | 0 << -196) & -1;
   private static int ea = 6029312 >>> 242 | 6029312 << -242;
   private static int bv = 0 >>> 174 | 0 << ~174 + 1;
   private static long ct = Long.reverse(-8470568011735617621L);
   private static long el = Long.reverse(-4611686018427387904L);
   protected final NLoginType_008 a;
   private static long ei = Long.reverse(2882303761517117440L);
   private static int an = 33554432 >>> 216 | 33554432 << -216;
   private static int dg = Integer.reverse(Integer.MIN_VALUE);
   public static final int a = NLoginType_006.ez;
   private static int bi = Integer.reverse(536870912);
   private static int bx = Integer.reverse(1073741824);
   private static int ew = 0 >>> 2 | 0 << -2;
   private static String[] ZKM_STR_B = new String[NLoginType_006.ey];
   private static int ca = (0 >>> 134 | 0 << -134) & -1;
   private static long bp = Long.reverse(2882303761517117440L);
   private static int ao = 402653184 >>> 251 | 402653184 << ~251 + 1;
   private static int ez = Integer.reverse(-805306368);
   private static long g = Long.reverse(2882303761517117440L);
   private static int var_do = (637534208 >>> 121 | 637534208 << -121) & -1;
   private static long q = Long.reverse(-6741185754825347157L);
   private static long c;
   private static int y = (-1 >>> 210 | -1 << ~210 + 1) & -1;
   private static int c = Integer.reverse(0);
   private static int ac = 0 >>> 253 | 0 << ~253 + 1;
   private static int ed = Integer.reverse(402653184);
   private static int am = Integer.reverse(Integer.MIN_VALUE);
   private static int v = Integer.reverse(0);
   private static int cd = (100663296 >>> 23 | 100663296 << ~23 + 1) & -1;
   private static int e = Integer.reverse(0);
   private static long dk = Long.reverse(2882303761517117440L);
   private static int au = (0 >>> 172 | 0 << ~172 + 1) & -1;
   private static int cs = (480 >>> 133 | 480 << -133) & -1;
   private static int bl = 524288 >>> 146 | 524288 << -146;
   private static long dz = Long.reverse(2882303761517117440L);
   private static int ey = (125829120 >>> 54 | 125829120 << -54) & -1;
   private static long ee = Long.reverse(-6741185754825347157L);
   private static int av = Integer.reverse(-1610612736);
   private static int cu = (16777216 >>> 216 | 16777216 << -216) & -1;
   private static long es = Long.reverse(2882303761517117440L);
   private static int bm = 96 >>> 5 | 96 << ~5 + 1;
   private static int cl = Integer.reverse(0);
   private static int cg = Integer.reverse(Integer.MIN_VALUE);
   private static long bh = Long.reverse(2882303761517117440L);
   private static long dv = Long.reverse(-6741185754825347157L);
   private static int ae = -1 >>> 138 | -1 << ~138 + 1;
   private static long eh = Long.reverse(-6741185754825347157L);
   private static long ai = Long.reverse(2882303761517117440L);
   private static int cp = Integer.reverse(1879048192);
   private static int h = 2 >>> 1 | 2 << ~1 + 1;
   private static long ef = Long.reverse(2882303761517117440L);
   private static String[] ZKM_STR_A = new String[NLoginType_006.ex];
   private static int db = 64 >>> 2 | 64 << -2;
   private static long dq = Long.reverse(2882303761517117440L);
   private static int p = 536870912 >>> 220 | 536870912 << ~220 + 1;
   private static long dj = Long.reverse(-6741185754825347157L);
   private static int di = (2176 >>> 71 | 2176 << ~71 + 1) & -1;
   private static int dx = Integer.reverse(1744830464);
   private static long u = Long.reverse(-8470568011735617621L);
   private static int eq = (112 >>> 66 | 112 << -66) & -1;
   private static long cf = Long.reverse(2882303761517117440L);
   private final Cache<String, ForceRegisterConfig> a = Caffeine.newBuilder().expireAfterWrite(el, TimeUnit.SECONDS).build();
   private static int ad = 5 >>> 0 | 5 << ~0 + 1;
   private static int ci = Integer.reverse(0);
   private static int bb = (0 >>> 127 | 0 << ~127 + 1) & -1;
   private static long ar = Long.reverse(2882303761517117440L);
   private static int cc = 0 >>> 142 | 0 << ~142 + 1;
   private static int cb = 256 >>> 40 | 256 << -40;
   private static long af = Long.reverse(-8470568011735617621L);
   private static int dm = -1 >>> 109 | -1 << ~109 + 1;
   private static long bo = Long.reverse(-6741185754825347157L);
   private static long ab = Long.reverse(2882303761517117440L);
   private static int bq = Integer.reverse(-805306368);
   private static int ex = Integer.reverse(2013265920);
   private static int m = Integer.reverse(Integer.MIN_VALUE);
   private static long dc = Long.reverse(-6741185754825347157L);
   private static long at = Long.reverse(-8470568011735617621L);
   private static int ap = Integer.reverse(-536870912);
   private static long cr = Long.reverse(-8470568011735617621L);
   private static long aq = Long.reverse(-6741185754825347157L);
   private static int k = 0 >>> 92 | 0 << ~92 + 1;
   private static int bn = (20480 >>> 43 | 20480 << -43) & -1;
   private static int aw = Integer.reverse(0);
   private static int et = (60817408 >>> 245 | 60817408 << -245) & -1;
   private static long r = Long.reverse(2882303761517117440L);
   private static long dt = Long.reverse(2882303761517117440L);
   private static int df = 0 >>> 193 | 0 << ~193 + 1;
   private static int em = (262144 >>> 114 | 262144 << ~114 + 1) & -1;
   private static long ce = Long.reverse(-6741185754825347157L);
   private static int bw = (2048 >>> 11 | 2048 << -11) & -1;
   private static int ax = (1073741824 >>> 94 | 1073741824 << ~94 + 1) & -1;
   private static int ba = 512 >>> 39 | 512 << -39;
   private static long ec = Long.reverse(-8470568011735617621L);
   private static int cv = 0 >>> 84 | 0 << ~84 + 1;
   private static int eb = -1 >>> 3 | -1 << ~3 + 1;
   private static long dy = Long.reverse(-6741185754825347157L);
   private static int j = Integer.reverse(1073741824);
   private static long ds = Long.reverse(-6741185754825347157L);
   private static long bs = Long.reverse(2882303761517117440L);
   private static int cm = (20480 >>> 12 | 20480 << ~12 + 1) & -1;

   public boolean comparePassword(AccountData var1, String var2) {
      this.a(var2, a(z, aa ^ ab));
      this.a();
      AccountDataImpl var3 = this.a(var1);
      return var3.getHashedPassword().map(var1x -> {
         NLoginCore_566 var2x = NLoginCore_566.a(var1x);
         return Boolean.valueOf(((var2x != null && var2x.a() != 0).i(var2, var1x) ? ev : ew));
      }).orElse(Boolean.valueOf((ac != 0)));
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean performUnregister(@Nonnull Identity var1) {
      this.a();
      ForceRegisterConfig var2 = this.a(var1);
      if (var2.h()) {
         String var3 = this.b(var1);
         NLoginCore_277 var4 = this.a.b().a(var3);
         UUID var5 = var4 != null ? var4.a() : var2.a();
         NLoginType_008 var10000 = this.a;
         EventEnum var10001 = EventEnum.UNREGISTER;
         Object[] var10002 = new Object[ak];
         var10002[al] = null;
         var10002[am] = var5;
         var10002[an] = var2.i();
         var10002[ao] = UnregisterSource.BY_API;
         if (var10000.a(var10001, var10002)) {
            synchronized (var2.c) {
               if (this.a.a().a(var2)) {
                  NLoginCore_370.b(a(ap, aq ^ ar) + var2.i() + a(as, at));
                  boolean var11 = false /* VF: Semaphore variable */;

                  try {
                     var11 = true;
                     var10000 = this.a;
                     var10001 = EventEnum.PASSWORD_UPDATE_EVENT;
                     var10002 = new Object[av];
                     var10002[aw] = var4;
                     var10002[ax] = var5;
                     var10002[ay] = var3;
                     var10002[az] = null;
                     var10002[ba] = UpdatePasswordSource.BY_API;
                     var10000.a(var10001, var10002);
                     var11 = false;
                  } finally {
                     if (var11) {
                        if (var4 != null) {
                           var4.a(NLoginCore_150.a(NLoginCore_487.q, var4));
                        }
                     }
                  }

                  if (var4 != null) {
                     var4.a(NLoginCore_150.a(NLoginCore_487.q, var4));
                  }

                  return (bd != 0);
               }
            }
         }
      }

      return (be != 0);
   }

   protected void a(Identity var1) {
      if (var1 == null) {
         throw new IllegalArgumentException(a(du, dv ^ dw));
      } else if (!(var1 instanceof NLoginCore_473)) {
         throw new IllegalArgumentException(a(dx, dy ^ dz) + NLoginCore_473.class.getCanonicalName() + a(ea & eb, ec) + var1.getClass().getCanonicalName());
      }
   }

   protected String b(Identity var1) {
      if (var1 instanceof NLoginCore_174) {
         NLoginCore_174 var6 = (NLoginCore_174)var1;
         return var6.getKnownName();
      } else if (var1 instanceof NLoginCore_539) {
         NLoginCore_539 var2 = (NLoginCore_539)var1;
         String var3 = var2.getName();
         int var4 = var2.getMojangId() != null ? dg : dh;
         String var5;
         if (NLoginCore_329.d.ar() && !BCryptHashProvider.c(var3, (var4 != 0))) {
            var5 = BCryptHashProvider.g(var3, (var4 != 0));
         } else {
            var5 = var3;
         }

         return var5;
      } else {
         throw new IllegalArgumentException(a(di, dj ^ dk) + var1.getClass().getCanonicalName());
      }
   }

   public boolean forceLogin(@Nonnull Identity var1, boolean var2) {
      this.a();
      ForceRegisterConfig var3 = this.a(var1);
      if (var3.h()) {
         String var4 = this.b(var1);
         NLoginCore_277 var5 = this.a.b().a(var4);
         if (var5 != null) {
            this.a.b().a(var3, var5, var2, (cy != 0));
            return (cz != 0);
         }
      }

      return (da != 0);
   }

   @CheckReturnValue
   protected ForceRegisterConfig a(Identity var1) {
      String var2 = this.b(var1);
      NLoginCore_277 var3 = this.a.b().a(var2);
      return var3 != null ? this.a.a().b(var3).a() : (ForceRegisterConfig)this.a.get(var2, var3x -> {
         NLoginCore_291 var4 = this.a.a();
         ForceRegisterConfig var5;
         if (var1 instanceof NLoginCore_174) {
            NLoginCore_174 var6 = (NLoginCore_174)var1;
            var5 = var4.c(var6.getKnownName());
         } else {
            if (!(var1 instanceof NLoginCore_539)) {
               throw new IllegalArgumentException(a(en & eo, ep) + var1.getClass().getCanonicalName());
            }

            NLoginCore_539 var7 = (NLoginCore_539)var1;
            var5 = var4.a(var7.getName(), var7.getMojangId(), var7.getBedrockId(), (em != 0));
         }

         if (var5 == null) {
            throw new RuntimeException(a(eq, er ^ es) + var2 + a(et, eu));
         } else {
            return var5;
         }
      });
   }

   public boolean isAvailable() {
      return ((!this.a.M() != 0) ? b : c);
   }

   public long getAccountCount() {
      this.a();
      NLoginCore_495 var1 = this.a.a();
      return var1.a();
   }

   public boolean setLanguage(@Nonnull Identity var1, @Nullable String var2) {
      this.a();
      if (var2 == null || !var2.isEmpty() && var2.length() <= cm) {
         ForceRegisterConfig var3 = this.a(var1);
         synchronized (var3.c) {
            if (var2 != null) {
               var3.a().a(a(cp & cq, cr), var2);
            } else {
               var3.a().d(a(cs, ct));
            }

            String var5 = this.b(var1);
            NLoginCore_277 var6 = this.a.b().a(var5);
            if (var6 != null) {
               NLoginCore_509 var7 = this.a.a().b(var6);
               NLoginCore_055 var8 = NLoginCore_055.c(var2);
               if (var8 != null) {
                  var7.a(NLoginCore_567.i, var8);
               }
            }

            if (var3.a().E()) {
               NLoginCore_291 var10000 = this.a.a();
               NLoginCore_436[] var10002 = new NLoginCore_436[cu];
               var10002[cv] = NLoginCore_436.l;
               if (!var10000.a(var3, var10002)) {
                  return (cx != 0);
               }
            }

            return (cw != 0);
         }
      } else {
         throw new IllegalStateException(a(cn, co));
      }
   }

   public boolean performRegister(@Nonnull Identity var1, @Nonnull String var2, @Nullable String var3) {
      this.a(var2, a(ad & ae, af));
      if (var3 != null) {
         this.a(var3, a(ag, ah ^ ai));
      }

      this.a();
      ForceRegisterConfig var4 = this.a(var1);
      synchronized (var4.c) {
         return ((!var4.h() != 0) ? this.a.a().a(var4, this.a(var1), var2, null, var3) : aj);
      }
   }

   public boolean setDiscord(@Nonnull Identity var1, long var2) {
      this.a();
      ForceRegisterConfig var4 = this.a(var1);
      synchronized (var4.c) {
         if (var4.h()) {
            var4.a().c(var2 > 0L ? Long.toString(var2) : null);
            NLoginCore_291 var10000 = this.a.a();
            NLoginCore_436[] var10002 = new NLoginCore_436[cj];
            var10002[ck] = NLoginCore_436.k;
            return var10000.a(var4, var10002);
         } else {
            return (cl != 0);
         }
      }
   }

   public boolean isAuthenticated(@Nonnull String var1) {
      NLoginCore_277 var2 = this.a.b().a(var1);
      return ((var2 != null && this.a.a() != 0).b(var2) ? w : x);
   }

   public boolean changePassword(@Nonnull Identity var1, @Nonnull String var2) {
      this.a(var2, a(bf, bg ^ bh));
      this.a();
      ForceRegisterConfig var3 = this.a(var1);
      if (var3.h()) {
         String var4 = this.b(var1);
         NLoginCore_277 var5 = this.a.b().a(var4);
         UUID var6 = var5 != null ? var5.a() : var3.a();
         NLoginType_008 var10000 = this.a;
         EventEnum var10001 = EventEnum.CHANGE_PASSWORD;
         Object[] var10002 = new Object[bi];
         var10002[bj] = var5;
         var10002[bk] = var6;
         var10002[bl] = var4;
         var10002[bm] = ChangePasswordSource.BY_API;
         if (var10000.a(var10001, var10002)) {
            synchronized (var3.c) {
               if (this.a.a().c(var3, var2)) {
                  NLoginCore_370.b(a(bn, bo ^ bp) + var3.i() + a(bq, br ^ bs));
                  var10000 = this.a;
                  var10001 = EventEnum.PASSWORD_UPDATE_EVENT;
                  var10002 = new Object[bu];
                  var10002[bv] = var5;
                  var10002[bw] = var6;
                  var10002[bx] = var4;
                  var10002[by] = var2;
                  var10002[bz] = UpdatePasswordSource.BY_API;
                  var10000.a(var10001, var10002);
                  if (var5 != null) {
                     NLoginCore_150.a(var5, NLoginCore_487.o);
                  }

                  return (cb != 0);
               }
            }
         }
      }

      return (cc != 0);
   }

   protected AccountDataImpl a(AccountData var1) {
      if (var1 == null) {
         throw new IllegalArgumentException(a(dl & dm, dn));
      } else if (!(var1 instanceof AccountDataImpl)) {
         throw new IllegalArgumentException(
            a(var_do, dp ^ dq) + AccountDataImpl.class.getCanonicalName() + a(dr, ds ^ dt) + var1.getClass().getCanonicalName()
         );
      } else {
         return (AccountDataImpl)var1;
      }
   }

   public boolean isAuthenticated(@Nonnull Identity var1) {
      this.a(var1);
      this.a();
      String var2 = this.b(var1);
      return this.isAuthenticated(var2);
   }

   protected void a(String var1, String var2) {
      if (var1 == null) {
         throw new IllegalArgumentException(var2 + a(ed, ee ^ ef));
      } else if (var1.isEmpty()) {
         throw new IllegalArgumentException(var2 + a(eg, eh ^ ei));
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginType_006.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_397.B("ƓƵƷƗƻǚǒǨǔƣǡǗǥǟƨǍǯǮǦǬǦƻ", (byte)118, 66), NLoginType_006.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_433.F("֢֕֡դ֤֛֤֠֯֞ի֦֭֩֩֯ձआࣻࣼऀऋःऊऑऔࣾ࣠इऍ֊", (byte)118, 70) + var1 + NLoginCore_397.C("Ց", (byte)118, 67) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 20L;
      var1 ^= -4064315045252723270L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(12 + 56),
                     (byte)(37 + 32),
                     83,
                     (byte)(20 + 27),
                     (byte)(65 + 2),
                     (byte)(12 + 54),
                     (byte)(52 + 15),
                     (byte)(26 + 21),
                     (byte)(73 + 7),
                     (byte)(30 + 45),
                     (byte)(29 + 38),
                     (byte)(54 + 29),
                     (byte)(12 + 41),
                     (byte)(71 + 9),
                     (byte)(52 + 45),
                     (byte)(44 + 56),
                     (byte)(57 + 43),
                     (byte)(21 + 84),
                     (byte)(43 + 67),
                     (byte)(35 + 68)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(32 + 51)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_530.A("źƇƆŉƉƅƀƉƔƃŐƎƒƋƎƔŖӫӠӡӥӰӨӯӶӹӣӅӬӲ", (byte)76, 65));
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

   protected String a(Identity var1) {
      String var2;
      if (var1 instanceof NLoginCore_174) {
         NLoginCore_174 var3 = (NLoginCore_174)var1;
         var2 = var3.getKnownName();
      } else {
         if (!(var1 instanceof NLoginCore_539)) {
            throw new IllegalArgumentException(a(db, dc ^ dd) + var1.getClass().getCanonicalName());
         }

         NLoginCore_539 var4 = (NLoginCore_539)var1;
         var2 = var4.getName();
      }

      String var5;
      if ((var5 = BCryptHashProvider.h(var2, (de != 0))) != null) {
         return var5;
      } else {
         return (var5 = BCryptHashProvider.h(var2, (df != 0))) != null ? var5 : var2;
      }
   }

   @Nonnull
   public ImplementationType getImplementationType() {
      return ImplementationType.NATIVE;
   }

   public DatabaseType getDatabaseType() {
      this.a();
      return DatabaseType.valueOf(this.a.a().a().a().name());
   }

   public int getRemainingSeconds(@Nonnull Identity var1) {
      this.a(var1);
      this.a();
      String var2 = this.b(var1);
      NLoginCore_277 var3 = this.a.b().a(var2);
      if (var3 != null) {
         NLoginCore_509 var4 = this.a.a().b(var3);
         Integer var5 = var4.b();
         if (var5 != null) {
            return var5;
         }
      }

      return y;
   }

   @Nonnull
   public List<AccountData> getAccountsByIp(@Nonnull String var1) {
      this.a(var1, a(e, f ^ g));
      this.a();
      ArrayList var2 = new ArrayList();

      try {
         NLoginCore_459 var10000 = this.a.a().a();
         String var10001 = a(h, i);
         Object[] var10002 = new Object[j];
         var10002[k] = NLoginCore_477.e.a(new Object[l]);
         var10002[m] = NLoginCore_436.g.getName();
         var10001 = String.format(var10001, var10002);
         var10002 = new Object[n];
         var10002[o] = var1;
         NLoginCore_171 var3 = var10000.a(var10001, var10002);

         try {
            ResultSet var4 = var3.d();

            while (var4.next()) {
               ForceRegisterConfig var5 = this.a.a().a(var4);
               if (var5 == null) {
                  throw new RuntimeException(a(p, q ^ r));
               }

               var2.add(NLoginType_024.from(var5));
            }
         } catch (Throwable var7) {
            if (var3 != null) {
               try {
                  var3.close();
               } catch (Throwable var6) {
                  var7.addSuppressed(var6);
               }
            }

            throw var7;
         }

         if (var3 != null) {
            var3.close();
         }
      } catch (Exception var8) {
         NLoginCore_370.c(a(s & t, u) + var1, var8);
      }

      return NLoginCore_135.a(var2);
   }

   @Nonnull
   public String getVersion() {
      return this.a.s();
   }

   @Generated
   public NLoginType_006(NLoginType_008 var1) {
      this.a = var1;
   }

   protected void a() {
      if (!this.isAvailable()) {
         throw new nLoginNotReadyException(a(ej, ek));
      }
   }

   public boolean setEmail(@Nonnull Identity var1, @Nullable String var2) {
      if (var2 != null) {
         this.a(var2, a(cd, ce ^ cf));
      }

      this.a();
      ForceRegisterConfig var3 = this.a(var1);
      synchronized (var3.c) {
         if (var3.h()) {
            var3.a().b(var2);
            NLoginCore_291 var10000 = this.a.a();
            NLoginCore_436[] var10002 = new NLoginCore_436[cg];
            var10002[ch] = NLoginCore_436.j;
            return var10000.a(var3, var10002);
         } else {
            return (ci != 0);
         }
      }
   }

   private static void b() {
      c = -3029676331660063163L;
      long var0 = c ^ -4064315045252723270L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(47 + 21),
               (byte)(61 + 8),
               (byte)(18 + 65),
               (byte)(35 + 12),
               67,
               (byte)(58 + 8),
               (byte)(30 + 37),
               (byte)(16 + 31),
               (byte)(7 + 73),
               (byte)(16 + 59),
               (byte)(38 + 29),
               (byte)(52 + 31),
               53,
               (byte)(76 + 4),
               (byte)(95 + 2),
               (byte)(68 + 32),
               (byte)(61 + 39),
               (byte)(20 + 85),
               (byte)(38 + 72),
               (byte)(36 + 67)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(66 + 2), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_173.F("խՌճԶՋ\u0530շԸձՇԸՂ", (byte)62, 70);
               ZKM_STR_B[1] = NLoginCore_183.C("өӪөҼӀӠҠӪӍӌӐҽӎӖӞҲӖӕөӺӦӈӻӻӳӽӺҹӁӵԁӺӵӣӸӕҾӟӞӈӯӛӍӎԃӥӱԑԍӹӥԕԎԛӢӣ", (byte)62, 67);
               ZKM_STR_B[2] = NLoginCore_091.E("իԬՐմՎՎմջննՖԺպմնՠ՞Ցզ՛նձՒ՛նՄգկջե\u058c՝", (byte)62, 69);
               ZKM_STR_B[3] = NLoginCore_559.E("ձՂՒ\u0557գԲժԳխԮՆ՚ԾթԾԺՙղ՟\u0557՟ճձճՋսյ՞՚ժտրռՔև֕՟լւՙ֗էՔբ", (byte)62, 69);
               ZKM_STR_B[4] = NLoginCore_451.D("ӈҷҶӣӀӨӃҿӞӞұӴӑҬҾӲӷӯөӺӊӫӂӃ", (byte)62, 68);
               ZKM_STR_B[5] = NLoginCore_451.C("ӘӥҧӪӛӛҹӂӰӮӁӜӑӃӪӸӉӗҵӍӜӕӂӃ", (byte)62, 67);
               ZKM_STR_B[6] = NLoginCore_110.E("ՀյԾբ\u0557մչՉԺչ՚ղՓԷձՐռ՝Փ\u0557ենՍՎ", (byte)62, 69);
               ZKM_STR_B[7] = NLoginCore_453.F("հՂԿալձՋճ՛զՍհ՛մբպոբՙոևՠՍՎ", (byte)62, 70);
               ZKM_STR_B[8] = NLoginCore_530.A("ĪűŒıŇĶřķŴŹżŐŒŵŻƄŲőſœűŉƆŉţƀżżūůźŉŪƂƎŠŷŕųƆŚśūſƛŵƞŲŻŵƎŻŸƁŮů", (byte)62, 65);
               ZKM_STR_B[9] = NLoginCore_173.C("ӤҲӀҪӫҾӥӫӐҹӝӟҪӐӧӕӗҫӱӉөӕӂӃ", (byte)62, 67);
               ZKM_STR_B[10] = NLoginCore_092.C("ӝӆҦҝӧӚҭӥӟӄӋӆӱұҾӐҴӫӨӪӐӱӚһҾӫӷӜӘӯӂӳ", (byte)62, 67);
               ZKM_STR_B[11] = NLoginCore_521.C("ҞӥӆҥһҪӍҫӨӭӱӌӮҵҨӧӮӅӭҭӷӵӛӒӝӁӞӽӎӷӅӀӺӇӴӺԁӉӠԃӡӰӚӗ", (byte)62, 67);
               ZKM_STR_B[12] = NLoginCore_110.E("կճՉՔշէծԶԭՖՉՂ", (byte)62, 69);
               ZKM_STR_B[13] = NLoginCore_241.D("ҴәӘӡӋӦҶӗӰӍұӬҫӆӎӦӦӦӥӬӵӻҶӚӫҹӂӐӖӶӦӑөӤӄӨәӦԅӷӚԋӒӉӮԄӵԓԖӒӢӓԈԗԗԙԖӿӷԏӚӶԤԦӱӿӷԖԛԕԢԚӽԋԒԴӪԉԎԀԫӹԦԼԝԕԂԃ", (byte)62, 68);
               ZKM_STR_B[14] = NLoginCore_223.D("ӧҴҿӗӃҶӡҸҢҾӇӢӯҭӱӨӢӃҷӍәӻӂӃ", (byte)62, 68);
               ZKM_STR_B[15] = NLoginCore_559.C("ӧҴҿӗӃҶӡҸҢҾӇӢӯҭӱӨӢӃҷӍәӻӂӃ", (byte)62, 67);
               ZKM_STR_B[16] = NLoginCore_471.F("ՋձխԭՁըզՄԶժԸՙշրտձ՚՝ղՂֆՃցդպգ՜զոոՉվՒ֑քՎ\u0557\u058b։֗։ծթբ", (byte)62, 70);
               ZKM_STR_B[17] = NLoginCore_183.A("ŌŲŮĮłũŧŅķūĹŚŸƁƀŲśŞųŃƇńƂťŻŤŝŧŹŹŊſœƒƅŏŘƌƊƘƊůŪţ", (byte)62, 65);
               ZKM_STR_B[18] = NLoginCore_446.A("īŦłŕŅŵŧŇĹŏĺŇĺūōŵŌŝļŶƆƇżƄźŬŽƋżƎƅŨƌŬžųŵƆŒƜƘƛƘţ", (byte)62, 65);
               ZKM_STR_B[19] = NLoginCore_559.A("īŦłŕŅŵŧŇĹŏĺķŎŌśĵžųőƄĿņŵūŋŶƏƉƐżźŜšŕƎŐƁƗƉƍŲųƑŝŒſŪƌŠƜƐŞŢƁŮů", (byte)62, 65);
               ZKM_STR_B[20] = NLoginCore_223.D("ҤӪӅӥӢҬӎӄҪӤҼӀүӂӓӔӁӢӪӐӕӕӂӃ", (byte)62, 68);
               ZKM_STR_B[21] = NLoginCore_530.F("ԿՋթԱղՌծՇՊՇ՝ՉՑԺց՚՝ՀՁհԽՔղ՟ֆՖ\u058c\u058bեթֈ֏ղՋ֖զՏ\u058bմյ֛֕ձբ", (byte)62, 70);
               ZKM_STR_B[22] = NLoginCore_553.B("ŀŌŪĲųōůňŋňŧřŜųŀźŲŢŗŘŇŴťƆſŹūŮŋŬƃŐƃŝőƘŔŘŹŻŜƑŮţ", (byte)62, 66);
               ZKM_STR_B[23] = NLoginCore_027.D("ҤӪӅӥӢҬӎӄҪӤҼӀүӂӓӔӁӢӪӐӕӕӂӃ", (byte)62, 68);
               ZKM_STR_B[24] = NLoginCore_553.C("ӢҳҠҤӟҿәӚӑҮӤӞӨӫӴӎҲӆӸӨӈӦӏӚҽӶӂӖӼӱӚӝ", (byte)62, 67);
               ZKM_STR_B[25] = NLoginCore_110.B("ŮĿĬİūŋťŦŝĺűŷźŘĸŸƀƀŚŻřƉşŴŴśƃƈƈŊŊŪ", (byte)62, 66);
               ZKM_STR_B[26] = NLoginCore_241.E("ԩՂՕՂըհ\u0557ԹՒՖջ՝վ՚ՠՁ\u0557ՍփԾՙզՆՉՠ։֎ՇՉոֆֆ՜լփՈՍդ֚ֈՔ՛ֆ\u058bշ֘֞ռջձ֘՝ճքզ֕գչխ֙ֈո֩րְ֒֠\u058cճ֫ոֳ֤֖֩ւ", (byte)62, 69);
               ZKM_STR_B[27] = NLoginCore_387.C("ӀӦӢҢҶӝӛҹҫӟҭӎӬӵӴӦӏӒӧҷӻҸӶәӯӘӑӛӭӭҾӳӇԆӹӃӌԀӾԌӾӣӞӗ", (byte)62, 67);
               ZKM_STR_B[28] = NLoginCore_559.E("ձՂՒ\u0557գԲժԳխԮՆ՚ԾթԾԺՙղ՟\u0557՟գֈԼռօվ՟ագեՈսդ֎գ։ֈ֕Փ՚֕֝ն՟֜՜\u058c֑֖֤֚֞հխծ", (byte)62, 69);
               ZKM_STR_B[29] = NLoginCore_324.A("ĳŭŌİņŷŃŇũūŬŃ", (byte)62, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_453.A("ŝōœŬūŉŃŧŨŮźŷŰŬŚŝōľśœŇƇŎŏ", (byte)62, 65);
               ZKM_STR_B[1] = NLoginCore_232.E("մյմՇՋիԫյ\u0558\u0557՛ՈՙաթԽաՠմօձՓֆֆվֈօՄՌր\u058cօրծփՠՉժթՓպզ՛թձվ֣֕֓Ֆրշարխծ", (byte)62, 69);
               ZKM_STR_B[2] = NLoginCore_387.D("ӠҡӅөӃӃөӰӫӫӋүӯөӫӕӓӆӛӐӫӗӐӘӑӫӋԁӕӠӮӒ", (byte)62, 68);
               ZKM_STR_B[3] = NLoginCore_530.F("ձՂՒ\u0557գԲժԳխԮՆ՚ԾթԾԺՙղ՟\u0557՟ճձճՋսյ՞՚ժտրՉ՜յՔ֎ՔՋ֕լլ֒զ՟ՙո՝կ֏ս֛դհխծ", (byte)62, 70);
               ZKM_STR_B[4] = NLoginCore_433.E("ՓՂՁծՋճՎՊթթԳլՙղտիմծՂւջՔՂզԽդե՟\u058cէրբ", (byte)62, 69);
               ZKM_STR_B[5] = NLoginCore_232.E("գհԲյզզՄՍջչՊզնրՁջՙեՒհքնՍՎ", (byte)62, 69);
               ZKM_STR_B[6] = NLoginCore_451.C("ҵӪҳӗӌөӮҾүӮӐҽӳӆӮӟӒӑәӉӨӫӂӃ", (byte)62, 67);
               ZKM_STR_B[7] = NLoginCore_471.C("ӥҷҴӖӡӦӀӨӐӛӄӞӑҭӣҳӊӺӈӔҶӦҼӷӵӳӔӠҽәӠҾ", (byte)62, 67);
               ZKM_STR_B[8] = NLoginCore_027.B("ĪűŒıŇĶřķŴŹżŐŒŵŻƄŲőſœűŉƆŉţƀżżūůźŉŪƂƎŠŷŕųƆŚśŬŲŨƙŻƘŸƣŘŷƧƁŮů", (byte)62, 66);
               ZKM_STR_B[9] = NLoginCore_127.A("ŰľŌĶŷŊűŷŜŅūŋřſŏŔŷŢšŦŝŃƀũŅŦƀžŢŮŬũ", (byte)62, 65);
               ZKM_STR_B[10] = NLoginCore_324.A("ũŒĲĩųŦĹűūŐŗŒŽĽŊŜŀŷŴŶŜƀŷƃŸƂŦŇƂŜƏŦ", (byte)62, 65);
               ZKM_STR_B[11] = NLoginCore_127.A("ĪűŒıŇĶřķŴŹŽŘźŁĴųźőŹĹƃƁŧŞũōŪƉŚƃőŌŎŵŮŷŭŴźŭœƐźţ", (byte)62, 65);
               ZKM_STR_B[12] = NLoginCore_127.F("ԥԾՖ\u0530ԯ\u0558դ՚ՅԳՐ՜թԶԽՓԽջԻՃփնՍՎ", (byte)62, 70);
               ZKM_STR_B[13] = NLoginCore_471.D("ҴәӘӡӋӦҶӗӰӍұӬҫӆӎӦӦӦӥӬӵӻҶӚӫҹӂӐӖӶӦӑөӤӄӨәӦԅӷӚԋӒӉӮԄӵԓԖӒӢӓԈԗԗԙԖӿӷԏӚӶԤԦӱӿӷԖԛԕԢԚӽԋԒӫԣӰԦԉԄӹԛԳԑԅԂԃ", (byte)62, 68);
               ZKM_STR_B[14] = NLoginCore_324.C("ӧҴҿӗӃҶӡҸҢҾӈӱӨҮӭӧӦӲҴӪӖӅӂӃ", (byte)62, 67);
               ZKM_STR_B[15] = NLoginCore_521.C("ӧҴҿӗӃҶӡҸҢҾӆӒӴҳҬҶӉӊӯӭәӕӂӃ", (byte)62, 67);
               ZKM_STR_B[16] = NLoginCore_173.C("ӀӦӢҢҶӝӛҹҫӟҭӎӬӵӴӦӏӒӧҷӻҸӶәӯӘӑӛӭӭҾӳԁӿӔԁԊӵӉӼӢӞԐӗ", (byte)62, 67);
               ZKM_STR_B[17] = NLoginCore_324.F("ՋձխԭՁըզՄԶժԸՙշրտձ՚՝ղՂֆՃցդպգ՜զոոՉվ֍\u058b֔հը\u058cց՚\u058bկչբ", (byte)62, 70);
               ZKM_STR_B[18] = NLoginCore_521.B("īŦłŕŅŵŧŇĹŏĺŇĺūōŵŌŝļŶƆƇżƄźŬŽƋżƎƅŨƊŒŤũŹƓƐżƉžřţ", (byte)62, 66);
               ZKM_STR_B[19] = NLoginCore_553.B("īŦłŕŅŵŧŇĹŏĺķŎŌśĵžųőƄĿņŵūŋŶƏƉƐżźŜšŕƎŐƁƗƉƍŲųƐƌŬƓŠƓƂűŶƂŤƗŮů", (byte)62, 66);
               ZKM_STR_B[20] = NLoginCore_427.C("ҤӪӅӥӢҬӎӄҪӤһҪӆҽӎӥӒӸҹӊӷӫӂӃ", (byte)62, 67);
               ZKM_STR_B[21] = NLoginCore_324.B("ŀŌŪĲųōůňŋňŞŊŒĻƂśŞŁłűľŕųŠƇŗƍƌŦŪƉƐŲƋšŬƓƖŦƌŪŴŲţ", (byte)62, 66);
               ZKM_STR_B[22] = NLoginCore_471.A("ŀŌŪĲųōůňŋňŧřŜųŀźŲŢŗŘŇŴťƆſŹūŮŋŬƃŐƏƕžŦţƕŤŭŒƘŧŹƍŷšƐƓŢųƣŲűŮů", (byte)62, 65);
               ZKM_STR_B[23] = NLoginCore_110.C("ҤӪӅӥӢҬӎӄҪӤҼҪӀӅӦҵӨӦӬӊӯӫӂӃ", (byte)62, 67);
               ZKM_STR_B[24] = NLoginCore_138.A("ŮĿĬİūŋťŦŝĺŰŪŴŷƀŚľŒƄŴŔšŃƀŋŞũŠŚōŚŏ", (byte)62, 65);
               ZKM_STR_B[25] = NLoginCore_324.F("խԾԫԯժՊդե՜Թհնչ\u0557Էշտտՙպ\u0558և\u0558չ՞ի\u058cՠ\u0558գ֑ե", (byte)62, 70);
               ZKM_STR_B[26] = NLoginCore_138.D("ҞҷӊҷӝӥӌҮӇӋӰӒӳӏӕҶӌӂӸҳӎӛһҾӕӾԃҼҾӭӻӻӑӡӸҽӂәԏӽӉӐӻԀӬԍԓӱӰӦԍӒӨӹӛԊӘӮӢԎӽӭԞӵӲӠԡӪԨԅԁԛӸӱӫӳԐԬӾԃԋӲԇԎԼԅԂԃ", (byte)62, 68);
               ZKM_STR_B[27] = NLoginCore_173.F("ՋձխԭՁըզՄԶժԸՙշրտձ՚՝ղՂֆՃցդպգ՜զոոՉվՊ\u058c՝\u0590ՎիՐճկլ՜բ", (byte)62, 70);
               ZKM_STR_B[28] = NLoginCore_427.A("ŲŃœŘŤĳūĴŮįŇśĿŪĿĻŚųŠŘŠŤƉĽŽƆſŠŢŤŦŉžťƏŤƊƉƖŔśƖƞŖŶƌźƋƟűƢƆżƕƚƇƔƜżƝƋƞůƟ", (byte)62, 65);
               ZKM_STR_B[29] = NLoginCore_004.E("ՃըԫմաՇՉՐկ՝ՅՂ", (byte)62, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_559.A("őĬťĶńĳņŲŮŔŉŐŚŢŪźſųťŔŚŸļņŧŨƋƋƏžƋŽ", (byte)62, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_201.A("ōŞĴůŃŅŬŉĺŎūŌſƁŲūŮƃţĽņŔţłŢũŎŻŉƂƈų", (byte)62, 65);
         }
      }
   }

   @Nonnull
   public Iterator<AccountData> getAccounts() {
      this.a();
      NLoginCore_495 var1 = this.a.a();
      return new NLoginCore_236(this.a.a(), var1.a(), var1.a());
   }

   static {
      b();
   }

   public int getApiVersion() {
      return d;
   }

   public Optional<AccountData> getAccount(@Nonnull Identity var1) {
      this.a(var1);
      this.a();
      ForceRegisterConfig var2 = this.a(var1);
      return var2.h() ? Optional.of(NLoginType_024.from(var2)) : Optional.empty();
   }
}
