package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerLoginEvent.Result;

public class ρζΨνψξφφεΨδσψ implements ΦοιυξχςΩΦψξΓΣΨ {
   private static int k = Integer.reverse(-1610612736);
   private static int ae = 1207959552 >>> 59 | 1207959552 << -59;
   public static final boolean p = (boolean)(ΓΔπλδγιΦζΓΛδν.a().a(ΓΔπλδγιΦζΓΛδν.b)
         && ψΨπηηυυδΔη.a(c<"㺀">(ρζΨνψξφφεΨδσψ.af, ρζΨνψξφφεΨδσψ.ag ^ ρζΨνψξφφεΨδσψ.ah))
      ? ρζΨνψξφφεΨδσψ.aj
      : ρζΨνψξφφεΨδσψ.ak);
   private static int e = 65536 >>> 176 | 65536 << -176;
   private static long r = Long.reverse(2594073385365405696L);
   private static long g = Long.reverse(-1351920628229466592L);
   private static int ak = 0 >>> 32 | 0 << ~32 + 1;
   private static long v = Long.reverse(2594073385365405696L);
   private static int af = 1048576 >>> 177 | 1048576 << ~177 + 1;
   private static int ai = 0 >>> 116 | 0 << -116;
   private static long c;
   private static long ah = Long.reverse(2594073385365405696L);
   private static int x = '쀀' >>> 'm' | 49152 << ~109 + 1;
   private final boolean q;
   private static long u = Long.reverse(-3945994013594872288L);
   private static long ag = Long.reverse(-3945994013594872288L);
   private static int b = Integer.reverse(0);
   private static int ab = Integer.reverse(-1);
   private static String[] a = new String[ρζΨνψξφφεΨδσψ.ad];
   private static int j = Integer.reverse(0);
   private static long q = Long.reverse(-3945994013594872288L);
   private static int w = Integer.reverse(-1073741824);
   private static int a = Integer.reverse(0);
   private static long i = Long.reverse(-1351920628229466592L);
   private static int h = Integer.reverse(1073741824);
   private static int aj = 65536 >>> 208 | 65536 << -208;
   private static int l = Integer.reverse(0);
   private static long n = Long.reverse(-1351920628229466592L);
   private static int o = Integer.reverse(Integer.MIN_VALUE);
   private static int z = Integer.reverse(536870912);
   private static long y = Long.reverse(-1351920628229466592L);
   private static int t = 1073741825 >>> 222 | 1073741825 << ~222 + 1;
   private static int p = Integer.reverse(536870912);
   private static int ad = 37748736 >>> 214 | 37748736 << -214;
   private static int aa = Integer.reverse(-536870912);
   private static int m = 3072 >>> 106 | 3072 << -106;
   private final αοΛσφψΦε g;
   private static String[] b = new String[ae];
   private static int s = Integer.reverse(1073741824);
   private static int f = -1 >>> 201 | -1 << -201;
   private static long d = Long.reverse(-1351920628229466592L);
   private final nLoginBukkit i;
   private static long ac = Long.reverse(-1351920628229466592L);
   private static int c = -1 >>> 78 | -1 << ~78 + 1;

   @EventHandler(
      priority = EventPriority.HIGHEST
   )
   public void b(PlayerLoginEvent var1) {
      if (var1.getResult() == Result.ALLOWED) {
         Player var2 = var1.getPlayer();
         if (!this.g.c(var2)) {
            InetAddress var3;
            try {
               var3 = var1.getRealAddress();
            } catch (NoSuchMethodError var6) {
               var3 = null;
            }

            com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ var4 = com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ.a(var2.getName(), var1.getAddress(), var3);
            if (var4 == null) {
               String var7 = c<"㺀">(b & c, d) + var2.getName() + c<"㺃">(e & f, g) + var1.getClass().getSimpleName() + c<"㺆">(h, i);
               ψΓωτιμωκχψΛΨ.c(var7);
               Result var10001 = Result.KICK_OTHER;
               String[] var10002 = new String[k];
               var10002[l] = c<"㺉">(m, n);
               var10002[o] = c<"㺌">(p, q ^ r);
               var10002[s] = c<"㺏">(t, u ^ v) + var7;
               var10002[w] = c<"㺒">(x, y);
               var10002[z] = c<"㺕">(aa & ab, ac);
               var1.disallow(var10001, βιχγΓλχΠσπ.a(var10002));
            } else {
               String var5 = this.g.a(this.i.a().b().a(var2), var4);
               if (var5 != null) {
                  var1.disallow(Result.KICK_OTHER, var5);
               }
            }
         }
      }
   }

