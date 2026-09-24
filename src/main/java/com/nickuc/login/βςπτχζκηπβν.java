package com.nickuc.login;

import com.nickuc.login.api.enums.SpawnType;
import com.nickuc.login.lib.json.JSONObject;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class βςπτχζκηπβν implements ςνΛωΠθρπυΣμκΓΩο<SpawnType> {
   private static int f = Integer.reverse(1073741824);
   private static String[] b = new String[βςπτχζκηπβν.g];
   private static int g = 256 >>> 167 | 256 << ~167 + 1;
   private static String[] a = new String[f];
   private static long d = Long.reverse(730286486730372425L);
   public static final βςπτχζκηπβν a = new βςπτχζκηπβν();
   private static int c = 64 >>> 198 | 64 << ~198 + 1;
   private static long c;
   private static long b = Long.reverse(-7196048857441700535L);
   private static int a = Integer.reverse(0);
   private static long e = Long.reverse(-7638104968020361216L);

   public JSONObject a(@Nonnull SpawnType var1) {
      JSONObject var2 = new JSONObject();
      var2.put(c<"㺀">(a, b), var1);
      return var2;
   }

   @Override
   public Class<?> a() {
      return SpawnType.class;
   }

   public SpawnType a(@Nonnull JSONObject var1) {
      return (SpawnType)var1.getEnum(SpawnType.class, c<"㺀">(c, d ^ e));
   }

   private static String a(int var0, long var1) {
      var1 ^= 105L;
      var1 ^= 3006236024130251349L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(56 + 13),
                     (byte)(63 + 20),
                     (byte)(11 + 36),
                     (byte)(61 + 6),
                     (byte)(17 + 49),
                     (byte)(28 + 39),
                     (byte)(38 + 9),
                     (byte)(74 + 6),
                     (byte)(55 + 20),
                     (byte)(56 + 11),
                     83,
                     (byte)(18 + 35),
                     (byte)(37 + 43),
                     (byte)(19 + 78),
                     (byte)(28 + 72),
                     (byte)(29 + 71),
                     (byte)(20 + 85),
                     (byte)(65 + 45),
                     (byte)(62 + 41)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(5 + 64), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(θεωψξβΛσσ.B("ƚƧƦũƩƥƠƩƴƣŰƮƲƫƮƴŶӺԋԊԏԓԃԈԆԐԃԏ", (byte)92, 66));
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
      c = -7877029381372230576L;
      long var0 = c ^ 3006236024130251349L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(7 + 61),
               (byte)(58 + 11),
               83,
               (byte)(4 + 43),
               (byte)(14 + 53),
               (byte)(23 + 43),
               (byte)(18 + 49),
               47,
               (byte)(69 + 11),
               (byte)(13 + 62),
               (byte)(59 + 8),
               (byte)(49 + 34),
               (byte)(29 + 24),
               (byte)(79 + 1),
               (byte)(14 + 83),
               (byte)(64 + 36),
               (byte)(47 + 53),
               (byte)(62 + 43),
               (byte)(26 + 84),
               (byte)(2 + 101)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(2 + 81)}, StandardCharsets.UTF_8));
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
               b[0] = ΠΛΨοδΩσμνΛγΦφβς.E("ԽԩԸՆԹԥՎՎՒԌԒԜ", (byte)24, 69);
               b[1] = ντθΔζβΔζ.F("ԽԩԸՆԹԥՎՎՒԌԒԜ", (byte)24, 70);
               break;
            case 1:
               b[0] = πχσδΦΦνθΔπ.C("цѵѥѕѹѴѷјѰэҁѻѮѶмѯљ҆цфсѹѐё", (byte)24, 67);
               b[1] = φδχεθοκψαλΛογλ.D("ѡэхгѫѱЮѨўѪоћѵусх҇ќѶтѧѹѐё", (byte)24, 68);
               break;
            case 2:
               b[0] = ντθΔζβΔζ.E("ՀԍՌԜԠԏԩՑԦԖՕԨԓ՛ԗԫՍ՜ՐԸՉԙԭԴԛԣՐ՜ԽԪեԶ", (byte)24, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = ζβησεθωυγτ.C("чѧзѳіђѱѦѓѾщойлѢзѻ҆ѓҀѡѣѐё", (byte)24, 67);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  βςπτχζκηπβν.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ντθΔζβΔζ.E("ՙջս՝ց֚֮֠֘թ֧֥֝֫ծֲִֵ֓֬֬ց", (byte)117, 69), βςπτχζκηπβν.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            δΛψπξκσβγςα.D("շքփՆֆւսֆ֑րՍ\u058b֏ֈ\u058b֑Փࣰࣣ࣭ࣗࣨࣧ࣬࣠ࣥ࣠࣬ժ", (byte)117, 68) + var1 + οΩνΩρωλΨηΛδωδ.B("ƣ", (byte)117, 66) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }
}
