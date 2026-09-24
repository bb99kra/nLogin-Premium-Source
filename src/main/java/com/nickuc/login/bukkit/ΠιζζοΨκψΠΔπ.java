package com.nickuc.login.bukkit;

import com.nickuc.login.ΠΛΨοδΩσμνΛγΦφβς;
import com.nickuc.login.ΣφδσΔζιΠρα;
import com.nickuc.login.γξψμαςψχ;
import com.nickuc.login.δΛψπξκσβγςα;
import com.nickuc.login.ιΠοθΩΦξκ;
import com.nickuc.login.λΣΩσμφγχ;
import com.nickuc.login.ντθΔζβΔζ;
import com.nickuc.login.νχιλΣΩμψιτβΔΣδμ;
import com.nickuc.login.ξψθρΣΠΣς;
import com.nickuc.login.πηγμΣΔκκ;
import com.nickuc.login.πχσδΦΦνθΔπ;
import com.nickuc.login.πψυκΠΨμΛΩβΣφμφσ;
import com.nickuc.login.σιβεθκιπΓνΣΔουρ;
import com.nickuc.login.στΩξξχκι;
import com.nickuc.login.φΨαξωυθανΣφυκη;
import com.nickuc.login.χΠξΦιζΨΣωΦσΨζ;
import com.nickuc.login.ωομΦδΔπνΨεβυΓ;
import com.nickuc.login.lib.caffeine.cache.Cache;
import com.nickuc.login.lib.caffeine.cache.Caffeine;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import io.netty.channel.Channel;
import io.netty.channel.ChannelPipeline;
import io.netty.util.AttributeKey;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.Location;

public class ΠιζζοΨκψΠΔπ implements νχιλΣΩμψιτβΔΣδμ {
   @Nullable
   private γξψμαςψχ a;
   private static int e = (262144 >>> 50 | 262144 << -50) & -1;
   private static int a = (0 >>> 120 | 0 << -120) & -1;
   @Nullable
   public Location a;
   private static int l = (65536 >>> 15 | 65536 << ~15 + 1) & -1;
   private static int b = (-1 >>> 90 | -1 << -90) & -1;
   @Nullable
   public final ωομΦδΔπνΨεβυΓ a;
   public final Channel a;
   private static int i = 16384 >>> 174 | 16384 << -174;
   private static int m = Integer.reverse(-1);
   public final boolean a;
   public static final AttributeKey<ΠιζζοΨκψΠΔπ> a = σιβεθκιπΓνΣΔουρ.a(c<"㺀">(l & m, ΠιζζοΨκψΠΔπ.n));
   private static int h = (0 >>> 93 | 0 << ~93 + 1) & -1;
   private static String[] b = new String[ΠιζζοΨκψΠΔπ.k];
   @Nullable
   public final UUID c;
   private static long c;
   private static final Cache<String, ΠιζζοΨκψΠΔπ> b = Caffeine.newBuilder().expireAfterWrite(1L, TimeUnit.MINUTES).build();
   public final User a;
   public final στΩξξχκι a;
   private static String[] a = new String[ΠιζζοΨκψΠΔπ.j];
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static int j = Integer.reverse(-1073741824);
   private static int k = Integer.reverse(-1073741824);
   private static long n = Long.reverse(-744201092114470664L);
   @Nullable
   public final Runnable a;
   public final String k;
   private static long f = Long.reverse(-744201092114470664L);
   private boolean b;
   private static long d = Long.reverse(-744201092114470664L);

   public boolean d() {
      ChannelPipeline var1 = this.a.pipeline();
      return (boolean)(var1.get(c<"㺀">(a & b, d)) != null && var1.get(c<"㺃">(e, f)) != null ? g : h);
   }

   public static ΠιζζοΨκψΠΔπ a(String var0, InetAddress var1, @Nullable InetAddress var2) {
      ΠιζζοΨκψΠΔπ var3 = null;
      if (var1 != null) {
         var3 = (ΠιζζοΨκψΠΔπ)b.getIfPresent(var0 + var1.getHostAddress());
      }

      if (var3 == null && var2 != null) {
         var3 = (ΠιζζοΨκψΠΔπ)b.getIfPresent(var0 + var2.getHostAddress());
      }

      if (var3 == null) {
         var3 = (ΠιζζοΨκψΠΔπ)b.getIfPresent(var0);
      }

      return var3;
   }

   @Override
   public void b(String var1, String var2) {
      this.a = new γξψμαςψχ(var1, var2);
   }

   @Override
   public στΩξξχκι a() {
      return this.a;
   }

