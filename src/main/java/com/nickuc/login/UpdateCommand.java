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

public class UpdateCommand implements NLoginInterface_010, NLoginInterface_035 {
   private static long q = Long.reverse(995054226442663046L);
   private final NLoginCore_211 T;
   private static long o = Long.reverse(-2463710287377877882L);
   private static long c;
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static int m = Integer.reverse(Integer.MIN_VALUE);
   private static long j = Long.reverse(-2463710287377877882L);
   private static long r = Long.reverse(-3458764513820540928L);
   private static int k = Integer.reverse(1073741824);
   private static int a = 0 >>> 182 | 0 << ~182 + 1;
   private static int g = (131072 >>> 113 | 131072 << -113) & -1;
   private static int f = (0 >>> 247 | 0 << ~247 + 1) & -1;
   private static int s = Integer.reverse(536870912);
   private static int e = 256 >>> 40 | 256 << -40;
   private static String[] ZKM_STR_A = new String[s];
   private static int b = Integer.reverse(-1);
   private static int l = (0 >>> 196 | 0 << -196) & -1;
   private static int t = (Integer.MIN_VALUE >>> 29 | Integer.MIN_VALUE << -29) & -1;
   private static int p = 1572864 >>> 243 | 1572864 << ~243 + 1;
   private static long d = Long.reverse(-2463710287377877882L);
   private static int n = '耀' >>> 'n' | 32768 << -110;
   private static String[] ZKM_STR_B = new String[t];
   private static int h = (0 >>> 42 | 0 << ~42 + 1) & -1;

   @Generated
   public UpdateCommand(NLoginCore_211 var1) {
      this.T = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
      switch (NLoginCore_547.z[var5.ordinal()]) {
         case 1:
         case 2:
            var1.a().a().a(a(n, o), a(p, q ^ r)).ag();
            var1.a().a(var5 == NLoginCore_445.g ? NLoginCore_204.b : NLoginCore_204.c);
            NLoginInterface_035.super.a(var1, var2, var3, var4, var5);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 11L;
      var1 ^= 2869351537434598908L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(50 + 18),
                     (byte)(10 + 59),
                     83,
                     (byte)(42 + 5),
                     (byte)(27 + 40),
                     (byte)(6 + 60),
                     (byte)(12 + 55),
                     (byte)(31 + 16),
                     80,
                     (byte)(48 + 27),
                     (byte)(11 + 56),
                     (byte)(76 + 7),
                     (byte)(26 + 27),
                     (byte)(39 + 41),
                     (byte)(14 + 83),
                     (byte)(75 + 25),
                     (byte)(19 + 81),
                     (byte)(77 + 28),
                     (byte)(26 + 84),
                     (byte)(92 + 11)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(24 + 59)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_559.F("բկծԱձխըձռիԸնպճնռԾࢸࣇ࣒ࣚࣖࣔࣛࢺ", (byte)67, 70));
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
      c = 7002458330251981744L;
      long var0 = c ^ 2869351537434598908L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(61 + 7),
               69,
               (byte)(35 + 48),
               (byte)(41 + 6),
               (byte)(34 + 33),
               (byte)(18 + 48),
               (byte)(61 + 6),
               (byte)(29 + 18),
               (byte)(61 + 19),
               (byte)(6 + 69),
               (byte)(23 + 44),
               (byte)(53 + 30),
               (byte)(5 + 48),
               80,
               (byte)(88 + 9),
               (byte)(49 + 51),
               (byte)(70 + 30),
               (byte)(53 + 52),
               (byte)(104 + 6),
               (byte)(56 + 47)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(31 + 38), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_183.E("Պՙ՜հծՈ\u058c֍վևքհմՌՍե՜֘\u0558֟֒֠էը", (byte)88, 69);
               ZKM_STR_B[1] = NLoginCore_092.B("ŲŷƣūŞŤƏƧźƣżƠƈƑŨƃƎƴƭƇŴƅƂƃ", (byte)88, 66);
               ZKM_STR_B[2] = NLoginCore_110.D("ӳԂԅԙԗӱԵԶԧ\u0530ԭԙԝӵӶԎԅՁԁՈԻՉԐԑ", (byte)88, 68);
               ZKM_STR_B[3] = NLoginCore_453.F("ՍիօՎ֏\u058cՓկՠՍՎ՜", (byte)88, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_092.A("ťŴŷƋƉţƧƨƙƢƟƅƊƩƯƟƈƋƮƦƥƫƂƃ", (byte)88, 65);
               ZKM_STR_B[1] = NLoginCore_553.D("ԀԅԱӹӬӲԝԵԈԱԋԒӿӼӼԏՁՆՄԙԩԘԿԷԎՅԽՈՎԌՂԤ", (byte)88, 68);
               ZKM_STR_B[2] = NLoginCore_201.F("Պՙ՜հծՈ\u058c֍վևփդխ֊֚֔չվՕ֠՜պէը", (byte)88, 70);
               ZKM_STR_B[3] = NLoginCore_427.C("ӮԳԨӲԵӶԵԛԋӵԌԅ", (byte)88, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_092.C("ӵԀԹԡԹӱԭԐԌԳԔԅ", (byte)88, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_173.C("ӲԥԁԆӹԗԳԇԮԛӹԗԫԣӼԠԂՇԹԞԥԓԐԑ", (byte)88, 67);
         }
      }
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.T;
   }

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_237 var10001 = NLoginCore_237.f;
      Object[] var10002 = new Object[g];
      var10002[h] = a(i, j);
      NLoginCore_150.a(var2, var10001, var10002);
      NLoginCore_445[] var5 = new NLoginCore_445[k];
      var5[l] = NLoginCore_445.g;
      var5[m] = NLoginCore_445.h;
      return GUIButtonContainer.a(var2, var5);
   }

   static {
      b();
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      return ((!var1.a() != 0).p() && var1.a().a().c(a(a & b, d)) ? f : e);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  UpdateCommand.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_110.C("АвдДиїяѥёРўєѢќХъѬѫѣѩѣи", (byte)17, 67), UpdateCommand.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_324.B("ĄđĐÓēďĊēĞčÚĘĜĕĘĞàњѩѼѸѶѴѽќô", (byte)17, 66) + var1 + NLoginCore_138.F("ԇ", (byte)17, 70) + var2.toString(), var4);
      }
   }
}
