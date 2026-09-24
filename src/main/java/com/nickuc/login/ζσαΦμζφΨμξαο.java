package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Locale;
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

public class ζσαΦμζφΨμξαο implements ΦοιυξχςΩΦψξΓΣΨ {
   private static int h = -1 >>> 156 | -1 << ~156 + 1;
   private static long r = Long.reverse(-2017612633061982208L);
   private static int k = (0 >>> 50 | 0 << ~50 + 1) & -1;
   private static int g = Integer.reverse(1073741824);
   private static int y = Integer.reverse(0);
   private static String[] b = new String[ζσαΦμζφΨμξαο.aa];
   private static long c;
   private static int aa = Integer.reverse(-1610612736);
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private final ΨγημιδξΓτοθαζ h;
   private static String[] a = new String[ζσαΦμζφΨμξαο.z];
   private static int a = (0 >>> 12 | 0 << ~12 + 1) & -1;
   private static int e = 128 >>> 39 | 128 << -39;
   private static long i = Long.reverse(2617403105314836889L);
   private static int s = (0 >>> 222 | 0 << -222) & -1;
   private static int n = (788529152 >>> 216 | 788529152 << ~216 + 1) & -1;
   private static int w = (0 >>> 44 | 0 << ~44 + 1) & -1;
   private static long b = Long.reverse(-4588356298477956711L);
   private static long u = Long.reverse(2617403105314836889L);
   private static long f = Long.reverse(2617403105314836889L);
   private static int t = Integer.reverse(536870912);
   private static long q = Long.reverse(-4588356298477956711L);
   private static int x = Integer.reverse(Integer.MIN_VALUE);
   private static int p = Integer.reverse(-1073741824);
   private static int l = Integer.reverse(0);
   private static int v = Integer.reverse(Integer.MIN_VALUE);
   private static int m = 0 >>> 164 | 0 << ~164 + 1;
   private static int z = (320 >>> 70 | 320 << -70) & -1;
   private static long d = Long.reverse(-2017612633061982208L);
   private static int o = (0 >>> 37 | 0 << -37) & -1;

