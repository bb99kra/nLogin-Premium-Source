package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.plugin.PluginDescription;

final class ωγΔυΣΛωρΓν implements ΨΩΔξδκΛψψκφδ {
   private static int b = (2048 >>> 139 | 2048 << ~139 + 1) & -1;
   private static int q = (1073741824 >>> 190 | 1073741824 << ~190 + 1) & -1;
   private static int n = Integer.reverse(-1073741824);
   private static int z = (3 >>> 31 | 3 << -31) & -1;
   private static int ac = (14680064 >>> 213 | 14680064 << -213) & -1;
   private static String[] a = new String[ac];
   private static long s = Long.reverse(4913160985879796909L);
   private static int g = 1 >>> 192 | 1 << -192;
   private static int r = 8388608 >>> 21 | 8388608 << ~21 + 1;
   private static int y = Integer.reverse(Integer.MIN_VALUE);
   private static int j = Integer.reverse(0);
   private static long ab = Long.reverse(3904354669348805805L);
   private static long i = Long.reverse(8214565720323784704L);
   private static long w = Long.reverse(3904354669348805805L);
   private static int v = (-1 >>> 206 | -1 << -206) & -1;
   private static int k = Integer.reverse(1073741824);
   private static long f = Long.reverse(3904354669348805805L);
   private static long t = Long.reverse(8214565720323784704L);
   private static String[] b = new String[ωγΔυΣΛωρΓν.ad];
   private static long h = Long.reverse(4913160985879796909L);
   private static long o = Long.reverse(3904354669348805805L);
   private static long l = Long.reverse(4913160985879796909L);
   private static long m = Long.reverse(8214565720323784704L);
   private static int d = (0 >>> 84 | 0 << ~84 + 1) & -1;
   private static int a = Integer.reverse(0);
   private static int ad = Integer.reverse(-536870912);
   private static int x = 0 >>> 158 | 0 << ~158 + 1;
   private static int e = -1 >>> 223 | -1 << ~223 + 1;
   private static int aa = Integer.reverse(-1);
   private static long c;
   private final πργηπνπτΨζξσΓΓ a;
   private static int c = Integer.reverse(0);
   private static int u = 671088640 >>> 187 | 671088640 << ~187 + 1;
   private static int p = Integer.reverse(0);

