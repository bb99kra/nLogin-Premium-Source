package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.kyori.adventure.text.Component;
import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class ΨεηηνμγυΩαγ implements ΨαχΨχΣλεΠψΦ {
   private final Player d;
   private static long ao = Long.reverse(3458764513820540928L);
   private static int au = 32 >>> 36 | 32 << -36;
   private static int ay = 16384 >>> 238 | 16384 << ~238 + 1;
   private static int dj = Integer.reverse(-1);
   private static long dc = Long.reverse(-2387346074832603658L);
   private static int cn = Integer.reverse(Integer.MIN_VALUE);
   private static int aa = Integer.reverse(-1);
   private static long dg = Long.reverse(-1234424570225756682L);
   private static final Class<?> f;
   private static int ai = 0 >>> 49 | 0 << ~49 + 1;
   private static int ag = 64 >>> 6 | 64 << -6;
   private static int v = Integer.reverse(0);
   private static long al = Long.reverse(3458764513820540928L);
   private static int ah = Integer.reverse(0);
   private static int ax = Integer.reverse(Integer.MIN_VALUE);
   private static int cs = (64 >>> 102 | 64 << ~102 + 1) & -1;
   private static int av = Integer.reverse(0);
   private static int bx = Integer.reverse(1879048192);
   private static int bf = Integer.reverse(Integer.MIN_VALUE);
   private static int r = Integer.reverse(Integer.MIN_VALUE);
   private static long cr = Long.reverse(3458764513820540928L);
   private static int dl = Integer.reverse(Integer.MIN_VALUE);
   private static int cf = Integer.reverse(Integer.MIN_VALUE);
   private static int be = (0 >>> 27 | 0 << ~27 + 1) & -1;
   private static String[] b = new String[ΨεηηνμγυΩαγ.cm];
   private final οεΦρΓψωΓξγΔι a;
   private static long dx = Long.reverse(3458764513820540928L);
   private static int ch = Integer.reverse(0);
   private static long ck = Long.reverse(-1234424570225756682L);
   private static long cw = Long.reverse(-1234424570225756682L);
   private static int ar = Integer.reverse(268435456);
   private static int ap = Integer.reverse(0);
   private static long an = Long.reverse(-2387346074832603658L);
   private static final Class<?> g;
   private static int ce = Integer.reverse(0);
   private static long f = Long.reverse(-1234424570225756682L);
   private static long bq = Long.reverse(-2387346074832603658L);
   private static int aq = Integer.reverse(0);
   private static int ba = 0 >>> 50 | 0 << ~50 + 1;
   private static int q = (131072 >>> 209 | 131072 << -209) & -1;
   private κκψασΩψμωΩυθ a;
   private static int bv = 201326592 >>> 186 | 201326592 << ~186 + 1;
   private static int i = Integer.reverse(1073741824);
   private static int cl = Integer.reverse(1476395008);
   private static int bp = Integer.reverse(805306368);
   private final Server c;
   private static int bb = Integer.reverse(Integer.MIN_VALUE);
   private static int as = (-1 >>> 249 | -1 << -249) & -1;
   private static int c = 2048 >>> 11 | 2048 << ~11 + 1;
   private static long dk = Long.reverse(-1234424570225756682L);
   private static long bk = Long.reverse(-1234424570225756682L);
   private static long dw = Long.reverse(-2387346074832603658L);
   private static long ad = Long.reverse(-2387346074832603658L);
   private static int cd = ('耀' >>> 'n' | 32768 << -110) & -1;
   private final UUID d = UUID.randomUUID();
   private static int db = Integer.reverse(671088640);
   private static int cm = Integer.reverse(1476395008);
   private static long by = Long.reverse(-2387346074832603658L);
   private static int p = Integer.reverse(Integer.MIN_VALUE);
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static long dp = Long.reverse(-1234424570225756682L);
   private static int dm = (0 >>> 149 | 0 << ~149 + 1) & -1;
   private static long cc = Long.reverse(3458764513820540928L);
   private static int ac = Integer.reverse(-1610612736);
   private static int m = 0 >>> 42 | 0 << ~42 + 1;
   private static int dv = (50 >>> 161 | 50 << -161) & -1;
   private static int aj = (805306368 >>> 251 | 805306368 << ~251 + 1) & -1;
   private static int d = Integer.reverse(0);
   private static int aw = (3008 >>> 102 | 3008 << -102) & -1;
   private static long dt = Long.reverse(3458764513820540928L);
   private static long dd = Long.reverse(3458764513820540928L);
   private static int b = (0 >>> 37 | 0 << ~37 + 1) & -1;
   private static int az = Integer.reverse(Integer.MIN_VALUE);
   private static int cj = -1 >>> 26 | -1 << ~26 + 1;
   private static int bm = (-2147483643 >>> 159 | -2147483643 << ~159 + 1) & -1;
   private static int du = 0 >>> 245 | 0 << ~245 + 1;
   private static int ci = Integer.reverse(134217728);
   private static long h = Long.reverse(-1234424570225756682L);
   private static int bw = Integer.reverse(Integer.MIN_VALUE);
   private static long ab = Long.reverse(-1234424570225756682L);
   private static int co = (0 >>> 244 | 0 << -244) & -1;
   private static int dr = Integer.reverse(402653184);
   private static long ds = Long.reverse(-2387346074832603658L);
   private static int cv = Integer.reverse(-1);
   private static int ca = Integer.reverse(-268435456);
   private static Method d;
   private static long at = Long.reverse(-1234424570225756682L);
   private static int dn = 94208 >>> 108 | 94208 << -108;
   private static long br = Long.reverse(3458764513820540928L);
   private static int de = Integer.reverse(0);
   private static int u = Integer.reverse(Integer.MIN_VALUE);
   private static int t = Integer.reverse(0);
   private static int dq = Integer.reverse(0);
   static final Map<Player, ΨεηηνμγυΩαγ> b;
   private static int da = 0 >>> 12 | 0 << -12;
   private static int w = 6 >>> 161 | 6 << ~161 + 1;
   private static int g = 2 >>> 193 | 2 << ~193 + 1;
   private static long bu = Long.reverse(3458764513820540928L);
   private static long bo = Long.reverse(3458764513820540928L);
   private static int cp = Integer.reverse(-2013265920);
   private static long cy = Long.reverse(-2387346074832603658L);
   private static long ae = Long.reverse(3458764513820540928L);
   private static int dh = Integer.reverse(0);
   private static long j = Long.reverse(-2387346074832603658L);
   private static int dz = Integer.reverse(0);
   private static String[] a = new String[cl];
   private static int bg = Integer.reverse(-1879048192);
   private static int di = (-2147483643 >>> 158 | -2147483643 << -158) & -1;
   private static Method c;
   private static int bd = Integer.reverse(1073741824);
   private static long ak = Long.reverse(-2387346074832603658L);
   private static int bs = Integer.reverse(-1342177280);
   private static int e = Integer.reverse(0);
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int bc = Integer.reverse(0);
   private static int o = 0 >>> 152 | 0 << ~152 + 1;
   private static int cg = (0 >>> 136 | 0 << ~136 + 1) & -1;
   private static int ct = Integer.reverse(0);
   private static long cq = Long.reverse(-2387346074832603658L);
   private static long cz = Long.reverse(3458764513820540928L);
   private static int l = 2097152 >>> 117 | 2097152 << ~117 + 1;
   private static Method b;
   private static int cx = Integer.reverse(-939524096);
   private static long c;
   private static int dy = 536870912 >>> 125 | 536870912 << ~125 + 1;
   private static long cb = Long.reverse(-2387346074832603658L);
   private static int bi = Integer.reverse(1342177280);
   private static long k = Long.reverse(3458764513820540928L);
   private static int do = (-1 >>> 12 | -1 << -12) & -1;
   private static long bh = Long.reverse(-1234424570225756682L);
   private static long bz = Long.reverse(3458764513820540928L);
   private static int bl = 128000 >>> 234 | 128000 << -234;
   private static final Field c;
   private static int af = Integer.reverse(Integer.MIN_VALUE);
   private static long y = Long.reverse(3458764513820540928L);
   private static int am = 3670016 >>> 243 | 3670016 << ~243 + 1;
   private static int z = 67108864 >>> 152 | 67108864 << -152;
   private static int cu = (536870913 >>> 156 | 536870913 << -156) & -1;
   private static int df = Integer.reverse(-1476395008);
   private static long x = Long.reverse(-2387346074832603658L);
   private static int bj = Integer.reverse(-1);
   private static long bt = Long.reverse(-2387346074832603658L);
   private static long bn = Long.reverse(-2387346074832603658L);
   private static int s = 0 >>> 7 | 0 << ~7 + 1;
   private static final Field b;

   private static String a(int var0, long var1) {
      var1 ^= 12L;
      var1 ^= -5376792534244619579L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(48 + 20),
                     (byte)(57 + 12),
                     (byte)(10 + 73),
                     (byte)(25 + 22),
                     (byte)(54 + 13),
                     (byte)(26 + 40),
                     (byte)(13 + 54),
                     (byte)(39 + 8),
                     80,
                     (byte)(42 + 33),
                     67,
                     (byte)(49 + 34),
                     (byte)(7 + 46),
                     (byte)(49 + 31),
                     (byte)(58 + 39),
                     (byte)(25 + 75),
                     (byte)(74 + 26),
                     (byte)(50 + 55),
                     (byte)(35 + 75),
                     (byte)(25 + 78)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(9 + 60), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ιΠοθΩΦξκ.F("ՠխլԯկիզկպթԶմոձմպԼࢶࣄࣇࣈ࣏࣏ࣇࣚࢿࣈ࣋", (byte)65, 70));
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

   public static ΨεηηνμγυΩαγ a(μΛΔθΛτναεαΓ var0, Server var1, Object var2) {
      if (var2 instanceof String) {
         String var3 = ((String)var2).toLowerCase(Locale.ENGLISH);
         Player var4 = var1.getPlayerExact(var3);
         return var4 == null ? null : a(var0, var1, var4);
      } else if (var2 instanceof Player) {
         return a(var0, var1, (Player)var2);
      } else {
         throw new IllegalArgumentException(
            c<"㺀">(bm, bn ^ bo) + var2 + c<"㺃">(bp, bq ^ br) + (var2 != null ? var2.getClass().getCanonicalName() : c<"㺆">(bs, bt ^ bu))
         );
      }
   }

   @Override
   public String getName() {
      return this.d.getName();
   }

   @Override
   public void d(Object var1) {
      if (var1 instanceof String) {
         if (d != null) {
            Method var5 = d;
            Player var6 = this.d;
            Object[] var8 = new Object[n];
            var8[o] = ΩτωνοφχεΠ.b((String)var1, (boolean)p);
            ΓΛθσφζςηκ.a(var5, var6, var8);
         } else {
            this.d.sendMessage(ςβικδπφδΣκ.f((String)var1, (boolean)q));
         }
      } else if (d != null && var1 instanceof Component) {
         Method var4 = d;
         Player var10001 = this.d;
         Object[] var7 = new Object[r];
         var7[s] = var1;
         ΓΛθσφζςηκ.a(var4, var10001, var7);
      } else {
         if (f == null || b == null || c == null || !(var1 instanceof BaseComponent)) {
            throw new IllegalArgumentException(c<"㺃">(z & aa, ab) + var1 + c<"㺆">(ac, ad ^ ae) + var1.getClass().getCanonicalName());
         }

         try {
            Object var2 = b.invoke(this.d);
            Method var10000 = c;
            Object[] var10002 = new Object[u];
            var10002[v] = var1;
            var10000.invoke(var2, var10002);
         } catch (ReflectiveOperationException var3) {
            throw new RuntimeException(c<"㺀">(w, x ^ y) + this.getName(), var3);
         }
      }
   }

   @Override
   public String u() {
      return this.d.getDisplayName();
   }

   static {
      b();
      Field var2;
      if (ζδΩςΣΓζτχ.k != null) {
         Class var10000 = ζδΩςΣΓζτχ.k;
         String[] var10001 = new String[cn];
         var10001[co] = c<"㺀">(cp, cq ^ cr);
         var2 = ΓΛθσφζςηκ.a(var10000, var10001);
      } else {
         var2 = null;
      }

      b = var2;
      if (ζδΩςΣΓζτχ.k != null) {
         Class var3 = ζδΩςΣΓζτχ.k;
         String[] var6 = new String[cs];
         var6[ct] = c<"㺃">(cu & cv, cw);
         var2 = ΓΛθσφζςηκ.a(var3, var6);
      } else {
         var2 = null;
      }

      c = var2;
      f = ψΨπηηυυδΔη.a(c<"㺆">(cx, cy ^ cz));
      if (f != null) {
         b = ΓΛθσφζςηκ.a(Player.class, c<"㺉">(db, dc ^ dd));
         Class var0 = ψΨπηηυυδΔη.a(c<"㺌">(df, dg));
         if (var0 != null) {
            Class var5 = f;
            String var7 = c<"㺏">(di & dj, dk);
            Class[] var10002 = new Class[dl];
            var10002[dm] = var0;
            c = ΓΛθσφζςηκ.a(var5, var7, var10002);
         }
      }

      g = ψΨπηηυυδΔη.a(c<"㺒">(dn & do, dp));
      Class var1 = ψΨπηηυυδΔη.a(c<"㺕">(dr, ds ^ dt));
      if (g != null && var1 != null && var1.isAssignableFrom(Player.class)) {
         String var8 = c<"㺘">(dv, dw ^ dx);
         Class[] var9 = new Class[dy];
         var9[dz] = g;
         d = ΓΛθσφζςηκ.a(var1, var8, var9);
      }

      b = new ConcurrentHashMap<>();
   }

   @Override
   public void a(String var1, String var2, int var3, int var4, int var5) {
      ωυββακσδτιΠΣν.a().a(this.d, ςβικδπφδΣκ.f(var1, (boolean)ay), ςβικδπφδΣκ.f(var2, (boolean)az), var3, var4, var5);
   }

   @Override
   public String toString() {
      return c<"㺀">(bg, bh) + this.d + c<"㺃">(bi & bj, bk) + this.d + bl;
   }

   @Override
   public κκψασΩψμωΩυθ a() {
      if (this.a == null) {
         this.a = (var1, var2) -> {
            if (this.d.isOnline()) {
               try {
                  ζδΩςΣΓζτχ.a(this.d, var1);
                  Object[] var3 = var2;
                  int var4 = var2.length;

                  for (int var5 = ch; var5 < var4; var5++) {
                     Object var6 = var3[var5];
                     ζδΩςΣΓζτχ.a(this.d, var6);
                  }
               } catch (ReflectiveOperationException var7) {
                  throw new RuntimeException(c<"㺀">(ci & cj, ck) + this.getName(), var7);
               }
            }
         };
      }

      return this.a;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != null && this.getClass() == var1.getClass()) {
         ΨεηηνμγυΩαγ var2 = (ΨεηηνμγυΩαγ)var1;
         return (boolean)(Objects.equals(this.d, var2.d) && Objects.equals(this.d, var2.d) ? bb : bc);
      } else {
         return (boolean)ba;
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ΨεηηνμγυΩαγ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(χΠξΦιζΨΣωΦσΨζ.C("ՂդզՆժ։ց֗փՒ\u0590ֆ֔֎\u0557ռ֛֞֝֕֕ժ", (byte)119, 67), ΨεηηνμγυΩαγ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            μεςΩΔΣγν.F("֖֣֢եְ֥֥֡֜֟լְ֪֧֪֮ղࣺ࣬ࣽࣾअअࣽऐࣵࣾँ։", (byte)119, 70) + var1 + ζβησεθωυγτ.D("Ք", (byte)119, 68) + var2.toString(), var4
         );
      }
   }

   @Override
   public void ad() {
      ωυββακσδτιΠΣν.a().a(this.d);
   }

   @Override
   public boolean R() {
      Player var1 = this.c.getPlayerExact(this.d.getName());
      return (boolean)(var1 != null && var1.equals(this.d) ? c : d);
   }

   @Override
   public void a(εηχβγρΦβΦΛκγΦοδ<?> var1, γΦΠυρρρπη var2, Object var3, byte[] var4) {
      if (!(var3 instanceof String)) {
         throw new IllegalArgumentException(c<"㺀">(ar & as, at));
      } else {
         this.d.sendPluginMessage((Plugin)var1.b(), (String)var3, var4);
      }
   }

   @Override
   public void n(String var1) {
      this.d.setDisplayName(var1);
   }

   @Override
   public Optional<String> a() {
      try {
         return Optional.of(this.d.getLocale());
      } catch (NoSuchMethodError var5) {
         if (c == null) {
            return Optional.empty();
         } else {
            Object var2 = ζδΩςΣΓζτχ.a(this.d);
            if (var2 == null) {
               return Optional.empty();
            } else {
               try {
                  return Optional.ofNullable((String)c.get(var2));
               } catch (Exception var4) {
                  return Optional.empty();
               }
            }
         }
      }
   }

   @Override
   public boolean i(String var1) {
      return this.d.hasPermission(var1);
   }

   @Generated
   private ΨεηηνμγυΩαγ(Player var1, Server var2, οεΦρΓψωΓξγΔι var3) {
      this.d = var1;
      this.c = var2;
      this.a = var3;
   }

   @Override
   public CompletableFuture<Void> a(String var1) {
      return ΓχυψπωΣςΠκγζΦ.a(this.d, ςβικδπφδΣκ.f(var1, (boolean)ag));
   }

   private static void b() {
      c = 8047850771465534331L;
      long var0 = c ^ -5376792534244619579L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(49 + 19),
               (byte)(53 + 16),
               (byte)(82 + 1),
               47,
               (byte)(17 + 50),
               (byte)(51 + 15),
               (byte)(66 + 1),
               (byte)(8 + 39),
               (byte)(70 + 10),
               (byte)(69 + 6),
               67,
               (byte)(25 + 58),
               (byte)(46 + 7),
               (byte)(74 + 6),
               (byte)(34 + 63),
               (byte)(90 + 10),
               (byte)(16 + 84),
               (byte)(5 + 100),
               (byte)(25 + 85),
               (byte)(71 + 32)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(37 + 32), (byte)(50 + 33)}, StandardCharsets.UTF_8));
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
               b[0] = ζοηκορΦνΣθγΩ.B("ƴƩƸƷǓƜƲǛƻƽǜƫ", (byte)114, 66);
               b[1] = χΠξΦιζΨΣωΦσΨζ.C("Ց՟ԿՒֈցՅՇՊ՜ֈՓ", (byte)114, 67);
               b[2] = χΠξΦιζΨΣωΦσΨζ.E("չ֠ըտե֕քֈ֢֗կը֑կիֳ֩յ֖֘ֆ֔ցւ", (byte)114, 69);
               b[3] = λΣΩσμφγχ.E("֦֑ւ֝պ֤֩սեժ\u058bֲ֫հ֖֏։֏ֲֲִֵֶַֺֺׂ֛֚֔֕֙֗տ֑֖׆ֻֻׁ֥֢֖֟", (byte)114, 69);
               b[4] = θεωψξβΛσσ.E("ձ֨՟ո֬ի֦ր֨֨կ֎ծլ֓հր֙\u058bֱִ֮֕֯ֈ֬֎ִֹֺ֝րվּքׇּּ֖֚֡֕֙֜", (byte)114, 69);
               b[5] = πχσδΦΦνθΔπ.B("ǜǇǞǈƺƱǙǌưǁơƫ", (byte)114, 66);
               b[6] = βεξΠθρρςΔΦμ.E("֑ֈրռքևզ֖ս\u058c֍֠\u058b֑֨վն֦\u058bִձּն֒֩׀։ֵ֠ւ֯ׄ", (byte)114, 69);
               b[7] = μζξτΩσσφυδεπλΨ.B("ǇƺƷƭƲƷƴƢƠƠǘƫ", (byte)114, 66);
               b[8] = ιΠοθΩΦξκ.F("աագ֠ջ։ս֪֢֭֨ջ֤֮֊֖խփ֨\u0590ּ֚֝ֈ֫սְ֜֓֜֕֞տֺ֒֡׆֊ֻּּ֥֖֡", (byte)114, 70);
               b[9] = βεξΠθρρςΔΦμ.E("կ֒ո֒շբդ֗֊֢ռ֦֦֬իְַ֡֎ո֖ղֱֺ֮ջտֽ֟֬֔֎֛֢֛֓փ֦\u05c9ֽ֧֘ֈ֖", (byte)114, 69);
               b[10] = ζοηκορΦνΣθγΩ.B("ǘǙƛƘƴǎǓƮƟǏǜǒƣǉƢǗǂǨƽƺǁǉƶƷ", (byte)114, 66);
               b[11] = οΩνΩρωλΨηΛδωδ.A("ƦǝƔƭǡƠǛƵǝǝƤǠǓǓƥƤƶǌǙǟǞǐƩǟƭǣƮǉǓǁǢǚǦƺƽǓƸǵǊǐǟǝǦǋ", (byte)114, 65);
               b[12] = ςΦζσμτΓσ.C("քկֆհբՙցմ\u0558թՉՓ", (byte)114, 67);
               b[13] = πψυκΠΨμΛΩβΣφμφσ.E("ֈ֕չ֘֬փ֥ծփր֯ն", (byte)114, 69);
               b[14] = ΣερμΔσατσκ.E("չմգ֔են֤ևֈք֛ն", (byte)114, 69);
               b[15] = θεωψξβΛσσ.C(
                  "ոՓպՏ\u0557զՀՓէ՜ջՅսէաջրՔ֍Տև֕֊գըվֆռՖ֝֗֍ւ֎֞քշ֜՜֛պխ֡եէք֓ցխհյְֱָ֭փպռֵָֺ֖֯֔֝փց\u0590ׅ֪\u05c9փ\u058c\u05ca\u05c8ׄ\u058cֲּ֩ֆֲ\u05cf\u05c8֏֬ך׆ְֱ֧֛֭֩\u05cbכ",
                  (byte)114,
                  67
               );
               b[16] = οΩνΩρωλΨηΛδωδ.F("ֈ֞֠֡տ։֪֮֩֯հսրփ֡լև֍ְ֭֯֓ջ֦յ֗\u058cְׂׄցֲ", (byte)114, 70);
               b[17] = βθκςνθΩθυμςτκχ.F("֑՚֊օճվգֆե֍հն", (byte)114, 70);
               b[18] = μεςΩΔΣγν.C("շՏՙՖճշՄՈօ։՚Փ", (byte)114, 67);
               b[19] = ζβησεθωυγτ.D("ՎԾօջքՓոօ՞բՄկէ\u0590ժը֏ճյֆճո՚֜ոՔմռվ֖֝խճ֣շկ՚շազ֧֟֜ճ", (byte)114, 68);
               b[20] = πψυκΠΨμΛΩβΣφμφσ.A("ƺǏƔǇƴƬǏƕƷƸǤƫ", (byte)114, 65);
               b[21] = μζξτΩσσφυδεπλΨ.E("տ֕֔եյ\u058cխ֝ք֪֠հ֥զղ֡֔կְֱֵ֯֊֮֓֞։ֱյֶֽ֣֠׃֦֟փֵֽ֛֮\u05cfֱֈ׃ֆֲ֧\u05c8ו֢֡\u05c9ך֢֡", (byte)114, 69);
               b[22] = ζοηκορΦνΣθγΩ.F("֛սչչ֝֜ն֧֗ո֏դֆղյխ֎֙ճֻ֪֬ցւ", (byte)114, 70);
               b[23] = οοθδΨιοΦΠβδζ.B("ƥǇǜƗƴǊǛƺƼƥƝƤǘǩǙƢǛƤǗƷǟǱƻǇǡƾǣƲǠǴǵƻǙǸǋǠǒƿǑǵǚǃǎȂȉǕǟǦȁǟȅǢȐǙǖǗ", (byte)114, 66);
               b[24] = βθκςνθΩθυμςτκχ.B("ƥǇǜƗƴǊǛƺƼƥƝƤǘǩǙƢǛƤǗƷǟƫƼǟǢǈǧǪǵǵƺƷǈǙƷǺǐƼǻȃǟǃǑǃǾǴǖǨǹȃǷǾǇǿǖǗ", (byte)114, 66);
               b[25] = οοθδΨιοΦΠβδζ.D("ո՚ՖՖպչՓմքՕլՁգՏՒՊինՐ֘։և՞՟", (byte)114, 68);
               break;
            case 1:
               b[0] = δΛψπξκσβγςα.E("ւ֚ննտօ֘պ֊էհն", (byte)114, 69);
               b[1] = πχσδΦΦνθΔπ.A("ƘǒǔƿƶƗǢǢƢƟǐƫ", (byte)114, 65);
               b[2] = λΣΩσμφγχ.D("ՖսՅ՜ՂղաեմտՋօզըՌև՟օ\u0590թի֗՞՟", (byte)114, 68);
               b[3] = ξψθρΣΠΣς.F("֦֑ւ֝պ֤֩սեժ\u058bֲ֫հ֖֏։֏ֲֲִֵֶֺֺׂ֛֚֔֕֙֗ւ֔׃։ַֻׁ֬־\u05c9֖֭", (byte)114, 70);
               b[4] = βεξΠθρρςΔΦμ.E("ձ֨՟ո֬ի֦ր֨֨կ֎ծլ֓հր֙\u058bֱִ֮֕֯ֈ֬֎ִֹֺ֝ր֚֟֓֡և֖֢֣֖֭֙֩", (byte)114, 69);
               b[5] = ντθΔζβΔζ.D("փվբՠ՟գևշդխռՓ", (byte)114, 68);
               b[6] = ζοηκορΦνΣθγΩ.D("ծե՝ՙադՃճ՚թժսըծօ՛Փփը֑ՎՔէՑշ֚՛յց։՟֚մփ՝մճ՟ֈք֖\u058c֨ճ", (byte)114, 68);
               b[7] = ξψθρΣΠΣς.C("ԻՕ՜ՏՈՕֆՙՙցՅՓ", (byte)114, 67);
               b[8] = οοθδΨιοΦΠβδζ.F("աագ֠ջ։ս֪֢֭֨ջ֤֮֊֖խփ֨\u0590ּ֚֝ֈ֫սְ֜֓֜֕֞׃ֳ֟֕֬վփֽ\u05cd\u05ce\u0590֖", (byte)114, 70);
               b[9] = πχσδΦΦνθΔπ.F("կ֒ո֒շբդ֗֊֢ռ֦֦֬իְַ֡֎ո֖ղֱֺ֮ջտֽ֟֬֔֎ֽ֛֪֟֟֊։ָ֨ב\u058c\u0590\u05cdׂ֑֢אהִ֢֘֘֬֡", (byte)114, 70);
               b[10] = φδχεθοκψαλΛογλ.C("րցՃՀ՜նջՖՇշև՚Ղլղ֏֔֔տցև֗՞՟", (byte)114, 67);
               b[11] = ιΠοθΩΦξκ.F("ձ֨՟ո֬ի֦ր֨֨կ֫֞֞հկց֤֪֛֗֩մ֪ո֮չ֔֞\u058c֥֭֜ց֧֧֩\u058cָֻ֖֖֝֡", (byte)114, 70);
               b[12] = ΣερμΔσατσκ.B("ǉƥǗƺƼƱƴǁƺǆǘƫ", (byte)114, 66);
               b[13] = πχσδΦΦνθΔπ.B("ƽƼƛǓǓƯƪƵǡǢǐƫ", (byte)114, 66);
               b[14] = ςπυηννναΣ.F("ս֦ու֥֛գ֛ւծ\u0590ւլ\u0590ִַֺ֑֭֯֠֘ցւ", (byte)114, 70);
               b[15] = ΣδτΠνεγοΓορητ.C(
                  "ոՓպՏ\u0557զՀՓէ՜ջՅսէաջրՔ֍Տև֕֊գըվֆռՖ֝֗֍ւ֎֞քշ֜՜֛պխ֡եէք֓ցխհյְֱָ֭փպռֵָֺ֖֯֔֝փց\u0590ׅ֪\u05c9փ\u058c\u05ca\u05c8ׄ\u058cֲּ֩ֆֲ\u05cf\u05c8֏֧֓\u05cc\u05caֳֵָֹֹֻֿ֤֦֛֚֞֞גֵי\u05c9רֳ",
                  (byte)114,
                  67
               );
               b[16] = φΨαξωυθανΣφυκη.C("եջսվ՜զև\u058bֆ\u058cՍ՚՝ՠվՉդժ\u058cհ֊և֊֎ժՕ\u058b։֖֑ո֥֧֝֠֗֙մը֙ր֧֎ճ", (byte)114, 67);
               b[17] = χφπρψπφΦθμπ.E("կչռ֤֕\u058b֥ջ֝֏։\u058c֓ր֖ֈթ֗\u0590ֆ֎քցւ", (byte)114, 69);
               b[18] = πψυκΠΨμΛΩβΣφμφσ.F("֖֓ով֞ըցդժհչդ֥ճֲ֍ָ֥ֆ֗մքցւ", (byte)114, 70);
               b[19] = ΨφιωσρΓδΔθ.A("ƦƖǝǓǜƫǐǝƶƺƜǇƿǨǂǀǧǋǍǞǋǐƲǴǐƬǌǔǖǮǵǅǚǥǹǉǎǙǰǗǟǢƽǂǷǆǁǢǅǨȅȇȉǩǖǗ", (byte)114, 65);
               b[20] = μζξτΩσσφυδεπλΨ.C("Տջ\u0558ճ՞Յփ\u058bջե՜Չտբխփֈի\u058bՕլև՞՟", (byte)114, 67);
               b[21] = ΣερμΔσατσκ.F("տ֕֔եյ\u058cխ֝ք֪֠հ֥զղ֡֔կְֱֵ֯֊֮֓֞։ֱյֶֽ֣֠׃֦֟փֵֽ֛֮\u05cfֺ֏א\u05cc\u0590ֶטׇׂ֪גחחל֨\u05cfבף\u05ccאֺף", (byte)114, 70);
               b[22] = φΨαξωυθανΣφυκη.B("ǐƲƮƮǒǑƫǌǜƭǄƽǠǟƽǣǬƥǋǎǫǯƶƷ", (byte)114, 66);
               b[23] = ΨφιωσρΓδΔθ.C("ՍկքԿ՜ղփբդՍՅՌր֑ցՊփՌտ՟և֙գկ։զ\u058b՚ֈ֜֝գց֠ճֈպէչ֝ւիո֥֪֢֨֨ց֪֞֘ր֑վտ", (byte)114, 67);
               b[24] = ΣδτΠνεγοΓορητ.E("հ֧֒բտ֦֕օևհըկִ֣֤խ֦կ֢ւ֪նևֲֵ֪֭֓׀׀օւ֤֓ւׅ֛և׆\u05ce֪֎֥֙֩\u05c8ֲֹׂ֖֤֒֕֩חֻ\u05ceב֩׃ֻמ\u05cdצ", (byte)114, 69);
               b[25] = ΦδφπθΩΩλζξ.B("ǐƲƮƮǒǑƫǌǜƭǂǘǖƿƧƨƶǇǇǩƮǯƶƷ", (byte)114, 66);
               break;
            case 2:
               b[0] = χΠξΦιζΨΣωΦσΨζ.C("՚ՂՠչաճոՉՈ՛֍\u0558՜Շ֍աՍՠև֘ֈձ՞՟", (byte)114, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = χΠξΦιζΨΣωΦσΨζ.B("ƽǍǗǀǠƙƯǠƣƱǘǣǀǝǜǔǟǗǢƬƮǯǩǰǧǩǡǏǵǘǓǙ", (byte)114, 66);
         }
      }
   }

   @Nullable
   @Override
   public InetSocketAddress a() {
      try {
         return this.d.getAddress();
      } catch (NullPointerException var2) {
         return null;
      }
   }

   @Override
   public <T> T c() {
      return (T)this.d;
   }

   @Override
   public void p(String var1) {
      this.d.chat(var1);
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[bd];
      var10000[be] = this.d;
      var10000[bf] = this.d;
      return Objects.hash(var10000);
   }

   private static ΨεηηνμγυΩαγ a(μΛΔθΛτναεαΓ var0, Server var1, Player var2) {
      ΨεηηνμγυΩαγ var3 = b.get(var2);
      if (var3 != null) {
         return var3;
      } else {
         if (ψΓωτιμωκχψΛΨ.aj()) {
            StackTraceElement[] var4 = new Exception().getStackTrace();
            String var5 = var4.length > 0 ? var4[Math.min(bv, var4.length - bw)].toString() : c<"㺀">(bx, by ^ bz);
            String var10000 = c<"㺃">(ca, cb ^ cc);
            Object[] var10001 = new Object[cd];
            var10001[ce] = var2.getName();
            var10001[cf] = var5;
            ψΓωτιμωκχψΛΨ.c(var10000, var10001);
         }

         return b(var0, var1, var2);
      }
   }

   public static boolean Q() {
      return (boolean)(d != null ? a : b);
   }

   @Override
   public οεΦρΓψωΓξγΔι a() {
      return this.a;
   }

   static ΨεηηνμγυΩαγ b(μΛΔθΛτναεαΓ var0, Server var1, Player var2) {
      Object var3 = ΓχυψπωΣςΠκγζΦ.V() ? new ιθΣτΔηΓωζξρβ(var0.a(), var2) : var0.b((boolean)cg);
      return new ΨεηηνμγυΩαγ(var2, var1, (οεΦρΓψωΓξγΔι)var3);
   }

   @Override
   public void o(String var1) {
      ςμκΔΣιζρΛξΨιθφΠ.a().send(this.d, ςβικδπφδΣκ.f(var1, (boolean)af));
   }

   @Override
   public UUID a() {
      return this.d.getUniqueId();
   }

   @Override
   public int h() {
      if (b == null) {
         return ah;
      } else {
         Object var1 = ζδΩςΣΓζτχ.a(this.d);
         if (var1 == null) {
            return ai;
         } else {
            try {
               return (Integer)b.get(var1);
            } catch (Exception var3) {
               ψΓωτιμωκχψΛΨ.c(c<"㺀">(aj, ak ^ al) + this + c<"㺃">(am, an ^ ao), var3);
               return aq;
            }
         }
      }
   }

   @Override
   public void l(String var1) {
      if (var1.length() >= au && var1.charAt(av) == aw) {
         var1 = var1.substring(ax);
      }

      this.c.dispatchCommand(this.d, var1);
   }

   @Override
   public boolean S() {
      return (boolean)(!this.d.hasMetadata(c<"㺀">(e, f)) && !this.d.hasMetadata(c<"㺃">(g, h)) && !this.d.hasMetadata(c<"㺆">(i, j ^ k)) ? m : l);
   }
}