   private static void b() {
      c = -7383138746318239229L;
      long var0 = c ^ 7885948589909409199L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(41 + 27),
               (byte)(22 + 47),
               (byte)(24 + 59),
               (byte)(6 + 41),
               (byte)(58 + 9),
               (byte)(30 + 36),
               67,
               (byte)(15 + 32),
               (byte)(17 + 63),
               (byte)(62 + 13),
               (byte)(60 + 7),
               (byte)(12 + 71),
               (byte)(39 + 14),
               (byte)(10 + 70),
               (byte)(96 + 1),
               (byte)(80 + 20),
               (byte)(51 + 49),
               (byte)(54 + 51),
               110,
               (byte)(66 + 37)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(8 + 75)}, StandardCharsets.UTF_8));
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
               b[0] = ΨφιωσρΓδΔθ.D("юцРѐрсігњЖњС", (byte)12, 68);
               b[1] = ΨφιωσρΓδΔθ.D("МоРЯЪЕбЧИХЕЙѕкяьјѓџёнжйџѥЦэѡфѭѢѩ", (byte)12, 68);
               b[2] = πψυκΠΨμΛΩβΣφμφσ.C("ЌЧФПюЧщдєшябэеМбПѠйѕфЯЬЭ", (byte)12, 67);
               b[3] = ΣφδσΔζιΠρα.D("ХФШЧѕщщуеШЛС", (byte)12, 68);
               b[4] = ζοηκορΦνΣθγΩ.C("ФтшТОХЩххУаС", (byte)12, 67);
               break;
            case 1:
               b[0] = βεξΠθρρςΔΦμ.A("êÚâÐæāáëÒãĈß", (byte)12, 65);
               b[1] = βθκςνθΩθυμςτκχ.C("МоРЯЪЕбЧИХЕЙѕкяьјѓџёнлеўѨзФйЮяѝн", (byte)12, 67);
               b[2] = μεςΩΔΣγν.D("ЌЧФПюЧщдєшюЦЖњЮёэвўцХузмптьЩўзТѣ", (byte)12, 68);
               b[3] = φΨαξωυθανΣφυκη.F("ԍԵԞԱԲԄԲԝԉԺԽԐ", (byte)12, 70);
               b[4] = ςΦζσμτΓσ.D("вЋвозбсежЗЬЯЯбјЩкѝямгѥЬЭ", (byte)12, 68);
               break;
            case 2:
               b[0] = χφπρψπφΦθμπ.C("уђмѕѐФЩЬЯјЯЕбМшМТєРѠгѥЬЭ", (byte)12, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = βεξΠθρρςΔΦμ.F("ԟӾӼԗԹԡԧԔԘԃԴԊՇՌԎՊԾԝՇԒԴԞԛԜ", (byte)12, 70);
         }
      }
   }

   @EventHandler(
      priority = EventPriority.LOW,
      ignoreCancelled = true
   )
   public void a(TabCompleteEvent var1) {
      CommandSender var2 = var1.getSender();
      if (var2 instanceof Player) {
         if (!var1.getCompletions().isEmpty()) {
            if (var1.getBuffer().startsWith(c<"㺀">(a, b ^ d))) {
               ΨαχΨχΣλεΠψΦ var3 = this.h.b().a(var2);
               int var4 = !var3.i(c<"㺃">(e, f)) && !var3.i(c<"㺆">(g & h, i)) ? k : j;
               ArrayList var5 = new ArrayList(var1.getCompletions());
               var5.removeIf(var3x -> {
                  if (var3x.trim().isEmpty()) {
                     return (boolean)l;
                  } else if (var3x.charAt(m) != n) {
                     return (boolean)o;
                  } else {
                     String[] var4x = var3x.split(c<"㺀">(p, q ^ r));
                     String var5x = var4x[s].toLowerCase(Locale.ENGLISH);
                     if (!var4 && var5x.equals(c<"㺃">(t, u))) {
                        return (boolean)v;
                     } else if (this.h.a().b(var3)) {
                        return (boolean)w;
                     } else {
                        θιοτχπσΦΩ var6 = this.h.a();
                        return (boolean)(var6 != null && !var6.b(var5x) ? y : x);
                     }
                  }
               });
               var1.setCompletions(var5);
            }
         }
      }
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 39L;
      var1 ^= 7885948589909409199L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(63 + 5),
                     (byte)(24 + 45),
                     (byte)(62 + 21),
                     (byte)(16 + 31),
                     (byte)(49 + 18),
                     66,
                     (byte)(11 + 56),
                     (byte)(26 + 21),
                     (byte)(64 + 16),
                     (byte)(36 + 39),
                     (byte)(5 + 62),
                     (byte)(22 + 61),
                     (byte)(13 + 40),
                     (byte)(43 + 37),
                     (byte)(26 + 71),
                     (byte)(25 + 75),
                     (byte)(91 + 9),
                     105,
                     (byte)(21 + 89),
                     (byte)(10 + 93)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(32 + 37), (byte)(67 + 16)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(χΠξΦιζΨΣωΦσΨζ.C("ԈԕԔӗԗԓԎԗԢԑӞԜԠԙԜԢӤ\u086cࡺࡩ\u085fࡶࡱࢂࡥࡺࡽࡱࢀ", (byte)80, 67));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ζσαΦμζφΨμξαο.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(λΣΩσμφγχ.E("ԋԭԯԏԳՒՊՠՌԛՙՏ՝\u0557ԠՅէզ՞դ՞Գ", (byte)39, 69), ζσαΦμζφΨμξαο.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(ΣφδσΔζιΠρα.B("İĽļÿĿĻĶĿŊĹĆńňŁńŊČҔҢґ҇ҞҙҪҍҢҥҙҨĤ", (byte)39, 66) + var1 + μεςΩΔΣγν.E("ԝ", (byte)39, 69) + var2.toString(), var4);
      }
   }

   @Generated
   public ζσαΦμζφΨμξαο(ΨγημιδξΓτοθαζ var1) {
      this.h = var1;
   }
}
