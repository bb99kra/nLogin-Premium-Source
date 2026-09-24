package com.nickuc.login;

import com.nickuc.login.api.types.Identity;
import com.nickuc.login.lib.json.JSONObject;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class κΛτζφΓιρυψσγςπ implements ςνΛωΠθρπυΣμκΓΩο<Identity> {
   private static int au = Integer.reverse(-268435456);
   private static int l = Integer.reverse(-1073741824);
   private static int s = (671088640 >>> 219 | 671088640 << -219) & -1;
   private static int aq = 114688 >>> 77 | 114688 << ~77 + 1;
   private static long aa = Long.reverse(-7205759403792793600L);
   private static String[] a = new String[κΛτζφΓιρυψσγςπ.at];
   public static final κΛτζφΓιρυψσγςπ a = new κΛτζφΓιρυψσγςπ();
   private static long d = Long.reverse(-7205759403792793600L);
   private static long k = Long.reverse(-7205759403792793600L);
   private static int y = Integer.reverse(-536870912);
   private static long b = Long.reverse(5313830679315597930L);
   private static long ao = Long.reverse(5313830679315597930L);
   private static int ac = Integer.reverse(-1);
   private static String[] b = new String[au];
   private static long t = Long.reverse(5313830679315597930L);
   private static int i = Integer.reverse(1073741824);
   private static long af = Long.reverse(5313830679315597930L);
   private static long m = Long.reverse(5313830679315597930L);
   private static int r = 8 >>> 195 | 8 << -195;
   private static long p = Long.reverse(5313830679315597930L);
   private static long ag = Long.reverse(-7205759403792793600L);
   private static int ah = 'ꀀ' >>> 'L' | 40960 << ~76 + 1;
   private static int v = 1610612736 >>> 156 | 1610612736 << -156;
   private static long q = Long.reverse(-7205759403792793600L);
   private static int a = (0 >>> 217 | 0 << ~217 + 1) & -1;
   private static long w = Long.reverse(5313830679315597930L);
   private static int aj = Integer.reverse(-805306368);
   private static long ar = Long.reverse(5313830679315597930L);
   private static long am = Long.reverse(-3044850229084042646L);
   private static long x = Long.reverse(-7205759403792793600L);
   private static long ak = Long.reverse(-3044850229084042646L);
   private static int o = Integer.reverse(536870912);
   private static int an = (13631488 >>> 52 | 13631488 << ~52 + 1) & -1;
   private static int e = Integer.reverse(0);
   private static long ai = Long.reverse(-3044850229084042646L);
   private static long z = Long.reverse(5313830679315597930L);
   private static int g = (-1 >>> 157 | -1 << ~157 + 1) & -1;
   private static long h = Long.reverse(-3044850229084042646L);
   private static long u = Long.reverse(-7205759403792793600L);
   private static long as = Long.reverse(-7205759403792793600L);
   private static int al = (6 >>> 63 | 6 << -63) & -1;
   private static int ab = 4096 >>> 41 | 4096 << ~41 + 1;
   private static int ae = Integer.reverse(-1879048192);
   private static long c;
   private static long j = Long.reverse(5313830679315597930L);
   private static int at = Integer.reverse(-268435456);
   private static int f = (1 >>> 96 | 1 << -96) & -1;
   private static long ap = Long.reverse(-7205759403792793600L);
   private static long ad = Long.reverse(-3044850229084042646L);
   private static long n = Long.reverse(-7205759403792793600L);

   @Override
   public Class<?> a() {
      return Identity.class;
   }

   public JSONObject a(@Nonnull Identity var1) {
      JSONObject var2 = new JSONObject();
      if (var1 instanceof ΠιγμμΓΨλς) {
         ΠιγμμΓΨλς var3 = (ΠιγμμΓΨλς)var1;
         var2.put(c<"㺀">(a, b ^ d), e);
         var2.put(c<"㺃">(f & g, h), var3.getName());
         UUID var4 = var3.getMojangId();
         if (var4 != null) {
            var2.put(c<"㺆">(i, j ^ k), λΣσΣκΓβΠΨ.b(var4));
         }

         UUID var5 = var3.getBedrockId();
         if (var5 != null) {
            var2.put(c<"㺉">(l, m ^ n), λΣσΣκΓβΠΨ.b(var5));
         }
      } else {
         if (!(var1 instanceof φλφυΔξθγ)) {
            throw new IllegalArgumentException(c<"㺒">(v, w ^ x) + var1.getClass().getCanonicalName());
         }

         φλφυΔξθγ var6 = (φλφυΔξθγ)var1;
         var2.put(c<"㺌">(o, p ^ q), r);
         var2.put(c<"㺏">(s, t ^ u), var6.getKnownName());
      }

      return var2;
   }

   private static String a(int var0, long var1) {
      var1 ^= 57L;
      var1 ^= -8022305193088394656L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(44 + 24),
                     (byte)(30 + 39),
                     (byte)(48 + 35),
                     (byte)(5 + 42),
                     (byte)(53 + 14),
                     (byte)(15 + 51),
                     (byte)(62 + 5),
                     47,
                     (byte)(78 + 2),
                     (byte)(73 + 2),
                     (byte)(41 + 26),
                     (byte)(76 + 7),
                     (byte)(19 + 34),
                     80,
                     (byte)(59 + 38),
                     (byte)(71 + 29),
                     (byte)(95 + 5),
                     (byte)(57 + 48),
                     (byte)(29 + 81),
                     (byte)(51 + 52)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(15 + 53), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ζβησεθωυγτ.D("ҥҲұѴҴҰҫҴҿҮѻҹҽҶҹҿҁࠍ߯࠙ࠌࠝ߫ࠒࠛࠠࠤࠠࠑࠡࠠ", (byte)47, 68));
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
      c = 6220514155168890258L;
      long var0 = c ^ -8022305193088394656L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(2 + 66),
               (byte)(19 + 50),
               (byte)(61 + 22),
               (byte)(22 + 25),
               (byte)(22 + 45),
               (byte)(24 + 42),
               67,
               (byte)(45 + 2),
               (byte)(43 + 37),
               (byte)(28 + 47),
               (byte)(28 + 39),
               (byte)(82 + 1),
               (byte)(12 + 41),
               (byte)(62 + 18),
               (byte)(69 + 28),
               100,
               (byte)(20 + 80),
               (byte)(20 + 85),
               (byte)(108 + 2),
               (byte)(55 + 48)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(42 + 41)}, StandardCharsets.UTF_8));
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
               b[0] = λΣΩσμφγχ.C("զ՝ըՈղՕՒ\u0558մԿկՊ", (byte)111, 67);
               b[1] = ΣερμΔσατσκ.D("Ռ\u0558կոՔԽվժծԾՍՊ", (byte)111, 68);
               b[2] = πχσδΦΦνθΔπ.A("ƎƯǍƥƮƚƚǝǖǊǐǟǀǁǢƴǓǅǕǓǩǩưƱ", (byte)111, 65);
               b[3] = φΨαξωυθανΣφυκη.B("ǐƪưǔǐƘƩǍƙǚƽƱǊƠƖǔǄƷǆƱƥǙưƱ", (byte)111, 66);
               b[4] = ντθΔζβΔζ.C("զ՝ըՈղՕՒ\u0558մԿկՊ", (byte)111, 67);
               b[5] = πχσδΦΦνθΔπ.C("պհոԸխՎԼԿձՐզՕոՇՕՒնոդՊծըՕՖ", (byte)111, 67);
               b[6] = ΨφιωσρΓδΔθ.C("ճՇը\u0530տՑԸՊցն՛եսհճջՅՋՊթ֍ՉՇ֒ՠՒ֊օՍբնՕչֈ֊֗\u058cրրվ֤֟կ֠ռվ։֪ւ֗ռնի֫ը֤֭֭֮նֆր֧ք", (byte)111, 67);
               b[7] = χΠξΦιζΨΣωΦσΨζ.B("ǁƸǃƣǍưƭƳǏƚǊƥ", (byte)111, 66);
               b[8] = ΣφδσΔζιΠρα.E("յց֘֡սզ֧֓֗էնճ", (byte)111, 69);
               b[9] = ΨΦνΨΦωυΩνβςμ.D("ԳՔղՊՓԿԿւջկյքեզևՙոժպո֎֎ՕՖ", (byte)111, 68);
               b[10] = ΣδτΠνεγοΓορητ.A("ƎƯǍƥƮƚƚǝǖǊǐǟǀǁǢƴǓǅǕǓǩǩưƱ", (byte)111, 65);
               b[11] = χΠξΦιζΨΣωΦσΨζ.C("յՏՕչյԽՎղԾտբՖկՅԻչթ՜իՖՊվՕՖ", (byte)111, 67);
               b[12] = ςπυηννναΣ.D("յՏՕչյԽՎղԾտբՖկՅԻչթ՜իՖՊվՕՖ", (byte)111, 68);
               b[13] = φΨαξωυθανΣφυκη.B("ǕǋǓƓǈƩƗƚǌƫǁưǓƢưƭǑǓƿƥǉǃưƱ", (byte)111, 66);
               b[14] = φδχεθοκψαλΛογλ.B("ǎƢǃƋǚƬƓƥǜǑƴǡǒƶǡǍǦǏƥǆǛǜǁǣƿƹǧƮǈƼǣǨǤǬǡǂǣƳǫƴǏǩƹǵƺǑǭǲȂƿǾǽǁǓǐǑ", (byte)111, 66);
               break;
            case 1:
               b[0] = χφπρψπφΦθμπ.F("տոճևփ֜֙ճպ֥֥֝֙֯ղ֝ս֣֯մ֓ցվտ", (byte)111, 70);
               b[1] = πψυκΠΨμΛΩβΣφμφσ.F("֛րնվրմ֣՝ցխվճ", (byte)111, 70);
               b[2] = πψυκΠΨμΛΩβΣφμφσ.B("ƎƯǍƥƮƚƚǝǖǊǑǛǘƭǎǚƲǧǖǛƾǩưƱ", (byte)111, 66);
               b[3] = ζβησεθωυγτ.F("֞ով֢֞զշ֛է֨\u058b֢֙֊լֳ֪֭֯ծևַվտ", (byte)111, 70);
               b[4] = μεςΩΔΣγν.A("ǏǅǑǑƔƫƴǝƶƭƸƥ", (byte)111, 65);
               b[5] = θεωψξβΛσσ.A("ǕǋǓƓǈƩƗƚǌƫǁǒǛƯǍǚƸƝǃǥǈǃưƱ", (byte)111, 65);
               b[6] = χΠξΦιζΨΣωΦσΨζ.B("ǎƢǃƋǚƬƓƥǜǑƶǀǘǋǎǖƠƦƥǄǨƤƢǭƻƭǥǠƨƽǑưǔǣǥǲǧǛǛǙǿǺǊǻǗǙǤȅǝǲǗǑǆǹȁǝȅǪǋǚȉȎȆǮǿȐǱǬǬǔǥǭǰțȊǥ", (byte)111, 66);
               b[7] = λΣΩσμφγχ.A("ǑƒǙǉǇƱƩƭƞǌǀƥ", (byte)111, 65);
               b[8] = μζξτΩσσφυδεπλΨ.C("ԳԷՕ՞խժՌկՃ՛ՙՊ", (byte)111, 67);
               b[9] = πχσδΦΦνθΔπ.E("՜ս֛ճռըը֤֫֘֞զկ֦օղսֶ֖ֆַ֪վտ", (byte)111, 69);
               b[10] = οοθδΨιοΦΠβδζ.E("՜ս֛ճռըը֤֫֘֜ր֘ժ֢կի\u058b֨ք֎ցվտ", (byte)111, 69);
               b[11] = φδχεθοκψαλΛογλ.C("յՏՕչյԽՎղԾտգռԿդր֊\u0558Պ։։։֎ՕՖ", (byte)111, 67);
               b[12] = ζοηκορΦνΣθγΩ.B("ǐƪưǔǐƘƩǍƙǚƾƓƹƫǞǍǑǦǡǁƣǩưƱ", (byte)111, 66);
               b[13] = ντθΔζβΔζ.B("ǕǋǓƓǈƩƗƚǌƫǀƪǖƶǏƹƦǀƳƦƳǃưƱ", (byte)111, 66);
               b[14] = πχσδΦΦνθΔπ.F("֜հ֑ՙ֨պաճ֪֟ւ֯֠քִ֛֯֝ճ֪֔֩֏ֱ֍ևֵռ֖֊ֱֲֶֺ֯\u0590ֱցֹւַ֝և֠\u05cb֍֪\u05cf֦ה\u058c֟\u05ceׇ֞֟", (byte)111, 70);
               break;
            case 2:
               b[0] = ξψθρΣΠΣς.D("Ջռԯո\u0558ՒԳլղՑՃձՑնժվ՜ՖզնՅ֎բ֎ծըֈ\u058b֑զհ֗", (byte)111, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = μεςΩΔΣγν.D("ռչհԹծ՚ՉՎՀուն՝ՓՑբ\u058bՉֈա\u058bըՕՖ", (byte)111, 68);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  κΛτζφΓιρυψσγςπ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(φδχεθοκψαλΛογλ.D("ҲӔӖҶӚӹӱԇӳӂԀӶԄӾӇӬԎԍԅԋԅӚ", (byte)71, 68), κΛτζφΓιρυψσγςπ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            βεξΠθρρςΔΦμ.D("ӭӺӹҼӼӸӳӼԇӶӃԁԅӾԁԇӉࡕ࠷ࡡࡔࡥ࠳࡚ࡣࡨ\u086cࡨ࡙ࡩࡨӣ", (byte)71, 68) + var1 + πψυκΠΨμΛΩβΣφμφσ.A("Ň", (byte)71, 65) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   public Identity a(@Nonnull JSONObject var1) {
      int var2 = var1.getInt(c<"㺀">(y, z ^ aa));
      switch (var2) {
         case 0:
            String var6 = var1.getString(c<"㺃">(ab & ac, ad));
            UUID var4 = var1.has(c<"㺆">(ae, af ^ ag)) ? λΣσΣκΓβΠΨ.c(var1.getString(c<"㺉">(ah, ai))) : null;
            UUID var5 = var1.has(c<"㺌">(aj, ak)) ? λΣσΣκΓβΠΨ.c(var1.getString(c<"㺏">(al, am))) : null;
            return new ΠιγμμΓΨλς(var6, var4, var5);
         case 1:
            String var3 = var1.getString(c<"㺒">(an, ao ^ ap));
            return new φλφυΔξθγ(var3);
         default:
            throw new IllegalArgumentException(c<"㺕">(aq, ar ^ as) + var2);
      }
   }
}
