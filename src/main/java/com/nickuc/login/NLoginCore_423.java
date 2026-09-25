package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_423 {
   private final NLoginType_008 r;
   private static int c = (0 >>> 33 | 0 << -33) & -1;
   private static String[] ZKM_STR_A = new String[NLoginCore_423.o];
   private static int a = 1024 >>> 138 | 1024 << ~138 + 1;
   private static int k = 32 >>> 133 | 32 << ~133 + 1;
   private static long g = Long.reverse(8358680908399640576L);
   private static int d = Integer.reverse(0);
   private static int j = Integer.reverse(0);
   private static int i = 2097152 >>> 149 | 2097152 << ~149 + 1;
   private static long f = Long.reverse(7548202719190720634L);
   private static String[] ZKM_STR_B = new String[NLoginCore_423.p];
   private static long c;
   private static long m = Long.reverse(2882303761517117440L);
   private static int o = Integer.reverse(Integer.MIN_VALUE);
   private static long l = Long.reverse(2882303761517117440L);
   private static int h = (32 >>> 101 | 32 << -101) & -1;
   private static int n = Integer.reverse(0);
   private static int p = 33554432 >>> 185 | 33554432 << -185;
   private static int e = 0 >>> 51 | 0 << ~51 + 1;
   private static int b = (1073741824 >>> 254 | 1073741824 << ~254 + 1) & -1;

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_423.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_241.B("ŕŷŹřŽƜƔƪƖťƣƙƧơŪƏƱưƨƮƨŽ", (byte)87, 66), NLoginCore_423.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_521.F("նփւՅօցռօ\u0590տՌ֊֎և֊\u0590Ւࣧ\u08e2࣭࣐ࣩ࣬࣬ࣝզ", (byte)87, 70) + var1 + NLoginCore_446.E("Ս", (byte)87, 69) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 46L;
      var1 ^= 4532489605557390615L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(25 + 43),
                     (byte)(59 + 10),
                     (byte)(45 + 38),
                     (byte)(9 + 38),
                     (byte)(49 + 18),
                     66,
                     (byte)(25 + 42),
                     (byte)(3 + 44),
                     80,
                     (byte)(6 + 69),
                     (byte)(33 + 34),
                     (byte)(70 + 13),
                     (byte)(13 + 40),
                     (byte)(67 + 13),
                     (byte)(80 + 17),
                     (byte)(29 + 71),
                     (byte)(71 + 29),
                     (byte)(97 + 8),
                     (byte)(5 + 105),
                     (byte)(77 + 26)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(33 + 50)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_530.F("խպչԼռոճռևնՃցօվցևՉࣣࣞࣙࣤࣇࣣ࣠ࣔ", (byte)78, 70));
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

   public boolean a(NLoginCore_277 var1, NLoginCore_509 var2) {
      return ((this.a(var1, var2, (a != 0) != 0)) != null ? b : c);
   }

   static {
      b();
   }

   private static void b() {
      c = 6774540089618400022L;
      long var0 = c ^ 4532489605557390615L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(36 + 32),
               (byte)(48 + 21),
               (byte)(52 + 31),
               (byte)(42 + 5),
               67,
               66,
               (byte)(55 + 12),
               (byte)(39 + 8),
               (byte)(64 + 16),
               (byte)(25 + 50),
               (byte)(10 + 57),
               (byte)(66 + 17),
               (byte)(44 + 9),
               (byte)(77 + 3),
               (byte)(50 + 47),
               (byte)(81 + 19),
               (byte)(96 + 4),
               (byte)(100 + 5),
               (byte)(95 + 15),
               (byte)(42 + 61)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(75 + 8)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_397.B("ǜƷǧƳǅƣƥǀƥǈǩǇǚƱǰǋƼǄƲǃƵǧƾƿ", (byte)118, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_387.E("֣վ֮պ\u058cժլևլ֏ְն֍֤հպֵ\u0590ֳ֝ռֈօֆ", (byte)118, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_092.A("ƤǦƺƦǑǈǜǖƴƶǃƧǀƹƺǨǝǲƯǐǣǁƾƿ", (byte)118, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_521.F("ն֩շփ֥֪ռ֛\u0590֡֟պ", (byte)118, 70);
         }
      }
   }

   public NLoginCore_423(NLoginType_008 var1) {
      this.r = var1;
   }

   private NLoginInterface_012 a(NLoginCore_277 var1, NLoginCore_509 var2, boolean var3) {
      boolean var4 = var1.i(a(e, f ^ g));
      var2.a(NLoginCore_567.n);
      boolean var5 = var2.d(NLoginCore_567.e);
      NLoginCore_501 var6 = new NLoginCore_501(this.r, var5, var3, var4);
      NLoginInterface_012 var7 = var6.b(var1, var2);
      if (var7 == null) {
         return null;
      } else {
         var2.a(NLoginCore_567.n, var6);
         if (!var3 && !(var7 instanceof NLoginInterface_039)) {
            var2.a(NLoginCore_567.H, var7);
         } else {
            var7.a(this.r, var1, var2, (h != 0));
            if (var7 instanceof NLoginInterface_039) {
               if (!var3) {
                  var2.a(NLoginCore_567.y, Boolean.valueOf((i != 0)));
               }

               NLoginInterface_039 var8 = (NLoginInterface_039)var7;
               if (var8.at()) {
                  var2.a(NLoginCore_567.z, j);
               }

               if (var8.au()) {
                  this.r.b((k != 0)).a(var3x -> {
                     if (var1.R() && var8.a(var2)) {
                        NLoginCore_150.a(var1, NLoginCore_508.m);
                     } else {
                        var3x.Z();
                     }
                  }, l, m, TimeUnit.SECONDS);
               }
            }
         }

         return var7;
      }
   }

   public NLoginInterface_012 a(NLoginCore_277 var1, NLoginCore_509 var2) {
      return this.a(var1, var2, (d != 0));
   }
}
