package com.nickuc.login;

import com.velocitypowered.api.event.PostOrder;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.command.CommandExecuteEvent;
import com.velocitypowered.api.event.command.PlayerAvailableCommandsEvent;
import com.velocitypowered.api.event.command.CommandExecuteEvent.CommandResult;
import com.velocitypowered.api.event.player.TabCompleteEvent;
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

public class ψΔφΣΦΦΩπηγοΠζ implements ωΩΩαομοΣψΩ {
   private static int h = 0 >>> 198 | 0 << -198;
   private final String bS;
   private static int r = (0 >>> 237 | 0 << ~237 + 1) & -1;
   private static int b = Integer.reverse(1543503872);
   private static long c;
   private static int a = Integer.reverse(-973078528);
   private static int p = Integer.reverse(0);
   private static int m = 0 >>> 123 | 0 << -123;
   private static int k = Integer.reverse(0);
   private static int y = (0 >>> 152 | 0 << ~152 + 1) & -1;
   private static int ab = Integer.reverse(Integer.MIN_VALUE);
   private static int x = Integer.reverse(Integer.MIN_VALUE);
   private static int f = Integer.reverse(1543503872);
   private static long o = Long.reverse(9130017673472434196L);
   private static int aa = 512 >>> 233 | 512 << ~233 + 1;
   private static int w = Integer.reverse(1543503872);
   private static int z = 94 >>> 1 | 94 << -1;
   private static int g = 6336 >>> 38 | 6336 << ~38 + 1;
   private static int e = 805306374 >>> 156 | 805306374 << ~156 + 1;
   private static int t = (8192 >>> 141 | 8192 << -141) & -1;
   private static int l = 96256 >>> 171 | 96256 << -171;
   private static int q = (1073741824 >>> 254 | 1073741824 << -254) & -1;
   private static int s = Integer.reverse(1543503872);
   private static int n = Integer.reverse(0);
   private static String[] b = new String[ab];
   private static int u = 0 >>> 193 | 0 << ~193 + 1;
   private final Set<String> t;
   private final Set<String> u;
   private static int j = 0 >>> 108 | 0 << ~108 + 1;
   private static String[] a = new String[aa];
   private static int v = Integer.reverse(-201326592);
   private static int i = Integer.reverse(-201326592);
   private static int d = Integer.reverse(0);
   private static int c = (103809024 >>> 20 | 103809024 << -20) & -1;

   static {
      b();
   }

   @Subscribe(
      order = PostOrder.LAST
   )
   public void a(CommandExecuteEvent var1) {
      if (this.g(var1.getCommand())) {
         var1.setResult(CommandResult.allowed());
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 110L;
      var1 ^= 7936652216971819836L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(37 + 31),
                     (byte)(55 + 14),
                     (byte)(8 + 75),
                     (byte)(44 + 3),
                     (byte)(14 + 53),
                     (byte)(2 + 64),
                     (byte)(24 + 43),
                     (byte)(44 + 3),
                     (byte)(29 + 51),
                     (byte)(48 + 27),
                     (byte)(52 + 15),
                     (byte)(55 + 28),
                     (byte)(30 + 23),
                     (byte)(17 + 63),
                     97,
                     100,
                     (byte)(37 + 63),
                     (byte)(103 + 2),
                     (byte)(64 + 46),
                     (byte)(48 + 55)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(59 + 10), (byte)(48 + 35)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(χΠξΦιζΨΣωΦσΨζ.E("ռ։ֈՋ\u058bևւ\u058b֖օՒ\u0590֔֍\u0590֖\u0558ࣲࢿࣱࣲ࣐ࣩࣦࣔࣕࣙࣳࣕ࣬", (byte)93, 69));
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

   @Subscribe(
      order = PostOrder.EARLY
   )
   public void a(PlayerAvailableCommandsEvent var1) {
      var1.getRootNode().getChildren().removeIf(var1x -> {
         String var2 = var1x.getName().toLowerCase(Locale.ENGLISH);
         return (boolean)(!var2.startsWith(this.bS + s) && !this.t.contains(var2) ? u : t);
      });
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ψΔφΣΦΦΩπηγοΠζ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ζβησεθωυγτ.B("œŵŷŗŻƚƒƨƔţơƗƥƟŨƍƯƮƦƬƦŻ", (byte)86, 66), ψΔφΣΦΦΩπηγοΠζ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ςΦζσμτΓσ.B("ƎƛƚŝƝƙƔƝƨƗŤƢƦƟƢƨŪԄӑԄӢӦӧӫԃӻӸԅӧӾƃ", (byte)86, 66) + var1 + φΨαξωυθανΣφυκη.A("ť", (byte)86, 65) + var2.toString(), var4
         );
      }
   }

