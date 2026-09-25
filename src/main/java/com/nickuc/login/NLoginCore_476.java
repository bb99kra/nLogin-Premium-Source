package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Locale;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.server.TabCompleteEvent;

public class NLoginCore_476 implements NLoginInterface_027 {
   private final Set<String> i;
   private static int b = Integer.reverse(-1);
   private static int m = (0 >>> 195 | 0 << ~195 + 1) & -1;
   private static String[] ZKM_STR_A = new String[NLoginCore_476.n];
   private static int o = Integer.reverse(1073741824);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int i = 0 >>> 209 | 0 << -209;
   private static long f = Long.reverse(-3091159427748377833L);
   private static int l = 1 >>> 0 | 1 << -0;
   private static int k = Integer.reverse(1543503872);
   private static int j = Integer.reverse(-201326592);
   private static String[] ZKM_STR_B = new String[o];
   private static int a = Integer.reverse(0);
   private static long c;
   private final String af;
   private static long d = Long.reverse(-1650007546989819113L);
   private static long g = Long.reverse(4323455642275676160L);
   private static int n = (131072 >>> 240 | 131072 << ~240 + 1) & -1;
   private static int h = Integer.reverse(0);

   @Generated
   NLoginCore_476(String var1, Set<String> var2) {
      this.af = var1;
      this.i = var2;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_476.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_575.A("ŉūŭōűƐƈƞƊřƗƍƛƕŞƃƥƤƜƢƜű", (byte)81, 65), NLoginCore_476.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_232.C("ԋԘԗӚԚԖԑԚԥԔӡԟԣԜԟԥӧࡼࡣࡣࡤࡦࢇࡲࡨࡺࢆࢂࡻ\u086eԀ", (byte)81, 67) + var1 + NLoginCore_092.A("ś", (byte)81, 65) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 60L;
      var1 ^= 4108399764546634854L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(52 + 16),
                     (byte)(41 + 28),
                     (byte)(61 + 22),
                     (byte)(28 + 19),
                     (byte)(39 + 28),
                     (byte)(15 + 51),
                     (byte)(30 + 37),
                     (byte)(16 + 31),
                     80,
                     (byte)(31 + 44),
                     (byte)(32 + 35),
                     (byte)(16 + 67),
                     (byte)(7 + 46),
                     (byte)(58 + 22),
                     97,
                     (byte)(77 + 23),
                     (byte)(31 + 69),
                     (byte)(75 + 30),
                     (byte)(55 + 55),
                     (byte)(11 + 92)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(20 + 48), 69, (byte)(22 + 61)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_091.C("ҽӊӉҌӌӈӃӌӗӆғӑӕӎӑӗҙ\u082eࠕࠕࠖ࠘࠹ࠤࠚࠬ࠸࠴࠭ࠠ", (byte)55, 67));
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

   static {
      b();
   }

   @EventHandler(
      priority = EventPriority.LOW,
      ignoreCancelled = true
   )
   public void a(TabCompleteEvent var1) {
      CommandSender var2 = var1.getSender();
      if (var2 instanceof Player) {
         if (!var1.getCompletions().isEmpty()) {
            if (var1.getBuffer().startsWith(a(a & b, d))) {
               ArrayList var3 = new ArrayList(var1.getCompletions());
               var3.removeIf(var1x -> {
                  String[] var2x = var1x.split(a(e, f ^ g));
                  if (var2x.length == 0) {
                     return (h != 0);
                  } else {
                     String var3x = var2x[i].toLowerCase(Locale.ENGLISH);
                     return ((!var3x.startsWith(j + this.af + k) != 0) && !this.i.contains(var3x) ? m : l);
                  }
               });
               var1.setCompletions(var3);
            }
         }
      }
   }

   private static void b() {
      c = -1670079878097037141L;
      long var0 = c ^ 4108399764546634854L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(16 + 52),
               (byte)(28 + 41),
               (byte)(59 + 24),
               (byte)(2 + 45),
               (byte)(6 + 61),
               (byte)(36 + 30),
               (byte)(58 + 9),
               (byte)(32 + 15),
               (byte)(6 + 74),
               (byte)(14 + 61),
               (byte)(3 + 64),
               (byte)(38 + 45),
               (byte)(15 + 38),
               (byte)(25 + 55),
               (byte)(72 + 25),
               100,
               100,
               (byte)(66 + 39),
               (byte)(106 + 4),
               (byte)(11 + 92)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(30 + 39), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_232.B("ůųŪĺſķļƃŜŞƀŋ", (byte)66, 66);
               ZKM_STR_B[1] = NLoginCore_173.A("ũŅŊŻůŮŎŐŶſŞŋ", (byte)66, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_092.A("ĴœŴŒžżſŜŴśŁŋ", (byte)66, 65);
               ZKM_STR_B[1] = NLoginCore_387.F("խձՃձճկռՇ՟խիՆ", (byte)66, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_138.D("ҳҰӢҳӨҴӐӄӏҽӻӸҷӫӎӑӰӀҽӱӲԉӢӤӹөӚӥӼԌӼӐ", (byte)66, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_141.C("ӐӊӀӑӸӬӗӎӹӊӽӫӹӰӗӬӝԃӮӐӁӳӣӂҾӹӶӋӦӎӼӓ", (byte)66, 67);
         }
      }
   }
}