   private static String a(int var0, long var1) {
      var1 ^= 78L;
      var1 ^= -4892950930752995798L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(18 + 51),
                     (byte)(50 + 33),
                     (byte)(7 + 40),
                     (byte)(51 + 16),
                     (byte)(36 + 30),
                     (byte)(45 + 22),
                     47,
                     (byte)(14 + 66),
                     (byte)(12 + 63),
                     (byte)(47 + 20),
                     (byte)(5 + 78),
                     (byte)(2 + 51),
                     (byte)(50 + 30),
                     (byte)(70 + 27),
                     (byte)(55 + 45),
                     (byte)(19 + 81),
                     (byte)(63 + 42),
                     (byte)(65 + 45),
                     (byte)(59 + 44)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(65 + 3), (byte)(28 + 41), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(οΩνΩρωλΨηΛδωδ.B("ĚħĦéĩĥĠĩĴģðĮĲīĮĴöґѼўҐѯѨҗҐѣҎ", (byte)28, 66));
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
   public μΓμρΨπζνιφφβΩΛΓ a() {
      return new χκηεΦωΣδλφΣτΦμι(this.a);
   }

   @Override
   public θΨΛξτΠνΓυιθςσ a() {
      ProxyServer var1 = this.a.a();
      return new θΨΛξτΠνΓυιθςσ(var1.getName(), var1.getVersion(), var1.getVersion(), κιββωσγχςΣβΠΣδ.c, (boolean)c);
   }

   @Override
   public void j() {
      this.a.j();
   }

   @Override
   public οεΦρΓψωΓξγΔι a(boolean var1) {
      return new ΠμυΛλδπι(this.a.a());
   }

   private static void b() {
      c = -5387934710969076702L;
      long var0 = c ^ -4892950930752995798L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(27 + 42),
               (byte)(47 + 36),
               (byte)(18 + 29),
               (byte)(52 + 15),
               (byte)(58 + 8),
               (byte)(58 + 9),
               (byte)(46 + 1),
               (byte)(42 + 38),
               75,
               (byte)(8 + 59),
               (byte)(39 + 44),
               (byte)(36 + 17),
               (byte)(79 + 1),
               (byte)(10 + 87),
               (byte)(9 + 91),
               (byte)(8 + 92),
               (byte)(59 + 46),
               (byte)(22 + 88),
               (byte)(50 + 53)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
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
               b[0] = πηγμΣΔκκ.D("ѼҌҏѤѐѴѠҍѣѭђїњѯҕҕқѶѽѫѷҡѨѩ", (byte)32, 68);
               b[1] = χΠξΦιζΨΣωΦσΨζ.D("ҌҁѪѠҋхѢ҉҇щ҂ѝ", (byte)32, 68);
               b[2] = ςΦζσμτΓσ.D("ѣҐцҀѣ҇ѼғѠѴјёіҚѱҙѲѽҐѳҕѡ҃Ѥҏҗ҈Ѥ҆ѽѶҡҨҎҋұѾҰҡҤ҅ѭ҂ҋѳҤҏҸҦҶҩґҸһѶңңҡҝұ҅ҿӉӂҹҧӏҼӇҨҨӋӏҡҡҔӄҷҷҴӛҳҗҜӟҫҨҩ", (byte)32, 68);
               b[3] = πηγμΣΔκκ.C("ѨхяѢѿҔѼ҃ҐҀѓѝ", (byte)32, 67);
               b[4] = ντθΔζβΔζ.E("ԐԌՎԨԱ՛՚ՐՋՓՉԤ", (byte)32, 69);
               b[5] = μζξτΩσσφυδεπλΨ.B("čĺðĪčıĦĽĊĞĂûĀńěŃĜħĺĝĿċĭĎĹŁĲĎİħĠŋŒĸĵśĨŚŋŎįėĪĲĮřşŕŚńūŧŬŅşŃĪŋĻİŕŭŐŉĶŧŏŤŊśĻűĺŵųőšŒŔŕņŃƄƈƃŇžŻƃŧƆůŌŏŌƑ", (byte)32, 66);
               b[6] = ΣφδσΔζιΠρα.F("ԶՀ\u0557ԖԢԚՒԫԶՏՉԤ", (byte)32, 70);
               break;
            case 1:
               b[0] = ΣδτΠνεγοΓορητ.F("ՃՓՖԫԗԻԧՔԪԴԘԼ՟ԲԼՂ\u0530ԺԼԡԟՂԯ\u0530", (byte)32, 70);
               b[1] = ξψθρΣΠΣς.C("іҐѢяѮѤҔѽҌ҅ѓѝ", (byte)32, 67);
               b[2] = φδχεθοκψαλΛογλ.B("čĺðĪčıĦĽĊĞĂûĀńěŃĜħĺĝĿċĭĎĹŁĲĎİħĠŋŒĸĵśĨŚŋŎįėĬĵĝŎĹŢŐŠœĻŢťĠōōŋŇśįũųŬţőŹŦűŒŒŵŹŋŊōńƄƃŠŚźźŪŌŕŒœ", (byte)32, 66);
               b[3] = ΦδφπθΩΩλζξ.D("ѼсњћҊ҂ѧѢѧѯҖѝ", (byte)32, 68);
               b[4] = φΨαξωυθανΣφυκη.C("ф҈ѥѣ҈ѡѪўўюҋҋҋҘѤѰ҉ҎҋѠҗѻѨѩ", (byte)32, 67);
               b[5] = ΦδφπθΩΩλζξ.B("čĺðĪčıĦĽĊĞĂûĀńěŃĜħĺĝĿċĭĎĹŁĲĎİħĠŋŒĸĵśĨŚŋŎįėĪĲĮřşŕŚńūŧŬŅşŃĪŋĻİŕŭŐŉĶŧŏŤŊśĻűĺŵųőšŒŔŕņŃƄƈƃƋŧŦŻŰŧƁƋƆŧŪūťƘƗƈřŭŮƉƔƔŧ", (byte)32, 66);
               b[6] = ΣδτΠνεγοΓορητ.C("҅њшъўѮѝѥѩҍҊѝ", (byte)32, 67);
               break;
            case 2:
               b[0] = πηγμΣΔκκ.D("҈ѨѮѼяэѮҍѫҌѳ҂ѱѣю҇ѵѭѵҍҞѰѶҢѼҒ҈ѡѶ҇ңѿ", (byte)32, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = ΨΦνΨΦωυΩνβςμ.F("ԬՎԦԊՋԬԧԺ՝ԔԬԘԴԔԙԽ՝\u0530ԟԺաԣըԫՌԶՅԫՉ\u0530Ճե", (byte)32, 70);
         }
      }
   }

