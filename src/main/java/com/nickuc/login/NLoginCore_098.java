package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class NLoginCore_098 extends NLoginCore_374 {
   private static int ae = (64 >>> 36 | 64 << -36) & -1;
   private static long v = Long.reverse(-2449958197289549824L);
   private static long aa = Long.reverse(-2449958197289549824L);
   protected String O;
   private static long am = Long.reverse(-195416424926246469L);
   private static String[] ZKM_STR_A = new String[NLoginCore_098.az];
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static int bc = 2359296 >>> 178 | 2359296 << ~178 + 1;
   private static int an = Integer.reverse(-536870912);
   private static long g = Long.reverse(-195416424926246469L);
   private static int ak = Integer.reverse(1610612736);
   private static int d = (0 >>> 63 | 0 << -63) & -1;
   private static int ai = (-1 >>> 26 | -1 << -26) & -1;
   private static int aq = Integer.reverse(268435456);
   private static long x = Long.reverse(2542772148515015099L);
   protected String P;
   private static long as = Long.reverse(-195416424926246469L);
   private static int w = (25165824 >>> 87 | 25165824 << ~87 + 1) & -1;
   private static int ah = 81920 >>> 206 | 81920 << -206;
   private static long aj = Long.reverse(-195416424926246469L);
   private static long u = Long.reverse(2542772148515015099L);
   protected String r;
   private static long ag = Long.reverse(-195416424926246469L);
   private static String[] ZKM_STR_B = new String[bc];
   private static int aw = 0 >>> 123 | 0 << ~123 + 1;
   private static long f;
   private static long n = Long.reverse(-2449958197289549824L);
   private static int af = -1 >>> 29 | -1 << ~29 + 1;
   private static int az = Integer.reverse(-1879048192);
   private static int c = (2048 >>> 203 | 2048 << ~203 + 1) & -1;
   private static int t = (1048576 >>> 243 | 1048576 << ~243 + 1) & -1;
   private static long ap = Long.reverse(-195416424926246469L);
   private static long i = Long.reverse(2542772148515015099L);
   private static int s = 0 >>> 60 | 0 << ~60 + 1;

   public NLoginCore_098(NLoginType_008 var1, NLoginCore_479 var2, String var3, @Nullable String var4) {
      this(var1, var2, var3, var4, (c != 0));
   }

   private static void b() {
      f = -2481062280859643196L;
      long var0 = f ^ -2764951779350650524L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(41 + 28),
               (byte)(25 + 58),
               (byte)(43 + 4),
               (byte)(19 + 48),
               (byte)(24 + 42),
               (byte)(5 + 62),
               (byte)(5 + 42),
               (byte)(51 + 29),
               (byte)(72 + 3),
               (byte)(41 + 26),
               (byte)(46 + 37),
               (byte)(33 + 20),
               (byte)(69 + 11),
               (byte)(28 + 69),
               (byte)(43 + 57),
               (byte)(95 + 5),
               (byte)(73 + 32),
               110,
               (byte)(82 + 21)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(51 + 18), (byte)(2 + 81)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_223.B("ÜþĉûāûÞêýÑêêąòóñĐØďûċďæç", (byte)10, 66);
               ZKM_STR_B[1] = NLoginCore_453.F("ԟӸԎԵԚ\u0530ԁԦԒԽՇԎ", (byte)10, 70);
               ZKM_STR_B[2] = NLoginCore_324.D("зРЦЎшябГаѕЪсГющИгЛјЖктоуєРХѕѓѥъѓщЬѣѰољѝЮуЧђл", (byte)10, 68);
               ZKM_STR_B[3] = NLoginCore_183.B("÷àæÎĈďñÓðĕêāÓĎĉØóÛĘÖúùáĒđîďđğĚģãåąĘÿìāäïñĢĖû", (byte)10, 66);
               ZKM_STR_B[4] = NLoginCore_559.B("ÿćÖÌĉçíćðëÑÛ", (byte)10, 66);
               ZKM_STR_B[5] = NLoginCore_559.B("êąÊäêćóûàóĈÛ", (byte)10, 66);
               ZKM_STR_B[6] = NLoginCore_521.D("чнЇнНОЊлъаТЛ", (byte)10, 68);
               ZKM_STR_B[7] = NLoginCore_091.D("ЈэЬЙяафЎнЪвЛ", (byte)10, 68);
               ZKM_STR_B[8] = NLoginCore_173.F("ԏӺӾԿԢԖՀԹԙՁԸՁԂՌӿԖԯԐԯԏԮՀԾՅՉՎՏՆԭԗՉՉԳԝԴՁՌԮ՟ՙԯԶՓԮ", (byte)10, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_223.D("МощлслОЪнБЫѐјеѓьѕэћўжёТѠљѓУѤѤѓњн", (byte)10, 68);
               ZKM_STR_B[1] = NLoginCore_521.B("ÜČàÞÂËćĐÔČĔÛ", (byte)10, 66);
               ZKM_STR_B[2] = NLoginCore_427.F("ԪԓԙԁԻՂԤԆԣՈԝԴԆՁԼԋԦԎՋԉԭԵԱԶՇԓԘՈՆ\u0558ԽՆԚԫԿԷԛ\u0558աԾԦԞգԮ", (byte)10, 70);
               ZKM_STR_B[3] = NLoginCore_384.C("зРЦЎшябГаѕЪсГющИгЛјЖкйСђёЮяёџњѣУѨјњѢщмщѐџѱѴл", (byte)10, 67);
               ZKM_STR_B[4] = NLoginCore_559.C("эЬмтфчуЉЪэфЛ", (byte)10, 67);
               ZKM_STR_B[5] = NLoginCore_471.C("ЧЫЧшЬХютяъЦЛ", (byte)10, 67);
               ZKM_STR_B[6] = NLoginCore_223.C("ИЭФЈЋЩХєШѕОтїЪјШЯўцЗўЩЦЧ", (byte)10, 67);
               ZKM_STR_B[7] = NLoginCore_183.B("êÃÖÅĆåúáĔÞÞÛ", (byte)10, 66);
               ZKM_STR_B[8] = NLoginCore_241.B("ÜÇËČïãčĆæĎąĎÏęÌãüÝüÜûčċĒĖěĜēúäĖĖĂğúåćěĉüĒĶİĕāĳ÷öĸĜĈĞöĉĆć", (byte)10, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_110.D("ЂУОнкЛявуфвЛ", (byte)10, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_201.D("ЗтЮфЩщъпАЮдСѕјУяицєќєџЦЧ", (byte)10, 68);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_098.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_559.C("ӁӣӥӅөԈԀԖԂӑԏԅԓԍӖӻԝԜԔԚԔө", (byte)76, 67), NLoginCore_098.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_138.F("իոշԺպնձպօմՁտփռտօՇࣗࢺࣟࢿ࣑࣐ࣣ࣡ࣨࣘ࣫ࢷࣅ࣪ࣥբ", (byte)76, 70) + var1 + NLoginCore_446.F("Ղ", (byte)76, 70) + var2.toString(), var4
         );
      }
   }

   private void N() {
      if (this.P == null) {
         throw new IllegalArgumentException(a(t, u ^ v));
      } else if (this.P.isEmpty()) {
         throw new IllegalArgumentException(a(w, x ^ aa));
      } else {
         this.f(this.P);
         NLoginCore_171 var1 = this.a(this.d);

         try {
            ResultSet var2 = var1.d();

            while (var2.next() && this.m.N()) {
               try {
                  this.b(var2);
               } catch (Exception var10) {
                  NLoginCore_370.b(
                     a(ae & af, ag)
                        + this.a.getName()
                        + a(ah & ai, aj)
                        + (this.r == null ? a(ak, am) : this.r + a(an, ap))
                        + a(aq, as),
                     var10
                  );
               } finally {
                  this.l++;
               }
            }
         } catch (Throwable var12) {
            if (var1 != null) {
               try {
                  var1.close();
               } catch (Throwable var9) {
                  var12.addSuppressed(var9);
               }
            }

            throw var12;
         }

         if (var1 != null) {
            var1.close();
         }
      }
   }

   protected abstract void c(NLoginCore_219 var1);

   protected NLoginCore_219 a(String var1) {
      return new NLoginCore_219(var1, this.b());
   }

   private static String a(int var0, long var1) {
      var1 ^= 123L;
      var1 ^= -2764951779350650524L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(29 + 39),
                     (byte)(24 + 45),
                     (byte)(58 + 25),
                     (byte)(3 + 44),
                     (byte)(9 + 58),
                     (byte)(57 + 9),
                     67,
                     (byte)(30 + 17),
                     (byte)(77 + 3),
                     (byte)(27 + 48),
                     (byte)(25 + 42),
                     (byte)(11 + 72),
                     (byte)(10 + 43),
                     (byte)(75 + 5),
                     (byte)(40 + 57),
                     (byte)(80 + 20),
                     100,
                     (byte)(6 + 99),
                     (byte)(70 + 40),
                     (byte)(64 + 39)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(51 + 17), 69, (byte)(49 + 34)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_471.F("ԫԸԷӺԺԶԱԺՅԴԁԿՃԼԿՅԇ\u0897ࡺ࢟ࡿࢡ\u0891\u0890ࢨ࢘ࢣࢫࡷࢅࢪࢥ", (byte)12, 70));
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

   public NLoginCore_098(NLoginType_008 var1, NLoginCore_479 var2, String var3, @Nullable String var4, boolean var5) {
      super(var1, var2, var5);
      this.O = var3;
      this.P = var4;
   }

   static {
      b();
   }

   @Override
   protected void b(NLoginInterface_042 var1) {
      NLoginCore_219 var2 = this.a(this.O);
      this.c(var2);
      this.N();
      this.c(var1);
   }

   protected abstract void b(ResultSet var1);

   public NLoginCore_098(NLoginType_008 var1, NLoginCore_479 var2, String var3) {
      this(var1, var2, var3, null);
   }

   protected NLoginCore_171 a(NLoginCore_459 var1) {
      return var1.a(a(d, g) + this.P + a(h, i ^ n));
   }
}