   private static String a(int var0, long var1) {
      var1 ^= 87L;
      var1 ^= -7569864832455592126L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(23 + 45),
                     (byte)(3 + 66),
                     (byte)(51 + 32),
                     (byte)(37 + 10),
                     (byte)(35 + 32),
                     (byte)(26 + 40),
                     (byte)(25 + 42),
                     (byte)(40 + 7),
                     (byte)(26 + 54),
                     (byte)(8 + 67),
                     (byte)(25 + 42),
                     83,
                     (byte)(35 + 18),
                     (byte)(6 + 74),
                     (byte)(50 + 47),
                     (byte)(52 + 48),
                     100,
                     (byte)(38 + 67),
                     (byte)(53 + 57),
                     (byte)(71 + 32)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(38 + 30), (byte)(44 + 25), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΠΛΨοδΩσμνΛγΦφβς.B("ņœŒĕŕőŌŕŠŏĜŚŞŗŚŠĢŖŪšŢšŭĩқҵҳҴҾҨһӊңҘӅ", (byte)50, 66));
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

   @Generated
   public ΠιζζοΨκψΠΔπ(
      User var1, στΩξξχκι var2, String var3, @Nullable UUID var4, boolean var5, @Nullable Runnable var6, Channel var7, @Nullable ωομΦδΔπνΨεβυΓ var8
   ) {
      this.a = var1;
      this.a = var2;
      this.k = var3;
      this.c = var4;
      this.a = var5;
      this.a = var6;
      this.a = var7;
      this.a = var8;
   }

   public static void a(String var0, @Nullable String var1, InetAddress var2, ΠιζζοΨκψΠΔπ var3) {
      b.put(var0, var3);
      b.put(var0 + var2.getHostAddress(), var3);
      if (var1 != null) {
         b.put(var1 + var2.getHostAddress(), var3);
      }
   }

   @Override
   public String d() {
      return this.k;
   }

   @Override
   public void g() {
      this.b = (boolean)i;
   }

   private static void b() {
      c = 2239679816222127608L;
      long var0 = c ^ -7569864832455592126L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(37 + 31),
               (byte)(15 + 54),
               (byte)(80 + 3),
               (byte)(32 + 15),
               (byte)(15 + 52),
               (byte)(57 + 9),
               (byte)(55 + 12),
               (byte)(32 + 15),
               (byte)(18 + 62),
               (byte)(73 + 2),
               (byte)(6 + 61),
               (byte)(6 + 77),
               (byte)(34 + 19),
               (byte)(75 + 5),
               (byte)(33 + 64),
               100,
               (byte)(55 + 45),
               (byte)(33 + 72),
               110,
               (byte)(91 + 12)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(51 + 17), 69, (byte)(51 + 32)}, StandardCharsets.UTF_8));
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
               b[0] = ντθΔζβΔζ.A("ŗŌŰůŤĴŧſŗŘŴŇ", (byte)64, 65);
               b[1] = πηγμΣΔκκ.F("ՍՠէէՅՑհՕխտչՄ", (byte)64, 70);
               b[2] = δΛψπξκσβγςα.A("įŮŹņĳŸŉĻŪŲƀłńƀĽţœńŷŪŵŦŶŗřŞōƉşőōū", (byte)64, 65);
               break;
            case 1:
               b[0] = πχσδΦΦνθΔπ.A("ŧŉŮňŭĺŚıķŹŘžŁƀļŃŰňŶřŊƋŒœ", (byte)64, 65);
               b[1] = ιΠοθΩΦξκ.A("ťųŐĶůŭŪůŹœŹŵĺťłŨĺžŶńƄƋŒœ", (byte)64, 65);
               b[2] = λΣΩσμφγχ.B("įŮŹņĳŸŉĻŪŲƀłńƀĽţœńŷŪŵŵŦňţƎőƆƆƃşşŹŪœƚśƞžūŒŻŝŧ", (byte)64, 66);
               break;
            case 2:
               b[0] = πψυκΠΨμΛΩβΣφμφσ.A("ųķŭĲŗĺİųŬŹŭŭŌůşŁŠŽńƄŽƀŦƁƀƆŢůſſŤŗ", (byte)64, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = φΨαξωυθανΣφυκη.D("ӉӘҼөӤӱӲҿөӒӢүӂӲӕҼӲҺӭӉӛӗӞӅӝԅӷԃӄӚӌӹ", (byte)64, 68);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ΠιζζοΨκψΠΔπ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΣφδσΔζιΠρα.E("ԞՀՂԢՆե՝ճ՟ԮլբհժԳ\u0558պչձշձՆ", (byte)58, 69), ΠιζζοΨκψΠΔπ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            χΠξΦιζΨΣωΦσΨζ.B("ŖţŢĥťšŜťŰşĬŪŮŧŪŰĲŦźűŲűŽĹҫӅӃӄӎҸӋӚҳҨӕŐ", (byte)58, 66) + var1 + ξψθρΣΠΣς.D("ҝ", (byte)58, 68) + var2.toString(), var4
         );
      }
   }

   @Override
   public boolean e() {
      return this.a;
   }

   @Generated
   @Override
   public boolean f() {
      return this.b;
   }

   @Nullable
   @Override
   public γξψμαςψχ a() {
      return this.a;
   }

   static {
      b();
   }
}