   private boolean g(String var1) {
      if (var1.isEmpty()) {
         return (boolean)j;
      } else if (var1.charAt(k) != l) {
         return (boolean)m;
      } else {
         String[] var2 = var1.split(c<"㺀">(n, o));
         return (boolean)(var2.length > 0 && this.u.contains(var2[p].toLowerCase(Locale.ENGLISH)) ? q : r);
      }
   }

   public ψΔφΣΦΦΩπηγοΠζ(νεΓτεκΓηζεΔλιΩ var1) {
      this.bS = var1.q().toLowerCase(Locale.ENGLISH);
      HashSet var2 = new HashSet();
      var2.add(this.bS + a);
      var2.add(this.bS + b + this.bS + c);
      κιββωσγχςΣβΠΣδ[] var3 = κιββωσγχςΣβΠΣδ.values();
      int var4 = var3.length;

      for (int var5 = d; var5 < var4; var5++) {
         κιββωσγχςΣβΠΣδ var6 = var3[var5];
         String var7 = var6.Z().toLowerCase(Locale.ENGLISH);
         var2.add(this.bS + var7 + e);
         var2.add(this.bS + f + this.bS + var7 + g);
      }

      this.t = σΠοξΔθαφγο.a(var2);
      this.u = σΠοξΔθαφγο.a(var2.stream().map(var0 -> z + var0).collect(Collectors.toSet()));
   }

   @Subscribe(
      order = PostOrder.EARLY
   )
   public void a(TabCompleteEvent var1) {
      List var2 = var1.getSuggestions();
      if (!var2.isEmpty()) {
         String var3 = var1.getPartialMessage().trim();
         if (var3.isEmpty() || var3.charAt(h) == i) {
            var2.removeIf(var1x -> (boolean)(!var1x.startsWith(v + this.bS + w) && !this.g(var1x) ? y : x));
         }
      }
   }

   private static void b() {
      c = 2884338127762763024L;
      long var0 = c ^ 7936652216971819836L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(51 + 17),
               (byte)(53 + 16),
               (byte)(77 + 6),
               (byte)(34 + 13),
               (byte)(41 + 26),
               (byte)(61 + 5),
               (byte)(2 + 65),
               (byte)(44 + 3),
               (byte)(47 + 33),
               (byte)(40 + 35),
               (byte)(60 + 7),
               (byte)(61 + 22),
               (byte)(22 + 31),
               80,
               (byte)(75 + 22),
               100,
               (byte)(54 + 46),
               (byte)(94 + 11),
               (byte)(46 + 64),
               (byte)(50 + 53)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(49 + 20), (byte)(16 + 67)}, StandardCharsets.UTF_8));
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
               b[0] = φΨαξωυθανΣφυκη.D("ҷӘҿӈӬҭӲҿӠӦӘҽ", (byte)64, 68);
               break;
            case 1:
               b[0] = ξψθρΣΠΣς.D("ӇҾӤӆөӅҼӇӥұӪҽ", (byte)64, 68);
               break;
            case 2:
               b[0] = ΣδτΠνεγοΓορητ.A("ťŤńŖŻĽōŞŖššľŏőŕľŇĻŞŠšƋŒœ", (byte)64, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = λΣΩσμφγχ.E("ԵգԱԵապՙչԻՒՖմ\u0557չչշՄւղբՒբՏՐ", (byte)64, 69);
         }
      }
   }
}
