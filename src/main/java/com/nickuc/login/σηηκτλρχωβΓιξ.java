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

public abstract class σηηκτλρχωβΓιξ implements nLoginAPI {
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
   protected final ΨγημιδξΓτοθαζ a;
   private static long ei = Long.reverse(2882303761517117440L);
   private static int an = 33554432 >>> 216 | 33554432 << -216;
   private static int dg = Integer.reverse(Integer.MIN_VALUE);
   public static final int a = σηηκτλρχωβΓιξ.ez;
   private static int bi = Integer.reverse(536870912);
   private static int bx = Integer.reverse(1073741824);
   private static int ew = 0 >>> 2 | 0 << -2;
   private static String[] b = new String[σηηκτλρχωβΓιξ.ey];
   private static int ca = (0 >>> 134 | 0 << -134) & -1;
   private static long bp = Long.reverse(2882303761517117440L);
   private static int ao = 402653184 >>> 251 | 402653184 << ~251 + 1;
   private static int ez = Integer.reverse(-805306368);
   private static long g = Long.reverse(2882303761517117440L);
   private static int do = (637534208 >>> 121 | 637534208 << -121) & -1;
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
   private static String[] a = new String[σηηκτλρχωβΓιξ.ex];
   private static int db = 64 >>> 2 | 64 << -2;
   private static long dq = Long.reverse(2882303761517117440L);
   private static int p = 536870912 >>> 220 | 536870912 << ~220 + 1;
   private static long dj = Long.reverse(-6741185754825347157L);
   private static int di = (2176 >>> 71 | 2176 << ~71 + 1) & -1;
   private static int dx = Integer.reverse(1744830464);
   private static long u = Long.reverse(-8470568011735617621L);
   private static int eq = (112 >>> 66 | 112 << -66) & -1;
   private static long cf = Long.reverse(2882303761517117440L);
   private final Cache<String, στΩξξχκι> a = Caffeine.newBuilder().expireAfterWrite(el, TimeUnit.SECONDS).build();
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
      this.a(var2, c<"㺀">(z, aa ^ ab));
      this.a();
      AccountDataImpl var3 = this.a(var1);
      return var3.getHashedPassword().map(var1x -> {
         γτΓξβμΠΣυχ var2x = γτΓξβμΠΣυχ.a(var1x);
         return Boolean.valueOf((boolean)(var2x != null && var2x.a().i(var2, var1x) ? ev : ew));
      }).orElse(Boolean.valueOf((boolean)ac));
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean performUnregister(@Nonnull Identity var1) {
      this.a();
      στΩξξχκι var2 = this.a(var1);
      if (var2.h()) {
         String var3 = this.b(var1);
         ΨαχΨχΣλεΠψΦ var4 = this.a.b().a(var3);
         UUID var5 = var4 != null ? var4.a() : var2.a();
         ΨγημιδξΓτοθαζ var10000 = this.a;
         EventEnum var10001 = EventEnum.UNREGISTER;
         Object[] var10002 = new Object[ak];
         var10002[al] = null;
         var10002[am] = var5;
         var10002[an] = var2.i();
         var10002[ao] = UnregisterSource.BY_API;
         if (var10000.a(var10001, var10002)) {
            synchronized (var2.c) {
               if (this.a.a().a(var2)) {
                  ψΓωτιμωκχψΛΨ.b(c<"㺀">(ap, aq ^ ar) + var2.i() + c<"㺃">(as, at));
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
                           var4.a(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.q, var4));
                        }
                     }
                  }

                  if (var4 != null) {
                     var4.a(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.q, var4));
                  }

