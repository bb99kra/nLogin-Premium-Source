package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.event.Cancellable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.server.ServerCommandEvent;

public class NLoginCore_239 implements NLoginInterface_027 {
   private static long j = Long.reverse(-4357958274171877454L);
   private static int ac = Integer.reverse(-201326592);
   private static int w = Integer.reverse(1073741824);
   private final Set<String> h;
   private static int c = 811008 >>> 45 | 811008 << ~45 + 1;
   private static int ab = Integer.reverse(0);
   private static int i = -1 >>> 55 | -1 << ~55 + 1;
   private static int q = (0 >>> 119 | 0 << ~119 + 1) & -1;
   private static int t = Integer.reverse(0);
   private static int h = Integer.reverse(0);
   private static int o = 0 >>> 80 | 0 << ~80 + 1;
   private static String[] a = new String[NLoginCore_239.ad];
   private static long c;
   private static int aa = 2 >>> 65 | 2 << ~65 + 1;
   private static int e = Integer.reverse(-973078528);
   private static int a = 198 >>> 161 | 198 << -161;
   private static int z = (0 >>> 90 | 0 << ~90 + 1) & -1;
   private static long y = Long.reverse(-6629298651489370112L);
   private static int v = 376 >>> 227 | 376 << -227;
   private static int m = Integer.reverse(Integer.MIN_VALUE);
   private static int f = Integer.reverse(1543503872);
   private static String[] b = new String[NLoginCore_239.ae];
   private static long x = Long.reverse(7459487148048304050L);
   private static int b = Integer.reverse(1543503872);
   private static int g = Integer.reverse(-973078528);
   private static int r = (0 >>> 32 | 0 << -32) & -1;
   private final String ae;
   private static int ae = Integer.reverse(-1073741824);
   private static long n = Long.reverse(-4357958274171877454L);
   private static int s = Integer.reverse(0);
   private static int d = Integer.reverse(0);
   private static int p = Integer.reverse(0);
   private static int l = 0 >>> 222 | 0 << -222;
   private static int k = (0 >>> 255 | 0 << ~255 + 1) & -1;
   private static int u = 1540096 >>> 47 | 1540096 << -47;
   private static int ad = Integer.reverse(-1073741824);
   private final Set<String> g;

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_239.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(
                     NLoginCore_091.F("\u0530ՒՔԴ\u0558շկօձՀվմւռՅժ\u058c\u058bփ։փ\u0558", (byte)76, 70), NLoginCore_239.class.getClassLoader()
                  )
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_092.E("իոշԺպնձպօմՁտփռտօՇࣟࣙ࣠ࣝࣤࣞࣥࣛࣁ՜", (byte)76, 69) + var1 + NLoginCore_324.C("ӓ", (byte)76, 67) + var2.toString(), var4);
      }
   }

   private static void b() {
      c = 5612400205601612262L;
      long var0 = c ^ -3450135039845536273L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(15 + 53),
               (byte)(46 + 23),
               83,
               (byte)(22 + 25),
               (byte)(13 + 54),
               (byte)(65 + 1),
               (byte)(54 + 13),
               (byte)(14 + 33),
               (byte)(14 + 66),
               (byte)(24 + 51),
               (byte)(25 + 42),
               (byte)(23 + 60),
               (byte)(32 + 21),
               (byte)(75 + 5),
               (byte)(52 + 45),
               100,
               (byte)(57 + 43),
               (byte)(56 + 49),
               (byte)(106 + 4),
               (byte)(77 + 26)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(28 + 55)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_223.B("ƉƨƖƓưƬƻƕƸƽǄƍƃƝźƱƗƃƪƃƧǐƭƹƉƳǍƋƑƯǘƸǎƼƩǔƵƯǗǛǎǖƽǆǕƠƺƛǋǝƫǚǖƹǭưƻǉǟƲƳǠǙǉ", (byte)97, 66);
               b[1] = NLoginCore_141.A("ƉƨƖƓưƬƻƕƸƽǄƍƃƝźƱƗƃƪƃƧǎƻƩƦơǏƥƣǐǍǇǄƹǗƔưƬƙǢƳƚƻǢǀƧƥǢǛƫƺǨƭƪǯǀǡǏǆǓǟǱǲǨ", (byte)97, 65);
               b[2] = NLoginCore_575.F("էխհֈլ\u0590֕֊տսոե", (byte)97, 70);
               break;
            case 1:
               b[0] = NLoginCore_201.F("եքղկ\u058cֈ֗ձ֔֙֠թ՟չՖ֍ճ՟ֆ՟փ֬։֕ե֏֩էխ\u058bִ֪֔֘օְ֑\u058bֱֲֳַ֪֢֙ռ֖շֹ֧ևֲֶָ֝׆֨\u058cւ֑֪֨ב֨֕ה\u05c9הִִֵֶׇ֑֥֟", (byte)97, 70);
               b[1] = NLoginCore_553.F("եքղկ\u058cֈ֗ձ֔֙֠թ՟չՖ֍ճ՟ֆ՟փ֪֗օւս֫ցտֳ֣֬֩֠֕հ\u058cֈյ־֏ն֗־֜փց־ַև֖ׄ։\u05ca׀ַև֍\u05cbֈ֣ב֦֨", (byte)97, 70);
               b[2] = NLoginCore_201.B("ƕƳƒƲƽƽŻƢƍƐǂƉ", (byte)97, 66);
               break;
            case 2:
               b[0] = NLoginCore_141.E("ֈ\u0590֑ղՐք՚ը֊ն֒՚ժրմֆկ֖ձ֢֥֢֣֓֙ծ֨ըְ֩֒խ", (byte)97, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_387.C("ԿԲԠԎԋ\u0530ԓԴՊԒ\u0530ՆԓՔԬԸԱԾՠբԵդԫԬ", (byte)97, 67);
         }
      }
   }

   @EventHandler(
      priority = EventPriority.MONITOR
   )
   public void a(PlayerCommandPreprocessEvent var1) {
      if (this.g(var1.getMessage())) {
         var1.setCancelled((boolean)q);
      }
   }

   @EventHandler(
      priority = EventPriority.MONITOR
   )
   public void b(ServerCommandEvent var1) {
      if (var1 instanceof Cancellable && this.g(var1.getCommand())) {
         var1.setCancelled((boolean)r);
      }
   }

   private boolean g(String var1) {
      if (var1.isEmpty()) {
         return (boolean)s;
      } else {
         if (var1.charAt(t) != u) {
            var1 = v + var1;
         }

         String[] var2 = var1.split(a(w, x ^ y));
         return (boolean)(var2.length > 0 && this.h.contains(var2[z].toLowerCase(Locale.ENGLISH)) ? aa : ab);
      }
   }

   public NLoginCore_239(NLoginCore_089 var1) {
      this.ae = var1.q().toLowerCase(Locale.ENGLISH);
      HashSet var2 = new HashSet();
      var2.add(this.ae + a);
      var2.add(this.ae + b + this.ae + c);
      NLoginCore_419[] var3 = NLoginCore_419.values();
      int var4 = var3.length;

      for (int var5 = d; var5 < var4; var5++) {
         NLoginCore_419 var6 = var3[var5];
         String var7 = var6.Z().toLowerCase(Locale.ENGLISH);
         var2.add(this.ae + var7 + e);
         var2.add(this.ae + f + this.ae + var7 + g);
      }

      this.g = NLoginCore_114.a(var2);
      this.h = NLoginCore_114.a(var2.stream().map(var0 -> ac + var0).collect(Collectors.toSet()));
   }

   private static String a(int var0, long var1) {
      var1 ^= 37L;
      var1 ^= -3450135039845536273L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(48 + 20),
                     (byte)(18 + 51),
                     83,
                     (byte)(21 + 26),
                     (byte)(15 + 52),
                     (byte)(7 + 59),
                     (byte)(14 + 53),
                     (byte)(37 + 10),
                     (byte)(7 + 73),
                     (byte)(64 + 11),
                     (byte)(20 + 47),
                     (byte)(24 + 59),
                     (byte)(50 + 3),
                     (byte)(30 + 50),
                     (byte)(29 + 68),
                     100,
                     (byte)(37 + 63),
                     (byte)(16 + 89),
                     (byte)(78 + 32),
                     (byte)(56 + 47)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(5 + 78)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_427.E("ԟԬԫӮԮԪԥԮԹԨӵԳԷ\u0530ԳԹӻ\u0893ࢍ\u0894\u0891࢘\u0892࢙\u088fࡵ", (byte)0, 69));
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
   public void a(Object var1) {
      NLoginInterface_027.super.a(var1);
      NLoginCore_089 var2 = (NLoginCore_089)var1;
      if (NLoginCore_298.a(a(h & i, j))) {
         var2.a(new NLoginCore_106(this.ae, this.g), new NLoginInterface_013[l]);
      }

      if (NLoginCore_298.a(a(m, n))) {
         var2.a(new NLoginCore_476(this.ae, this.h), new NLoginInterface_013[p]);
      }
   }

   static {
      b();
   }
}
