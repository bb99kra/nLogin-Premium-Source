package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class φτμΨνψΣτξ {
   private final String cd;
   private static int b = -1 >>> 153 | -1 << ~153 + 1;
   private static final ωομΦδΔπνΨεβυΓ[] a = new ωομΦδΔπνΨεβυΓ[φτμΨνψΣτξ.n];
   private static int e = 4 >>> 66 | 4 << -66;
   private static long h = Long.reverse(-2029687917120958620L);
   private final ωομΦδΔπνΨεβυΓ[] b;
   private static int n = Integer.reverse(0);
   private static long f = Long.reverse(-2029687917120958620L);
   private static int i = (24576 >>> 205 | 24576 << ~205 + 1) & -1;
   private static long j = Long.reverse(-5344337242865643676L);
   private static String[] b = new String[φτμΨνψΣτξ.m];
   private final UUID g;
   private static long c;
   private static long k = Long.reverse(6196953087261802496L);
   private static int g = Integer.reverse(1073741824);
   private static int a = (0 >>> 126 | 0 << ~126 + 1) & -1;
   private static long d = Long.reverse(-2029687917120958620L);
   private static String[] a = new String[φτμΨνψΣτξ.l];
   private static int l = Integer.reverse(536870912);
   private static int m = (8388608 >>> 181 | 8388608 << ~181 + 1) & -1;

   @Generated
   @Override
   public String toString() {
      return c<"㺀">(a & b, d) + this.b() + c<"㺃">(e, f) + this.getName() + c<"㺆">(g, h) + Arrays.deepToString(this.a()) + c<"㺉">(i, j ^ k);
   }

   public φτμΨνψΣτξ(UUID var1, String var2) {
      this(var1, var2, a);
   }

   @Generated
   public UUID b() {
      return this.g;
   }

   @Generated
   public φτμΨνψΣτξ(UUID var1, String var2, ωομΦδΔπνΨεβυΓ[] var3) {
      this.g = var1;
      this.cd = var2;
      this.b = var3;
   }

   private static void b() {
      c = 2806403288064895917L;
      long var0 = c ^ 2161175802538586978L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(48 + 20),
               (byte)(21 + 48),
               (byte)(44 + 39),
               (byte)(8 + 39),
               (byte)(49 + 18),
               (byte)(63 + 3),
               (byte)(43 + 24),
               (byte)(35 + 12),
               (byte)(44 + 36),
               (byte)(51 + 24),
               (byte)(34 + 33),
               83,
               (byte)(36 + 17),
               (byte)(34 + 46),
               (byte)(24 + 73),
               (byte)(66 + 34),
               (byte)(79 + 21),
               105,
               (byte)(86 + 24),
               (byte)(61 + 42)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(55 + 28)}, StandardCharsets.UTF_8));
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
               b[0] = ζβησεθωυγτ.E("ԿԲեՑ\u0530՟ՠԴԾԦԫըխՉ՝ԱըՏՕձԸՓ\u0530՜ԺջՉ՚ԻՕփա", (byte)47, 69);
               b[1] = φδχεθοκψαλΛογλ.A("ĴŒŕĖıĘŅĲĸŒİĥ", (byte)47, 65);
               b[2] = ΣφδσΔζιΠρα.B("ĳģĎŐēŐĚňĹĹśĴŊŀōŜİĿĨŇŧũİı", (byte)47, 66);
               b[3] = ΦδφπθΩΩλζξ.A("ŗŗįŎĴĪőĮĖŒĬĥ", (byte)47, 65);
               break;
            case 1:
               b[0] = ςΦζσμτΓσ.B("ıĤŗŃĢőŒĦİĘĝŚşĻŏģŚŁŇţĪŅŔĶŭŢśŞļűŇŴ", (byte)47, 66);
               b[1] = ΨΦνΨΦωυΩνβςμ.C("ҶҰҸҔҒҽҸѺҫҌҶҺҗҾҴҡҋӆҽҸҼҾҕҖ", (byte)47, 67);
               b[2] = μεςΩΔΣγν.A("ĳģĎŐēŐĚňĹĹŚŀĞįŒĶĢĺıŝŅĳİı", (byte)47, 65);
               b[3] = οΩνΩρωλΨηΛδωδ.F("ԟԶԴ՜գ\u0557ԹՠՊԤԾԳ", (byte)47, 70);
               break;
            case 2:
               b[0] = λΣΩσμφγχ.D("ҋґҗѸѶѸѾҲѿҠҚӁҵҒҪӈҬҡҽҽӎҨҕҖ", (byte)47, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = ζοηκορΦνΣθγΩ.C("ѭҹѴүҞҹҩӃѵӃӁҰҙҘҜҪҚӂҸҡҼҘҕҖ", (byte)47, 67);
         }
      }
   }

   @Generated
   public ωομΦδΔπνΨεβυΓ[] a() {
      return this.b;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  φτμΨνψΣτξ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(οΩνΩρωλΨηΛδωδ.F("ՋխկՏճ֒֊֠\u058c՛֙֏֝֗ՠօ֧֦֤֞֞ճ", (byte)103, 70), φτμΨνψΣτξ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            θεωψξβΛσσ.F("ֆ֓֒Օ֑֕\u058c֕֠֏՜֚֚֞֗֠բࣲࣺࣹࣟࣵँࣺࣝࣿշ", (byte)103, 70) + var1 + ΨφιωσρΓδΔθ.F("՝", (byte)103, 70) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 106L;
      var1 ^= 2161175802538586978L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(5 + 63),
                     (byte)(2 + 67),
                     (byte)(75 + 8),
                     (byte)(29 + 18),
                     (byte)(63 + 4),
                     (byte)(10 + 56),
                     (byte)(33 + 34),
                     (byte)(29 + 18),
                     (byte)(21 + 59),
                     (byte)(26 + 49),
                     (byte)(3 + 64),
                     (byte)(70 + 13),
                     (byte)(14 + 39),
                     80,
                     (byte)(31 + 66),
                     100,
                     (byte)(62 + 38),
                     (byte)(17 + 88),
                     (byte)(72 + 38),
                     (byte)(66 + 37)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(33 + 35), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(δΛψπξκσβγςα.B("ƞƫƪŭƭƩƤƭƸƧŴƲƶƯƲƸźԒԑԊӷԍԙӵԗԒ", (byte)94, 66));
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

   @Generated
   public String getName() {
      return this.cd;
   }
}