   @Generated
   public ρζΨνψξφφεΨδσψ(nLoginBukkit var1, αοΛσφψΦε var2, boolean var3) {
      this.i = var1;
      this.g = var2;
      this.q = var3;
   }

   private static void b() {
      c = 317569399131258003L;
      long var0 = c ^ 4581459046270074571L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(37 + 31),
               (byte)(4 + 65),
               (byte)(28 + 55),
               (byte)(7 + 40),
               (byte)(58 + 9),
               (byte)(32 + 34),
               (byte)(29 + 38),
               47,
               (byte)(76 + 4),
               (byte)(12 + 63),
               (byte)(4 + 63),
               (byte)(13 + 70),
               (byte)(43 + 10),
               (byte)(29 + 51),
               (byte)(18 + 79),
               (byte)(79 + 21),
               (byte)(76 + 24),
               (byte)(34 + 71),
               110,
               (byte)(97 + 6)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(48 + 20), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = μζξτΩσσφυδεπλΨ.F("֎ղւ֎֧փַֹ֎֜֝֞ո\u0590ְֱֺּ֥֧֤֜֗֓֡ֆ֨֊ְֿ׆׆֧׆֬\u05ce\u05cbֲבֲׇ֪ׄ֨זְנמטֱע֮חףטנִ־כ׃\u05ed׀ּֽ", (byte)126, 70);
               b[1] = ιΠοθΩΦξκ.E("ֱֲ֖֧֟֒ի֎ֵ֬։ւ", (byte)126, 69);
               b[2] = βεξΠθρρςΔΦμ.E("ս֡փְ֭֡կַ֙։֒\u058bֻ֝֡֓րրִ־ָ֗ք֗׃֪փ\u05cf֙ֈևְ֥\u05cc\u058bִהבךֲכֹ֤\u05c9ֱֹ֪֯\u05cfיׁ֠דצ֭֮", (byte)126, 69);
               b[3] = χφπρψπφΦθμπ.C("֠֒ջ֡ի֣֮֬֙սհ֍ղֱ֪թְֶ֎ֶ֑֫ւփ", (byte)126, 67);
               b[4] = οοθδΨιοΦΠβδζ.B("ǔǐǷǖǈǗǍǭƴƯǎǃ", (byte)126, 66);
               b[5] = πχσδΦΦνθΔπ.C("րր֪֟էև֣կ\u058cէվշ", (byte)126, 67);
               b[6] = ντθΔζβΔζ.B("ǔǐǷǖǈǗǍǭƴƯǎǃ", (byte)126, 66);
               b[7] = οΩνΩρωλΨηΛδωδ.C("֞֠մէյ֠ւ֬ոֆ\u058bֳ֮տ֒֯ղ֨քմֳִջְֶֶֺ֑֚֘֗֬րֺֺ֖֧֚֬ׄև\u05cd֣׆֑֦֡הַָ֥\u05cbְ֥֢֣", (byte)126, 67);
               b[8] = ςπυηννναΣ.A("ǧǆƿǯǩǲǤǙǛǏǼǛǪǉȃǛǍǜǵǅȁȇǢǃȍƿȏǏǤȇǒǿǑǥǱȔǲȈǘǸǽȇȍǬȌȟȑǞǻǡȕȤǻǺȩǻǹȭȘȮǿǭȤȪȡǲȯȀǯȈȢȭȷȰȒȷȒǽȕȓȽȽǽɅɃȡȎȏ", (byte)126, 65);
               break;
            case 1:
               b[0] = ΣφδσΔζιΠρα.B("ǏƳǃǏǨǄǸǺǏǝǞǟƹǑǽǱǲǦǝǘǔǢǻǨǥǇǩǋȀǱȇȇǨȇǭȏȌǳȒȅǫȈǩǳȗǱȡȟșǲȣǯȘȥȉȄǤǧȢȄȇȠǲȓ", (byte)126, 66);
               b[1] = ΣφδσΔζιΠρα.C("ֆճ֞ջ֡ջտ֥֏ջպշ", (byte)126, 67);
               b[2] = ΦδφπθΩΩλζξ.A("ƾǢǄǢǱǮưǸǚǊǓǌǼǞǢǔǁǁǵǿǹǘǅǘȄǫǄȐǚǉǈǱǦȍǌǵȕȒțǳȜǥǺȎǰȉǫȒǲǥȓǿȘȡǺǸǤȇǠȈǰȎȈȎ", (byte)126, 65);
               b[3] = πψυκΠΨμΛΩβΣφμφσ.E("֫֝ֆ֬նַֹ֤֮ֈջ\u0590ֻּ֢֕֓֒֞֏֏\u0590֍֎", (byte)126, 69);
               b[4] = χφπρψπφΦθμπ.F("ֱևտֲ֎շ\u058c֓֨֙ռւ", (byte)126, 70);
               b[5] = ΨΦνΨΦωυΩνβςμ.B("ǒǰǈƶǅǱǗǔǏƷǨǃ", (byte)126, 66);
               b[6] = μζξτΩσσφυδεπλΨ.D("֞ֆ֭֩֜զթְ\u0590֤֙շ", (byte)126, 68);
               b[7] = βεξΠθρρςΔΦμ.A("ǪǬǀƳǁǬǎǸǄǒǗǿǺǋǞǻƾǴǐǀǿȀǇǤǼǣȂǦǸȆǝȂǌȆǦǢǸȆǳȐǓșǰǿǱǬȌȀǴȥǠǞȥȁǮǯ", (byte)126, 65);
               b[8] = ΠΛΨοδΩσμνΛγΦφβς.A("ǧǆƿǯǩǲǤǙǛǏǼǛǪǉȃǛǍǜǵǅȁȇǢǃȍƿȏǏǤȇǒǿǑǥǱȔǲȈǘǸǽȇȍǬȌȟȑǞǻǡȕȤǻǺȩǻǹȭȘȮǿǭȤȪȡǲȯȀǯȈȢȭȷȰȔȏȳȫɀȫȘȿǽȣȜɇȎȏ", (byte)126, 65);
               break;
            case 2:
               b[0] = ςΦζσμτΓσ.B("ǕǮǰƩǙǖǭƭǬǔƽǨƾǫǸƺǣȅǚƽǔǡǎǏ", (byte)126, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = ξψθρΣΠΣς.A("ƲǈƳǩǮǺǶǫǮƼǱǭǨǻǐǘǝȂǯǇƿǑǎǏ", (byte)126, 65);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ρζΨνψξφφεΨδσψ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(χφπρψπφΦθμπ.B("ƟǁǃƣǇǦǞǴǠƯǭǣǱǫƴǙǻǺǲǸǲǇ", (byte)124, 66), ρζΨνψξφφεΨδσψ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ιΠοθΩΦξκ.C("\u058c֙֘՛֛֛֦֗֒֕բ֤֦֠֝֠ըࣱࣺࣻࣤआࣽआइࣷ࣫ࣸईऎց", (byte)124, 67) + var1 + μεςΩΔΣγν.D("գ", (byte)124, 68) + var2.toString(), var4
         );
      }
   }

