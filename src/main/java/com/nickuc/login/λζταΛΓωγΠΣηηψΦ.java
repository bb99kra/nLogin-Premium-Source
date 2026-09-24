package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.spigotmc.event.player.PlayerSpawnLocationEvent;

public class λζταΛΓωγΠΣηηψΦ implements ΦοιυξχςΩΦψξΓΣΨ {
   private static long ac = Long.reverse(-2576128063588475048L);
   private static int k = Integer.reverse(-1610612736);
   private static long ad = Long.reverse(432345564227567616L);
   private final λΓλχΩαοΨωθτοςΓ b;
   private static int af = Integer.reverse(268435456);
   private static long v = Long.reverse(432345564227567616L);
   private static int h = Integer.reverse(1073741824);
   private static int ae = (0 >>> 0 | 0 << -0) & -1;
   private static int w = Integer.reverse(-1073741824);
   private static long u = Long.reverse(-2576128063588475048L);
   private static int s = (8 >>> 226 | 8 << -226) & -1;
   private static int ab = Integer.reverse(-536870912);
   private static int p = Integer.reverse(536870912);
   private static int y = (-1 >>> 135 | -1 << -135) & -1;
   private static int aa = (1048576 >>> 114 | 1048576 << ~114 + 1) & -1;
   private static int j = Integer.reverse(0);
   private static int m = 196608 >>> 240 | 196608 << ~240 + 1;
   private static int ag = Integer.reverse(268435456);
   private final nLoginBukkit l;
   private static int l = Integer.reverse(0);
   private static int x = (786432 >>> 145 | 786432 << -145) & -1;
   private static long g = Long.reverse(432345564227567616L);
   private static int o = 8192 >>> 205 | 8192 << -205;
   private static long i = Long.reverse(-2720243251664330920L);
   private static long d = Long.reverse(432345564227567616L);
   private static int q = Integer.reverse(-1);
   private static int e = 64 >>> 134 | 64 << -134;
   private static long c;
   private static long r = Long.reverse(-2720243251664330920L);
   private static String[] a = new String[af];
   private static long b = Long.reverse(-2576128063588475048L);
   private static int a = Integer.reverse(0);
   private static long f = Long.reverse(-2576128063588475048L);
   private static int t = Integer.reverse(-1610612736);
   private static long z = Long.reverse(-2720243251664330920L);
   private static long n = Long.reverse(-2720243251664330920L);
   private static String[] b = new String[ag];