   static {
      b();
   }

   @Override
   public void O() {
      this.a.O();
   }

   @Override
   public void V() {
      try {
         Map var1 = this.a.a();
         if (var1 != null && !var1.isEmpty()) {
            List var2 = var1.entrySet()
               .stream()
               .map(var0 -> (String)var0.getKey() + c<"㺀">(z & aa, ab) + ((ServerInfo)var0.getValue()).getSocketAddress())
               .collect(Collectors.toList());
            this.a.b.a().a().a(c<"㺀">(d & e, f), String.join(c<"㺃">(g, h ^ i), var2));
         }
      } catch (NoSuchMethodError var3) {
      }
   }

   @Override
   public ρΣνμχγΨοΔΦ[] a() {
      return this.a.a();
   }

   @Override
   public void T() {
      this.a.T();
   }

   @Override
   public ωΔτζχιαυΔτ a() {
      ProxyServer var1 = this.a.a();
      return new ωωξΠζΨΛζροθδβγ(this.a, var1, ΠγΔιΠΩζι.a(var1, var1.getConsole()));
   }

   @Override
   public θαΩΦνυψγ a() {
      return new αχδΦΨςφΣφΣκ(this.a);
   }

   @Generated
   public ωγΔυΣΛωρΓν(πργηπνπτΨζξσΓΓ var1) {
      this.a = var1;
   }

   @Override
   public boolean e(String var1) {
      int var2 = j;
      PluginDescription var3 = this.a.a().getDescription();
      if (!var3.getName().equals(var1)) {
         ψΓωτιμωκχψΛΨ.d(c<"㺀">(k, l ^ m) + var3.getName() + c<"㺃">(n, o));
         var2 = q;
      }

      if (!var3.getAuthor().equals(c<"㺆">(r, s ^ t))) {
         ψΓωτιμωκχψΛΨ.d(c<"㺉">(u & v, w));
         var2 = y;
      }

      return (boolean)var2;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ωγΔυΣΛωρΓν.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΣδτΠνεγοΓορητ.C("ӖӸӺӚӾԝԕԫԗӦԤԚԨԢӫԐԲԱԩԯԩӾ", (byte)83, 67), ωγΔυΣΛωρΓν.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            βθκςνθΩθυμςτκχ.A("ƈƕƔŗƗƓƎƗƢƑŞƜƠƙƜƢŤӿӪӌӾӝӖԅӾӑӼź", (byte)83, 65) + var1 + ΣφδσΔζιΠρα.F("Չ", (byte)83, 70) + var2.toString(), var4
         );
      }
   }

   @Override
   public μΓμρΨπζνιφφβΩΛΓ b() {
      return new ΨΨβυλξηνσθ(this.a, this.a.a());
   }

   @Override
   public void U() {
      ψΓωτιμωκχψΛΨ.a(this.a, (boolean)a, (boolean)b);
   }

   @Override
   public void i() {
      this.a.i();
   }
}
