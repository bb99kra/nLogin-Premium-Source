package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_503 extends NLoginCore_353 {
   private static int j = 0 >>> 202 | 0 << -202;
   private static long ak = Long.reverse(4758684495168256122L);
   private static int o = (0 >>> 251 | 0 << ~251 + 1) & -1;
   private static int ac = 128 >>> 7 | 128 << ~7 + 1;
   private static long t = Long.reverse(-3744111601307240326L);
   private static int c = 0 >>> 110 | 0 << -110;
   private static long d = Long.reverse(-3744111601307240326L);
   private static long ae = Long.reverse(4758684495168256122L);
   private static long ao = Long.reverse(4758684495168256122L);
   private static long g = Long.reverse(-3744111601307240326L);
   private static String[] ZKM_STR_B = new String[NLoginCore_503.ar];
   private static long am = Long.reverse(4758684495168256122L);
   private static long e = Long.reverse(-8214565720323784704L);
   private static int ab = Integer.reverse(Integer.MIN_VALUE);
   private static int f = 131072 >>> 81 | 131072 << ~81 + 1;
   private static int ap = 0 >>> 164 | 0 << -164;
   private static int al = Integer.reverse(-536870912);
   private static int aq = (1207959552 >>> 27 | 1207959552 << -27) & -1;
   private static int aa = Integer.reverse(0);
   private static int l = Integer.reverse(0);
   private static int k = 0 >>> 96 | 0 << ~96 + 1;
   private static int x = Integer.reverse(Integer.MIN_VALUE);
   private static int v = Integer.reverse(Integer.MIN_VALUE);
   private static long c;
   private static int w = 0 >>> 156 | 0 << ~156 + 1;
   private static long h = Long.reverse(-8214565720323784704L);
   private static int i = (16 >>> 100 | 16 << -100) & -1;
   private static int y = Integer.reverse(0);
   private static int s = 402653184 >>> 187 | 402653184 << -187;
   private static int q = Integer.reverse(-1);
   private static int af = Integer.reverse(-1610612736);
   private static long ah = Long.reverse(4758684495168256122L);
   private static int aj = (6291456 >>> 148 | 6291456 << -148) & -1;
   private static long r = Long.reverse(4758684495168256122L);
   private static int n = 262144 >>> 82 | 262144 << -82;
   private static long u = Long.reverse(-8214565720323784704L);
   private static int z = Integer.reverse(Integer.MIN_VALUE);
   private static int p = Integer.reverse(1073741824);
   private static int m = Integer.reverse(1073741824);
   private static String[] ZKM_STR_A = new String[aq];
   private static int an = Integer.reverse(268435456);
   private static int ai = 0 >>> 20 | 0 << ~20 + 1;
   private static int ar = '退' >>> 204 | 36864 << -204;
   private static int ag = Integer.reverse(-1);
   private static int ad = (8 >>> 225 | 8 << -225) & -1;

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_503.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_384.E("ԣՅՇԧՋժբոդԳձէյկԸ՝տվնռնՋ", (byte)63, 69), NLoginCore_503.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_183.A("ŠŭŬįůūŦůźũĶŴŸűŴźļҩӏҫӗҸӏӊҸұҷŒ", (byte)63, 65) + var1 + NLoginCore_183.B("ķ", (byte)63, 66) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 113L;
      var1 ^= -9067283583422954456L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     69,
                     (byte)(49 + 34),
                     (byte)(40 + 7),
                     (byte)(9 + 58),
                     (byte)(61 + 5),
                     (byte)(8 + 59),
                     (byte)(22 + 25),
                     (byte)(74 + 6),
                     (byte)(71 + 4),
                     (byte)(52 + 15),
                     (byte)(75 + 8),
                     (byte)(32 + 21),
                     (byte)(77 + 3),
                     (byte)(2 + 95),
                     (byte)(31 + 69),
                     (byte)(56 + 44),
                     (byte)(35 + 70),
                     (byte)(26 + 84),
                     (byte)(38 + 65)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(12 + 71)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_521.D("ѾҋҊэҍ҉҄ҍҘ҇єҒҖҏҒҘњ߇߭߉ߵߖ߭ߨߖߏߕ", (byte)34, 68));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         ZKM_STR_A[var0] = new String(var3.doFinal(Base64.getDecoder().decode(ZKM_STR_B[var0])), StandardCharsets.UTF_8);
      }

      return ZKM_STR_A[var0];
   }

   static {
      b();
   }

   private static void b() {
      c = 6781740645846110259L;
      long var0 = c ^ -9067283583422954456L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(25 + 43),
               (byte)(32 + 37),
               83,
               (byte)(12 + 35),
               (byte)(34 + 33),
               (byte)(63 + 3),
               (byte)(11 + 56),
               (byte)(29 + 18),
               (byte)(12 + 68),
               (byte)(49 + 26),
               (byte)(21 + 46),
               83,
               (byte)(14 + 39),
               (byte)(71 + 9),
               (byte)(10 + 87),
               (byte)(40 + 60),
               (byte)(12 + 88),
               (byte)(104 + 1),
               (byte)(6 + 104),
               (byte)(15 + 88)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(62 + 6), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_451.F("շբօժְր֡ճֈֵմփոֈִִ֪\u058cճ֮ր֜։֊", (byte)122, 70);
               ZKM_STR_B[1] = NLoginCore_575.E("֫ի֙ժեռִ֦֒֙նֶ\u058cղ֑վյ֑֬֊ֱ֜։֊", (byte)122, 69);
               ZKM_STR_B[2] = NLoginCore_201.E("֘\u058b֢֒հւֲֶ֑֥֓ձַ֣ջֈ֟֫շ֍ֲֿ։֊", (byte)122, 69);
               ZKM_STR_B[3] = NLoginCore_384.B("ǋǖǣƧǥƧǉƽǯǎǟǤǢǥǏǈƸǓǔǾƿǙǆǇ", (byte)122, 66);
               ZKM_STR_B[4] = NLoginCore_223.C("՛կժո֓խիղ֘\u0590ս֒֔ւ֓պցֆփ֬֍֍ք֥֜խ֨շճֱ֣֪֖֯֜նֽ֭ռׂ֎օָ\u058b", (byte)122, 67);
               ZKM_STR_B[5] = NLoginCore_471.D("կծ֞ֈկխ՟ծ՝սղճ֛֞֔եթս֍֊հ։նշ", (byte)122, 68);
               ZKM_STR_B[6] = NLoginCore_127.C("Փժղ֠՛֜֍ն՜ռպի", (byte)122, 67);
               ZKM_STR_B[7] = NLoginCore_559.B("ƧǇƽƾǨǋƿǥǆǅƵǠǩƷƶǯǦǌǛǏǚƾǍǐȀǸǽǃǑǚǠȃǵǢǭǸȄǧǮȐǑȄǷǭǠǢǭǛǺǔǾȒǩǷǷȖǶȘȑȆȖǩȔǿ", (byte)122, 66);
               ZKM_STR_B[8] = NLoginCore_530.C("ք\u058bկլջջււճցֆի", (byte)122, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_530.B("ƴƟǂƧǭƽǞưǅǲƱǟƪǂƸǓǴǍǌǬƸǯǆǇ", (byte)122, 66);
               ZKM_STR_B[1] = NLoginCore_471.D("֘\u0558ֆ\u0557Ւթ֓֡տֆաե֥մաիյվֈէ֛չնշ", (byte)122, 68);
               ZKM_STR_B[2] = NLoginCore_027.A("ǕǈǟǏƭƿǎǳǢǯǎǲǮǅƷƵǗǝǛǭǴǉǆǇ", (byte)122, 65);
               ZKM_STR_B[3] = NLoginCore_004.E("֎֦֙ժ֨ժ\u058cրֲ֑֚չ֥֛֪յֻտ֒\u0590־\u058c։֊", (byte)122, 69);
               ZKM_STR_B[4] = NLoginCore_091.D("՛կժո֓խիղ֘\u0590ս֒֔ւ֓պցֆփ֬֍֍ք֥֜խ֨շճֱֱֳּׁ֣֛֣֯֩֡׃ֻׄ\u058b", (byte)122, 68);
               ZKM_STR_B[5] = NLoginCore_173.C("կծ֞ֈկխ՟ծ՝սղ՝մր֨գ֖֗֙ըְ֟նշ", (byte)122, 67);
               ZKM_STR_B[6] = NLoginCore_530.D("հ֊ըճց֢ոՠ֍ցւի", (byte)122, 68);
               ZKM_STR_B[7] = NLoginCore_451.F("ժ֊րց֫֎ւ֨։ֈո֣֬պչֲ֩֏֞֒֝ց\u0590֓׃ֻ׀ֆ֣֔֝׆ְֱָׇֻ֥֪דְְׇֺֽׁ֣֥֔֞֗וֻ֭֬פְֱפֹׅ֧֨ץ", (byte)122, 70);
               ZKM_STR_B[8] = NLoginCore_433.F("ելջլֆփ֒֗֓հ։վ", (byte)122, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_173.F("ջջ\u058b֪֛֍֊֦֗ք֫ճֈոֱ֪֔֩֠\u058cֲ֜։֊", (byte)122, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_453.E("պְգ֒ժֆ֔մւղ֊ֱ֤շ֮֫֟ղցֲ֚֠։֊", (byte)122, 69);
         }
      }
   }

   public NLoginCore_503(NLoginType_008 var1) {
      super(var1, a(c, d ^ e), a(f, g ^ h), (i != 0), (j != 0));
   }

   @Override
   public void b(NLoginInterface_042 var1, String[] var2) {
      if (var1 instanceof NLoginCore_277) {
         NLoginCore_150.a(var1, NLoginCore_487.A);
      } else if (var2.length != m) {
         NLoginCore_487 var9 = NLoginCore_487.x;
         Object[] var11 = new Object[n];
         var11[o] = a(p & q, r) + this.e().toLowerCase(Locale.ENGLISH) + a(s, t ^ u);
         NLoginCore_150.a(var1, var9, var11);
      } else {
         NLoginCore_277 var3 = this.a.b().a(var2[v]);
         if (var3 == null) {
            NLoginCore_150.a(var1, NLoginCore_487.u);
         } else {
            NLoginCore_187 var4 = this.a.a();
            NLoginCore_509 var5 = var4.b(var3);
            ForceRegisterConfig var6 = var5.a();
            if (!var6.h()) {
               NLoginCore_487 var8 = NLoginCore_487.t;
               Object[] var10 = new Object[x];
               var10[y] = var3.getName();
               NLoginCore_150.a(var1, var8, var10);
            } else if (var4.b(var3)) {
               NLoginCore_487 var10001 = NLoginCore_487.F;
               Object[] var10002 = new Object[z];
               var10002[aa] = var3.getName();
               NLoginCore_150.a(var1, var10001, var10002);
            } else {
               this.a.b().a(var6, var3, (ab != 0), (ac != 0));
               String var7 = var6.i();
               NLoginCore_150.a(var1, a(ad, ae) + var7 + a(af & ag, ah));
               NLoginCore_370.b(a(aj, ak) + var7 + a(al, am) + var1.getName() + a(an, ao));
            }
         }
      }
   }
}
