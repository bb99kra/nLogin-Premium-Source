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

public class NLoginCore_207 extends NLoginCore_353 {
   private static int t = -1 >>> 247 | -1 << ~247 + 1;
   private static int f = Integer.reverse(0);
   private static long c;
   private static int r = -1 >>> 52 | -1 << ~52 + 1;
   private static long m = Long.reverse(-902175208232066809L);
   private static int c = Integer.reverse(0);
   private static long d = Long.reverse(-1622751148611346169L);
   private static int q = Integer.reverse(1073741824);
   private static long p = Long.reverse(-902175208232066809L);
   private static int h = Integer.reverse(0);
   private static long e = Long.reverse(1873497444986126336L);
   private static int o = Integer.reverse(1073741824);
   private static int u = Integer.reverse(-1073741824);
   private static String[] a = new String[u];
   private static int l = -1 >>> 151 | -1 << ~151 + 1;
   private static int i = Integer.reverse(0);
   private static String[] b = new String[NLoginCore_207.v];
   private static int n = (256 >>> 232 | 256 << ~232 + 1) & -1;
   private static int s = 12582912 >>> 214 | 12582912 << -214;
   private static int k = (33554432 >>> 185 | 33554432 << ~185 + 1) & -1;
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static int j = (4 >>> 224 | 4 << ~224 + 1) & -1;
   private static int v = 196608 >>> 144 | 196608 << -144;

   @Override
   public void b(NLoginInterface_042 var1, String[] var2) {
      if (!(var1 instanceof NLoginCore_277)) {
         NLoginCore_150.a(var1, NLoginCore_487.z);
      } else {
         NLoginCore_277 var3 = (NLoginCore_277)var1;
         NLoginCore_509 var4 = this.a.a().b(var3);
         if (!var4.d(NLoginCore_567.e)) {
            NLoginInterface_024 var5 = var4.a();
            if (var2.length < j) {
               var5.a(a(k & l, m));
            } else {
               String var6 = var2[n];
               if (var6.equals(a(o, p))) {
                  int var7 = NLoginCore_449.a(var2[q], r);
                  int var8 = NLoginCore_449.a(var2[s], t);
                  synchronized (var4.n) {
                     NLoginCore_501 var10 = var4.d(NLoginCore_567.n);
                     if (var10 == null) {
                        return;
                     }

                     NLoginCore_445 var11 = NLoginCore_445.a(var8);
                     if (var11 == null) {
                        return;
                     }

                     NLoginInterface_012 var12 = var10.b();
                     if (var12.a().v() != var7) {
                        return;
                     }

                     var12.a(this.a, var3, var4, var5, var11);
                  }
               }
            }
         }
      }
   }

   public NLoginCore_207(NLoginType_008 var1) {
      super(var1, a(c, d ^ e), null, (boolean)f, (boolean)g);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_207.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_324.A("ŏűųœŷƖƎƤƐşƝƓơƛŤƉƫƪƢƨƢŷ", (byte)84, 65), NLoginCore_207.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_559.C("ԔԡԠӣԣԟԚԣԮԝӪԨԬԥԨԮӰࡾ\u086bࡽ࢈ࡾࢄࡼࡲࢋࡱࡾࢀ\u0892ԉ", (byte)84, 67) + var1 + NLoginCore_471.C("ӫ", (byte)84, 67) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = -2267680980486889833L;
      long var0 = c ^ 4188745449508115615L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(45 + 23),
               (byte)(24 + 45),
               (byte)(20 + 63),
               (byte)(21 + 26),
               (byte)(7 + 60),
               66,
               (byte)(28 + 39),
               (byte)(34 + 13),
               (byte)(64 + 16),
               (byte)(21 + 54),
               (byte)(29 + 38),
               (byte)(66 + 17),
               (byte)(3 + 50),
               (byte)(22 + 58),
               (byte)(79 + 18),
               (byte)(79 + 21),
               (byte)(67 + 33),
               105,
               (byte)(72 + 38),
               (byte)(99 + 4)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(70 + 13)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_110.C("ոդ՟բՉփե։գ֍ջՖ", (byte)115, 67);
               b[1] = NLoginCore_427.D(
                  "եֈփՄբԾքևըՐխՋթ֊ՔղՕ֘մդժ֚\u0557ժ֒՝֍՛սռբցճ֤֛֞չ֪֡֏զևռք֞տֆַօ֭֯չջ֪շնֳּ֡֞֏֖׃վַ֠֗֕։\u05c8ֶ\u05c9\u05ccׅ׃ְ֎ֳ֥\u05c8ֳׅ֒֨ד֤֢֡", (byte)115, 68
               );
               b[2] = NLoginCore_451.A("ƶƹƫǠƯǟǜƷǔƣƥƱǪǡƶǮǍǙƮǍƨǱƸƹ", (byte)115, 65);
               break;
            case 1:
               b[0] = NLoginCore_446.E("գոյ֧֛֘֗֟֩֞֩։֤֭֫֩ֈֻ֫շֻ֭ւփ", (byte)115, 69);
               b[1] = NLoginCore_092.D(
                  "եֈփՄբԾքևըՐխՋթ֊ՔղՕ֘մդժ֚\u0557ժ֒՝֍՛սռբցճ֤֛֞չ֪֡֏զևռք֞տֆַօ֭֯չջ֪շնֳּ֡֞֏֖׃վַ֠֗֕։\u05c8ֶ\u05c9\u05ccׅ׆\u05ceּ֬֎ה֑֓\u05cdז֪זֱ֔֙֗אׂ\u05ceמץ׀",
                  (byte)115,
                  68
               );
               b[2] = NLoginCore_127.E("րփյ֪չ֦֩ց֞խկֲտ\u0590֮օָ֣֊֯ք֥֟նְ֑֮֮֩֎րֆ", (byte)115, 69);
               break;
            case 2:
               b[0] = NLoginCore_387.A("ƙƹƵƚƙƱǗƲǧǓǈƩƢǔǜƭƺǃƩǣƽǒǞǡǤǒǲǯǆǋǑƽ", (byte)115, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_559.D("ձ՚եդմ՚ՠֆՌրջՖ", (byte)115, 68);
         }
      }
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 88L;
      var1 ^= 4188745449508115615L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(38 + 30),
                     (byte)(32 + 37),
                     (byte)(22 + 61),
                     (byte)(39 + 8),
                     (byte)(34 + 33),
                     (byte)(55 + 11),
                     (byte)(51 + 16),
                     (byte)(21 + 26),
                     80,
                     (byte)(46 + 29),
                     (byte)(14 + 53),
                     83,
                     (byte)(48 + 5),
                     (byte)(59 + 21),
                     (byte)(10 + 87),
                     (byte)(25 + 75),
                     (byte)(4 + 96),
                     (byte)(35 + 70),
                     (byte)(74 + 36),
                     (byte)(52 + 51)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(36 + 33), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_091.A("ĐĝĜßğěĖğĪęæĤĨġĤĪìѺѧѹ҄ѺҀѸѮ҇ѭѺѼҎ", (byte)23, 65));
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
}
