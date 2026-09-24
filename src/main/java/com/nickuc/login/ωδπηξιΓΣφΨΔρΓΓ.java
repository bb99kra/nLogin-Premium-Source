package com.nickuc.login;

import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.api.enums.DatabaseType;
import com.nickuc.login.api.enums.ImplementationType;
import com.nickuc.login.api.enums.SpawnType;
import com.nickuc.login.api.exception.nLoginRequestUnavailableException;
import com.nickuc.login.api.exception.nLoginRequestUnsupportedException;
import com.nickuc.login.api.nLoginAPI.nLoginInternal;
import com.nickuc.login.api.types.AccountData;
import com.nickuc.login.api.types.Identity;
import com.nickuc.login.api.types.Location;
import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.lib.json.JSONObject;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class ωδπηξιΓΣφΨΔρΓΓ implements nLoginAPI {
   private static long ah = Long.reverse(-432345564227567616L);
   private static int m = Integer.reverse(536870912);
   private static int cm = Integer.reverse(1073741824);
   private static int cv = Integer.reverse(1073741824);
   private static int ca = Integer.reverse(Integer.MIN_VALUE);
   private static int ch = Integer.reverse(0);
   private static int bb = Integer.reverse(Integer.MIN_VALUE);
   private static long bq = Long.reverse(4827996979049345835L);
   private static long ae = Long.reverse(4827996979049345835L);
   private static int cz = Integer.reverse(0);
   private static int au = 3670016 >>> 18 | 3670016 << ~18 + 1;
   private static int cr = Integer.reverse(Integer.MIN_VALUE);
   private static int cy = (512 >>> 168 | 512 << ~168 + 1) & -1;
   private static int bd = Integer.reverse(134217728);
   private static int cs = (2097152 >>> 212 | 2097152 << ~212 + 1) & -1;
   private static long bi = Long.reverse(-432345564227567616L);
   private static long bh = Long.reverse(-5115950998184709333L);
   private static String[] a = new String[ωδπηξιΓΣφΨΔρΓΓ.db];
   private static int ax = Integer.reverse(-268435456);
   private static int ai = 100663296 >>> 215 | 100663296 << ~215 + 1;
   private static int aa = (9437184 >>> 212 | 9437184 << ~212 + 1) & -1;
   private static int cd = 704 >>> 37 | 704 << -37;
   private static long e = Long.reverse(-432345564227567616L);
   private static int cj = Integer.reverse(1073741824);
   private static int r = (402653184 >>> 91 | 402653184 << ~91 + 1) & -1;
   private static final int l = ωδπηξιΓΣφΨΔρΓΓ.dd;
   private static int an = Integer.reverse(-805306368);
   private static int p = 20971520 >>> 214 | 20971520 << ~214 + 1;
   private static int bv = (0 >>> 164 | 0 << -164) & -1;
   private static int k = -1 >>> 18 | -1 << ~18 + 1;
   private static int z = 0 >>> 109 | 0 << -109;
   private static int af = (92274688 >>> 247 | 92274688 << ~247 + 1) & -1;
   private static long ar = Long.reverse(-432345564227567616L);
   private static int bu = Integer.reverse(Integer.MIN_VALUE);
   private static int cn = 0 >>> 52 | 0 << ~52 + 1;
   private static int am = 0 >>> 97 | 0 << ~97 + 1;
   private static int ce = Integer.reverse(-1);
   private static int by = (524288 >>> 82 | 524288 << -82) & -1;
   private static int at = (0 >>> 131 | 0 << -131) & -1;
   private static int ad = 2560 >>> 168 | 2560 << -168;
   private final nLoginBukkit p;
   private static int ck = (1024 >>> 106 | 1024 << -106) & -1;
   private static int bx = (0 >>> 76 | 0 << ~76 + 1) & -1;
   private static long aw = Long.reverse(4827996979049345835L);
   private static long o = Long.reverse(4827996979049345835L);
   private static long w = Long.reverse(4827996979049345835L);
   private static int bm = Integer.reverse(Integer.MIN_VALUE);
   private static int bo = Integer.reverse(-939524096);
   private static int cq = 0 >>> 152 | 0 << -152;
   private static long i = Long.reverse(-432345564227567616L);
   private final Set<String> a;
   private static int cp = (262144 >>> 49 | 262144 << ~49 + 1) & -1;
   private static long y = Long.reverse(4827996979049345835L);
   private static int br = 41943040 >>> 117 | 41943040 << ~117 + 1;
   private static int dc = -1073741819 >>> 222 | -1073741819 << ~222 + 1;
   private static int ci = Integer.reverse(Integer.MIN_VALUE);
   private static int cx = 8388608 >>> 55 | 8388608 << ~55 + 1;
   private static long be = Long.reverse(-5115950998184709333L);
   private static long b = Long.reverse(4827996979049345835L);
   private static long aq = Long.reverse(-5115950998184709333L);
   private static int v = Integer.reverse(-1);
   private static long bs = Long.reverse(-5115950998184709333L);
   private static long h = Long.reverse(-5115950998184709333L);
   private static int bp = Integer.reverse(-1);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static long az = Long.reverse(4827996979049345835L);
   private final ΛΠομχΓξσΩΔ a = new ΛΠομχΓξσΩΔ(this);
   private static int cl = (0 >>> 108 | 0 << -108) & -1;
   private static long ac = Long.reverse(5386305154335113216L);
   private static long ag = Long.reverse(-5115950998184709333L);
   private static int cg = Integer.reverse(-1073741824);
   private static int db = 192937984 >>> 23 | 192937984 << ~23 + 1;
   private static int al = Integer.reverse(Integer.MIN_VALUE);
   private static int a = (0 >>> 237 | 0 << -237) & -1;
   private static int cu = Integer.reverse(Integer.MIN_VALUE);
   private static long d = Long.reverse(-5115950998184709333L);
   private static int ao = Integer.reverse(0);
   private static int u = Integer.reverse(-536870912);
   private static long bf = Long.reverse(-432345564227567616L);
   private static int ay = Integer.reverse(-1);
   private static int as = 2 >>> 65 | 2 << -65;
   private static int bc = Integer.reverse(0);
   private static String[] b = new String[dc];
   private static int x = Integer.reverse(268435456);
   private static long cc = Long.reverse(4827996979049345835L);
   private static int j = (393216 >>> 49 | 393216 << ~49 + 1) & -1;
   private static long ak = Long.reverse(-432345564227567616L);
   private static long l = Long.reverse(4827996979049345835L);
   private static long bl = Long.reverse(-432345564227567616L);
   private static int ap = Integer.reverse(-1342177280);
   private static int da = Integer.reverse(Integer.MIN_VALUE);
   private static int cb = Integer.reverse(-1476395008);
   private static long bt = Long.reverse(-432345564227567616L);
   private static int cw = (0 >>> 148 | 0 << ~148 + 1) & -1;
   private static long t = Long.reverse(4827996979049345835L);
   private static int bz = Integer.reverse(0);
   private static long bk = Long.reverse(-5115950998184709333L);
   private static int bn = Integer.reverse(0);
   private static long c;
   private static int n = -1 >>> 172 | -1 << ~172 + 1;
   private static int s = Integer.reverse(1610612736);
   private static long cf = Long.reverse(4827996979049345835L);
   private static int co = 16 >>> 100 | 16 << -100;
   private static int f = (0 >>> 249 | 0 << -249) & -1;
   private static long ab = Long.reverse(4827996979049345835L);
   private static int g = 131072 >>> 240 | 131072 << -240;
   private static int av = Integer.reverse(-1);
   private static int ba = (0 >>> 43 | 0 << -43) & -1;
   private static int dd = (1375731715 >>> 24 | 1375731715 << ~24 + 1) & -1;
   private static int bg = (544 >>> 37 | 544 << -37) & -1;
   private static long aj = Long.reverse(-5115950998184709333L);
   private static int bj = 1207959552 >>> 186 | 1207959552 << ~186 + 1;
   private static int ct = Integer.reverse(0);
   private static long q = Long.reverse(4827996979049345835L);
   private static int bw = Integer.reverse(Integer.MIN_VALUE);

   @Nonnull
   public Iterator<AccountData> getAccounts() {
      throw new nLoginRequestUnsupportedException(c<"㺀">(au & av, aw) + this.getImplementationType() + c<"㺃">(ax & ay, az));
   }

   public boolean setEmail(@Nonnull Identity var1, @Nullable String var2) {
      λχγιΨκηζρ var10001 = λχγιΨκηζρ.k;
      Object[] var10002 = new Object[cp];
      var10002[cq] = var1;
      var10002[cr] = var2;
      return this.<Boolean>a(var10001, var10002);
   }

   public boolean isAuthenticated(Identity var1) {
      if (var1 == null) {
         throw new IllegalArgumentException(c<"㺀">(bd, be ^ bf));
      } else if (!(var1 instanceof δΓβςζΣψΠ)) {
         throw new IllegalArgumentException(c<"㺃">(bg, bh ^ bi) + δΓβςζΣψΠ.class.getCanonicalName() + c<"㺆">(bj, bk ^ bl) + var1.getClass().getCanonicalName());
      } else {
         λχγιΨκηζρ var10001 = λχγιΨκηζρ.e;
         Object[] var10002 = new Object[bm];
         var10002[bn] = var1;
         return this.<Boolean>a(var10001, var10002);
      }
   }

   public boolean changePassword(@Nonnull Identity var1, @Nonnull String var2) {
      λχγιΨκηζρ var10001 = λχγιΨκηζρ.j;
      Object[] var10002 = new Object[cm];
      var10002[cn] = var1;
      var10002[co] = var2;
      return this.<Boolean>a(var10001, var10002);
   }

   public long getAccountCount() {
      return this.<Long>a(λχγιΨκηζρ.d);
   }

   @Nonnull
   public nLoginInternal internal() {
      return this.a;
   }

   static {
      b();
   }

   public boolean isAvailable() {
      return (boolean)(!this.p.a().M() && !ΓχυψπωΣςΠκγζΦ.d().isEmpty() ? al : am);
   }

   public boolean performRegister(@Nonnull Identity var1, @Nonnull String var2, @Nullable String var3) {
      λχγιΨκηζρ var10001 = λχγιΨκηζρ.h;
      Object[] var10002 = new Object[cg];
      var10002[ch] = var1;
      var10002[ci] = var2;
      var10002[cj] = var3;
      return this.<Boolean>a(var10001, var10002);
   }

   private static String a(int var0, long var1) {
      var1 ^= 95L;
      var1 ^= -8786943702501008509L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(33 + 35),
                     (byte)(39 + 30),
                     (byte)(28 + 55),
                     (byte)(13 + 34),
                     (byte)(35 + 32),
                     (byte)(21 + 45),
                     (byte)(37 + 30),
                     (byte)(23 + 24),
                     (byte)(63 + 17),
                     (byte)(15 + 60),
                     (byte)(34 + 33),
                     (byte)(70 + 13),
                     (byte)(46 + 7),
                     (byte)(36 + 44),
                     (byte)(73 + 24),
                     (byte)(58 + 42),
                     (byte)(53 + 47),
                     105,
                     (byte)(17 + 93),
                     (byte)(10 + 93)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(25 + 44), (byte)(31 + 52)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(χφπρψπφΦθμπ.E("Փՠ՟Ԣբ՞ՙբխ՜ԩէիդէխԯ࣊ࢶࣃࢻࣃࢿ࢚ࢫ࣏ࢲ࢟࣍ࢠࢡ", (byte)52, 69));
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

   public boolean comparePassword(AccountData var1, String var2) {
      λχγιΨκηζρ var10001 = λχγιΨκηζρ.g;
      Object[] var10002 = new Object[by];
      var10002[bz] = var1;
      var10002[ca] = var2;
      return this.<Boolean>a(var10001, var10002);
   }

   public int getRemainingSeconds(@Nonnull Identity var1) {
      λχγιΨκηζρ var10001 = λχγιΨκηζρ.f;
      Object[] var10002 = new Object[bw];
      var10002[bx] = var1;
      return this.<Integer>a(var10001, var10002);
   }

   public boolean setLanguage(@Nonnull Identity var1, @Nullable String var2) {
      λχγιΨκηζρ var10001 = λχγιΨκηζρ.m;
      Object[] var10002 = new Object[cv];
      var10002[cw] = var1;
      var10002[cx] = var2;
      return this.<Boolean>a(var10001, var10002);
   }

   public int getApiVersion() {
      return an;
   }

   private <T> T a(λχγιΨκηζρ var1, Object... var2) {
      ςνΛωΠθρπυΣμκΓΩο[] var3 = var1.a();
      if (var3.length != var2.length) {
         throw new IllegalArgumentException(c<"㺀">(a, b) + var3.length + c<"㺃">(c, d ^ e) + var2.length);
      } else {
         for (int var4 = f; var4 < var3.length; var4++) {
            Object var5 = var2[var4];
            if (var5 != null) {
               ςνΛωΠθρπυΣμκΓΩο var6 = var3[var4];
               Class var7 = var6 instanceof μλωΨδΩΣΔα ? ((μλωΨδΩΣΔα)var6).b() : var6.a();
               Class var8 = var5.getClass();
               if (!var7.isAssignableFrom(var8)) {
                  throw new IllegalArgumentException(c<"㺆">(g, h ^ i) + var7 + c<"㺉">(j & k, l) + var4 + c<"㺌">(m & n, o) + var8 + c<"㺏">(p, q));
               }
            }
         }

         if (this.p.a().isPrimaryThread()) {
            String var13 = Thread.currentThread().getStackTrace()[r].toString();
            if (this.a.add(var13)) {
               ψΓωτιμωκχψΛΨ.c(c<"㺒">(s, t) + var13 + c<"㺕">(u & v, w) + var1 + c<"㺘">(x, y));
            }
         }

         ΨαχΨχΣλεΠψΦ var14 = null;
         Iterator var15 = this.p.b().c().iterator();
         if (var15.hasNext()) {
            ΨαχΨχΣλεΠψΦ var17 = (ΨαχΨχΣλεΠψΦ)var15.next();
            var14 = var17;
         }

         if (var14 == null) {
            throw new nLoginRequestUnavailableException(c<"㺛">(aa, ab));
         } else {
            CompletableFuture var16 = this.p.a().a(var14, var1, var2);

            try {
               JSONObject var18 = (JSONObject)var16.get(ac, TimeUnit.MILLISECONDS);
               Object var19 = var18 != null ? var1.a().a(var18) : null;
               return (T)(var1.k() ? Optional.<Object>ofNullable(var19) : var19);
            } catch (InterruptedException var9) {
               throw new nLoginRequestUnavailableException(c<"㺞">(ad, ae), var9);
            } catch (ExecutionException var10) {
               throw new nLoginRequestUnavailableException(c<"㺡">(af, ag ^ ah), var10);
            } catch (TimeoutException var11) {
               throw new nLoginRequestUnavailableException(c<"㺤">(ai, aj ^ ak));
            } catch (ClassCastException var12) {
               throw new RuntimeException(var12);
            }
         }
      }
   }

   public boolean forceLogin(@Nonnull Identity var1, boolean var2) {
      λχγιΨκηζρ var10001 = λχγιΨκηζρ.n;
      Object[] var10002 = new Object[cy];
      var10002[cz] = var1;
      var10002[da] = var2;
      return this.<Boolean>a(var10001, var10002);
   }

   public Optional<AccountData> getAccount(@Nonnull Identity var1) {
      λχγιΨκηζρ var10001 = λχγιΨκηζρ.b;
      Object[] var10002 = new Object[as];
      var10002[at] = var1;
      return this.a(var10001, var10002);
   }

   @Generated
   public ωδπηξιΓΣφΨΔρΓΓ(nLoginBukkit var1) {
      this.a = new HashSet<>();
      this.p = var1;
   }

   @Nonnull
   public List<AccountData> getAccountsByIp(@Nonnull String var1) {
      λχγιΨκηζρ var10001 = λχγιΨκηζρ.c;
      Object[] var10002 = new Object[bb];
      var10002[bc] = var1;
      return this.a(var10001, var10002);
   }

   public boolean performUnregister(@Nonnull Identity var1) {
      λχγιΨκηζρ var10001 = λχγιΨκηζρ.i;
      Object[] var10002 = new Object[ck];
      var10002[cl] = var1;
      return this.<Boolean>a(var10001, var10002);
   }

   public boolean setDiscord(@Nonnull Identity var1, long var2) {
      λχγιΨκηζρ var10001 = λχγιΨκηζρ.l;
      Object[] var10002 = new Object[cs];
      var10002[ct] = var1;
      var10002[cu] = var2;
      return this.<Boolean>a(var10001, var10002);
   }

   public DatabaseType getDatabaseType() {
      return this.a(λχγιΨκηζρ.a);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ωδπηξιΓΣφΨΔρΓΓ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(πηγμΣΔκκ.C("ЁУХЅЩшрітБяхѓэЖлѝќєњєЩ", (byte)12, 67), ωδπηξιΓΣφΨΔρΓΓ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            πηγμΣΔκκ.B("úćĆÉĉąĀĉĔăÐĎĒċĎĔÖѱѝѪѢѪѦсђѶљцѴчшð", (byte)12, 66) + var1 + ΣφδσΔζιΠρα.B("Ñ", (byte)12, 66) + var2.toString(), var4
         );
      }
   }

   public void requestLogin(@Nonnull Identity var1, @Nonnull Object var2) {
      throw new nLoginRequestUnsupportedException(c<"㺀">(cb, cc) + this.getImplementationType() + c<"㺃">(cd & ce, cf));
   }

   @Nonnull
   public String getVersion() {
      return this.p.s();
   }

   public boolean isAuthenticated(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException(c<"㺀">(bo & bp, bq));
      } else if (var1.isEmpty()) {
         throw new IllegalArgumentException(c<"㺃">(br, bs ^ bt));
      } else {
         ΨαχΨχΣλεΠψΦ var2 = this.p.b().a(var1);
         return (boolean)(var2 != null && this.p.a().a().b(var2) ? bu : bv);
      }
   }

   @Nonnull
   public ImplementationType getImplementationType() {
      return ImplementationType.PROXY;
   }

   public Optional<Location> getSpawnLocation(SpawnType var1) {
      if (var1 == null) {
         throw new IllegalArgumentException(c<"㺀">(ap, aq ^ ar));
      } else {
         ραδκμΠΔαωεηεΛ var2 = ραδκμΠΔαωεηεΛ.a(var1);
         String var3 = this.p.a().a().k(var2.aE());
         if (var3 == null) {
            return Optional.empty();
         } else {
            org.bukkit.Location var4 = ξπχιβρμογιω.a(var3);
            γδδΛζΨφδΠΛ var5 = new γδδΛζΨφδΠΛ(var4.getWorld().getName(), var4.getX(), var4.getY(), var4.getZ(), var4.getYaw(), var4.getPitch());
            return Optional.of(var5);
         }
      }
   }

   private static void b() {
      c = -3112929571536764771L;
      long var0 = c ^ -8786943702501008509L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(46 + 22),
               (byte)(57 + 12),
               (byte)(55 + 28),
               (byte)(3 + 44),
               67,
               (byte)(32 + 34),
               67,
               (byte)(31 + 16),
               (byte)(13 + 67),
               (byte)(64 + 11),
               (byte)(56 + 11),
               (byte)(50 + 33),
               (byte)(49 + 4),
               (byte)(20 + 60),
               (byte)(32 + 65),
               (byte)(76 + 24),
               (byte)(39 + 61),
               (byte)(56 + 49),
               (byte)(92 + 18),
               (byte)(92 + 11)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(64 + 4), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = δΛψπξκσβγςα.E(
                  "հգբկՎկԾմշդ՜դ\u0557րՋ\u0590ՠ\u058cժռՠնկր֑֔֏֍՚էևյժ\u0590֡ոս՟ա֤է֣ժ֛ն֪֤֍\u058bլֵ֭֠֬ձֱֻ֦֗֯֕ջֳַ֮ոյ֦֭ոչ֣ׄׄւׅ\u05cb֍\u05ca\u05c8\u05cdֽ\u05c8\u05cc֧֏֖֥ההָ֪֛ם׀\u05cd",
                  (byte)76,
                  69
               );
               b[1] = χφπρψπφΦθμπ.A("ůŝƄƊŞſƓŤŷŷőş", (byte)76, 65);
               b[2] = χΠξΦιζΨΣωΦσΨζ.C("ӍԔԌԈӷӑӲԌӚӑԎӔӞӑԜӱӹԋӭӺԝԤӵԙԄԣԫӨԁӼԚԤ", (byte)76, 67);
               b[3] = βθκςνθΩθυμςτκχ.D("ӬӜԍӴԂԋӱӑԍӼԊӡ", (byte)76, 68);
               b[4] = μεςΩΔΣγν.C("ӐӦӐӪԎӥԙӔӓӣӷԅӞԚөԞԝӰӰӷԧԏӢԢԅӦӽԚӬԮԅԲԱԅӪԮԄӭӰԮԏԍԶԁ", (byte)76, 67);
               b[5] = βεξΠθρρςΔΦμ.C("ӚӬԀӋԓӔӎӘӕӷԎӡ", (byte)76, 67);
               b[6] = πψυκΠΨμΛΩβΣφμφσ.A("şőƏŧŨųūŴƏŰţƜƘƊƒƇŪƑŜƖŸƣŪū", (byte)76, 65);
               b[7] = ΨφιωσρΓδΔθ.E("ռՊՠ՛ՐՆրՃՉոՊիՠևՎևեՑձթֈք՛՜", (byte)76, 69);
               b[8] = ΨφιωσρΓδΔθ.B(
                  "ŐƈƂŬƌœŵƖŨƚƇŶŘżŮƀśŻŔŠƜƆƘƞšžŸŻƃƩƂƙžƦŤƀƣƶƠŰƑƩƤƫƝƓƽƵƐƾưƗžƼƟƸǈƣƨƈƶǌƥƻƼǊǈƠǃƯƓǗƱƹǇƭƳƏǉƛǞƠƙǎƵǢƣƷƴǊƽƹƴƣǧƻǰǯǥǀǃƭǌǐǌǶǷǴǩǇǚǇƺǎǙȂǍǀǖǹǇǷǵǻǧǄȌȂ",
                  (byte)76,
                  66
               );
               b[9] = ΠΛΨοδΩσμνΛγΦφβς.D(
                  "ԁԐԍӍӱԀӦӏԗӭԓӴөԞӘԑԖӽӭԃӯӰԅӧӾԄӶӣԃԬӮԱӱԈԜӯԳԗԍԩԯԍԜԖӷԝԋӿԬԚԿӷӽӽԁԩԒԡԴԟԺԜՐԢՃԣՒԞՆԎՎՆԣԗԯԮԫԭԖՔ՟ԫՂԳԯ՚՚ԡԜՂ՛ԨըՊԿըՋՓՋթԭհլաՂ\u0558\u0557ՈլՋ՞Քբ՞ՕՓչ՚դՂճօՙ։էջՙՠ",
                  (byte)76,
                  68
               );
               b[10] = ΨΦνΨΦωυΩνβςμ.D("ԁԐԍӍӱԀӦӏԗӭԓӴөԞӘԑԖӽӭԃӯӰԅӧӾԄӶӣԃԬӮԱӱԈԜӯԳԗԍԩԯԍԜԖӷԝԋӿԬԚԿӷӽՈԦԽԒԹԤԢԠԉԮԏԩՀՐԨԮՄԔՔՔԬԴԹ՚\u0558ԲԳԸՎԹՆԥԦըԛՠԝԦԼԾՏգ՛", (byte)76, 68);
               b[11] = ΣδτΠνεγοΓορητ.D("ԁԐԍӍӱԀӦӏԗӭԓӴөԞӘԑԖӽӭԃӯӰԅӧӾԄӶӣԃԬӮԱӱԈԜӯԳԗԍԩԯԍԜԖӷԝԋӿԬԚԿӷӽՈԦԽԒԹԤԢԠԉԮԏԮՀՎՂՓԫԵԔԓԬԎԛՊԱՀԟ՜Գ\u0557ԮԵԙՖԿՔՆԾգԾխՙղ", (byte)76, 68);
               b[12] = φδχεθοκψαλΛογλ.B(
                  "ſƎƋŋůžŤōƕūƑŲŧƜŖƏƔŻūƁŭŮƃťżƂŴšƁƪŬƯůƆƚŭƱƕƋƧƭƋƚƔŵƛƉŽƪƘƽŵŻŻſƧƐƟƲƝƸƚǎƠǉơƺƨƒǑǖƑƕǆǓƸƷƫƫƱǡƝǎǖǔƗƸƿƣơǅǖǌǮǈǗƼǆǲǴǐǔƿǌƶƹǖǐǥǒǨǖǒƸǣǖƻȅǡǑǣǡǥǽǖǺǤȐǂǐǧǰǯȇǵȎǕǔǵǸȉȕșǽȝǲȞǷȅǽǪǫ",
                  (byte)76,
                  66
               );
               b[13] = ξψθρΣΠΣς.B("ƇƑũŋŢŕƏŢƑŷŕŚŭŻƎŸƈƊƙƟƣşƎŢŢşſƥţƌťŻưƠƄżƇƅơƢűƃƂſ", (byte)76, 66);
               b[14] = λΣΩσμφγχ.E(
                  "՞՚ձՠՑՔֈֈՒՃևոգնՠը՟\u0590վխ\u0590\u058c֊֓կզեՙկ֖֘֙\u058cց֔Ֆղ֘֏շ՛ևէր֠֍\u058c֬֎ְ֧֢֓֟ճցֺֆַյְִֿׁ֥֭֕֡֕ոֶֽ֟׆ֿ֔֔\u05ceּ֛֚׀֭\u058b֍֛֮֜", (byte)76, 69
               );
               b[15] = ζοηκορΦνΣθγΩ.B("ŚňńŉŲŞŕƒƅŐŮş", (byte)76, 66);
               b[16] = λΣΩσμφγχ.B("ſŞŜŠƔōƋƁŹŧƌŮťƍŕřŻƢƠŜƜŤżƖƑŵƤŪƨƕƭƉƝƟůƫƕƄƤƔƎƊŹſ", (byte)76, 66);
               b[17] = χΠξΦιζΨΣωΦσΨζ.C("ԁӠӞӢԖӏԍԃӻөԏӘӖԛӠԀԜԎӤԂԓԑԤԉԅԧԫԟӫԆӯԪԈԟӯԝԬԁӷԧԉӹԄԁ", (byte)76, 67);
               b[18] = οΩνΩρωλΨηΛδωδ.D("ӿӧӵԃӤԂӪԈԘӚԏӸӘӿԀӪӰӠӢԣӡӯӬӭ", (byte)76, 68);
               b[19] = βεξΠθρρςΔΦμ.D("ԏӦӥԕӯԒӫӷөԓӒԖӸԜӠӷӰӰӴӾӜԣӟԛԦԫӻԩԥӮԤԋӬӿԈԂԢԏԐԏԱԦԔԁ", (byte)76, 68);
               b[20] = οΩνΩρωλΨηΛδωδ.F("վՕՔք՞ց՚զ\u0558ւՁօէ\u058bՏզ՟՟գխՋ֊ըյչՒջ\u0590զՕջջ։կ֣֕֗օևմ֖֜ջհ", (byte)76, 70);
               b[21] = ΨφιωσρΓδΔθ.F(
                  "՞՚ձՠՑՔֈֈՒՃևոգնՠը՟\u0590վխ\u0590\u058c֊֓կզեՙկ֖֘֙\u058cց֔Ֆղ֘֏շ՛ևէր֠֍\u058c֬֎ְ֧֢֓֟ճցֺֆַյְִֿׁ֥֭֕֡֕ոֶֽ֟׆ֿ֔֔\u05ceּ֛֚׀֭\u058b֍֛֮֜", (byte)76, 70
               );
               b[22] = ΣδτΠνεγοΓορητ.C("ӜӊӆӋӴӠӗԔԇӒӰӡ", (byte)76, 67);
               break;
            case 1:
               b[0] = πχσδΦΦνθΔπ.E(
                  "հգբկՎկԾմշդ՜դ\u0557րՋ\u0590ՠ\u058cժռՠնկր֑֔֏֍՚էևյժ\u0590֡ոս՟ա֤է֣ժ֛ն֪֤֍\u058bլֵ֭֠֬ձֱֻ֦֗֯֕ջֳַ֮ոյ֦֭ոչ֣ׄׄւׅ\u05cb֍\u05ca\u05c8\u05cdֽ\u05c8\u05cc֧\u058cָֿ\u05ca֥׃וֵ֚֗֬",
                  (byte)76,
                  69
               );
               b[1] = φΨαξωυθανΣφυκη.C("ӐӼԀԒӳӧӶӵԂӧӤӡ", (byte)76, 67);
               b[2] = πηγμΣΔκκ.C("ӍԔԌԈӷӑӲԌӚӑԎӔӞӑԜӱӹԋӭӺԝԢԐԥԁԁԗԭԆԐԤԤ", (byte)76, 67);
               b[3] = δΛψπξκσβγςα.E("Ի՚ՒվՖՓՠՖՒՁ՛Ր", (byte)76, 69);
               b[4] = ζοηκορΦνΣθγΩ.D("ӐӦӐӪԎӥԙӔӓӣӷԅӞԚөԞԝӰӰӷԧԏӢԢԅӦӽԚӬԮԅԲӾӫԜԌԥԟԭӷӱԺԐԁ", (byte)76, 68);
               b[5] = ντθΔζβΔζ.B("ƐƄƊşƂūƎŪŖšŲş", (byte)76, 66);
               b[6] = φΨαξωυθανΣφυκη.A("şőƏŧŨųūŴƏŰťƑƓƇƑŸŵřƌƓƓŭŪū", (byte)76, 65);
               b[7] = ΣφδσΔζιΠρα.C("ԍӛӱӬӡӗԑӔӚԉӎӾӴӹӽәԛӛӝԣԒԖԇԛԣԝӫԩԢԉԮӰ", (byte)76, 67);
               b[8] = χφπρψπφΦθμπ.B(
                  "ŐƈƂŬƌœŵƖŨƚƇŶŘżŮƀśŻŔŠƜƆƘƞšžŸŻƃƩƂƙžƦŤƀƣƶƠŰƑƩƤƫƝƓƽƵƐƾưƗžƼƟƸǈƣƨƈƶǌƥƻƼǊǈƠǃƯƓǗƱƹǇƭƳƏǉƛǞƠƙǎƵǢƣƷƴǊƽƹƴƣǧƻǰǯǥǀǃƭǌǐǌǶǷǴǩǇǚǇƺǎǙȂǍƻǣǖǅƻǆǟǨǽǻǊ",
                  (byte)76,
                  66
               );
               b[9] = χφπρψπφΦθμπ.F(
                  "հտռԼՠկՕԾֆ՜ւգ\u0558֍Շրօլ՜ղ՞՟մՖխճեՒղ֛՝֠ՠշ\u058b՞֢ֆռ֘֞ռ\u058bօզ\u058cպծ֛։֮զլլհ֘ց\u0590֣֎֩\u058bֲֿׁ֑֒֍ֵսֵֽ֒ֆ֚֞֝֜օ׃\u05ceֱ֢֚֞\u05c9\u05c9\u0590\u058bֱ\u05ca֗חֹ֮חֺֺׂט֜ןכאֱׇ׆ַכֺ\u05cd׃ב\u05cdׂׄר\u05cbײוף\u05f6\u05cf\u05f9הטנד",
                  (byte)76,
                  70
               );
               b[10] = θεωψξβΛσσ.D("ԁԐԍӍӱԀӦӏԗӭԓӴөԞӘԑԖӽӭԃӯӰԅӧӾԄӶӣԃԬӮԱӱԈԜӯԳԗԍԩԯԍԜԖӷԝԋӿԬԚԿӷӽՈԦԽԒԹԤԢԠԉԮԏԩՀՐԨԮՄԔՔՔԬԴԹ՚\u0558ԲԳԸՎԹՆԥԢՀթՙԼԪՍՏԡԺՀ", (byte)76, 68);
               b[11] = ΣδτΠνεγοΓορητ.C("ԁԐԍӍӱԀӦӏԗӭԓӴөԞӘԑԖӽӭԃӯӰԅӧӾԄӶӣԃԬӮԱӱԈԜӯԳԗԍԩԯԍԜԖӷԝԋӿԬԚԿӷӽՈԦԽԒԹԤԢԠԉԮԏԮՀՎՂՓԫԵԔԓԬԎԛՊԱՀԟ՜Գ\u0557ԮԵէեՊՕԤԼՃԿԨԽ՛", (byte)76, 67);
               b[12] = μεςΩΔΣγν.E(
                  "հտռԼՠկՕԾֆ՜ւգ\u0558֍Շրօլ՜ղ՞՟մՖխճեՒղ֛՝֠ՠշ\u058b՞֢ֆռ֘֞ռ\u058bօզ\u058cպծ֛։֮զլլհ֘ց\u0590֣֎֩\u058bֺֿ֑֒֫֙փׇׂւֆַ֢ׄ֩֨֜֜ג֎ׇֿׅֈְֶׇֽ֩֔֒ןֹ\u05c8ַ֭ףץְׇֽׁׁׅ֧֪ז׃יׇ׃֩הׇ֬\u05f6גׂהגז\u05eeׇ\u05ebו\u0601ֳׁטסנ\u05f8צ\u05ff׆ׅצ\u05f9\u05f7؍ש\u05eb؍ׄ،בקؔכל",
                  (byte)76,
                  69
               );
               b[13] = βθκςνθΩθυμςτκχ.F("ու՚ԼՓՆրՓւըՆՋ՞լտթչջ֊\u0590֔ՐտՓՓՐհ֖ՔսՖլյձ֖ճ֙ռօ֘բփշհ", (byte)76, 70);
               b[14] = οοθδΨιοΦΠβδζ.A("ŭũƀůŠţƗƗšŒƖƇŲƅůŷŮƟƍżƟƛƙƢžŵŴŨžƧƥƨƛƐƣťƁƧƞƆŪƖŶƏƯƜƛƻƝƿƢƶƱƮƂƐǉƕǆƄƴǃƼƤưƤǐƿǎƇǌƮǅǕƥƓǜǆưƫƫƿǃǡǚƽƪƫ", (byte)76, 65);
               b[15] = θεωψξβΛσσ.E("ՒԽՔՐչյբյԻ\u0557\u0557Ր", (byte)76, 69);
               b[16] = ζβησεθωυγτ.D("ԁӠӞӢԖӏԍԃӻөԎӰӧԏӗӛӽԤԢӞԞӦӾԘԓӷԦӬԪԗԯԋԤԦԮԝӭӿӴԦԓԧԔԁ", (byte)76, 68);
               b[17] = ζοηκορΦνΣθγΩ.B("ſŞŜŠƔōƋƁŹŧƍŖŔƙŞžƚƌŢƀƑƏƢƇƃƥƩƝũƄŭƨŦơƫƢƥƉƪưƦƧƭƗƐƎŶƽơŽƳǄƑƝƊƋ", (byte)76, 66);
               b[18] = ΦδφπθΩΩλζξ.E("ծՖդղՓձՙշևՉտՈքծՎւխէեՠՕ֔՛՜", (byte)76, 69);
               b[19] = πψυκΠΨμΛΩβΣφμφσ.C("ԏӦӥԕӯԒӫӷөԓӒԖӸԜӠӷӰӰӴӾӜԣӟԛԦԫӻԩԥӮԤԋԊӾӾԭӭԈԗԪӺԳӻԁ", (byte)76, 67);
               b[20] = φΨαξωυθανΣφυκη.F("վՕՔք՞ց՚զ\u0558ւՁօէ\u058bՏզ՟՟գխՋ֊ըյչՒջ\u0590զՕջջ֛լ֍կե֜դ֖ՠ֫ֆ֩յ֜֨սևֱհև֤֭ջռ", (byte)76, 70);
               b[21] = δΛψπξκσβγςα.C(
                  "ӯӫԂӱӢӥԙԙӣӔԘԉӴԇӱӹӰԡԏӾԡԝԛԤԀӷӶӪԀԩԧԪԝԒԥӧԃԩԠԈӬԘӸԑԱԞԝԽԟՁԤԸԳ\u0530ԄԒՋԗՈԆԶՅԾԦԲԦՒՁՐԉՎ\u0530Շ\u0557ԧՎԘԬՋՍ\u0530ՋԚՒԝԿԬԭ", (byte)76, 67
               );
               b[22] = βεξΠθρρςΔΦμ.C("ӭӪԔӴԖԄԐӬӤԏԊӡ", (byte)76, 67);
               break;
            case 2:
               b[0] = βθκςνθΩθυμςτκχ.B("ƎƉŻƈƕŎťŒţŔœƑŬƓƓƖũŬƀƒŢŽŪū", (byte)76, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = ΨΦνΨΦωυΩνβςμ.C("ӎԋԋӽԍӎӳӢԂӯԄԅԖӻӛԐӾӾӰӺӱӿӬӭ", (byte)76, 67);
         }
      }
   }
}
