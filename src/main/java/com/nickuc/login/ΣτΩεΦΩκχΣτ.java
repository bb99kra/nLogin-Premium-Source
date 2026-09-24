package com.nickuc.login;

import com.nickuc.login.api.types.AccountData;
import com.nickuc.login.lib.json.JSONArray;
import com.nickuc.login.lib.json.JSONObject;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ΣτΩεΦΩκχΣτ implements ςνΛωΠθρπυΣμκΓΩο<List<AccountData>> {
   private static int i = Integer.reverse(1073741824);
   private static long d = Long.reverse(-1491087312301745955L);
   private static int c = Integer.reverse(-1);
   private static String[] b = new String[ΣτΩεΦΩκχΣτ.j];
   private static int f = Integer.reverse(-1);
   private static int b = Integer.reverse(0);
   private static long c;
   private static String[] a = new String[i];
   public static ΣτΩεΦΩκχΣτ a = new ΣτΩεΦΩκχΣτ();
   private static int e = (64 >>> 134 | 64 << -134) & -1;
   private static int a = Integer.reverse(0);
   private static long g = Long.reverse(-1491087312301745955L);
   private static int j = Integer.reverse(1073741824);
   private static int h = 0 >>> 244 | 0 << ~244 + 1;

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 115L;
      var1 ^= 2264233009902216645L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(41 + 27),
                     (byte)(50 + 19),
                     (byte)(24 + 59),
                     (byte)(14 + 33),
                     67,
                     (byte)(52 + 14),
                     (byte)(31 + 36),
                     (byte)(36 + 11),
                     (byte)(20 + 60),
                     (byte)(57 + 18),
                     (byte)(45 + 22),
                     (byte)(30 + 53),
                     (byte)(36 + 17),
                     (byte)(29 + 51),
                     (byte)(19 + 78),
                     100,
                     (byte)(74 + 26),
                     (byte)(26 + 79),
                     (byte)(57 + 53),
                     (byte)(99 + 4)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(25 + 43), 69, (byte)(25 + 58)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ζβησεθωυγτ.E("Ց՞՝Ԡՠ՜\u0557ՠի՚ԧեթբեիԭࢢࣄࢪࢷࢩࢭࢿ࣍ࢪ࣌", (byte)50, 69));
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
      c = -4964773653114162524L;
      long var0 = c ^ 2264233009902216645L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(15 + 53),
               (byte)(13 + 56),
               (byte)(61 + 22),
               (byte)(46 + 1),
               (byte)(62 + 5),
               (byte)(48 + 18),
               (byte)(50 + 17),
               (byte)(18 + 29),
               80,
               (byte)(73 + 2),
               (byte)(45 + 22),
               (byte)(30 + 53),
               (byte)(12 + 41),
               80,
               (byte)(36 + 61),
               (byte)(16 + 84),
               (byte)(9 + 91),
               (byte)(28 + 77),
               (byte)(45 + 65),
               (byte)(74 + 29)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(33 + 36), 83}, StandardCharsets.UTF_8));
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
               b[0] = ξψθρΣΠΣς.D("շ֡֔մ֙շևֈ֜֞քևִ֚֫֏լִַ֬հ֨տր", (byte)125, 68);
               b[1] = φΨαξωυθανΣφυκη.A("ǄǮǡǁǦǄǔǕǩǫǑǔǧǸȁǜƹǹȄȁƽǵǌǍ", (byte)125, 65);
               break;
            case 1:
               b[0] = ντθΔζβΔζ.C("շ֡֔մ֙շևֈ֜֞ք֠թդ֤ի֬֗փְָ֑տր", (byte)125, 67);
               b[1] = μεςΩΔΣγν.B("ǄǮǡǁǦǄǔǕǩǫǓǖưƻȁǠǂǼǢǍǳǟǌǍ", (byte)125, 66);
               break;
            case 2:
               b[0] = πχσδΦΦνθΔπ.C("չ՝քֆջյգջյև֎\u058c֠ժռժց֧ձֺ֦֣ֈ֒֔։֊ֹׂ֝֘֠", (byte)125, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = ζβησεθωυγτ.B("ǧǐƮǖǲǏǳǙǆǮƻǖǩƼǸǭƸǴǯƻȁǸǕǓǗǙǴȅǛȎȑȁ", (byte)125, 66);
         }
      }
   }

   public List<AccountData> a(@Nonnull JSONObject var1) {
      JSONArray var2 = var1.getJSONArray(c<"㺀">(e & f, g));
      AccountData[] var3 = new AccountData[var2.length()];

      for (int var4 = h; var4 < var3.length; var4++) {
         var3[var4] = ΣωΦπψκψΔΦΦ.a.a(var2.getJSONObject(var4));
      }

      return ηζησΠΠωΓργπ.a(var3);
   }

   @Override
   public Class<?> a() {
      return List.class;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ΣτΩεΦΩκχΣτ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΦδφπθΩΩλζξ.A("ĭŏőıŕŴŬƂŮĽŻűſŹłŧƉƈƀƆƀŕ", (byte)67, 65), ΣτΩεΦΩκχΣτ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(μεςΩΔΣγν.F("բկծԱձխըձռիԸնպճնռԾࢳࣕࢻࣈࢺࢾ࣐ࣞࢻࣝՔ", (byte)67, 70) + var1 + ΨΦνΨΦωυΩνβςμ.B("Ŀ", (byte)67, 66) + var2.toString(), var4);
      }
   }

   public JSONObject a(@Nonnull List<AccountData> var1) {
      JSONObject var2 = new JSONObject();
      JSONArray var3 = new JSONArray();

      for (int var4 = a; var4 < var1.size(); var4++) {
         var3.put(var4, ΣωΦπψκψΔΦΦ.a.a((AccountData)var1.get(var4)));
      }

      var2.put(c<"㺀">(b & c, d), var3);
      return var2;
   }
}
