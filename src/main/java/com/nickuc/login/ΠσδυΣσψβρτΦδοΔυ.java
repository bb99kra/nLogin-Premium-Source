package com.nickuc.login;

import com.nickuc.login.lib.json.JSONObject;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ΠσδυΣσψβρτΦδοΔυ {
   private static int w = (524288 >>> 83 | 524288 << ~83 + 1) & -1;
   private static long ae = Long.reverse(4973893320866498114L);
   private static int ad = Integer.reverse(1342177280);
   private static long e = Long.reverse(3244511063956227650L);
   private static long aa = Long.reverse(7493989779944505344L);
   private static int aj = (3407872 >>> 210 | 3407872 << ~210 + 1) & -1;
   private static String[] b = new String[ΠσδυΣσψβρτΦδοΔυ.ak];
   private static int p = 1536 >>> 104 | 1536 << ~104 + 1;
   private static int k = Integer.reverse(536870912);
   public static final int u = ΠσδυΣσψβρτΦδοΔυ.ap;
   private static int a = (0 >>> 11 | 0 << ~11 + 1) & -1;
   private static int s = Integer.reverse(-536870912);
   private static long g = Long.reverse(3244511063956227650L);
   private static int ah = Integer.reverse(-1);
   private static long am = Long.reverse(4973893320866498114L);
   private static long ac = Long.reverse(3244511063956227650L);
   private static int ab = Integer.reverse(-1879048192);
   private static long c;
   private static long u = Long.reverse(7493989779944505344L);
   private static long t = Long.reverse(4973893320866498114L);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static long b = Long.reverse(3244511063956227650L);
   private static long q = Long.reverse(4973893320866498114L);
   public static final String Y = c<"㺀">(ΠσδυΣσψβρτΦδοΔυ.al, am ^ ΠσδυΣσψβρτΦδοΔυ.an);
   private static long o = Long.reverse(3244511063956227650L);
   private static int y = Integer.reverse(268435456);
   private static int ak = (218103808 >>> 24 | 218103808 << -24) & -1;
   private static int h = 3145728 >>> 20 | 3145728 << -20;
   private static int i = -1 >>> 185 | -1 << -185;
   private static int ao = Integer.reverse(Integer.MIN_VALUE);
   private static int n = (83886080 >>> 152 | 83886080 << ~152 + 1) & -1;
   private static int ap = Integer.reverse(0);
   private final ΓυετνΛζΠιΓζΣ a;
   private static int f = 262144 >>> 209 | 262144 << -209;
   private static long an = Long.reverse(7493989779944505344L);
   private static int al = (3072 >>> 232 | 3072 << -232) & -1;
   private static long z = Long.reverse(4973893320866498114L);
   private static int x = Integer.reverse(0);
   private static String[] a = new String[aj];
   private static long af = Long.reverse(7493989779944505344L);
   private static long r = Long.reverse(7493989779944505344L);
   private static long l = Long.reverse(4973893320866498114L);
   public static final int v = ao;
   private static long j = Long.reverse(3244511063956227650L);
   private static long m = Long.reverse(7493989779944505344L);
   private static int d = (-1 >>> 242 | -1 << -242) & -1;
   private static long ai = Long.reverse(3244511063956227650L);
   private static int ag = (22 >>> 33 | 22 << -33) & -1;

   public void a(int var1, Consumer<JSONObject> var2) {
      JSONObject var3 = new JSONObject();
      var3.put(c<"㺀">(ab, ac), var1);
      JSONObject var4 = new JSONObject();
      var2.accept(var4);
      var3.put(c<"㺃">(ad, ae ^ af), var4);
      this.a.l(c<"㺆">(ag & ah, ai), var3.toString());
   }

   private static String a(int var0, long var1) {
      var1 ^= 22L;
      var1 ^= 3195721435489393888L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(34 + 35),
                     (byte)(35 + 48),
                     (byte)(39 + 8),
                     (byte)(54 + 13),
                     66,
                     (byte)(8 + 59),
                     (byte)(13 + 34),
                     (byte)(78 + 2),
                     (byte)(59 + 16),
                     (byte)(40 + 27),
                     (byte)(75 + 8),
                     (byte)(36 + 17),
                     (byte)(16 + 64),
                     (byte)(19 + 78),
                     (byte)(11 + 89),
                     (byte)(8 + 92),
                     (byte)(51 + 54),
                     (byte)(76 + 34),
                     (byte)(42 + 61)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(2 + 67), (byte)(10 + 73)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(οΩνΩρωλΨηΛδωδ.D("շքփՆֆւսֆ֑րՍ\u058b֏ֈ\u058b֑Փࣅࣰࣲࣩ࣭࣭࣮ࣛ࣌ࣳࣞࣕࣤࣆࣸ", (byte)117, 68));
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
                  ΠσδυΣσψβρτΦδοΔυ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΣδτΠνεγοΓορητ.A("ŁţťŅũƈƀƖƂőƏƅƓƍŖŻƝƜƔƚƔũ", (byte)77, 65), ΠσδυΣσψβρτΦδοΔυ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            δΛψπξκσβγςα.C("ӿԌԋӎԎԊԅԎԙԈӕԓԗԐԓԙӛࡍࡱࡣࡵࡔࡵࡻࡦࡶࡺ\u085d\u086cࡸࡎࢀӶ", (byte)77, 67) + var1 + ξψθρΣΠΣς.B("œ", (byte)77, 66) + var2.toString(), var4
         );
      }
   }

   @Nullable
   public static ΠσδυΣσψβρτΦδοΔυ a(ΨγημιδξΓτοθαζ var0) {
      τφθχΔαΣγτφς var1 = var0.a();
      if (!var1.d(c<"㺀">(a, b)) && !var1.d(c<"㺃">(c & d, e))) {
         return null;
      } else {
         Object var2 = var1.d(c<"㺆">(f, g));
         if (var2 == null) {
            return null;
         } else {
            List var3;
            if (var2 instanceof String) {
               var3 = Collections.singletonList(var2.toString());
            } else {
               if (!(var2 instanceof List)) {
                  throw new IllegalArgumentException(c<"㺉">(h & i, j) + var2);
               }

               List var4 = (List)var2;
               var3 = var4.stream().map(Object::toString).collect(Collectors.toList());
            }

            if (var3.isEmpty()) {
               throw new IllegalArgumentException(c<"㺌">(k, l ^ m));
            } else {
               String var8 = var1.b(c<"㺏">(n, o));
               String var5 = var1.b(c<"㺒">(p, q ^ r));
               boolean var6 = var1.d(c<"㺕">(s, t ^ u));
               if (var8 != null && var8.isEmpty()) {
                  var8 = null;
               }

               if (var5 != null && var5.isEmpty()) {
                  var5 = null;
               }

               ΓυετνΛζΠιΓζΣ var7 = var3.size() > w ? ΓυετνΛζΠιΓζΣ.a(var0, var3, var8, var5, var6) : ΓυετνΛζΠιΓζΣ.a(var0, (String)var3.get(x), var8, var5, var6);
               return new ΠσδυΣσψβρτΦδοΔυ(var0, var7);
            }
         }
      }
   }

   public void c() {
      this.a.close();
   }

   static {
      b();
   }

   private static void b() {
      c = 4783376111911002274L;
      long var0 = c ^ 3195721435489393888L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(55 + 13),
               (byte)(41 + 28),
               (byte)(43 + 40),
               (byte)(4 + 43),
               (byte)(11 + 56),
               (byte)(21 + 45),
               (byte)(25 + 42),
               (byte)(44 + 3),
               (byte)(17 + 63),
               (byte)(34 + 41),
               (byte)(25 + 42),
               (byte)(8 + 75),
               (byte)(17 + 36),
               (byte)(11 + 69),
               97,
               (byte)(45 + 55),
               (byte)(68 + 32),
               (byte)(56 + 49),
               110,
               (byte)(36 + 67)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(31 + 37), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = ςΦζσμτΓσ.E("կձְֱ֤֨մ֤֙֝նְֺֽ֪֕ջׂ֔׆֥֠֍֎", (byte)126, 69);
               b[1] = οοθδΨιοΦΠβδζ.B("ưƲǱǲǩǥƵǚǥǞƶǙǹǵƿǳǵǠǄȃȆǑǎǏ", (byte)126, 66);
               b[2] = μζξτΩσσφυδεπλΨ.D("գ֙շքդ֪֫֎֪֯ծ֫֩վհֱւ֩չֵֻ֘ւփ", (byte)126, 68);
               b[3] = ςπυηννναΣ.F("֑ֆ֕֫ծ֮։֥պֆ֏ո֓֍ովյ׃ַքּ֞քֻևׂ֍քց֡\u05c8\u05cd֤֍֩\u05cbגׅ֣זֱֱ֢֘", (byte)126, 70);
               b[4] = ζβησεθωυγτ.D("֢֒զդ֝֗ււծխպ֢֮֠քխ֥֍ֽ֥֔֍ս֩ղպւֲ֘֟րֆׇ֦֡֨֔\u05cc֘\u058b֍֜\u05c8֗", (byte)126, 68);
               b[5] = βεξΠθρρςΔΦμ.E("֔\u058b։ֵ֪֠ք֖֧֛֪֛֭֘֘վֻպִׂ֠֠֍֎", (byte)126, 69);
               b[6] = ξψθρΣΠΣς.F("ղվ֧֕նյ֏\u0590ֈֹ֦֗֏ַ֗׀\u0590ւռֵ֡\u0590֍֎", (byte)126, 70);
               b[7] = φΨαξωυθανΣφυκη.A("ǋǎǕǋǱǐǭǈǓǲƻǴǞǶǗǀǽǡǚǦǟǑǎǏ", (byte)126, 65);
               b[8] = μζξτΩσσφυδεπλΨ.D("֢աա֬֙ևլցվև֡֬լ֖խ\u0590ִֵָ֛֭֫ւփ", (byte)126, 68);
               b[9] = ΣερμΔσατσκ.F("ֳ֦֒֫ւ֍֩֨֗օֻւ", (byte)126, 70);
               b[10] = δΛψπξκσβγςα.D("֙ցյ֫չռըչ֚ժ֜շ", (byte)126, 68);
               b[11] = ΨΦνΨΦωυΩνβςμ.E("֭լլַ֤֒շ\u058c։ַ֒֬շ֡ո֛׃ָֿ֦׀ֶ֍֎", (byte)126, 69);
               b[12] = οοθδΨιοΦΠβδζ.B("ǮƭƭǸǥǓƸǍǊǓǭǸƸǢƹǜȄǹȀǧȁǷǎǏ", (byte)126, 66);
               break;
            case 1:
               b[0] = ζβησεθωυγτ.B("ưƲǱǲǩǥƵǚǥǞƸƺǝƳǂǲǯǎǖǱǱǡǎǏ", (byte)126, 66);
               b[1] = λΣΩσμφγχ.A("ưƲǱǲǩǥƵǚǥǞƵǙƻǲƼǵǺǍǚǶǲƿǫǷǻȂǚǎǝǱǱǯ", (byte)126, 65);
               b[2] = μεςΩΔΣγν.B("ƯǥǃǐưǶǷǚǻǶƼǗǯǭȁǗǣǰȁǓǙǪǟǤǻǘǞǦǆǼǜǯ", (byte)126, 66);
               b[3] = δΛψπξκσβγςα.E("֑ֆ֕֫ծ֮։֥պֆ֏ո֓֍ովյ׃ַքּ֞քֻևׂ֍քց֡\u05c8\u05cd\u05ce\u05cbׇ֟\u05cf׀ֺֹׅ֦֗לֳ\u05cc֛֘םכסף׃צ֭֮", (byte)126, 69);
               b[4] = βθκςνθΩθυμςτκχ.A("ǞǮƲưǩǣǎǎƺƹǆǮǺǬǐƹǱǙǠǱȉǙǉǵƾǆǎǤǫǾǌǒǟȁǬȎǪǷȈǯǳǷǝǼǯȉǞǻǲǾȕǝǳȁǮǯ", (byte)126, 65);
               b[5] = ΣερμΔσατσκ.F("֔\u058b։ֵ֪֠ք֖֧֘֙։ּׁ֊սַ\u058cַַׇּֽֿ֘֯֕\u058b֍֨։ּ", (byte)126, 70);
               b[6] = θεωψξβΛσσ.A("ƳƿǖǨƷƶǐǑǉǘǦǎǲǿǴǗǔƼȇǚȆȂǸǹǉȈǠǺǫǮǧǭ", (byte)126, 65);
               b[7] = ςπυηννναΣ.A("ǋǎǕǋǱǐǭǈǓǲƹǈǺǘǿǃǠǅǹǰǼȇǎǏ", (byte)126, 65);
               b[8] = ΣερμΔσατσκ.F("֭լլַ֤֒շ\u058c։֮֒֙ձֱֿ֛֭֡֎տ\u0590֠֍֎", (byte)126, 70);
               b[9] = βθκςνθΩθυμςτκχ.B("ǏƮǓǆǘǒǏǬǮǭǨǃ", (byte)126, 66);
               b[10] = ΨφιωσρΓδΔθ.C("֥նշ֝ցդ֠֜վփ֎շ", (byte)126, 67);
               b[11] = ξψθρΣΠΣς.D("֢աա֬֙ևլցվև֡ֆ֤֫ֆ֔ֆհ֏֜ճֻւփ", (byte)126, 68);
               b[12] = ΣφδσΔζιΠρα.D("֢աա֬֙ևլցվևֳ֡֓ի֬թ։քև\u058b֤օւփ", (byte)126, 68);
               break;
            case 2:
               b[0] = δΛψπξκσβγςα.D("֧չ֖֒ր֩պ֧չև֤շ", (byte)126, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = φΨαξωυθανΣφυκη.E("ֵ֪֠ք֟։֎֓\u058b֨օւ", (byte)126, 69);
         }
      }
   }

   private ΠσδυΣσψβρτΦδοΔυ(ΨγημιδξΓτοθαζ var1, ΓυετνΛζΠιΓζΣ var2) {
      this.a = var2;
      var2.a(c<"㺀">(y, z ^ aa), new δμπψξΣτδΠΩουδξ(var1, null));
   }
}
