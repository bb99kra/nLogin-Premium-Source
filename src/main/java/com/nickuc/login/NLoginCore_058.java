package com.nickuc.login;

import com.nickuc.login.proxy.velocity.nLoginVelocity;
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

public class NLoginCore_058 implements NLoginInterface_030 {
   private static long f = Long.reverse(6548221958800251987L);
   private static long g = Long.reverse(4467570830351532032L);
   private static int a = 0 >>> 107 | 0 << -107;
   private static int b = -1 >>> 34 | -1 << -34;
   private static long c;
   private static int i = (2097152 >>> 20 | 2097152 << -20) & -1;
   private NLoginInterface_031 a;
   private static String[] ZKM_STR_B = new String[i];
   private NLoginCore_033 a;
   private final nLoginVelocity b;
   private final NLoginCore_132 b;
   private static long d = Long.reverse(7268797899179531347L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int h = Integer.reverse(1073741824);
   private static String[] ZKM_STR_A = new String[h];

   @Generated
   @Override
   public NLoginCore_033 a() {
      return this.a;
   }

   private static void b() {
      c = -3874840403891979430L;
      long var0 = c ^ -7442420564017763429L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(7 + 61),
               (byte)(39 + 30),
               (byte)(44 + 39),
               (byte)(40 + 7),
               (byte)(41 + 26),
               (byte)(10 + 56),
               (byte)(23 + 44),
               (byte)(13 + 34),
               (byte)(39 + 41),
               (byte)(42 + 33),
               (byte)(44 + 23),
               (byte)(18 + 65),
               (byte)(19 + 34),
               80,
               (byte)(31 + 66),
               100,
               (byte)(48 + 52),
               (byte)(55 + 50),
               (byte)(20 + 90),
               (byte)(30 + 73)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(64 + 4), (byte)(30 + 39), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_471.B("ǇƠƹƙǍƻƬǏƦƾƢƴơƠƱƓǅƭǅǕǚǋƢƣ", (byte)104, 66);
               ZKM_STR_B[1] = NLoginCore_173.C("ԘՙԲՂգՙէԾգԡԫԵ", (byte)104, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_453.A("ǇƠƹƙǍƻƬǏƦƾƣƽƨǍƷǊǌǓǗƭǌƥƢƣ", (byte)104, 65);
               ZKM_STR_B[1] = NLoginCore_183.D("աԠԻՠ՜ՇԨ՞Ս՝ՄՃԾԲեՁՋոծՑՃթՀՁ", (byte)104, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_433.C("ԲԝԱԽՇՂԪԪԧՁՇծԯաՅհԲշըէզչՀՁ", (byte)104, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_324.A("ƓƶƘǊƈƻƙǎǍƹƍƗ", (byte)104, 65);
         }
      }
   }

   @Override
   public void l() {
      if (this.a != null) {
         NLoginCore_390 var1 = this.b.a();
         var1.c(NLoginCore_132.a);
         var1.c(NLoginCore_132.b);
      }

      this.a = null;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_058.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_004.A("ýğġāĥńļŒľčŋŁŏŉĒķřŘŐŖŐĥ", (byte)43, 65), NLoginCore_058.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_384.A("ĸŅńćŇŃľŇŒŁĎŌŐŉŌŒĔҚҘҟҫҥҜ҇ҀҬҫҨī", (byte)43, 65) + var1 + NLoginCore_201.C("Ѱ", (byte)43, 67) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 124L;
      var1 ^= -7442420564017763429L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(64 + 4),
                     (byte)(60 + 9),
                     (byte)(31 + 52),
                     (byte)(25 + 22),
                     67,
                     (byte)(49 + 17),
                     (byte)(55 + 12),
                     47,
                     (byte)(39 + 41),
                     (byte)(41 + 34),
                     (byte)(18 + 49),
                     (byte)(7 + 76),
                     (byte)(28 + 25),
                     (byte)(15 + 65),
                     (byte)(38 + 59),
                     (byte)(59 + 41),
                     (byte)(93 + 7),
                     (byte)(104 + 1),
                     (byte)(37 + 73),
                     (byte)(90 + 13)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(70 + 13)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_127.E("գհկԲղծթղսլԹշջմշսԿࣅࣃ࣐࣊ࣖࣇࢲࢫ࣓ࣗࣖ", (byte)68, 69));
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

   @Override
   public void k() {
      NLoginType_008 var1 = this.b.a();
      if (this.b.b().j(a(a & b, d))) {
         this.a = new NLoginCore_418(var1);
      } else if (this.b.b().j(a(e, f ^ g))) {
         this.a = new NLoginCore_185();
      } else {
         this.a = null;
      }

      if (this.a == null) {
         NLoginCore_390 var2 = this.b.a();
         var2.a(NLoginCore_132.a, this.b);
         var2.a(NLoginCore_132.b, this.b);
         this.a = new NLoginCore_033(var1);
      }
   }

   static {
      b();
   }

   @Generated
   public NLoginCore_058(nLoginVelocity var1, NLoginCore_132 var2) {
      this.b = var1;
      this.b = var2;
   }

   @Override
   public void a(NLoginType_008 var1, boolean var2) {
      this.k();
   }

   @Generated
   @Override
   public NLoginInterface_031 a() {
      return this.a;
   }
}
