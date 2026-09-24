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

public class σνφφΨπςβ {
   private final ΨγημιδξΓτοθαζ r;
   private static int c = (0 >>> 33 | 0 << -33) & -1;
   private static String[] a = new String[σνφφΨπςβ.o];
   private static int a = 1024 >>> 138 | 1024 << ~138 + 1;
   private static int k = 32 >>> 133 | 32 << ~133 + 1;
   private static long g = Long.reverse(8358680908399640576L);
   private static int d = Integer.reverse(0);
   private static int j = Integer.reverse(0);
   private static int i = 2097152 >>> 149 | 2097152 << ~149 + 1;
   private static long f = Long.reverse(7548202719190720634L);
   private static String[] b = new String[σνφφΨπςβ.p];
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
                  σνφφΨπςβ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΣερμΔσατσκ.B("ŕŷŹřŽƜƔƪƖťƣƙƧơŪƏƱưƨƮƨŽ", (byte)87, 66), σνφφΨπςβ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            μεςΩΔΣγν.F("նփւՅօցռօ\u0590տՌ֊֎և֊\u0590Ւࣧ\u08e2࣭࣐ࣩ࣬࣬ࣝզ", (byte)87, 70) + var1 + μζξτΩσσφυδεπλΨ.E("Ս", (byte)87, 69) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 46L;
      var1 ^= 4532489605557390615L;
      if (a[var0] == null) {
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
            throw new RuntimeException(θεωψξβΛσσ.F("խպչԼռոճռևնՃցօվցևՉࣣࣞࣙࣤࣇࣣ࣠ࣔ", (byte)78, 70));
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

   public boolean a(ΨαχΨχΣλεΠψΦ var1, ιηοψσγξςΩγδ var2) {
      return (boolean)(this.a(var1, var2, (boolean)a) != null ? b : c);
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
               b[0] = οΩνΩρωλΨηΛδωδ.B("ǜƷǧƳǅƣƥǀƥǈǩǇǚƱǰǋƼǄƲǃƵǧƾƿ", (byte)118, 66);
               break;
            case 1:
               b[0] = χΠξΦιζΨΣωΦσΨζ.E("֣վ֮պ\u058cժլևլ֏ְն֍֤հպֵ\u0590ֳ֝ռֈօֆ", (byte)118, 69);
               break;
            case 2:
               b[0] = ζοηκορΦνΣθγΩ.A("ƤǦƺƦǑǈǜǖƴƶǃƧǀƹƺǨǝǲƯǐǣǁƾƿ", (byte)118, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = μεςΩΔΣγν.F("ն֩շփ֥֪ռ֛\u0590֡֟պ", (byte)118, 70);
         }
      }
   }

   public σνφφΨπςβ(ΨγημιδξΓτοθαζ var1) {
      this.r = var1;
   }

   private εβοςοηΦςψμνςωξΛ a(ΨαχΨχΣλεΠψΦ var1, ιηοψσγξςΩγδ var2, boolean var3) {
      boolean var4 = var1.i(c<"㺀">(e, f ^ g));
      var2.a(πβκνλοΛκΠδΦτφλ.n);
      boolean var5 = var2.d(πβκνλοΛκΠδΦτφλ.e);
      κμΨχΩρεφπβ var6 = new κμΨχΩρεφπβ(this.r, var5, var3, var4);
      εβοςοηΦςψμνςωξΛ var7 = var6.b(var1, var2);
      if (var7 == null) {
         return null;
      } else {
         var2.a(πβκνλοΛκΠδΦτφλ.n, var6);
         if (!var3 && !(var7 instanceof ΨψμΛροςζ)) {
            var2.a(πβκνλοΛκΠδΦτφλ.H, var7);
         } else {
            var7.a(this.r, var1, var2, (boolean)h);
            if (var7 instanceof ΨψμΛροςζ) {
               if (!var3) {
                  var2.a(πβκνλοΛκΠδΦτφλ.y, Boolean.valueOf((boolean)i));
               }

               ΨψμΛροςζ var8 = (ΨψμΛροςζ)var7;
               if (var8.at()) {
                  var2.a(πβκνλοΛκΠδΦτφλ.z, j);
               }

               if (var8.au()) {
                  this.r.b((boolean)k).a(var3x -> {
                     if (var1.R() && var8.a(var2)) {
                        εδδΠηδξΛΣχ.a(var1, αΦαοΓηντσθΩαλΛ.m);
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

   public εβοςοηΦςψμνςωξΛ a(ΨαχΨχΣλεΠψΦ var1, ιηοψσγξςΩγδ var2) {
      return this.a(var1, var2, (boolean)d);
   }
}
