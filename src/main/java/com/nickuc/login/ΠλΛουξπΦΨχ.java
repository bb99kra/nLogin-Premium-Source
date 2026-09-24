package com.nickuc.login;

import com.nickuc.login.loader.platform.BukkitLoader;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.plugin.messaging.PluginMessageListener;

public class ΠλΛουξπΦΨχ extends ξυνξβμχε<μΛΔθΛτναεαΓ> {
   private static String[] c = new String[ΠλΛουξπΦΨχ.w];
   private static long p = Long.reverse(8978897489676811223L);
   private static long s = Long.reverse(-1873497444986126336L);
   private static int q = (67108864 >>> 25 | 67108864 << -25) & -1;
   private static int o = (-1 >>> 138 | -1 << ~138 + 1) & -1;
   private static String[] d = new String[ΠλΛουξπΦΨχ.x];
   private static long v = Long.reverse(-1873497444986126336L);
   private static int t = (384 >>> 71 | 384 << -71) & -1;
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static long r = Long.reverse(-7306118762894902313L);
   private static long j = Long.reverse(-1873497444986126336L);
   private static long f;
   private static int x = Integer.reverse(536870912);
   private static long u = Long.reverse(-7306118762894902313L);
   private static int b = Integer.reverse(0);
   private static int w = 4 >>> 192 | 4 << -192;
   private static long i = Long.reverse(-7306118762894902313L);

   @Override
   public void b(Object var1) {
      throw new UnsupportedOperationException();
   }

   private static String a(int var0, long var1) {
      var1 ^= 103L;
      var1 ^= 4493939641104002683L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(19 + 49),
                     (byte)(63 + 6),
                     (byte)(81 + 2),
                     (byte)(23 + 24),
                     (byte)(11 + 56),
                     (byte)(64 + 2),
                     (byte)(3 + 64),
                     (byte)(18 + 29),
                     (byte)(5 + 75),
                     (byte)(51 + 24),
                     (byte)(39 + 28),
                     (byte)(2 + 81),
                     53,
                     (byte)(30 + 50),
                     (byte)(42 + 55),
                     (byte)(52 + 48),
                     100,
                     (byte)(70 + 35),
                     (byte)(29 + 81),
                     (byte)(11 + 92)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(33 + 36), (byte)(59 + 24)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(χφπρψπφΦθμπ.F("ԾՋՊԍՍՉՄՍ\u0558ՇԔՒՖՏՒ\u0558Ԛࢌࢨࢉࢮࢵࢯࢲ࢙࢜ࢼ", (byte)31, 70));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         c[var0] = new String(var3.doFinal(Base64.getDecoder().decode(d[var0])), StandardCharsets.UTF_8);
      }

