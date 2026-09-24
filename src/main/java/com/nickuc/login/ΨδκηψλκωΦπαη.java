package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;

public class ΨδκηψλκωΦπαη extends ΛδνδπΛζψηξαρΨ {
   private static long n;
   private static int dk = Integer.reverse(805306368);
   private static int aq = Integer.reverse(268435456);
   private static int az = (163840 >>> 14 | 163840 << ~14 + 1) & -1;
   private static long bh = Long.reverse(7205759403792793600L);
   private static int de = -1 >>> 162 | -1 << ~162 + 1;
   private static int dr = Integer.reverse(0);
   private static int bu = Integer.reverse(134217728);
   private static long cf = Long.reverse(-4970274363046478221L);
   private static long ci = Long.reverse(7205759403792793600L);
   private static long di = Long.reverse(-4970274363046478221L);
   private static int af = Integer.reverse(Integer.MIN_VALUE);
   private static long p = Long.reverse(7205759403792793600L);
   private static String[] e = new String[ΨδκηψλκωΦπαη.du];
   private static int co = 0 >>> 152 | 0 << -152;
   private static long bo = Long.reverse(-4970274363046478221L);
   private static int dd = (167772160 >>> 184 | 167772160 << -184) & -1;
   private static long o = Long.reverse(-4970274363046478221L);
   private static int cy = (2304 >>> 40 | 2304 << ~40 + 1) & -1;
   private static int cs = Integer.reverse(0);
   private static String[] f = new String[ΨδκηψλκωΦπαη.dw];
   private static long am = Long.reverse(-4970274363046478221L);
   private static int ar = 1073741824 >>> 187 | 1073741824 << -187;
   private static int bc = Integer.reverse(1342177280);
   private static long ap = Long.reverse(7205759403792793600L);
   private static int cv = Integer.reverse(-1610612736);
   private static long dp = Long.reverse(7205759403792793600L);
   private static long br = Long.reverse(7205759403792793600L);
   private static int dh = Integer.reverse(-805306368);
   private static long ca = Long.reverse(-4970274363046478221L);
   private static long ck = Long.reverse(-2376200977681072525L);
   private static int cj = Integer.reverse(268435456);
   private static long ay = Long.reverse(7205759403792793600L);
   private static long dm = Long.reverse(-4970274363046478221L);
   private static int du = (13 >>> 224 | 13 << -224) & -1;
   private static int dt = Integer.reverse(0);
   private static int ce = Integer.reverse(-536870912);
   private static int z = Integer.reverse(Integer.MIN_VALUE);
   private static int bw = 3932160 >>> 18 | 3932160 << ~18 + 1;
   private static long ab = Long.reverse(-4970274363046478221L);
   private static long ax = Long.reverse(-4970274363046478221L);
   private static int cm = Integer.reverse(0);
   private static long cz = Long.reverse(-4970274363046478221L);
   private static long dj = Long.reverse(7205759403792793600L);
   private static long be = Long.reverse(-4970274363046478221L);
   private static int bx = (8388608 >>> 87 | 8388608 << ~87 + 1) & -1;
   private static int d = 0 >>> 139 | 0 << -139;
   private static int dq = 0 >>> 35 | 0 << ~35 + 1;
   private static int dw = Integer.reverse(-1342177280);
   private static int cr = 327680 >>> 144 | 327680 << ~144 + 1;
   private static int bd = Integer.reverse(536870912);
   private static int bi = (458752 >>> 79 | 458752 << -79) & -1;
   private static int ah = (0 >>> 26 | 0 << -26) & -1;
   private static int bn = 1073741825 >>> 94 | 1073741825 << -94;
   private static long cd = Long.reverse(7205759403792793600L);
   private static int bl = (33554432 >>> 185 | 33554432 << ~185 + 1) & -1;
   private static int ai = Integer.reverse(1073741824);
   private static int bz = Integer.reverse(1610612736);
   private static long ac = Long.reverse(7205759403792793600L);
   private static int aw = Integer.reverse(-1073741824);
   private static long df = Long.reverse(-2376200977681072525L);
   private static long dc = Long.reverse(7205759403792793600L);
   private static int bj = Integer.reverse(-1342177280);

