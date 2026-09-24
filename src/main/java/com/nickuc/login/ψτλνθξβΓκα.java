package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.Bukkit;

public final class ψτλνθξβΓκα {
   private static int ba = Integer.reverse(-268435456);
   private static int al = Integer.reverse(1342177280);
   private static long ag = Long.reverse(-2549770258386638349L);
   private static int r = (268435456 >>> 186 | 268435456 << ~186 + 1) & -1;
   private static int y = Integer.reverse(1610612736);
   private static long c;
   private static int ar = (6 >>> 95 | 6 << -95) & -1;
   private static int ai = (536870913 >>> 253 | 536870913 << ~253 + 1) & -1;
   private static int u = 20 >>> 162 | 20 << -162;
   private static long am = Long.reverse(-2549770258386638349L);
   private static long e = Long.reverse(3170534137668829184L);
   private static long d = Long.reverse(-2549770258386638349L);
   private static long s = Long.reverse(-1108618377628079629L);
   private static long z = Long.reverse(-2549770258386638349L);
   private static long az = Long.reverse(3170534137668829184L);
   private static int au = 52 >>> 226 | 52 << ~226 + 1;
   private static int af = Integer.reverse(268435456);
   private static int ac = 256 >>> 164 | 256 << ~164 + 1;
   private static int b = 0 >>> 100 | 0 << ~100 + 1;
   private static int t = (6291456 >>> 21 | 6291456 << -21) & -1;
   private static String[] a = new String[ψτλνθξβΓκα.ab];
   private static long h = Long.reverse(-2549770258386638349L);
   private static long bc = Long.reverse(3170534137668829184L);
   private static final String aj = Bukkit.getServer().getClass().getPackage().getName();
   private static int ab = Integer.reverse(134217728);
   private static int as = -1 >>> 161 | -1 << -161;
   private static String[] b = new String[ac];
   private static long ae = Long.reverse(-1108618377628079629L);
   private static int m = Integer.reverse(Integer.MIN_VALUE);
   private static long l = Long.reverse(-1108618377628079629L);
   private static long aj = Long.reverse(-2549770258386638349L);
   private static int x = Integer.reverse(1946157056);
   private static int ax = Integer.reverse(1879048192);
   private static long v = Long.reverse(-2549770258386638349L);
   private static long ak = Long.reverse(3170534137668829184L);
   private static int ad = Integer.reverse(-536870912);
   private static long i = Long.reverse(3170534137668829184L);
   private static long p = Long.reverse(3170534137668829184L);
   private static long at = Long.reverse(-1108618377628079629L);
   private static long an = Long.reverse(3170534137668829184L);
   private static long o = Long.reverse(-2549770258386638349L);
   private static long aw = Long.reverse(3170534137668829184L);
   private static final String am;
   private static int n = Integer.reverse(-1073741824);
   private static long ah = Long.reverse(3170534137668829184L);
   private static int k = Integer.reverse(1073741824);
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static int a = (268435456 >>> 156 | 268435456 << -156) & -1;
   private static int ao = 1476395008 >>> 155 | 1476395008 << -155;
   private static int j = (0 >>> 17 | 0 << ~17 + 1) & -1;
   private static final String ak;
   private static long bb = Long.reverse(-2549770258386638349L);
   private static int q = Integer.reverse(1073741824);
   private static long ap = Long.reverse(-2549770258386638349L);
   private static long w = Long.reverse(3170534137668829184L);
   private static long aq = Long.reverse(3170534137668829184L);
   private static long aa = Long.reverse(3170534137668829184L);
   private static final Pattern c = Pattern.compile(c<"㺀">(ad, ae));
   private static long av = Long.reverse(-2549770258386638349L);
   private static int f = Integer.reverse(-1);
   private static long ay = Long.reverse(-2549770258386638349L);
   private static final String al;

