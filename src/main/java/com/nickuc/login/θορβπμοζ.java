package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class θορβπμοζ extends λΓλχΩαοΨωθτοςΓ {
   private static long be = Long.reverse(-2161727821137838080L);
   private static long cc = Long.reverse(-2161727821137838080L);
   private static long bs = Long.reverse(-5826504290764183782L);
   private static int bo = Integer.reverse(1073741824);
   private static int bb = (67108864 >>> 250 | 67108864 << ~250 + 1) & -1;
   private static int bu = (1572864 >>> 83 | 1572864 << -83) & -1;
   private static long bd = Long.reverse(5558595567228430106L);
   private static int cl = 1879048192 >>> 124 | 1879048192 << -124;
   private static long bz = Long.reverse(5558595567228430106L);
   private static String[] f = new String[θορβπμοζ.co];
   private static int by = Integer.reverse(536870912);
   private static long bw = Long.reverse(-5826504290764183782L);
   private static long al = Long.reverse(5558595567228430106L);
   private static long an = Long.reverse(-2161727821137838080L);
   private static int ae = Integer.reverse(0);
   private static long cj = Long.reverse(-5826504290764183782L);
   private static int br = Integer.reverse(-1);
   private static long g;
   private static int cf = Integer.reverse(-1610612736);
   private static int ci = Integer.reverse(1610612736);
   private static String[] e = new String[cl];
   private static long cg = Long.reverse(5558595567228430106L);
   private static long ch = Long.reverse(-2161727821137838080L);
   private static int co = Integer.reverse(-536870912);

   @Override
   public void b(στΩξξχκι var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3) {
      throw new UnsupportedOperationException(c<"㺀">(cf, cg ^ ch));
   }

   static {
      b();
   }

   @Override
   public void a(στΩξξχκι var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3) {
      throw new UnsupportedOperationException(c<"㺀">(by, bz ^ cc));
   }

   private static String a(int var0, long var1) {
      var1 ^= 71L;
      var1 ^= 8063153289813721855L;
      if (e[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(14 + 54),
                     (byte)(20 + 49),
                     (byte)(19 + 64),
                     (byte)(26 + 21),
                     (byte)(12 + 55),
                     (byte)(29 + 37),
                     (byte)(42 + 25),
                     (byte)(26 + 21),
                     (byte)(52 + 28),
                     (byte)(38 + 37),
                     (byte)(44 + 23),
                     (byte)(65 + 18),
                     53,
                     (byte)(38 + 42),
                     (byte)(20 + 77),
                     (byte)(58 + 42),
                     (byte)(94 + 6),
                     (byte)(103 + 2),
                     (byte)(8 + 102),
                     (byte)(46 + 57)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(39 + 29), (byte)(47 + 22), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(δΛψπξκσβγςα.E("ՁՎՍԐՐՌՇՐ՛ՊԗՕՙՒՕ՛ԝࢧࢯࢲࢤࢳࢰࢴࢬ", (byte)34, 69));
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

   @Override
   public ΓφτνρνυρΣ a() {
      throw new UnsupportedOperationException(c<"㺀">(ae, al ^ an));
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  θορβπμοζ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ντθΔζβΔζ.D("кќўоѢҁѹҏѻъ҈ѾҌ҆яѴҖҕҍғҍѢ", (byte)31, 68), θορβπμοζ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(ΨφιωσρΓδΔθ.B("ĠĭĬïįīĦįĺĩöĴĸıĴĺü҆Ҏґ҃ҒҏғҋĐ", (byte)31, 66) + var1 + ςΦζσμτΓσ.A("÷", (byte)31, 65) + var2.toString(), var4);
      }
   }

   @Override
   public void a(στΩξξχκι var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3, String var4, @Nullable String var5, boolean var6, boolean var7) {
      throw new UnsupportedOperationException(c<"㺀">(bu, bw));
   }

   @Override
   public void a(στΩξξχκι var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3, String var4, boolean var5, boolean var6) {
      throw new UnsupportedOperationException(c<"㺀">(bo & br, bs));
   }

   @Override
   public void a(στΩξξχκι var1, ΨαχΨχΣλεΠψΦ var2, boolean var3, boolean var4) {
      throw new UnsupportedOperationException(c<"㺀">(ci, cj));
   }

   public θορβπμοζ(nLoginBukkit var1) {
      super(var1);
   }

   @Override
   public ςτΩΦπρηΩΓ a() {
      throw new UnsupportedOperationException(c<"㺀">(bb, bd ^ be));
   }

   private static void b() {
      g = 6405364820196467890L;
      long var0 = g ^ 8063153289813721855L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(39 + 30),
               83,
               (byte)(3 + 44),
               (byte)(63 + 4),
               (byte)(63 + 3),
               (byte)(42 + 25),
               (byte)(33 + 14),
               (byte)(70 + 10),
               (byte)(72 + 3),
               (byte)(37 + 30),
               (byte)(5 + 78),
               (byte)(28 + 25),
               (byte)(52 + 28),
               (byte)(91 + 6),
               (byte)(47 + 53),
               (byte)(57 + 43),
               (byte)(94 + 11),
               (byte)(107 + 3),
               (byte)(24 + 79)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(18 + 51), 83}, StandardCharsets.UTF_8));
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
               f[0] = ντθΔζβΔζ.B("ƟǈǈƩƣǋǅƋǅƺƹƑƿǉƒƞǖǀƊơƒǙƵǖƺƾǉƪƪƼƿǝƢƯǑǨǊƢǙǁǚǮǉǪǀǴǠǫƱǱǰƵǷǩǀǁ", (byte)103, 66);
               f[1] = οΩνΩρωλΨηΛδωδ.C("ԼեեՆՀըբԨբ\u0557ՖԮ՜զԯԻճ՝ԧԾԯնՒճ\u0557՛զՇՇՙ՜պԿՌծօէԿն՞շ\u058bզև՝֑սֈՎ֎֍Ւ֔ֆ՝՞", (byte)103, 67);
               f[2] = ντθΔζβΔζ.E("յ֞֞տչ֛֡ա֛\u0590֏է֕֟ըմ֖֬ՠշը֯\u058b֬\u0590֔֟րրֳ֒֕ոօ֧־֠ոְ֯֗ׄ֟׀֖\u05caֶׁևׇ׆\u058b\u05cdֿ֖֗", (byte)103, 69);
               f[3] = χφπρψπφΦθμπ.A("ƟǈǈƩƣǋǅƋǅƺƹƑƿǉƒƞǖǀƊơƒǙƵǖƺƾǉƪƪƼƿǝƢƯǑǨǊƢǙǁǚǮǉǪǀǴǠǫƱǱǰƵǷǩǀǁ", (byte)103, 65);
               f[4] = ντθΔζβΔζ.E("յ֞֞տչ֛֡ա֛\u0590֏է֕֟ըմ֖֬ՠշը֯\u058b֬\u0590֔֟րրֳ֒֕ոօ֧־֠ոְ֯֗ׄ֟׀֖\u05caֶׁևׇ׆\u058b\u05cdֿ֖֗", (byte)103, 69);
               f[5] = οοθδΨιοΦΠβδζ.C("ԼեեՆՀըբԨբ\u0557ՖԮ՜զԯԻճ՝ԧԾԯնՒճ\u0557՛զՇՇՙ՜պԿՌծօէԿն՞շ\u058bզև՝֑սֈՎ֎֍Ւ֔ֆ՝՞", (byte)103, 67);
               f[6] = ΣφδσΔζιΠρα.F("յ֞֞տչ֛֡ա֛\u0590֏է֕֟ըմ֖֬ՠշը֯\u058b֬\u0590֔֟րրֳ֒֕ոօ֧־֠ոְ֯֗ׄ֟׀֖\u05caֶׁևׇ׆\u058b\u05cdֿ֖֗", (byte)103, 70);
               break;
            case 1:
               f[0] = ξψθρΣΠΣς.E("յ֞֞տչ֛֡ա֛\u0590֏է֕֟ըմ֖֬ՠշը֯\u058b֬\u0590֔֟րրֳ֒֕ոօ֧־֠ոְ֯֗ׄ֞֓־ք֕֬վ֛ֈ֢֖֮֩֗", (byte)103, 69);
               f[1] = ΠΛΨοδΩσμνΛγΦφβς.A("ƟǈǈƩƣǋǅƋǅƺƹƑƿǉƒƞǖǀƊơƒǙƵǖƺƾǉƪƪƼƿǝƢƯǑǨǊƢǙǁǚǮǉǧǓưǬǩǱǋǑǗƳǓǀǁ", (byte)103, 65);
               f[2] = ΦδφπθΩΩλζξ.F("յ֞֞տչ֛֡ա֛\u0590֏է֕֟ըմ֖֬ՠշը֯\u058b֬\u0590֔֟րրֳ֒֕ոօ֧־֠ոְָֺׂ֯֗ׄ֠րֻ֤֤׀ֺ֧֖֩֗", (byte)103, 70);
               f[3] = ΣερμΔσατσκ.D("ԼեեՆՀըբԨբ\u0557ՖԮ՜զԯԻճ՝ԧԾԯնՒճ\u0557՛զՇՇՙ՜պԿՌծօէԿն՞շ\u058bզսՅ։րէՒ\u058bկտՑՠ՝՞", (byte)103, 68);
               f[4] = ΣερμΔσατσκ.B("ƟǈǈƩƣǋǅƋǅƺƹƑƿǉƒƞǖǀƊơƒǙƵǖƺƾǉƪƪƼƿǝƢƯǑǨǊƢǙǁǚǮǋưƾǴǪƱǩǈǈƵǆǓǀǁ", (byte)103, 66);
               f[5] = ντθΔζβΔζ.F("յ֞֞տչ֛֡ա֛\u0590֏է֕֟ըմ֖֬ՠշը֯\u058b֬\u0590֔֟րրֳ֒֕ոօ֧־֠ոְׁ֯֗ׄ֟վ֦֣֜օּ֥֖֫֬֙֗", (byte)103, 70);
               f[6] = οοθδΨιοΦΠβδζ.F("յ֞֞տչ֛֡ա֛\u0590֏է֕֟ըմ֖֬ՠշը֯\u058b֬\u0590֔֟րրֳ֒֕ոօ֧־֠ոְ֯֗ׄ֞׀ր֢֓׃ׅ׀֦֦בֿ֖֗", (byte)103, 70);
               break;
            case 2:
               f[0] = ΨφιωσρΓδΔθ.A("ƢƜǅſƢƘƔƜƀƣƦƦưǋǎǁǅƏǕƴǅƣƠơ", (byte)103, 65);
            case 3:
            default:
               break;
            case 4:
               f[0] = μεςΩΔΣγν.D("ԡԸդդ՞ԾԳե՜ԤՄԫբէՆթգԪԵլոՐԽԾ", (byte)103, 68);
         }
      }
   }
}
