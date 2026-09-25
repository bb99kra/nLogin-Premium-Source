package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_490 extends NLoginCore_374 {
   private static int bf = Integer.reverse(67108864);
   private static long g = Long.reverse(267765620682996963L);
   private final String I;
   private static int bz = Integer.reverse(-536870912);
   private static int az = 0 >>> 12 | 0 << -12;
   private static long n = Long.reverse(-8811491228095922973L);
   private static int m = Integer.reverse(Integer.MIN_VALUE);
   private static long ay = Long.reverse(-8791026472627208192L);
   private static int ae = Integer.reverse(-1073741824);
   private static int bq = 69632 >>> 107 | 69632 << -107;
   private static long o = Long.reverse(-8791026472627208192L);
   private static int bd = (0 >>> 4 | 0 << -4) & -1;
   private static int w = Integer.reverse(Integer.MIN_VALUE);
   private static int bp = 10223616 >>> 210 | 10223616 << -210;
   private static int t = Integer.reverse(0);
   private static int aw = Integer.reverse(1610612736);
   private static long f;
   private static int cb = Integer.reverse(-536870912);
   private static int bg = 8 >>> 131 | 8 << ~131 + 1;
   private static int d = -1 >>> 20 | -1 << -20;
   private static long aa = Long.reverse(-8811491228095922973L);
   private static int bu = Integer.reverse(1140850688);
   private static int h = (134217728 >>> 91 | 134217728 << -91) & -1;
   private static int bl = (201326592 >>> 186 | 201326592 << ~186 + 1) & -1;
   private static String[] ZKM_STR_A = new String[bz];
   private static long ax = Long.reverse(-8811491228095922973L);
   private static String[] ZKM_STR_B = new String[cb];
   private static int bw = 33554432 >>> 217 | 33554432 << ~217 + 1;
   private static int bc = Integer.reverse(1073741824);
   private static int an = 5242880 >>> 212 | 5242880 << ~212 + 1;
   private static long ap = Long.reverse(-8811491228095922973L);
   private static long ag = Long.reverse(-8811491228095922973L);
   private static int c = 0 >>> 26 | 0 << ~26 + 1;
   private static long as = Long.reverse(-8791026472627208192L);
   private static int s = Integer.reverse(1073741824);
   private static long am = Long.reverse(267765620682996963L);
   private static int bn = (312 >>> 3 | 312 << ~3 + 1) & -1;
   private static int bj = Integer.reverse(Integer.MIN_VALUE);
   private static long aj = Long.reverse(-8791026472627208192L);
   private static int bi = 0 >>> 228 | 0 << ~228 + 1;
   private static int bx = Integer.reverse(Integer.MIN_VALUE);
   private static int y = 536870912 >>> 252 | 536870912 << -252;
   private static long ab = Long.reverse(-8791026472627208192L);
   private static int ak = 65536 >>> 14 | 65536 << ~14 + 1;

   public NLoginCore_490(NLoginType_008 var1, NLoginCore_479 var2) {
      this(var1, var2, a(c & d, g));
   }

   private static void b() {
      f = -4090117337933222495L;
      long var0 = f ^ 797749823862245281L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(19 + 49),
               (byte)(59 + 10),
               (byte)(72 + 11),
               (byte)(7 + 40),
               (byte)(28 + 39),
               (byte)(48 + 18),
               (byte)(26 + 41),
               (byte)(10 + 37),
               80,
               (byte)(24 + 51),
               (byte)(36 + 31),
               (byte)(23 + 60),
               (byte)(25 + 28),
               (byte)(55 + 25),
               (byte)(47 + 50),
               (byte)(64 + 36),
               100,
               (byte)(13 + 92),
               (byte)(38 + 72),
               (byte)(87 + 16)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(61 + 8), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_453.D("ЫѧфхнццѢёиљйѽѸѯошєѸуўѝъы", (byte)22, 68);
               ZKM_STR_B[1] = NLoginCore_183.D("мѲѯвѯѝЮцчѕбп", (byte)22, 68);
               ZKM_STR_B[2] = NLoginCore_451.D("шљѣѭѣѡѳѡхѰеп", (byte)22, 68);
               ZKM_STR_B[3] = NLoginCore_241.D("чѢѝЯєуўчдеѰп", (byte)22, 68);
               ZKM_STR_B[4] = NLoginCore_241.C("оѮвёѮёухѕиѴп", (byte)22, 67);
               ZKM_STR_B[5] = NLoginCore_433.A("àēúĝåúçûêĢåó", (byte)22, 65);
               ZKM_STR_B[6] = NLoginCore_004.B("ßûÜĢĥæöýĜĂĆĀĩćĲČēĶġČĈëĴęěöðĎüþĝČĘłĲēĥĸćĨĢĜļē", (byte)22, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_559.E("ԆՂԟԠԘԡԡԽԬԓԱԟՆԖՊՔՏՔԹ՜ԧԸԥԦ", (byte)22, 69);
               ZKM_STR_B[1] = NLoginCore_232.D("ытоѩђѮЯццѐтп", (byte)22, 68);
               ZKM_STR_B[2] = NLoginCore_241.C("ѭпњпсѕѧѱѪтеп", (byte)22, 67);
               ZKM_STR_B[3] = NLoginCore_027.E("ԳԦՎՂՁԧԪԽԢԢԔԚ", (byte)22, 69);
               ZKM_STR_B[4] = NLoginCore_173.E("ԫՇԇԀԍԇՏԱԨՏՔԐՕԹՈՈ՚՚ԹԿՏԨԥԦ", (byte)22, 69);
               ZKM_STR_B[5] = NLoginCore_387.D("пЭщрѝаѢёэдѰп", (byte)22, 68);
               ZKM_STR_B[6] = NLoginCore_027.E("ԆԢԃՉՌԍԝԤՃԩԭԧՐԮՙԳԺ՝ՈԳԯԒ՛ՀՂԝԗԵԣԥՄԳ՝ՄԤՠՌՆձՇԯՐՉԺ", (byte)22, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_471.B("üåïóēĨąÝęĈýĤĄïþĪĩĐĂĊďķþÿ", (byte)22, 66);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_223.F("ԺՍԶՅԁԘԉՂԅԝԞՂԬԏՖԚԯԱԱՇԞ՞ԥԦ", (byte)22, 70);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_490.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_384.A("ÙûýÝāĠĘĮĚéħĝīĥîēĵĴĬĲĬā", (byte)25, 65), NLoginCore_490.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_446.F("ԸՅՄԇՇՃԾՇՒՁԎՌՐՉՌՒԔ࢞ࢤࢠ\u088fࢠࢴ\u0895ࢱࢤࢣࢸ\u0891Ԭ", (byte)25, 70) + var1 + NLoginCore_173.C("к", (byte)25, 67) + var2.toString(),
            var4
         );
      }
   }

   static {
      b();
   }

   public NLoginCore_490(NLoginType_008 var1, NLoginCore_479 var2, String var3) {
      this(var1, var2, var3, (h != 0));
   }

   private String f(String var1) {
      var1 = var1.trim();
      if (var1.length() >= bc && var1.charAt(bd) == bf) {
         var1 = var1.substring(bg);
      }

      char var2 = var1.charAt(bi);
      char var3 = var1.charAt(var1.length() - bj);
      if (var1.length() >= bl && (var2 == bn && var3 == bp || var2 == bq && var3 == bu)) {
         var1 = var1.substring(bw, var1.length() - bx);
      }

      return var1;
   }

   private static String a(int var0, long var1) {
      var1 ^= 97L;
      var1 ^= 797749823862245281L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(24 + 44),
                     (byte)(19 + 50),
                     (byte)(13 + 70),
                     (byte)(31 + 16),
                     (byte)(27 + 40),
                     (byte)(3 + 63),
                     (byte)(8 + 59),
                     (byte)(19 + 28),
                     (byte)(14 + 66),
                     (byte)(56 + 19),
                     (byte)(52 + 15),
                     (byte)(35 + 48),
                     (byte)(30 + 23),
                     (byte)(78 + 2),
                     (byte)(89 + 8),
                     (byte)(64 + 36),
                     (byte)(73 + 27),
                     105,
                     110,
                     (byte)(28 + 75)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(61 + 7), 69, (byte)(41 + 42)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_092.D("ФбаϳгЯЪгоЭϺимеиоЀފސތݻތޠށޝސޏޤݽ", (byte)4, 68));
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

   protected void h(String var1, String var2) {
      this.a(var1, var2, null, null);
   }

   public NLoginCore_490(NLoginType_008 var1, NLoginCore_479 var2, String var3, boolean var4) {
      super(var1, var2, var4);
      this.I = var3;
   }

   @Override
   protected void b(NLoginInterface_042 var1) {
      File var2 = new File(this.b(), this.I);
      List var3 = NLoginCore_428.a(var2);
      this.j = var3.size();

      for (String var5 : var3) {
         Object var6 = null;

         try {
            String[] var7 = var5.split(a(m, n ^ o));
            if (var7.length >= s) {
               this.h(var7[t], this.f(var7[w]));
            }
         } catch (Exception var11) {
            NLoginCore_370.b(
               a(y, aa ^ ab) + this.a.getName() + a(ae, ag ^ aj) + (var6 == null ? a(ak, am) : var6 + a(an, ap ^ as)) + a(aw, ax ^ ay),
               var11
            );
         } finally {
            this.l++;
         }
      }

      var3.clear();
      this.c(var1);
   }
}
