package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class NLoginCore_410 extends NLoginCore_374 {
   private static int t = -1 >>> 104 | -1 << ~104 + 1;
   private static long x = Long.reverse(5445769585795913708L);
   private static long i = Long.reverse(-3345256886831294484L);
   private static int an = (0 >>> 87 | 0 << -87) & -1;
   private final String J;
   private static long aj = Long.reverse(-3345256886831294484L);
   private static long am = Long.reverse(-7349874591868649472L);
   private static int ah = (12582912 >>> 53 | 12582912 << ~53 + 1) & -1;
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private final String K;
   private static int ae = Integer.reverse(-1610612736);
   private static int y = (256 >>> 166 | 256 << -166) & -1;
   private static long ab = Long.reverse(-7349874591868649472L);
   private static long ag = Long.reverse(5445769585795913708L);
   private static int d = Integer.reverse(-1);
   private static long aa = Long.reverse(-3345256886831294484L);
   private static int aq = Integer.reverse(-536870912);
   private static long n = Long.reverse(-7349874591868649472L);
   private static int w = Integer.reverse(-1073741824);
   private static int c = Integer.reverse(0);
   private static String[] ZKM_STR_A = new String[NLoginCore_410.ao];
   private static long g = Long.reverse(5445769585795913708L);
   private static String[] ZKM_STR_B = new String[aq];
   private static int ao = Integer.reverse(-536870912);
   private static long u = Long.reverse(5445769585795913708L);
   private static long f;
   private static int s = Integer.reverse(1073741824);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_410.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_091.E("Ժ՜՞Ծբցչ֏ջՊֈվ\u058cֆՏմ֖֕֍֓֍բ", (byte)86, 69), NLoginCore_410.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_127.B("ƎƛƚŝƝƙƔƝƨƗŤƢƦƟƢƨŪӟӹԀӟӔԆԅӻž", (byte)86, 66) + var1 + NLoginCore_027.D("ӱ", (byte)86, 68) + var2.toString(), var4);
      }
   }

   public NLoginCore_410(NLoginType_008 var1, NLoginCore_479 var2, String var3, String var4) {
      super(var1, var2);
      this.J = var3;
      this.K = var4;
   }

   private static String a(int var0, long var1) {
      var1 ^= 89L;
      var1 ^= -6251385979590951707L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(51 + 17),
                     69,
                     (byte)(14 + 69),
                     (byte)(5 + 42),
                     (byte)(3 + 64),
                     (byte)(48 + 18),
                     (byte)(6 + 61),
                     (byte)(46 + 1),
                     (byte)(23 + 57),
                     (byte)(8 + 67),
                     (byte)(13 + 54),
                     83,
                     (byte)(28 + 25),
                     (byte)(58 + 22),
                     (byte)(49 + 48),
                     (byte)(90 + 10),
                     (byte)(82 + 18),
                     (byte)(81 + 24),
                     (byte)(35 + 75),
                     (byte)(53 + 50)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(41 + 27), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_232.F("\u0590֝֜՟֛֖֪֟֟֙զ֤֤֪֨֡լ࣡ࣻं࣡ࣖईइࣽ", (byte)113, 70));
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

   private static void b() {
      f = 4029524966893603211L;
      long var0 = f ^ -6251385979590951707L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(7 + 61),
               (byte)(58 + 11),
               (byte)(55 + 28),
               (byte)(15 + 32),
               (byte)(61 + 6),
               (byte)(30 + 36),
               (byte)(2 + 65),
               47,
               (byte)(15 + 65),
               (byte)(33 + 42),
               (byte)(51 + 16),
               (byte)(44 + 39),
               (byte)(46 + 7),
               (byte)(25 + 55),
               (byte)(95 + 2),
               (byte)(91 + 9),
               (byte)(38 + 62),
               105,
               (byte)(40 + 70),
               (byte)(87 + 16)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(22 + 46), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_427.F("ԚԘԡԙԶԻԘԥՊԼԠԕ", (byte)17, 70);
               ZKM_STR_B[1] = NLoginCore_223.A("îìõíĊďìùĞĐôé", (byte)17, 65);
               ZKM_STR_B[2] = NLoginCore_127.B("ØôÖæòçÿđòĚĖé", (byte)17, 66);
               ZKM_STR_B[3] = NLoginCore_397.D("юкѡЬјхўдгпѡа", (byte)17, 68);
               ZKM_STR_B[4] = NLoginCore_451.B("ēĈÕèĉĖĉĂôĔĚé", (byte)17, 66);
               ZKM_STR_B[5] = NLoginCore_451.A("ÖêæČċéđóČēüé", (byte)17, 65);
               ZKM_STR_B[6] = NLoginCore_427.F("ԒԧԵԁԂԄԴԛԣԥԇՇԱԐԨՑ\u0530ՕԕՄԢԣԹՑՓԵՍԛԔԸբՕԲբ՞ԹԡՅԵլածԧԵ", (byte)17, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_387.A("ČûÓêÞ×ēÚÿĐøé", (byte)17, 65);
               ZKM_STR_B[1] = NLoginCore_127.E("ԂՂԦӻԸԫԟԖՍՄԠԕ", (byte)17, 69);
               ZKM_STR_B[2] = NLoginCore_027.E("ԖԧՉԻԕԉՂԗԢԎԨԕ", (byte)17, 69);
               ZKM_STR_B[3] = NLoginCore_453.F("ՅՇԹԽՈՁՍԫՆԽԤԕ", (byte)17, 70);
               ZKM_STR_B[4] = NLoginCore_575.D("яџэтРѐчўнџеѢШѭэЭЭѥюцѰюлм", (byte)17, 68);
               ZKM_STR_B[5] = NLoginCore_530.D("ьОоФљѧёљувѝа", (byte)17, 68);
               ZKM_STR_B[6] = NLoginCore_387.A("æûĉÕÖØĈï÷ùÛěąäüĥĄĩéĘö÷čĥħĉġïèČĶĩĭķĝİĜĜÿýüĞĲĉ", (byte)17, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_384.A("ÌêċđēđöĘðďíþúÝñĝÜĆěõĊĭôõ", (byte)17, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_027.D("ЙЫјѡтФХкѠсѕѭѪїыйыбѓцЭэѫѠёѻѵќќѝѷѶ", (byte)17, 68);
         }
      }
   }

   @Override
   protected void b(NLoginInterface_042 var1) {
      NLoginCore_219 var2 = new NLoginCore_219(this.J, this.b());
      Set var3 = var2.a(this.K);
      this.j = var3.size();

      for (String var5 : var3) {
         try {
            String var6 = this.K + a(c & d, g) + var5 + a(h, i ^ n);
            this.a(var2, var5, var6);
         } catch (Exception var10) {
            NLoginCore_370.b(
               a(s & t, u) + this.a.getName() + a(w, x) + (var5 == null ? a(y, aa ^ ab) : var5 + a(ae, ag)) + a(ah, aj ^ am), var10
            );
         } finally {
            this.l++;
         }
      }

      var3.clear();
      this.c(var1);
   }

   protected abstract void a(NLoginCore_219 var1, String var2, String var3);

   static {
      b();
   }
}
