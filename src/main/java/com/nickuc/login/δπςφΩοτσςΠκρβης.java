package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class δπςφΩοτσςΠκρβης implements κΓΦνκχβδ {
   private static long c;
   private static int i = (0 >>> 172 | 0 << ~172 + 1) & -1;
   private static int l = (64 >>> 69 | 64 << -69) & -1;
   private static int q = Integer.reverse(Integer.MIN_VALUE);
   private static int n = Integer.reverse(-1);
   private static int f = (201326592 >>> 90 | 201326592 << -90) & -1;
   private static int d = Integer.reverse(0);
   private final ΩγΛξιχγτ M;
   private static int b = 18 >>> 97 | 18 << -97;
   private static long j = Long.reverse(3309416986446876304L);
   private static int s = Integer.reverse(1073741824);
   private static String[] b = new String[δπςφΩοτσςΠκρβης.t];
   private Boolean c;
   private static String[] a = new String[s];
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int g = Integer.reverse(0);
   private static int a = Integer.MIN_VALUE >>> 191 | Integer.MIN_VALUE << ~191 + 1;
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static int m = Integer.reverse(Integer.MIN_VALUE);
   private static int e = Integer.reverse(-402653184);
   private static int t = 67108864 >>> 57 | 67108864 << -57;
   private static long k = Long.reverse(4611686018427387904L);
   private static int p = Integer.reverse(0);
   private static int r = Integer.reverse(0);
   private static long o = Long.reverse(7921103004874264208L);

   private static String a(int var0, long var1) {
      var1 ^= 2L;
      var1 ^= -1957008598363100742L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(59 + 9),
                     (byte)(54 + 15),
                     (byte)(69 + 14),
                     (byte)(36 + 11),
                     (byte)(5 + 62),
                     (byte)(53 + 13),
                     (byte)(9 + 58),
                     (byte)(21 + 26),
                     80,
                     (byte)(59 + 16),
                     (byte)(63 + 4),
                     (byte)(11 + 72),
                     (byte)(18 + 35),
                     (byte)(76 + 4),
                     (byte)(60 + 37),
                     (byte)(91 + 9),
                     100,
                     (byte)(47 + 58),
                     (byte)(86 + 24),
                     (byte)(15 + 88)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(30 + 53)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(πηγμΣΔκκ.D("ӿԌԋӎԎԊԅԎԙԈӕԓԗԐԓԙӛࡡ\u086eࡱࡶ࡚ࡱࡷࡷࡷࡖࡱࡹ\u086bࡱࡽ", (byte)77, 68));
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

   @Override
   public boolean a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3) {
      if (this.c != null) {
         return this.c;
      } else {
         int var4 = var1.a().n();
         return this.c = Boolean.valueOf((boolean)(var4 != a && var4 != b ? c : d));
      }
   }

   @Generated
   public Boolean a() {
      return this.c;
   }

   @Generated
   public δπςφΩοτσςΠκρβης(ΩγΛξιχγτ var1) {
      this.M = var1;
   }

   private static void b() {
      c = 680873988218861492L;
      long var0 = c ^ -1957008598363100742L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(37 + 31),
               (byte)(28 + 41),
               (byte)(15 + 68),
               (byte)(41 + 6),
               (byte)(8 + 59),
               (byte)(51 + 15),
               67,
               (byte)(25 + 22),
               (byte)(58 + 22),
               (byte)(69 + 6),
               (byte)(58 + 9),
               (byte)(27 + 56),
               (byte)(23 + 30),
               (byte)(59 + 21),
               (byte)(48 + 49),
               (byte)(65 + 35),
               (byte)(7 + 93),
               (byte)(38 + 67),
               110,
               (byte)(99 + 4)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(44 + 25), 83}, StandardCharsets.UTF_8));
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
               b[0] = οΩνΩρωλΨηΛδωδ.D("չգֈքՔփէ\u0590֙հդփծչ՜ըշցջր֒ց֖֠ոֆօմս֧ռ֢֘ըղծտէֵַ֣֞֩֨և֕ջֲչִֻֻ֙֝֊\u058b", (byte)118, 68);
               b[1] = πψυκΠΨμΛΩβΣφμφσ.A("ƽƞǃǡƣƛƢǬǊƤǆǌǃǣǇƱǇǭǱǌǫǷƾƿ", (byte)118, 65);
               break;
            case 1:
               b[0] = φΨαξωυθανΣφυκη.F("֔վ֣֟կ֞ւִ֫\u058bտ֞։֔շփֱֻ֖֛֭֒֜֜֓֡֠֏ֳֽׂ֘֗փ֍։֚ւֹׄג־ג׀ׂ֔\u05cf\u05cbַ֥֥֦֬֞֯֨", (byte)118, 70);
               b[1] = πχσδΦΦνθΔπ.B("ƽƞǃǡƣƛƢǬǊƤǉǋǄưǦǓǋǫƶǨǸǒǇǎƼǽǙƹǾƸǗǖ", (byte)118, 66);
               break;
            case 2:
               b[0] = πψυκΠΨμΛΩβΣφμφσ.A("ǙǒǢǂǛǚƵƢƦǨǦǮǭǅǀǎǇǱǕƱǆǧƾƿ", (byte)118, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = ΠΛΨοδΩσμνΛγΦφβς.A("ƭǜǡǙǃǗƷǈǥǝƾơƨǭƺǧǰǀǅǏǣǁƾƿ", (byte)118, 65);
         }
      }
   }

   @Override
   public αΠαβσΠτΦ[] a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3, πααΔΣνΨγνθυ var4) {
      ευτβπαψω var10001 = var1.a().n() != e ? ευτβπαψω.z : ευτβπαψω.A;
      Object[] var10002 = new Object[f];
      var10002[g] = var1.s();
      var10002[h] = c<"㺀">(i, j ^ k);
      var10002[l] = c<"㺃">(m & n, o);
      εδδΠηδξΛΣχ.a(var2, var10001, var10002);
      this.c = Boolean.valueOf((boolean)p);
      γοηλιμεπη[] var5 = new γοηλιμεπη[q];
      var5[r] = γοηλιμεπη.a;
      return αΠαβσΠτΦ.a(var2, var5);
   }

   @Generated
   @Override
   public ΩγΛξιχγτ a() {
      return this.M;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  δπςφΩοτσςΠκρβης.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(οΩνΩρωλΨηΛδωδ.C("ѶҘҚѺҞҽҵӋҷ҆ӄҺӈӂҋҰӒӑӉӏӉҞ", (byte)51, 67), δπςφΩοτσςΠκρβης.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΦδφπθΩΩλζξ.C("ұҾҽҀӀҼҷӀӋҺ҇ӅӉӂӅӋҍࠓࠠࠣࠨࠌࠣࠩࠩࠩࠈࠣࠫࠝࠣ\u082fҨ", (byte)51, 67) + var1 + μεςΩΔΣγν.A("ğ", (byte)51, 65) + var2.toString(), var4
         );
      }
   }
}
