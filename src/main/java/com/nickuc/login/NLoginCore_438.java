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

public abstract class NLoginCore_438 implements NLoginInterface_039, NLoginInterface_044 {
   private static int c = Integer.reverse(0);
   private static int l = Integer.reverse(0);
   private static long f = Long.reverse(-8989753833847258271L);
   private static int i = Integer.reverse(0);
   private static String[] ZKM_STR_A = new String[NLoginCore_438.n];
   private static int g = Integer.reverse(0);
   private static int m = (65536 >>> 144 | 65536 << -144) & -1;
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static String[] ZKM_STR_B = new String[NLoginCore_438.o];
   private static int a = Integer.reverse(0);
   private static int b = Integer.reverse(0);
   private static int k = Integer.reverse(0);
   private static int d = 0 >>> 98 | 0 << ~98 + 1;
   private static long c;
   private static int j = 0 >>> 22 | 0 << ~22 + 1;
   private final NLoginCore_211 ar;
   private final NLoginCore_311 d;
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private final NLoginCore_487 c;
   private static int o = 131072 >>> 81 | 131072 << ~81 + 1;
   private static int e = 0 >>> 107 | 0 << -107;

   @Generated
   NLoginCore_438(NLoginCore_211 var1, NLoginCore_311 var2, NLoginCore_487 var3) {
      this.ar = var1;
      this.d = var2;
      this.c = var3;
   }

   private static void b() {
      c = -8736936233762046835L;
      long var0 = c ^ -1230901004390007078L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(55 + 13),
               (byte)(2 + 67),
               (byte)(32 + 51),
               (byte)(31 + 16),
               (byte)(8 + 59),
               (byte)(33 + 33),
               (byte)(30 + 37),
               (byte)(4 + 43),
               (byte)(16 + 64),
               (byte)(9 + 66),
               (byte)(25 + 42),
               (byte)(61 + 22),
               (byte)(27 + 26),
               80,
               (byte)(58 + 39),
               100,
               (byte)(29 + 71),
               (byte)(64 + 41),
               (byte)(86 + 24),
               (byte)(24 + 79)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(43 + 26), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_076.C("ԨԔԢԫԴԜԭԬԵԻԻԠգՍՔԘԤՈՅԲ\u0557ՄԱԲ", (byte)99, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_384.D("ԨԔԢԫԴԜԭԬԵԻԼԛԼԠՒԿԤԽԠՄլՔգՅՂ՜ՉՀԳզմը", (byte)99, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_004.E("ւ֚֎֑֒\u0558֎ր֓ւ֚իր֝տտ՚ն֓֜եօղճ", (byte)99, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_387.C("ԪՐԋԳ\u0530ԶՏԿ՛՝ՎԶԚԺԲ\u0558՞ՑեԶԺԩՎ՝ԩԪԪԮլՃճՀ", (byte)99, 67);
         }
      }
   }

   @Override
   public boolean c(NLoginType_008 var1) {
      return (l != 0);
   }

   static {
      b();
   }

   @Override
   public boolean at() {
      return (m != 0);
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.ar;
   }

   @Generated
   public NLoginCore_311 a() {
      return this.d;
   }

   @Override
   public void b(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      ForceRegisterConfig var4 = var3.a();
      if (this.d.b(var4) != null) {
         NLoginInterface_039.super.b(var1, var2, var3);
      }
   }

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_150.a(var2, this.c);
      return new GUIButtonContainer[k];
   }

   private static String a(int var0, long var1) {
      var1 ^= 76L;
      var1 ^= -1230901004390007078L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(45 + 23),
                     (byte)(17 + 52),
                     (byte)(73 + 10),
                     (byte)(41 + 6),
                     (byte)(5 + 62),
                     (byte)(10 + 56),
                     (byte)(11 + 56),
                     47,
                     (byte)(35 + 45),
                     (byte)(51 + 24),
                     67,
                     (byte)(18 + 65),
                     (byte)(26 + 27),
                     (byte)(74 + 6),
                     (byte)(81 + 16),
                     (byte)(64 + 36),
                     (byte)(75 + 25),
                     (byte)(101 + 4),
                     (byte)(31 + 79),
                     (byte)(87 + 16)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(47 + 21), 69, (byte)(37 + 46)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_092.D("҇ҔғіҖҒҍҖҡҐѝқҟҘқҡѣߞ߾ࠀ߳ߜ߷ߤߗࠃࠃ\u07fb", (byte)37, 68));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_438.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_138.A("ęĻĽĝŁŠŘŮŚĩŧŝūťĮœŵŴŬŲŬŁ", (byte)57, 65), NLoginCore_438.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_521.F("\u0558եդԧէգ՞էղաԮլհթլղԴࢯ࣏࣑ࣄࢭࣈࢵࢨࣔࣔ࣌Ջ", (byte)57, 70) + var1 + NLoginCore_110.B("ī", (byte)57, 66) + var2.toString(), var4
         );
      }
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      if (!this.d.d(var1)) {
         return (a != 0);
      } else if (!this.d.aJ()) {
         return (b != 0);
      } else {
         ForceRegisterConfig var4 = var3.a();
         if (var4.t() && !this.d.aK()) {
            return (c != 0);
         } else if (var4.u() && !this.d.aL()) {
            return (d != 0);
         } else if (var2.i(a(e, f) + this.d.getName())) {
            return (g != 0);
         } else {
            return ((this.d.b(var4) != 0) == null ? h : i);
         }
      }
   }
}