   @EventHandler(
      priority = EventPriority.LOW
   )
   public void a(PlayerLoginEvent var1) {
      if (!this.q) {
         if (var1.getResult() == Result.ALLOWED) {
            Player var2 = var1.getPlayer();
            if (!this.g.c(var2)) {
               Player var3 = Bukkit.getServer().getPlayerExact(var2.getName());
               if (var3 == null) {
                  var3 = Bukkit.getServer().getPlayer(var2.getUniqueId());
               }

               if (var3 != null && var3.isOnline()) {
                  String var4 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.Y);
                  var1.disallow(Result.KICK_OTHER, var4);
               }
            }
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 36L;
      var1 ^= 4581459046270074571L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(34 + 34),
                     (byte)(48 + 21),
                     (byte)(68 + 15),
                     47,
                     (byte)(33 + 34),
                     (byte)(7 + 59),
                     67,
                     (byte)(43 + 4),
                     (byte)(40 + 40),
                     (byte)(42 + 33),
                     (byte)(23 + 44),
                     (byte)(70 + 13),
                     (byte)(20 + 33),
                     (byte)(39 + 41),
                     (byte)(58 + 39),
                     (byte)(96 + 4),
                     (byte)(59 + 41),
                     (byte)(78 + 27),
                     (byte)(16 + 94),
                     (byte)(26 + 77)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(15 + 68)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ξψθρΣΠΣς.C("ҊҗҖљҙҕҐҙҤғѠҞҢқҞҤѦ߹߯ߢ߸ࠄ\u07fbࠄࠅߵߩ߶ࠆࠌ", (byte)38, 67));
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

   static {
      b();
   }
}