                  return (boolean)bd;
               }
            }
         }
      }

      return (boolean)be;
   }

   protected void a(Identity var1) {
      if (var1 == null) {
         throw new IllegalArgumentException(c<"㺀">(du, dv ^ dw));
      } else if (!(var1 instanceof δΓβςζΣψΠ)) {
         throw new IllegalArgumentException(c<"㺃">(dx, dy ^ dz) + δΓβςζΣψΠ.class.getCanonicalName() + c<"㺆">(ea & eb, ec) + var1.getClass().getCanonicalName());
      }
   }

   protected String b(Identity var1) {
      if (var1 instanceof φλφυΔξθγ) {
         φλφυΔξθγ var6 = (φλφυΔξθγ)var1;
         return var6.getKnownName();
      } else if (var1 instanceof ΠιγμμΓΨλς) {
         ΠιγμμΓΨλς var2 = (ΠιγμμΓΨλς)var1;
         String var3 = var2.getName();
         int var4 = var2.getMojangId() != null ? dg : dh;
         String var5;
         if (κδΔΦφγμδξΨωψο.d.ar() && !βδΔφμπθθγ.c(var3, (boolean)var4)) {
            var5 = βδΔφμπθθγ.g(var3, (boolean)var4);
         } else {
            var5 = var3;
         }

         return var5;
      } else {
         throw new IllegalArgumentException(c<"㺀">(di, dj ^ dk) + var1.getClass().getCanonicalName());
      }
   }

   public boolean forceLogin(@Nonnull Identity var1, boolean var2) {
      this.a();
      στΩξξχκι var3 = this.a(var1);
      if (var3.h()) {
         String var4 = this.b(var1);
         ΨαχΨχΣλεΠψΦ var5 = this.a.b().a(var4);
         if (var5 != null) {
            this.a.b().a(var3, var5, var2, (boolean)cy);
            return (boolean)cz;
         }
      }

      return (boolean)da;
   }

   @CheckReturnValue
   protected στΩξξχκι a(Identity var1) {
      String var2 = this.b(var1);
      ΨαχΨχΣλεΠψΦ var3 = this.a.b().a(var2);
      return var3 != null ? this.a.a().b(var3).a() : (στΩξξχκι)this.a.get(var2, var3x -> {
         ςθΓωΩπγΩΩΔβΨω var4 = this.a.a();
         στΩξξχκι var5;
         if (var1 instanceof φλφυΔξθγ) {
            φλφυΔξθγ var6 = (φλφυΔξθγ)var1;
            var5 = var4.c(var6.getKnownName());
         } else {
            if (!(var1 instanceof ΠιγμμΓΨλς)) {
               throw new IllegalArgumentException(c<"㺀">(en & eo, ep) + var1.getClass().getCanonicalName());
            }

            ΠιγμμΓΨλς var7 = (ΠιγμμΓΨλς)var1;
            var5 = var4.a(var7.getName(), var7.getMojangId(), var7.getBedrockId(), (boolean)em);
         }

         if (var5 == null) {
            throw new RuntimeException(c<"㺃">(eq, er ^ es) + var2 + c<"㺆">(et, eu));
         } else {
            return var5;
         }
      });
   }

   public boolean isAvailable() {
      return (boolean)(!this.a.M() ? b : c);
   }

   public long getAccountCount() {
      this.a();
      σΔυγκςνΓλξ var1 = this.a.a();
      return var1.a();
   }

   public boolean setLanguage(@Nonnull Identity var1, @Nullable String var2) {
      this.a();
      if (var2 == null || !var2.isEmpty() && var2.length() <= cm) {
         στΩξξχκι var3 = this.a(var1);
         synchronized (var3.c) {
            if (var2 != null) {
               var3.a().a(c<"㺃">(cp & cq, cr), var2);
            } else {
               var3.a().d(c<"㺆">(cs, ct));
            }

            String var5 = this.b(var1);
            ΨαχΨχΣλεΠψΦ var6 = this.a.b().a(var5);
            if (var6 != null) {
               ιηοψσγξςΩγδ var7 = this.a.a().b(var6);
               εθσξξτΛακπΣ var8 = εθσξξτΛακπΣ.c(var2);
               if (var8 != null) {
                  var7.a(πβκνλοΛκΠδΦτφλ.i, var8);
               }
            }

            if (var3.a().E()) {
               ςθΓωΩπγΩΩΔβΨω var10000 = this.a.a();
               ξξοηλξνΨ[] var10002 = new ξξοηλξνΨ[cu];
               var10002[cv] = ξξοηλξνΨ.l;
               if (!var10000.a(var3, var10002)) {
                  return (boolean)cx;
               }
            }

            return (boolean)cw;
         }
      } else {
         throw new IllegalStateException(c<"㺀">(cn, co));
      }
   }

   public boolean performRegister(@Nonnull Identity var1, @Nonnull String var2, @Nullable String var3) {
      this.a(var2, c<"㺀">(ad & ae, af));
      if (var3 != null) {
         this.a(var3, c<"㺃">(ag, ah ^ ai));
      }

      this.a();
      στΩξξχκι var4 = this.a(var1);
      synchronized (var4.c) {
         return (boolean)(!var4.h() ? this.a.a().a(var4, this.a(var1), var2, null, var3) : aj);
      }
   }

   public boolean setDiscord(@Nonnull Identity var1, long var2) {
      this.a();
      στΩξξχκι var4 = this.a(var1);
      synchronized (var4.c) {
         if (var4.h()) {
            var4.a().c(var2 > 0L ? Long.toString(var2) : null);
            ςθΓωΩπγΩΩΔβΨω var10000 = this.a.a();
            ξξοηλξνΨ[] var10002 = new ξξοηλξνΨ[cj];
            var10002[ck] = ξξοηλξνΨ.k;
            return var10000.a(var4, var10002);
         } else {
            return (boolean)cl;
         }
      }
   }

   public boolean isAuthenticated(@Nonnull String var1) {
      ΨαχΨχΣλεΠψΦ var2 = this.a.b().a(var1);
      return (boolean)(var2 != null && this.a.a().b(var2) ? w : x);
   }

   public boolean changePassword(@Nonnull Identity var1, @Nonnull String var2) {
      this.a(var2, c<"㺀">(bf, bg ^ bh));
      this.a();
      στΩξξχκι var3 = this.a(var1);
      if (var3.h()) {
         String var4 = this.b(var1);
         ΨαχΨχΣλεΠψΦ var5 = this.a.b().a(var4);
         UUID var6 = var5 != null ? var5.a() : var3.a();
         ΨγημιδξΓτοθαζ var10000 = this.a;
         EventEnum var10001 = EventEnum.CHANGE_PASSWORD;
         Object[] var10002 = new Object[bi];
         var10002[bj] = var5;
         var10002[bk] = var6;
         var10002[bl] = var4;
         var10002[bm] = ChangePasswordSource.BY_API;
         if (var10000.a(var10001, var10002)) {
            synchronized (var3.c) {
               if (this.a.a().c(var3, var2)) {
                  ψΓωτιμωκχψΛΨ.b(c<"㺃">(bn, bo ^ bp) + var3.i() + c<"㺆">(bq, br ^ bs));
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
                     εδδΠηδξΛΣχ.a(var5, πωιψγηξΓρφυ.o);
                  }

                  return (boolean)cb;
               }
            }
         }
      }

      return (boolean)cc;
   }

   protected AccountDataImpl a(AccountData var1) {
      if (var1 == null) {
         throw new IllegalArgumentException(c<"㺀">(dl & dm, dn));
      } else if (!(var1 instanceof AccountDataImpl)) {
         throw new IllegalArgumentException(
            c<"㺃">(do, dp ^ dq) + AccountDataImpl.class.getCanonicalName() + c<"㺆">(dr, ds ^ dt) + var1.getClass().getCanonicalName()
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
         throw new IllegalArgumentException(var2 + c<"㺀">(ed, ee ^ ef));
      } else if (var1.isEmpty()) {
         throw new IllegalArgumentException(var2 + c<"㺃">(eg, eh ^ ei));
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  σηηκτλρχωβΓιξ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(οΩνΩρωλΨηΛδωδ.B("ƓƵƷƗƻǚǒǨǔƣǡǗǥǟƨǍǯǮǦǬǦƻ", (byte)118, 66), σηηκτλρχωβΓιξ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            φδχεθοκψαλΛογλ.F("֢֕֡դ֤֛֤֠֯֞ի֦֭֩֩֯ձआࣻࣼऀऋःऊऑऔࣾ࣠इऍ֊", (byte)118, 70) + var1 + οΩνΩρωλΨηΛδωδ.C("Ց", (byte)118, 67) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 20L;
      var1 ^= -4064315045252723270L;
      if (a[var0] == null) {
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
            throw new RuntimeException(θεωψξβΛσσ.A("źƇƆŉƉƅƀƉƔƃŐƎƒƋƎƔŖӫӠӡӥӰӨӯӶӹӣӅӬӲ", (byte)76, 65));
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

   protected String a(Identity var1) {
      String var2;
      if (var1 instanceof φλφυΔξθγ) {
         φλφυΔξθγ var3 = (φλφυΔξθγ)var1;
         var2 = var3.getKnownName();
      } else {
         if (!(var1 instanceof ΠιγμμΓΨλς)) {
            throw new IllegalArgumentException(c<"㺀">(db, dc ^ dd) + var1.getClass().getCanonicalName());
         }

         ΠιγμμΓΨλς var4 = (ΠιγμμΓΨλς)var1;
         var2 = var4.getName();
      }

      String var5;
      if ((var5 = βδΔφμπθθγ.h(var2, (boolean)de)) != null) {
         return var5;
      } else {
         return (var5 = βδΔφμπθθγ.h(var2, (boolean)df)) != null ? var5 : var2;
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
      ΨαχΨχΣλεΠψΦ var3 = this.a.b().a(var2);
      if (var3 != null) {
         ιηοψσγξςΩγδ var4 = this.a.a().b(var3);
         Integer var5 = var4.b();
         if (var5 != null) {
            return var5;
         }
      }

      return y;
   }

   @Nonnull
   public List<AccountData> getAccountsByIp(@Nonnull String var1) {
      this.a(var1, c<"㺀">(e, f ^ g));
      this.a();
      ArrayList var2 = new ArrayList();

      try {
         ΨδΨξξοζεΦεςνδς var10000 = this.a.a().a();
         String var10001 = c<"㺃">(h, i);
         Object[] var10002 = new Object[j];
         var10002[k] = ΣλνΨουΩΔοθεβ.e.a(new Object[l]);
         var10002[m] = ξξοηλξνΨ.g.getName();
         var10001 = String.format(var10001, var10002);
         var10002 = new Object[n];
         var10002[o] = var1;
         ΔτιηητηζΔ var3 = var10000.a(var10001, var10002);

         try {
            ResultSet var4 = var3.d();

            while (var4.next()) {
               στΩξξχκι var5 = this.a.a().a(var4);
               if (var5 == null) {
                  throw new RuntimeException(c<"㺆">(p, q ^ r));
               }

               var2.add(ΛΣββυψΔμκΣζΣχΦτ.from(var5));
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
         ψΓωτιμωκχψΛΨ.c(c<"㺉">(s & t, u) + var1, var8);
      }

      return ηζησΠΠωΓργπ.a(var2);
   }

   @Nonnull
   public String getVersion() {
      return this.a.s();
   }

   @Generated
   public σηηκτλρχωβΓιξ(ΨγημιδξΓτοθαζ var1) {
      this.a = var1;
   }

   protected void a() {
      if (!this.isAvailable()) {
         throw new nLoginNotReadyException(c<"㺀">(ej, ek));
      }
   }

   public boolean setEmail(@Nonnull Identity var1, @Nullable String var2) {
      if (var2 != null) {
         this.a(var2, c<"㺀">(cd, ce ^ cf));
      }

      this.a();
      στΩξξχκι var3 = this.a(var1);
      synchronized (var3.c) {
         if (var3.h()) {
            var3.a().b(var2);
            ςθΓωΩπγΩΩΔβΨω var10000 = this.a.a();
            ξξοηλξνΨ[] var10002 = new ξξοηλξνΨ[cg];
            var10002[ch] = ξξοηλξνΨ.j;
            return var10000.a(var3, var10002);
         } else {
            return (boolean)ci;
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
               b[0] = βθκςνθΩθυμςτκχ.F("խՌճԶՋ\u0530շԸձՇԸՂ", (byte)62, 70);
               b[1] = δΛψπξκσβγςα.C("өӪөҼӀӠҠӪӍӌӐҽӎӖӞҲӖӕөӺӦӈӻӻӳӽӺҹӁӵԁӺӵӣӸӕҾӟӞӈӯӛӍӎԃӥӱԑԍӹӥԕԎԛӢӣ", (byte)62, 67);
               b[2] = ΠΛΨοδΩσμνΛγΦφβς.E("իԬՐմՎՎմջննՖԺպմնՠ՞Ցզ՛նձՒ՛նՄգկջե\u058c՝", (byte)62, 69);
               b[3] = ΨφιωσρΓδΔθ.E("ձՂՒ\u0557գԲժԳխԮՆ՚ԾթԾԺՙղ՟\u0557՟ճձճՋսյ՞՚ժտրռՔև֕՟լւՙ֗էՔբ", (byte)62, 69);
               b[4] = ΣφδσΔζιΠρα.D("ӈҷҶӣӀӨӃҿӞӞұӴӑҬҾӲӷӯөӺӊӫӂӃ", (byte)62, 68);
               b[5] = ΣφδσΔζιΠρα.C("ӘӥҧӪӛӛҹӂӰӮӁӜӑӃӪӸӉӗҵӍӜӕӂӃ", (byte)62, 67);
               b[6] = ντθΔζβΔζ.E("ՀյԾբ\u0557մչՉԺչ՚ղՓԷձՐռ՝Փ\u0557ենՍՎ", (byte)62, 69);
               b[7] = φΨαξωυθανΣφυκη.F("հՂԿալձՋճ՛զՍհ՛մբպոբՙոևՠՍՎ", (byte)62, 70);
               b[8] = θεωψξβΛσσ.A("ĪűŒıŇĶřķŴŹżŐŒŵŻƄŲőſœűŉƆŉţƀżżūůźŉŪƂƎŠŷŕųƆŚśūſƛŵƞŲŻŵƎŻŸƁŮů", (byte)62, 65);
               b[9] = βθκςνθΩθυμςτκχ.C("ӤҲӀҪӫҾӥӫӐҹӝӟҪӐӧӕӗҫӱӉөӕӂӃ", (byte)62, 67);
               b[10] = ζοηκορΦνΣθγΩ.C("ӝӆҦҝӧӚҭӥӟӄӋӆӱұҾӐҴӫӨӪӐӱӚһҾӫӷӜӘӯӂӳ", (byte)62, 67);
               b[11] = μεςΩΔΣγν.C("ҞӥӆҥһҪӍҫӨӭӱӌӮҵҨӧӮӅӭҭӷӵӛӒӝӁӞӽӎӷӅӀӺӇӴӺԁӉӠԃӡӰӚӗ", (byte)62, 67);
               b[12] = ντθΔζβΔζ.E("կճՉՔշէծԶԭՖՉՂ", (byte)62, 69);
               b[13] = ΣερμΔσατσκ.D("ҴәӘӡӋӦҶӗӰӍұӬҫӆӎӦӦӦӥӬӵӻҶӚӫҹӂӐӖӶӦӑөӤӄӨәӦԅӷӚԋӒӉӮԄӵԓԖӒӢӓԈԗԗԙԖӿӷԏӚӶԤԦӱӿӷԖԛԕԢԚӽԋԒԴӪԉԎԀԫӹԦԼԝԕԂԃ", (byte)62, 68);
               b[14] = βεξΠθρρςΔΦμ.D("ӧҴҿӗӃҶӡҸҢҾӇӢӯҭӱӨӢӃҷӍәӻӂӃ", (byte)62, 68);
               b[15] = ΨφιωσρΓδΔθ.C("ӧҴҿӗӃҶӡҸҢҾӇӢӯҭӱӨӢӃҷӍәӻӂӃ", (byte)62, 67);
               b[16] = οοθδΨιοΦΠβδζ.F("ՋձխԭՁըզՄԶժԸՙշրտձ՚՝ղՂֆՃցդպգ՜զոոՉվՒ֑քՎ\u0557\u058b։֗։ծթբ", (byte)62, 70);
               b[17] = δΛψπξκσβγςα.A("ŌŲŮĮłũŧŅķūĹŚŸƁƀŲśŞųŃƇńƂťŻŤŝŧŹŹŊſœƒƅŏŘƌƊƘƊůŪţ", (byte)62, 65);
               b[18] = μζξτΩσσφυδεπλΨ.A("īŦłŕŅŵŧŇĹŏĺŇĺūōŵŌŝļŶƆƇżƄźŬŽƋżƎƅŨƌŬžųŵƆŒƜƘƛƘţ", (byte)62, 65);
               b[19] = ΨφιωσρΓδΔθ.A("īŦłŕŅŵŧŇĹŏĺķŎŌśĵžųőƄĿņŵūŋŶƏƉƐżźŜšŕƎŐƁƗƉƍŲųƑŝŒſŪƌŠƜƐŞŢƁŮů", (byte)62, 65);
               b[20] = βεξΠθρρςΔΦμ.D("ҤӪӅӥӢҬӎӄҪӤҼӀүӂӓӔӁӢӪӐӕӕӂӃ", (byte)62, 68);
               b[21] = θεωψξβΛσσ.F("ԿՋթԱղՌծՇՊՇ՝ՉՑԺց՚՝ՀՁհԽՔղ՟ֆՖ\u058c\u058bեթֈ֏ղՋ֖զՏ\u058bմյ֛֕ձբ", (byte)62, 70);
               b[22] = λΣΩσμφγχ.B("ŀŌŪĲųōůňŋňŧřŜųŀźŲŢŗŘŇŴťƆſŹūŮŋŬƃŐƃŝőƘŔŘŹŻŜƑŮţ", (byte)62, 66);
               b[23] = ζβησεθωυγτ.D("ҤӪӅӥӢҬӎӄҪӤҼӀүӂӓӔӁӢӪӐӕӕӂӃ", (byte)62, 68);
               b[24] = λΣΩσμφγχ.C("ӢҳҠҤӟҿәӚӑҮӤӞӨӫӴӎҲӆӸӨӈӦӏӚҽӶӂӖӼӱӚӝ", (byte)62, 67);
               b[25] = ντθΔζβΔζ.B("ŮĿĬİūŋťŦŝĺűŷźŘĸŸƀƀŚŻřƉşŴŴśƃƈƈŊŊŪ", (byte)62, 66);
               b[26] = ΣερμΔσατσκ.E("ԩՂՕՂըհ\u0557ԹՒՖջ՝վ՚ՠՁ\u0557ՍփԾՙզՆՉՠ։֎ՇՉոֆֆ՜լփՈՍդ֚ֈՔ՛ֆ\u058bշ֘֞ռջձ֘՝ճքզ֕գչխ֙ֈո֩րְ֒֠\u058cճ֫ոֳ֤֖֩ւ", (byte)62, 69);
               b[27] = χΠξΦιζΨΣωΦσΨζ.C("ӀӦӢҢҶӝӛҹҫӟҭӎӬӵӴӦӏӒӧҷӻҸӶәӯӘӑӛӭӭҾӳӇԆӹӃӌԀӾԌӾӣӞӗ", (byte)62, 67);
               b[28] = ΨφιωσρΓδΔθ.E("ձՂՒ\u0557գԲժԳխԮՆ՚ԾթԾԺՙղ՟\u0557՟գֈԼռօվ՟ագեՈսդ֎գ։ֈ֕Փ՚֕֝ն՟֜՜\u058c֑֖֤֚֞հխծ", (byte)62, 69);
               b[29] = ςΦζσμτΓσ.A("ĳŭŌİņŷŃŇũūŬŃ", (byte)62, 65);
               break;
            case 1:
               b[0] = φΨαξωυθανΣφυκη.A("ŝōœŬūŉŃŧŨŮźŷŰŬŚŝōľśœŇƇŎŏ", (byte)62, 65);
               b[1] = ΦδφπθΩΩλζξ.E("մյմՇՋիԫյ\u0558\u0557՛ՈՙաթԽաՠմօձՓֆֆվֈօՄՌր\u058cօրծփՠՉժթՓպզ՛թձվ֣֕֓Ֆրշարխծ", (byte)62, 69);
               b[2] = χΠξΦιζΨΣωΦσΨζ.D("ӠҡӅөӃӃөӰӫӫӋүӯөӫӕӓӆӛӐӫӗӐӘӑӫӋԁӕӠӮӒ", (byte)62, 68);
               b[3] = θεωψξβΛσσ.F("ձՂՒ\u0557գԲժԳխԮՆ՚ԾթԾԺՙղ՟\u0557՟ճձճՋսյ՞՚ժտրՉ՜յՔ֎ՔՋ֕լլ֒զ՟ՙո՝կ֏ս֛դհխծ", (byte)62, 70);
               b[4] = φδχεθοκψαλΛογλ.E("ՓՂՁծՋճՎՊթթԳլՙղտիմծՂւջՔՂզԽդե՟\u058cէրբ", (byte)62, 69);
               b[5] = ΦδφπθΩΩλζξ.E("գհԲյզզՄՍջչՊզնրՁջՙեՒհքնՍՎ", (byte)62, 69);
               b[6] = ΣφδσΔζιΠρα.C("ҵӪҳӗӌөӮҾүӮӐҽӳӆӮӟӒӑәӉӨӫӂӃ", (byte)62, 67);
               b[7] = οοθδΨιοΦΠβδζ.C("ӥҷҴӖӡӦӀӨӐӛӄӞӑҭӣҳӊӺӈӔҶӦҼӷӵӳӔӠҽәӠҾ", (byte)62, 67);
               b[8] = ζβησεθωυγτ.B("ĪűŒıŇĶřķŴŹżŐŒŵŻƄŲőſœűŉƆŉţƀżżūůźŉŪƂƎŠŷŕųƆŚśŬŲŨƙŻƘŸƣŘŷƧƁŮů", (byte)62, 66);
               b[9] = ΨΦνΨΦωυΩνβςμ.A("ŰľŌĶŷŊűŷŜŅūŋřſŏŔŷŢšŦŝŃƀũŅŦƀžŢŮŬũ", (byte)62, 65);
               b[10] = ςΦζσμτΓσ.A("ũŒĲĩųŦĹűūŐŗŒŽĽŊŜŀŷŴŶŜƀŷƃŸƂŦŇƂŜƏŦ", (byte)62, 65);
               b[11] = ΨΦνΨΦωυΩνβςμ.A("ĪűŒıŇĶřķŴŹŽŘźŁĴųźőŹĹƃƁŧŞũōŪƉŚƃőŌŎŵŮŷŭŴźŭœƐźţ", (byte)62, 65);
               b[12] = ΨΦνΨΦωυΩνβςμ.F("ԥԾՖ\u0530ԯ\u0558դ՚ՅԳՐ՜թԶԽՓԽջԻՃփնՍՎ", (byte)62, 70);
               b[13] = οοθδΨιοΦΠβδζ.D("ҴәӘӡӋӦҶӗӰӍұӬҫӆӎӦӦӦӥӬӵӻҶӚӫҹӂӐӖӶӦӑөӤӄӨәӦԅӷӚԋӒӉӮԄӵԓԖӒӢӓԈԗԗԙԖӿӷԏӚӶԤԦӱӿӷԖԛԕԢԚӽԋԒӫԣӰԦԉԄӹԛԳԑԅԂԃ", (byte)62, 68);
               b[14] = ςΦζσμτΓσ.C("ӧҴҿӗӃҶӡҸҢҾӈӱӨҮӭӧӦӲҴӪӖӅӂӃ", (byte)62, 67);
               b[15] = μεςΩΔΣγν.C("ӧҴҿӗӃҶӡҸҢҾӆӒӴҳҬҶӉӊӯӭәӕӂӃ", (byte)62, 67);
               b[16] = βθκςνθΩθυμςτκχ.C("ӀӦӢҢҶӝӛҹҫӟҭӎӬӵӴӦӏӒӧҷӻҸӶәӯӘӑӛӭӭҾӳԁӿӔԁԊӵӉӼӢӞԐӗ", (byte)62, 67);
               b[17] = ςΦζσμτΓσ.F("ՋձխԭՁըզՄԶժԸՙշրտձ՚՝ղՂֆՃցդպգ՜զոոՉվ֍\u058b֔հը\u058cց՚\u058bկչբ", (byte)62, 70);
               b[18] = μεςΩΔΣγν.B("īŦłŕŅŵŧŇĹŏĺŇĺūōŵŌŝļŶƆƇżƄźŬŽƋżƎƅŨƊŒŤũŹƓƐżƉžřţ", (byte)62, 66);
               b[19] = λΣΩσμφγχ.B("īŦłŕŅŵŧŇĹŏĺķŎŌśĵžųőƄĿņŵūŋŶƏƉƐżźŜšŕƎŐƁƗƉƍŲųƐƌŬƓŠƓƂűŶƂŤƗŮů", (byte)62, 66);
               b[20] = ιΠοθΩΦξκ.C("ҤӪӅӥӢҬӎӄҪӤһҪӆҽӎӥӒӸҹӊӷӫӂӃ", (byte)62, 67);
               b[21] = ςΦζσμτΓσ.B("ŀŌŪĲųōůňŋňŞŊŒĻƂśŞŁłűľŕųŠƇŗƍƌŦŪƉƐŲƋšŬƓƖŦƌŪŴŲţ", (byte)62, 66);
               b[22] = οοθδΨιοΦΠβδζ.A("ŀŌŪĲųōůňŋňŧřŜųŀźŲŢŗŘŇŴťƆſŹūŮŋŬƃŐƏƕžŦţƕŤŭŒƘŧŹƍŷšƐƓŢųƣŲűŮů", (byte)62, 65);
               b[23] = ντθΔζβΔζ.C("ҤӪӅӥӢҬӎӄҪӤҼҪӀӅӦҵӨӦӬӊӯӫӂӃ", (byte)62, 67);
               b[24] = πηγμΣΔκκ.A("ŮĿĬİūŋťŦŝĺŰŪŴŷƀŚľŒƄŴŔšŃƀŋŞũŠŚōŚŏ", (byte)62, 65);
               b[25] = ςΦζσμτΓσ.F("խԾԫԯժՊդե՜Թհնչ\u0557Էշտտՙպ\u0558և\u0558չ՞ի\u058cՠ\u0558գ֑ե", (byte)62, 70);
               b[26] = πηγμΣΔκκ.D("ҞҷӊҷӝӥӌҮӇӋӰӒӳӏӕҶӌӂӸҳӎӛһҾӕӾԃҼҾӭӻӻӑӡӸҽӂәԏӽӉӐӻԀӬԍԓӱӰӦԍӒӨӹӛԊӘӮӢԎӽӭԞӵӲӠԡӪԨԅԁԛӸӱӫӳԐԬӾԃԋӲԇԎԼԅԂԃ", (byte)62, 68);
               b[27] = βθκςνθΩθυμςτκχ.F("ՋձխԭՁըզՄԶժԸՙշրտձ՚՝ղՂֆՃցդպգ՜զոոՉվՊ\u058c՝\u0590ՎիՐճկլ՜բ", (byte)62, 70);
               b[28] = ιΠοθΩΦξκ.A("ŲŃœŘŤĳūĴŮįŇśĿŪĿĻŚųŠŘŠŤƉĽŽƆſŠŢŤŦŉžťƏŤƊƉƖŔśƖƞŖŶƌźƋƟűƢƆżƕƚƇƔƜżƝƋƞůƟ", (byte)62, 65);
               b[29] = χφπρψπφΦθμπ.E("ՃըԫմաՇՉՐկ՝ՅՂ", (byte)62, 69);
               break;
            case 2:
               b[0] = ΨφιωσρΓδΔθ.A("őĬťĶńĳņŲŮŔŉŐŚŢŪźſųťŔŚŸļņŧŨƋƋƏžƋŽ", (byte)62, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = πψυκΠΨμΛΩβΣφμφσ.A("ōŞĴůŃŅŬŉĺŎūŌſƁŲūŮƃţĽņŔţłŢũŎŻŉƂƈų", (byte)62, 65);
         }
      }
   }

   @Nonnull
   public Iterator<AccountData> getAccounts() {
      this.a();
      σΔυγκςνΓλξ var1 = this.a.a();
      return new ηωκχκτΛβΦνχνςπφ(this.a.a(), var1.a(), var1.a());
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
      στΩξξχκι var2 = this.a(var1);
      return var2.h() ? Optional.of(ΛΣββυψΔμκΣζΣχΦτ.from(var2)) : Optional.empty();
   }
}