   private static String a(int var0, long var1) {
      var1 ^= 52L;
      var1 ^= -4064333389350687633L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(36 + 33),
                     (byte)(25 + 58),
                     (byte)(26 + 21),
                     (byte)(51 + 16),
                     (byte)(52 + 14),
                     (byte)(5 + 62),
                     (byte)(12 + 35),
                     (byte)(27 + 53),
                     (byte)(63 + 12),
                     (byte)(14 + 53),
                     (byte)(10 + 73),
                     (byte)(2 + 51),
                     (byte)(60 + 20),
                     (byte)(12 + 85),
                     (byte)(49 + 51),
                     (byte)(65 + 35),
                     105,
                     (byte)(70 + 40),
                     (byte)(85 + 18)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(49 + 19), (byte)(15 + 54), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ξψθρΣΠΣς.E("֥֤֘էֲ֧֣֧֞֡ծְֲ֬֩֬մऎऋःआंउࣾ࣠ईऀ", (byte)121, 69));
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
      c = -3489093126098339525L;
      long var0 = c ^ -4064333389350687633L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(41 + 27),
               (byte)(29 + 40),
               83,
               (byte)(17 + 30),
               (byte)(33 + 34),
               (byte)(26 + 40),
               (byte)(35 + 32),
               (byte)(12 + 35),
               80,
               (byte)(71 + 4),
               (byte)(22 + 45),
               (byte)(24 + 59),
               (byte)(47 + 6),
               (byte)(19 + 61),
               (byte)(13 + 84),
               (byte)(59 + 41),
               (byte)(8 + 92),
               (byte)(17 + 88),
               (byte)(25 + 85),
               (byte)(91 + 12)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(44 + 24), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = πχσδΦΦνθΔπ.D("ӣҮӣҼӥҲӪӏӭӄҷҽ", (byte)64, 68);
               b[1] = βθκςνθΩθυμςτκχ.A("ĲťųōťŰœŧŭĿƀŇ", (byte)64, 65);
               b[2] = χΠξΦιζΨΣωΦσΨζ.A("ŪůůŏũŕŖıŘšŴŇ", (byte)64, 65);
               b[3] = δΛψπξκσβγςα.A("œŪŮķųŷŜŖŚŌżŇ", (byte)64, 65);
               b[4] = χΠξΦιζΨΣωΦσΨζ.A("ŐŬŇŹŹřŘűşĽŎŇ", (byte)64, 65);
               b[5] = ξψθρΣΠΣς.E("ԯՓդԴԴ՛ԳժՕնՒԲՋՙ՜\u0558քփֆՓն՚ՊպխցՊձ\u058cտճղ", (byte)64, 69);
               b[6] = βεξΠθρρςΔΦμ.B("ūŴŰĭŨŒſĹſœŰŇ", (byte)64, 66);
               b[7] = βθκςνθΩθυμςτκχ.D("өҿҧӚҭӋӀӵӢҭӕӤӒӄӬӋӫӷӽҳӎӱӈӉ", (byte)64, 68);
               b[8] = πχσδΦΦνθΔπ.E("ՃԴՖՍՂՑՇՆճԴ՟իՔՏԿտՑճ՝ՃՖա\u0558\u058cք֏եժՋջբՌ", (byte)64, 69);
               b[9] = μεςΩΔΣγν.B("œūśŭŜŪŞŝſźŔĿŶŔŎűšřņƅŢƍňŨƄŏŽŤƈųœŵ", (byte)64, 66);
               b[10] = βεξΠθρρςΔΦμ.D("ҼҭӏӆһӊӀҿӬҭӘӤӍӈҸӸӊӬӖҼӏӚӑԅӽԈӞӣӄӴӛӅ", (byte)64, 68);
               b[11] = ΣερμΔσατσκ.B("œūśŭŜŪŞŝſźœŘŠŔźĹŚţŲŵŊťŒœ", (byte)64, 66);
               b[12] = χΠξΦιζΨΣωΦσΨζ.B("ņķřŐŅŔŊŉŶķŢŮŗŒłƂŔŶŠņřŤśƏƇƒŨŭŎžťŏ", (byte)64, 66);
               b[13] = ΣφδσΔζιΠρα.A("ŭĸŭņůļŴřŷŎŁŇ", (byte)64, 65);
               b[14] = ντθΔζβΔζ.A("ūŴŰĭŨŒſĹſœŰŇ", (byte)64, 65);
               b[15] = ζοηκορΦνΣθγΩ.B("ŭĸŭņůļŴřŷŎŁŇ", (byte)64, 66);
               break;
            case 1:
               b[0] = πηγμΣΔκκ.D("ҾӗҽһӛһӞүӤҿӲҽ", (byte)64, 68);
               b[1] = ντθΔζβΔζ.C("әӗһӢӚӮӆӋӢӥӐҽ", (byte)64, 67);
               b[2] = λΣΩσμφγχ.F("ՀԮՂճյԴծԵպժսՄ", (byte)64, 70);
               b[3] = μεςΩΔΣγν.A("ŇŪũũŘĳſŒŖőŒŇ", (byte)64, 65);
               b[4] = ΣφδσΔζιΠρα.F("ձՊխՃ\u0558ծլԼՉ՞ճնտռՌկզԽքպՕՒՏՐ", (byte)64, 70);
               b[5] = φΨαξωυθανΣφυκη.F("ԯՓդԴԴ՛ԳժՕնՒԲՋՙ՜\u0558քփֆՓն\u0557ՉրՌտդՌֆդ՝֓", (byte)64, 70);
               b[6] = βεξΠθρρςΔΦμ.D("ӘӊҭӱӒӍӆӡӷӘҳҽ", (byte)64, 68);
               b[7] = ΨφιωσρΓδΔθ.A("ųŉıŤķŕŊſŬķŞĵŤŻżłőũŖƊƋťŒœ", (byte)64, 65);
               b[8] = βεξΠθρρςΔΦμ.B("ņķřŐŅŔŊŉŶķŢŮŗŒłƂŔŶŠņřŠƌŞŌƄūƏƈŴƎōűƕŲŨűŷƇƒųżƜŧ", (byte)64, 66);
               b[9] = βθκςνθΩθυμςτκχ.F("Րը\u0558ժՙէ՛՚ռշՑԼճՑՋծ՞ՖՃւ՟ֈ\u0557ֈսժ՜խ֏֊Սբ", (byte)64, 70);
               b[10] = μεςΩΔΣγν.C("ҼҭӏӆһӊӀҿӬҭӘӤӍӈҸӸӊӬӖҼӏӏӣԀӞӒӑӈӦӺӵӶӈӫԀԒӞӯӨԅԁӬԖӝ", (byte)64, 67);
               b[11] = ςΦζσμτΓσ.B("œūśŭŜŪŞŝſźŕŐōśĽřņĻƊŬžŻŒœ", (byte)64, 66);
               b[12] = ςΦζσμτΓσ.C("ҼҭӏӆһӊӀҿӬҭӘӤӍӈҸӸӊӬӖҼӏӚӺӐӱӨӘӠӜӥӼԌӜԎԋӊԍԐӑӶӏӱԊӝ", (byte)64, 67);
               b[13] = οΩνΩρωλΨηΛδωδ.E("ՂգնՁՕղԶԴխՈԶՄ", (byte)64, 69);
               b[14] = ΣερμΔσατσκ.E("ԵհՕԴբնՋՍ՚՚ԾՄ", (byte)64, 69);
               b[15] = ΣδτΠνεγοΓορητ.E("մՊեՈՎԵՆպԸոչՄ", (byte)64, 69);
               break;
            case 2:
               b[0] = ιΠοθΩΦξκ.F("եԲԮբ\u0557նՒշՒՔԶաչփՌւհՖՅ\u0558ւֈՏՐ", (byte)64, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = ΣφδσΔζιΠρα.F("կՇձ\u0558ՐըԱԸլզՓՄ", (byte)64, 70);
         }
      }
   }

   @Generated
   private ψτλνθξβΓκα() {
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ψτλνθξβΓκα.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(οΩνΩρωλΨηΛδωδ.E("ӥԇԉөԍԬԤԺԦӵԳԩԷԱӺԟՁՀԸԾԸԍ", (byte)1, 69), ψτλνθξβΓκα.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(ςπυηννναΣ.A("äñð³óïêóþíºøüõøþÀњїяђюѕъЬєьÖ", (byte)1, 65) + var1 + μεςΩΔΣγν.F("ӷ", (byte)1, 70) + var2.toString(), var4);
      }
   }

   static {
      b();
      ak = aj.replace(c<"㺃">(af, ag ^ ah), c<"㺆">(ai, aj ^ ak));
      al = aj.replace(c<"㺉">(al, am ^ an), c<"㺌">(ao, ap ^ aq));
      am = aj.replace(c<"㺏">(ar & as, at), c<"㺒">(au, av ^ aw)).replace(c<"㺕">(ax, ψτλνθξβΓκα.ay ^ az), c<"㺘">(ba, ψτλνθξβΓκα.bb ^ bc));
   }

   public static String i(String var0) {
      StringBuffer var1 = new StringBuffer();
      Matcher var2 = c.matcher(var0);

      while (var2.find()) {
         String var3 = var2.group(a);
         String var4 = c<"㺀">(b, d ^ e);
         int var6 = f;
         switch (var3.hashCode()) {
            case 3519:
               if (var3.equals(c<"㺆">(k, l))) {
                  var6 = m;
               }
               break;
            case 109204:
               if (var3.equals(c<"㺃">(g, h ^ i))) {
                  var6 = j;
               }
               break;
            case 109808:
               if (var3.equals(c<"㺉">(n, o ^ p))) {
                  var6 = q;
               }
               break;
            case 351608024:
               if (var3.equals(c<"㺌">(r, s))) {
                  var6 = t;
               }
         }

         switch (var6) {
            case 0:
               var4 = ak;
               break;
            case 1:
               var4 = al;
               break;
            case 2:
               var4 = aj;
               break;
            case 3:
               var4 = am;
               break;
            default:
               throw new IllegalArgumentException(c<"㺏">(u, v ^ w) + var3);
         }

         if (!var4.isEmpty() && var2.end() < var0.length() && var0.charAt(var2.end()) != x) {
            var4 = var4 + c<"㺒">(y, z ^ aa);
         }

         var2.appendReplacement(var1, Matcher.quoteReplacement(var4));
      }

      var2.appendTail(var1);
      return var1.toString();
   }
}