   private static String a(int var0, long var1) {
      var1 ^= 38L;
      var1 ^= 5370974698977754779L;
      if (e[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(63 + 5),
                     69,
                     (byte)(60 + 23),
                     (byte)(2 + 45),
                     67,
                     (byte)(20 + 46),
                     (byte)(11 + 56),
                     (byte)(2 + 45),
                     (byte)(58 + 22),
                     (byte)(49 + 26),
                     (byte)(61 + 6),
                     (byte)(52 + 31),
                     (byte)(30 + 23),
                     (byte)(6 + 74),
                     (byte)(20 + 77),
                     (byte)(44 + 56),
                     (byte)(42 + 58),
                     (byte)(47 + 58),
                     (byte)(43 + 67),
                     (byte)(68 + 35)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(56 + 13), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(δΛψπξκσβγςα.C("՟լիԮծժեծչըԵճշհճչԻࢵࣂࣉࣇࣙ࣍࣍ࣝࢻࣖࣈ࣏", (byte)109, 67));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         e[var0] = new String(var3.doFinal(Base64.getDecoder().decode(f[var0])), StandardCharsets.UTF_8);
      }

      return e[var0];
   }

   private static void b() {
      n = -3567899464443076387L;
      long var0 = n ^ 5370974698977754779L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(15 + 53),
               (byte)(63 + 6),
               (byte)(3 + 80),
               (byte)(30 + 17),
               (byte)(57 + 10),
               (byte)(47 + 19),
               (byte)(25 + 42),
               (byte)(39 + 8),
               (byte)(21 + 59),
               (byte)(55 + 20),
               (byte)(29 + 38),
               (byte)(60 + 23),
               53,
               (byte)(23 + 57),
               (byte)(96 + 1),
               (byte)(11 + 89),
               (byte)(76 + 24),
               (byte)(79 + 26),
               (byte)(101 + 9),
               (byte)(89 + 14)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(4 + 65), 83}, StandardCharsets.UTF_8));
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
               f[0] = οΩνΩρωλΨηΛδωδ.A("įŇŨĭōŭŦũŏķŊŇ", (byte)64, 65);
               f[1] = πηγμΣΔκκ.F("բյ\u0558շԷզՅԸիպԽԲԷց՜ՃՄՁեշՒբՏՐ", (byte)64, 70);
               f[2] = πχσδΦΦνθΔπ.A("ŪĳťżĺŌļƀŞƀŪŀĽŽŧŢũŧŘŷźťŒœ", (byte)64, 65);
               f[3] = θεωψξβΛσσ.D("ӞҫӥӮҨӯӊҭӇӋӈӑӓӏӪӇӷӫӠҼӰԁӈӉ", (byte)64, 68);
               f[4] = φΨαξωυθανΣφυκη.F("խմՓԵՒժԲՄմոի՜ւյձտ՞սևճվֈՏՐ", (byte)64, 70);
               f[5] = ξψθρΣΠΣς.A("ūŚŇŋōĸźŵŰŷŲŃŀŐŏŔťşŘƁƋťŒœ", (byte)64, 65);
               f[6] = ΨφιωσρΓδΔθ.A("ĳŅńŔŸĳŕĺżķŁŇ", (byte)64, 65);
               f[7] = φδχεθοκψαλΛογλ.B("űĲŹśŊŴŬŵŎŵƃœŀŐĸŻŷƀŞƊŅƊƌŮűŞŋƇŞŋŲŔŬƈŧůŻƙƈƟƍŭŲŷƢŲšŰŷťƔųŶŷƭƚŢơƠƇƵƑŨƒ", (byte)64, 66);
               f[8] = πηγμΣΔκκ.E("Շ\u0530եՃՐբճն՝՜ԾՄ", (byte)64, 69);
               f[9] = ζοηκορΦνΣθγΩ.A("ŰńŮŌœŭŷŚŽřŕţŲľŻŜşŠŜťŋťŒœ", (byte)64, 65);
               f[10] = φΨαξωυθανΣφυκη.A("ĳŅńŔŸĳŕĺżķŁŇ", (byte)64, 65);
               f[11] = δΛψπξκσβγςα.E("ծԯն\u0558ՇձթղՋղրՐԽՍԵոմս՛ևՂև։իծ՛Ոք՛ՈկՑմՒՏ֊շՐ֑\u0557։՝֗֓ՠ՝՜֛ռ֗շՠ֝֊ջի֖խ֤֜֘իհ֣", (byte)64, 69);
               f[12] = μεςΩΔΣγν.C("ӤӪһӱӄӂӏҮӏҲӄҽ", (byte)64, 67);
               break;
            case 1:
               f[0] = ςπυηννναΣ.C("ӭӈӂӐҩҫӊӃҿӵӌҽ", (byte)64, 67);
               f[1] = ςπυηννναΣ.E("բյ\u0558շԷզՅԸիպԻլՎԾղՁտնմւգբՏՐ", (byte)64, 69);
               f[2] = πηγμΣΔκκ.D("ӠҩӛӲҰӂҲӶӔӶӠӺӵӱӆӊӖӸһҺԀӛӈӉ", (byte)64, 68);
               f[3] = ςΦζσμτΓσ.A("ŨĵůŸĲŹŔķőŕŒŔţƆľŁƆŉņžŃťŒœ", (byte)64, 65);
               f[4] = ΨΦνΨΦωυΩνβςμ.F("խմՓԵՒժԲՄմոլնյմհՏ՜յՖոյՀՙԾՉցջֆէփցտ", (byte)64, 70);
               f[5] = ΣφδσΔζιΠρα.D("ӡӐҽӁӃҮӰӫӦӭӨӫӳӸӹӫӛӭӳӍӁӋәӳҼӄӱӪҼҽӿԌ", (byte)64, 68);
               f[6] = ΨφιωσρΓδΔθ.B("ŴŪœťĮŪŞŌĻŁĹŇ", (byte)64, 66);
               f[7] = ΦδφπθΩΩλζξ.D("ӧҨӯӑӀӪӢӫӄӫӹӉҶӆҮӱӭӶӔԀһԀԂӤӧӔӁӽӔӁӨӊӢӾӝӥӱԏӾԕԃӣӨӭԘӨӗӦӭӛԊөӬӸӡӼԧӽӦԒөԇԌԅԧԜԙԁԅԅԝԌԂԠԦӽ", (byte)64, 68);
               f[8] = ξψθρΣΠΣς.B("ıŏıŖķŎŲŰŚŒŸŇ", (byte)64, 66);
               f[9] = θεωψξβΛσσ.C("ӦҺӤӂӉӣӭӐӳӏӋӏӅӷӚӧҸӷӽԂӳӛӈӉ", (byte)64, 67);
               f[10] = ντθΔζβΔζ.F("ՋՑղՆՎՌ՜շէջ՛Մ", (byte)64, 70);
               f[11] = ιΠοθΩΦξκ.D("ӧҨӯӑӀӪӢӫӄӫӹӉҶӆҮӱӭӶӔԀһԀԂӤӧӔӁӽӔӁӨӊӭӋӈԃӰӉԊӐԂӖԐԌәӖӕԔӵԐӰәԖԀӡԏԆӷӼӻԧԕԋӺ", (byte)64, 68);
               f[12] = πηγμΣΔκκ.C("ҫӪӨәҰӞӦӎүӂӪӸӵӣӹӊӋӯӵԀӕӛӈӉ", (byte)64, 67);
               break;
            case 2:
               f[0] = μζξτΩσσφυδεπλΨ.D("ӊӀӂӊӈӆӟӍұҿӪӒӲӺӗӜӐӳӭҹӱӱӈӉ", (byte)64, 68);
            case 3:
            default:
               break;
            case 4:
               f[0] = δΛψπξκσβγςα.F("թՖեՖԶՂմ՜ՐձըծՊբՕխՙՓսփօՒՏՐ", (byte)64, 70);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ΨδκηψλκωΦπαη.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(πηγμΣΔκκ.C("ҝҿӁҡӅӤӜӲӞҭӫӡӯөҲӗӹӸӰӶӰӅ", (byte)64, 67), ΨδκηψλκωΦπαη.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(ξψθρΣΠΣς.E("՟լիԮծժեծչըԵճշհճչԻࢵࣂࣉࣇࣙ࣍࣍ࣝࢻࣖࣈ࣏Փ", (byte)64, 69) + var1 + μεςΩΔΣγν.D("ү", (byte)64, 68) + var2.toString(), var4);
      }
   }

   static {
      b();
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected void a(File var1) {
      String var2 = null;
      String var3 = null;
      ΔΨμωχωΦλΦπΩυ var4 = ωςδωλλνδδ.a(var1);

      while (true) {
         boolean var12 = false /* VF: Semaphore variable */;

         label138: {
            try {
               var12 = true;
               String var5;
               if ((var5 = var4.ah()) != null) {
                  if (var5.startsWith(c<"㺀">(ai, am ^ ap)) && var5.length() > aq) {
                     var2 = var5.substring(ar);
                     continue;
                  }

                  if (var5.startsWith(c<"㺃">(aw, ax ^ ay)) && var5.length() > az) {
                     var3 = var5.substring(bc);
                     continue;
                  }

                  String var15 = var5.trim();
                  if (var15.startsWith(c<"㺆">(bd, be ^ bh)) && var15.length() > bi) {
                     var2 = var15.substring(bj, var15.length() - bl);
                     continue;
                  }

                  if (var15.startsWith(c<"㺉">(bn, bo ^ br)) && var15.length() > bu) {
                     var3 = var15.substring(bw, var15.length() - bx);
                  }
                  continue;
               }

               if (var3 == null) {
                  ψΓωτιμωκχψΛΨ.c(c<"㺌">(bz, ca ^ cd) + this.a.getName() + c<"㺏">(ce, cf ^ ci) + var1.getName() + c<"㺒">(cj, ck));
                  var12 = false;
                  break label138;
               }

               UUID var6 = null;
               if (var2 == null) {
                  String var7 = var1.getName();
                  if (var7.length() > cr) {
                     var7 = var7.substring(cs, var7.length() - cv);
                  }

                  var6 = λΣσΣκΓβΠΨ.c(var7);
                  OfflinePlayer var8 = this.m.b().<Server>c().getOfflinePlayer(var6);
                  var2 = var8.getName();
               }

               if (var2 != null) {
                  String var16;
                  try {
                     var16 = new String(Base64.getDecoder().decode(var3.getBytes()));
                  } catch (Exception var13) {
                     var16 = var3;
                  }

                  this.a(var2, var16 + c<"㺕">(cy, cz ^ dc), null, var6);
                  var12 = false;
               } else {
                  ψΓωτιμωκχψΛΨ.c(c<"㺘">(dd & de, df) + this.a.getName() + c<"㺛">(dh, di ^ dj) + var1.getName() + c<"㺞">(dk, dm ^ dp));
                  var12 = false;
               }
            } finally {
               if (var12) {
                  if (Collections.singletonList(var4).get(dt) != null) {
                     var4.close();
                  }
               }
            }

            if (Collections.singletonList(var4).get(dr) != null) {
               var4.close();
            }

            return;
         }

         if (Collections.singletonList(var4).get(co) != null) {
            var4.close();
         }

         return;
      }
   }

   public ΨδκηψλκωΦπαη(ΨγημιδξΓτοθαζ var1) {
      super(var1, ΓεοκπνΨωπτ.g, c<"㺀">(d, o ^ p) + File.separator + c<"㺃">(z, ab ^ ac), (boolean)(var1.b().a() == κιββωσγχςΣβΠΣδ.b ? af : ah));
   }
}
