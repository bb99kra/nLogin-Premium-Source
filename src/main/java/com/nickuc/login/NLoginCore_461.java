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

public class NLoginCore_461 implements NLoginInterface_037 {
   private static int m = Integer.reverse(0);
   private static int o = 24 >>> 131 | 24 << -131;
   private static long f = Long.reverse(-3476616474487829497L);
   private static long j = Long.reverse(-3476616474487829497L);
   private static long p = Long.reverse(-3476616474487829497L);
   private static int r = (0 >>> 74 | 0 << ~74 + 1) & -1;
   private static int a = Integer.reverse(0);
   private static long k = Long.reverse(144115188075855872L);
   private static String[] ZKM_STR_B = new String[NLoginCore_461.v];
   private static long c;
   private static int t = Integer.reverse(-1073741824);
   private static long d = Long.reverse(144115188075855872L);
   private static long b = Long.reverse(-3476616474487829497L);
   private static int i = Integer.reverse(1073741824);
   private static int h = Integer.reverse(0);
   private static int s = (4 >>> 65 | 4 << -65) & -1;
   private static long q = Long.reverse(144115188075855872L);
   private static int l = 134217728 >>> 25 | 134217728 << ~25 + 1;
   private static int n = (4194304 >>> 214 | 4194304 << -214) & -1;
   private static long g = Long.reverse(144115188075855872L);
   private static String[] ZKM_STR_A = new String[NLoginCore_461.u];
   private static int u = 512 >>> 7 | 512 << -7;
   private static int v = (4194304 >>> 180 | 4194304 << ~180 + 1) & -1;
   private static int e = Integer.reverse(Integer.MIN_VALUE);

   private String A(String var1) {
      return ((NLoginCore_369)NLoginCore_566.i.a()).E(var1);
   }

   @Override
   public boolean i(String var1, String var2) {
      if (var2.contains(a(a, b ^ d))) {
         var2 = var2.split(a(e, f ^ g))[h];
      }

      String[] var3 = var2.split(a(i, j ^ k));
      if (var3.length != l) {
         return (m != 0);
      } else if (!var3[n].equalsIgnoreCase(a(o, p ^ q))) {
         return (r != 0);
      } else {
         String var4 = var3[s];
         String var5 = var3[t];
         return var5.equals(this.A(this.A(var1) + var4));
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_461.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_127.E("ԧՉՋԫՏծզռըԷյիչճԼափւպրպՏ", (byte)67, 69), NLoginCore_461.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_324.C("ӡӮӭҰӰӬӧӰӻӪҷӵӹӲӵӻҽ\u082fࡃࡉࡘࡏ࠼࠽࠱\u085fӒ", (byte)67, 67) + var1 + NLoginCore_530.D("Ҹ", (byte)67, 68) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 64L;
      var1 ^= 3439807609821044417L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(34 + 35),
                     (byte)(23 + 60),
                     47,
                     (byte)(65 + 2),
                     (byte)(47 + 19),
                     (byte)(53 + 14),
                     (byte)(8 + 39),
                     (byte)(76 + 4),
                     (byte)(47 + 28),
                     (byte)(37 + 30),
                     (byte)(64 + 19),
                     (byte)(15 + 38),
                     (byte)(41 + 39),
                     (byte)(82 + 15),
                     (byte)(27 + 73),
                     (byte)(94 + 6),
                     (byte)(18 + 87),
                     (byte)(100 + 10),
                     (byte)(85 + 18)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(20 + 63)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_183.E("ԮԻԺӽԽԹԴԽՈԷԄՂՆԿՂՈԊࡼ\u0890\u0896ࢥ࢜ࢉࢊࡾࢬ", (byte)15, 69));
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
      c = -2291338796244335629L;
      long var0 = c ^ 3439807609821044417L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(60 + 8),
               (byte)(55 + 14),
               (byte)(25 + 58),
               (byte)(46 + 1),
               (byte)(35 + 32),
               (byte)(57 + 9),
               (byte)(2 + 65),
               (byte)(29 + 18),
               (byte)(75 + 5),
               (byte)(24 + 51),
               (byte)(18 + 49),
               (byte)(69 + 14),
               (byte)(8 + 45),
               80,
               (byte)(15 + 82),
               (byte)(86 + 14),
               100,
               (byte)(27 + 78),
               (byte)(6 + 104),
               (byte)(32 + 71)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(45 + 23), (byte)(55 + 14), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_397.A("ŤŲƊŴūŶƙŽśŞƔŧ", (byte)80, 65);
               ZKM_STR_B[1] = NLoginCore_092.B("ŤŲƊŴūŶƙŽśŞƔŧ", (byte)80, 66);
               ZKM_STR_B[2] = NLoginCore_575.F("ՂՃՒ։ՓՓյթօցիՔ", (byte)80, 70);
               ZKM_STR_B[3] = NLoginCore_471.B("ŸŷƃƙƙƘſŚƌƞŲŧ", (byte)80, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_091.B("ƙƌŷƉūƉŮŰŬŴƔŧ", (byte)80, 66);
               ZKM_STR_B[1] = NLoginCore_324.E("Ս\u0557՜ՂզրՇՔօՠ՟Ք", (byte)80, 69);
               ZKM_STR_B[2] = NLoginCore_141.B("ŸŧƏƐƘƅųũŻƓŝŧ", (byte)80, 66);
               ZKM_STR_B[3] = NLoginCore_530.B("ŸƍƔżƗƗƙƔŬƔŝŧ", (byte)80, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_553.A("ųƙŭƖƛŶƋƎƘŮƌŧ", (byte)80, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_453.D("ԊԒӾәԍӯԗԝԑԢԖӭ", (byte)80, 68);
         }
      }
   }
}
