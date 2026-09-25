package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.event.TabCompleteEvent;
import net.md_5.bungee.event.EventHandler;

public class NLoginCore_217 implements NLoginInterface_046 {
   private static int z = Integer.reverse(1543503872);
   private static int q = Integer.reverse(0);
   private static int m = Integer.reverse(0);
   private static int h = Integer.reverse(0);
   private static int f = 7602176 >>> 81 | 7602176 << ~81 + 1;
   private static int v = 0 >>> 32 | 0 << -32;
   private static int n = Integer.reverse(0);
   private final Set<String> k;
   private static int c = 103809024 >>> 244 | 103809024 << -244;
   private static String[] ZKM_STR_A = new String[NLoginCore_217.ad];
   private static int ad = Integer.reverse(1073741824);
   private static int g = Integer.reverse(-973078528);
   private final String ap;
   private static int d = Integer.reverse(0);
   private final Set<String> j;
   private static long u = Long.reverse(5174011409097971490L);
   private static int l = Integer.reverse(0);
   private static int aa = (4194304 >>> 246 | 4194304 << -246) & -1;
   private static int s = Integer.reverse(0);
   private static int k = (0 >>> 157 | 0 << ~157 + 1) & -1;
   private static long c;
   private static int e = Integer.reverse(-973078528);
   private static int r = 192512 >>> 236 | 192512 << ~236 + 1;
   private static long j = Long.reverse(-4899916394579099648L);
   private static int o = -268435454 >>> 124 | -268435454 << -124;
   private static int y = 12320768 >>> 210 | 12320768 << -210;
   private static int t = Integer.reverse(Integer.MIN_VALUE);
   private static int ab = Integer.reverse(0);
   private static int x = Integer.reverse(0);
   private static int w = 4 >>> 34 | 4 << ~34 + 1;
   private static int ac = (12032 >>> 72 | 12032 << -72) & -1;
   private static int p = Integer.reverse(0);
   private static int a = 25952256 >>> 18 | 25952256 << ~18 + 1;
   private static long i = Long.reverse(-302365737784551646L);
   private static String[] ZKM_STR_B = new String[NLoginCore_217.ae];
   private static int ae = Integer.reverse(1073741824);
   private static int b = Integer.reverse(1543503872);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_217.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_451.D("рѢѤфѨ҇ѿҕҁѐҎ҄ҒҌѕѺҜқғҙғѨ", (byte)33, 68), NLoginCore_217.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_241.D("ѻ҈҇ъҊ҆ҁҊҕ҄ёҏғҌҏҕї߰ߤߢߡߓ߷ߒߤ߬߸ߖ߸ߛ߲߰Ѳ", (byte)33, 68) + var1 + NLoginCore_575.C("ђ", (byte)33, 67) + var2.toString(), var4
         );
      }
   }

   private boolean g(String var1) {
      if (var1.isEmpty()) {
         return (p != 0);
      } else if (var1.charAt(q) != r) {
         return (s != 0);
      } else {
         String[] var2 = var1.split(a(t, u));
         return ((var2.length > 0 && this.k.contains(var2[v].toLowerCase(Locale.ENGLISH) != 0)) ? w : x);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 61L;
      var1 ^= -6904674705708606846L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(53 + 15),
                     (byte)(3 + 66),
                     (byte)(76 + 7),
                     (byte)(10 + 37),
                     67,
                     (byte)(25 + 41),
                     (byte)(31 + 36),
                     (byte)(15 + 32),
                     (byte)(40 + 40),
                     75,
                     (byte)(58 + 9),
                     (byte)(27 + 56),
                     (byte)(39 + 14),
                     (byte)(17 + 63),
                     (byte)(73 + 24),
                     (byte)(47 + 53),
                     (byte)(27 + 73),
                     (byte)(55 + 50),
                     (byte)(38 + 72),
                     (byte)(76 + 27)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(47 + 21), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_453.B("ƤƱưųƳƯƪƳƾƭźƸƼƵƸƾƀԙԍԋԊӼԠӻԍԕԡӿԡԄԛԙ", (byte)97, 66));
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

   @EventHandler(
      priority = -32
   )
   public void a(TabCompleteEvent var1) {
      if (!var1.isCancelled()) {
         List var2 = var1.getSuggestions();
         if (!var2.isEmpty()) {
            String var3 = var1.getCursor().trim();
            if (var3.isEmpty() || var3.charAt(n) == o) {
               var2.removeIf(var1x -> ((!var1x.startsWith(y + this.ap + z) != 0) && !this.g(var1x) ? ab : aa));
            }
         }
      }
   }

   @Override
   public void a(Object var1) {
      NLoginInterface_046.super.a(var1);
      if (NLoginCore_298.a(a(h, i ^ j))) {
         NLoginCore_383 var2 = (NLoginCore_383)var1;
         var2.a(new NLoginCore_394(this.ap, this.j), new NLoginInterface_013[l]);
      }
   }

   static {
      b();
   }

   public NLoginCore_217(NLoginCore_383 var1) {
      this.ap = var1.q().toLowerCase(Locale.ENGLISH);
      HashSet var2 = new HashSet();
      var2.add(this.ap + a);
      var2.add(this.ap + b + this.ap + c);
      NLoginCore_419[] var3 = NLoginCore_419.values();
      int var4 = var3.length;

      for (int var5 = d; var5 < var4; var5++) {
         NLoginCore_419 var6 = var3[var5];
         String var7 = var6.Z().toLowerCase(Locale.ENGLISH);
         var2.add(this.ap + var7 + e);
         var2.add(this.ap + f + this.ap + var7 + g);
      }

      this.j = NLoginCore_114.a(var2);
      this.k = NLoginCore_114.a(var2.stream().map(var0 -> ac + var0).collect(Collectors.toSet()));
   }

   @EventHandler(
      priority = 127
   )
   public void a(ChatEvent var1) {
      if (this.g(var1.getMessage())) {
         var1.setCancelled((m != 0));
      }
   }

   private static void b() {
      c = 4965879281577341919L;
      long var0 = c ^ -6904674705708606846L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(26 + 42),
               (byte)(35 + 34),
               (byte)(17 + 66),
               (byte)(13 + 34),
               67,
               (byte)(45 + 21),
               (byte)(56 + 11),
               (byte)(35 + 12),
               (byte)(68 + 12),
               75,
               (byte)(50 + 17),
               (byte)(4 + 79),
               (byte)(38 + 15),
               (byte)(56 + 24),
               (byte)(95 + 2),
               (byte)(22 + 78),
               (byte)(88 + 12),
               (byte)(79 + 26),
               (byte)(21 + 89),
               (byte)(54 + 49)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(59 + 24)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_173.D("ԸԎӽԈԐӽՂՃӿԯԣԜԓԇԣԥԘԃԈԋԮԋՀՈՋԔՃԩԪՓԷԭՍԔԨԹՉՔԪՙ՞ԢԸաՁգէԩՄՄՏՠՑՈՂծԬմՠՔՙՐՉռԼըշպլսՂՎմցեԿՄԿգՊետփ՞խ֏Ֆ\u0557", (byte)90, 68);
               ZKM_STR_B[1] = NLoginCore_324.A("ƖƎżƭƣżƄżżƴƆŻ", (byte)90, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_530.A("ƨžŭŸƀŭƲƳůƟƓƌƃŷƓƕƈųŸŻƞŻưƸƻƄƳƙƚǃƧƝƽƄƘƩƹǄƚǉǎƒƨǑƱǓǗƙƴƴƿǐǁƸƲǞƜǤǐǄǉǀƹǬƬǘǧǪǜǭƲƾǤǱǕǂƮǦǒǄǮǌǈǚǱǵǙǓƺǥǢǕǄǈǙǗ", (byte)90, 65);
               ZKM_STR_B[1] = NLoginCore_451.C("ӼԪԨԉԭԒӻԲԹԑԅԋ", (byte)90, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_110.C("ӷԅԈԴԿԯԬԻԞՀԞՇԦԖԄԧՄԘԿԌԛԩԖԗ", (byte)90, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_076.C("ӹԉӸӸԏԼԜԝӻԼԸԑԅՄԶԅԙԸԷԨՃԙԖԗ", (byte)90, 67);
         }
      }
   }
}