   private static String a(int var0, long var1) {
      var1 ^= 96L;
      var1 ^= -4580251861686935477L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(36 + 32),
                     (byte)(63 + 6),
                     (byte)(54 + 29),
                     (byte)(10 + 37),
                     (byte)(5 + 62),
                     (byte)(32 + 34),
                     (byte)(39 + 28),
                     (byte)(16 + 31),
                     80,
                     (byte)(52 + 23),
                     (byte)(60 + 7),
                     (byte)(28 + 55),
                     (byte)(45 + 8),
                     (byte)(19 + 61),
                     (byte)(48 + 49),
                     (byte)(30 + 70),
                     (byte)(38 + 62),
                     105,
                     (byte)(69 + 41),
                     (byte)(32 + 71)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(41 + 28), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(πηγμΣΔκκ.B("ńőŐēœŏŊœŞōĚŘŜŕŘŞĠҭҩҸҦґҊӁҬҚҞҳҴӆҥ", (byte)49, 66));
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

   private static void b() {
      c = 1944191142975503419L;
      long var0 = c ^ -4580251861686935477L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(55 + 13),
               (byte)(17 + 52),
               (byte)(14 + 69),
               (byte)(31 + 16),
               (byte)(6 + 61),
               (byte)(27 + 39),
               (byte)(53 + 14),
               (byte)(16 + 31),
               (byte)(41 + 39),
               (byte)(12 + 63),
               (byte)(45 + 22),
               83,
               (byte)(3 + 50),
               (byte)(44 + 36),
               97,
               (byte)(76 + 24),
               (byte)(17 + 83),
               (byte)(70 + 35),
               (byte)(43 + 67),
               (byte)(36 + 67)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(49 + 19), 69, (byte)(53 + 30)}, StandardCharsets.UTF_8));
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
               b[0] = ιΠοθΩΦξκ.E("ԸԼԥԃԼԬԊԻԝՉՄՂՇԦԞԎՈՃՌՔՓՓԴՋՒԸԼՙՒաԯԸԦԾԼզԝգ\u0557Հԥ՚ըՀԪԲմՔՉ\u0558կՌԵԵժՌՙՙ\u0557յձսՖվ", (byte)18, 69);
               b[1] = ΣφδσΔζιΠρα.E("ԙԈԹԀՁԽԾԤԽԹԭԖ", (byte)18, 69);
               b[2] = ξψθρΣΠΣς.B("ėÚĜĖÚĂęğßóĆáăĘĜõĂĭďíčĜāĲĂĠþĕñĬĻĄĥĜĹýĿċĶĿēģĂĹĳĞķĞŀĜĥŐıĩĖė", (byte)18, 66);
               b[3] = οοθδΨιοΦΠβδζ.E("ԲԕԔԻԿՅՋԹԧԎՃԼԿՆՇԏԩԸԑԪՌ՚ԡԢ", (byte)18, 69);
               b[4] = φΨαξωυθανΣφυκη.E("ԣԕՃԠԊՈԩԍԭԣԭԖ", (byte)18, 69);
               b[5] = βεξΠθρρςΔΦμ.D("нѐПгчрЩУѨћХг", (byte)18, 68);
               b[6] = ξψθρΣΠΣς.D("рвѠнЧѥцЪъръг", (byte)18, 68);
               b[7] = μεςΩΔΣγν.B("éĝğĜĚáċĕäòąúĕĩĝĀâīċĊĠðĩğģĒĕēĶĊĻĳĶöûČıĽŀĶýĺńĲġĕĝĕŀĥčĞĦĿĖė", (byte)18, 66);
               break;
            case 1:
               b[0] = πψυκΠΨμΛΩβΣφμφσ.E("ԸԼԥԃԼԬԊԻԝՉՄՂՇԦԞԎՈՃՌՔՓՓԴՋՒԸԼՙՒաԯԸԦԾԼզԝգ\u0557Հԥ՚ըՀԪԲմՔՉ\u0558կՌԵռԹՏԵիաՠՑ՚ոց", (byte)18, 69);
               b[1] = ΠΛΨοδΩσμνΛγΦφβς.B("æĆđĉċÝîÛĜïĘë", (byte)18, 66);
               b[2] = λΣΩσμφγχ.B("ėÚĜĖÚĂęğßóĆáăĘĜõĂĭďíčĜāĲĂĠþĕñĬĻĄĥĜĹýĿċĶĿēģĄĽĂĒĹĢĆŀĬģĠňĒīħĐİĲłŚħĔ", (byte)18, 66);
               b[3] = ιΠοθΩΦξκ.B("ćêéĐĔĚĠĎüãěãāúèĥęøÿûëğö÷", (byte)18, 66);
               b[4] = ςΦζσμτΓσ.D("нпюйѠШіјхФтг", (byte)18, 68);
               b[5] = πηγμΣΔκκ.B("ĔėěĠĚøĠúþďĐë", (byte)18, 66);
               b[6] = μζξτΩσσφυδεπλΨ.A("ûđđçđíĚûïďĘë", (byte)18, 65);
               b[7] = ΠΛΨοδΩσμνΛγΦφβς.A("éĝğĜĚáċĕäòąúĕĩĝĀâīċĊĠðĩğģĒĕēĶĊĻĳĶöûČıĽŀĶýĺŇĽĴķĝĞħĉħŁĆŏĖė", (byte)18, 65);
               break;
            case 2:
               b[0] = δΛψπξκσβγςα.A("Đĝĉĝ÷öûíČğğÙàĝćĄěĚģøİįö÷", (byte)18, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = ζοηκορΦνΣθγΩ.A("ěÕÝğàÛĢĠíėĜë", (byte)18, 65);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  λζταΛΓωγΠΣηηψΦ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ςΦζσμτΓσ.D("ԘԺԼԜՀ՟\u0557խՙԨզ՜ժդԭՒմճիձիՀ", (byte)105, 68), λζταΛΓωγΠΣηηψΦ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            οΩνΩρωλΨηΛδωδ.A("ƴǁǀƃǃƿƺǃǎƽƊǈǌǅǈǎƐԝԙԨԖԁӺԱԜԊԎԣԤԶԕƪ", (byte)105, 65) + var1 + ΠΛΨοδΩσμνΛγΦφβς.A("Ƌ", (byte)105, 65) + var2.toString(), var4
         );
      }
   }

   @EventHandler(
      priority = EventPriority.HIGH
   )
   public void a(PlayerSpawnLocationEvent var1) {
      ΨαχΨχΣλεΠψΦ var2 = this.l.b().a(var1.getPlayer());
      String var3 = var2.getName();
      InetAddress var4 = Optional.ofNullable(var2.a()).map(InetSocketAddress::getAddress).orElse(null);
      com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ var5 = com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ.a(var3, var4, null);
      if (var5 == null) {
         String var8 = c<"㺀">(a, b ^ d) + var3 + c<"㺃">(e, f ^ g) + var1.getClass().getSimpleName() + c<"㺆">(h, i);
         ψΓωτιμωκχψΛΨ.c(var8);
         String[] var10001 = new String[k];
         var10001[l] = c<"㺉">(m, n);
         var10001[o] = c<"㺌">(p & q, r);
         var10001[s] = c<"㺏">(t, u ^ v) + var8;
         var10001[w] = c<"㺒">(x & y, z);
         var10001[aa] = c<"㺕">(ab, ac ^ ad);
         var2.a(βιχγΓλχΠσπ.a(var10001));
      } else {
         Location var6 = var1.getSpawnLocation();
         Location var7 = this.b.a().a(var6, (boolean)ae);
         if (var7 != null) {
            if (ρζΨνψξφφεΨδσψ.p) {
               var5.a = var6;
            } else {
               this.l.a().a().b(var2).a().b(var6);
            }

            var1.setSpawnLocation(var7);
         }
      }
   }

   @Generated
   public λζταΛΓωγΠΣηηψΦ(nLoginBukkit var1, λΓλχΩαοΨωθτοςΓ var2) {
      this.l = var1;
      this.b = var2;
   }

   static {
      b();
   }
}