      return c[var0];
   }

   private static void b() {
      f = -1451096638930101927L;
      long var0 = f ^ 4493939641104002683L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(52 + 16),
               (byte)(41 + 28),
               83,
               (byte)(20 + 27),
               (byte)(62 + 5),
               (byte)(29 + 37),
               (byte)(58 + 9),
               (byte)(30 + 17),
               (byte)(12 + 68),
               (byte)(19 + 56),
               (byte)(25 + 42),
               (byte)(80 + 3),
               (byte)(25 + 28),
               (byte)(60 + 20),
               97,
               (byte)(26 + 74),
               (byte)(77 + 23),
               (byte)(15 + 90),
               (byte)(24 + 86),
               (byte)(74 + 29)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(57 + 11), 69, (byte)(44 + 39)}, StandardCharsets.UTF_8));
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
               d[0] = μεςΩΔΣγν.E("ԲՇԙՇԖԝՉԺԈԎԊՊԫՎՍՌԓՏՊՓԡԨԫԷԚ՞ՙԙՒՀՌՂԭ՞ՈԶՕԢդդԵ՝աԴ", (byte)16, 69);
               d[1] = οΩνΩρωλΨηΛδωδ.B("åĖČęĉĈĝÖčíÿĐĘáöçßāħêĢġīĈĀĎġĆĳđąĪ", (byte)16, 66);
               d[2] = ςΦζσμτΓσ.B("äĆÕïç×ČØĐāâēēûģñĖþóĕþěÿĂĢĚðĪĢóïĶðćıĵďėúčĵúùć", (byte)16, 66);
               d[3] = πψυκΠΨμΛΩβΣφμφσ.B("äĆÕïç×ČØĐāâēēûģñĖþóĕþěÿĂĢĚðĪĢóïĶðćıĵďėúčĵúùć", (byte)16, 66);
               break;
            case 1:
               d[0] = δΛψπξκσβγςα.D("ыѠвѠЯжѢѓСЧУѣфѧѦѥЬѨѣѬксфѐгѷѲвѫљѥћѸїмҁѣѠѼѤ҅Ѳчэ", (byte)16, 68);
               d[1] = ΣφδσΔζιΠρα.C("ЫќђџяюѣМѓгхіўЧмЭХчѭаѨѦЭіЬщяјѕѼѽѬ", (byte)16, 67);
               d[2] = ντθΔζβΔζ.E("ԑԳԂԜԔԄԹԅԽԮԏՀՀԨՐԞՃԫԠՂԫՈԬԯՏՇԝ\u0557ՏԠԜգ՛եՒՄՕԻՖՆՆՅաԴ", (byte)16, 69);
               d[3] = βεξΠθρρςΔΦμ.D("ЪьЛеЭНђОічШљљсѩзќфйћфѡхшѨѠжѰѨйеѼѰѱѯѼѽк҅ѽѹѰѲэ", (byte)16, 68);
               break;
            case 2:
               d[0] = ςπυηννναΣ.D("ЪбљЮгђжхћйіЭ", (byte)16, 68);
            case 3:
            default:
               break;
            case 4:
               d[0] = οοθδΨιοΦΠβδζ.A("ēçĈðøÜæďòÙČęÛÝýæĤĕûéĊīòó", (byte)16, 65);
         }
      }
   }

   static {
      b();
   }

   @Override
   public void c(Object var1) {
      if (!(var1 instanceof String)) {
         throw new IllegalArgumentException(c<"㺀">(t, u ^ v));
      } else {
         String var2 = (String)var1;
         BukkitLoader var3 = this.h.a();
         Messenger var4 = var3.getServer().getMessenger();
         var4.unregisterIncomingPluginChannel(var3, var2);
         var4.unregisterOutgoingPluginChannel(var3, var2);
      }
   }

   @Override
   public void a(Object var1, Object var2) {
      if (var2 == null) {
         throw new IllegalArgumentException(c<"㺀">(b, i ^ j));
      } else if (!(var2 instanceof PluginMessageListener)) {
         throw new IllegalArgumentException(c<"㺃">(n & o, p) + var2.getClass().getCanonicalName());
      } else if (!(var1 instanceof String)) {
         throw new IllegalArgumentException(c<"㺆">(q, r ^ s));
      } else {
         String var3 = (String)var1;
         BukkitLoader var4 = this.h.a();
         Messenger var5 = var4.getServer().getMessenger();
         if (!var5.isOutgoingChannelRegistered(var4, var3)) {
            var5.registerOutgoingPluginChannel(var4, var3);
         }

         if (!var5.isIncomingChannelRegistered(var4, var3)) {
            var5.registerIncomingPluginChannel(var4, var3, (PluginMessageListener)var2);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ΠλΛουξπΦΨχ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ζβησεθωυγτ.F("ӾԠԢԂԦՅԽՓԿԎՌՂՐՊԓԸ՚ՙՑ\u0557ՑԦ", (byte)26, 70), ΠλΛουξπΦΨχ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            χΠξΦιζΨΣωΦσΨζ.F("ԹՆՅԈՈՄԿՈՓՂԏՍՑՊՍՓԕࢇࢣࢄࢩࢰࢪࢭ\u0894\u0897ࢷԫ", (byte)26, 70) + var1 + ςΦζσμτΓσ.A("í", (byte)26, 65) + var2.toString(), var4
         );
      }
   }

   public ΠλΛουξπΦΨχ(μΛΔθΛτναεαΓ var1) {
      super(var1);
   }
}
