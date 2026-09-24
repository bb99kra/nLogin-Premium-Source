package com.nickuc.login;

import com.nickuc.login.lib.caffeine.cache.Cache;
import com.nickuc.login.lib.caffeine.cache.Caffeine;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_073 {
   private static long e = Long.reverse(-432345564227567616L);
   private static long g = Long.reverse(-6329595938288172772L);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static int k = Integer.reverse(-1073741824);
   private static final Cache<String, NLoginCore_184> j = Caffeine.newBuilder().expireAfterWrite(NLoginCore_073.n, TimeUnit.SECONDS).build();
   private static int l = Integer.reverse(-1073741824);
   private static long c;
   private static final Cache<String, NLoginCore_280> i = Caffeine.newBuilder().expireAfterWrite(NLoginCore_073.m, TimeUnit.SECONDS).build();
   private static long d = Long.reverse(-6329595938288172772L);
   private static int a = Integer.reverse(0);
   private static int b = (0 >>> 37 | 0 << -37) & -1;
   private static long n = Long.reverse(-5476377146882523136L);
   private static long j = Long.reverse(5920195048159576348L);
   private static long m = Long.reverse(-1152921504606846976L);
   private static String[] b = new String[l];
   private static int i = (536870912 >>> 220 | 536870912 << -220) & -1;
   private static long h = Long.reverse(-432345564227567616L);
   private static String[] a = new String[k];

   public static void a(String var0, String var1, NLoginCore_280 var2) {
      String var3 = var0 + var1;
      if (var2 != NLoginCore_280.a) {
         i.put(var3, var2);
      } else {
         i.invalidate(var3);
      }
   }

   static {
      b();
   }

   public static NLoginCore_280 a(String var0, InetAddress var1) {
      String var2 = var0 + var1.getHostAddress();
      NLoginCore_280 var3 = (NLoginCore_280)i.getIfPresent(var2);
      return var3 != null ? var3 : NLoginCore_280.a;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_073.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_559.E("ӰԒԔӴԘԷԯՅԱԀԾԴՂԼԅԪՌՋՃՉՃԘ", (byte)12, 69), NLoginCore_073.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_453.C("мщшЋычтыіхВѐєэѐіИާޥޯޖޫެޯ\u07b9ްЭ", (byte)12, 67) + var1 + NLoginCore_241.A("Ñ", (byte)12, 65) + var2.toString(), var4
         );
      }
   }

   public static void a(NLoginType_008 var0, String var1, InetAddress var2, NLoginCore_280 var3) {
      String var4 = var2.getHostAddress();
      a(var0, var1, var4, var3);
      a(var1, var4, var3);
   }

   public static void a(NLoginType_008 var0, String var1, InetAddress var2, NLoginCore_184 var3) {
      String var4 = var2.getHostAddress();
      a(var0, var1, var4, var3);
      a(var1, var4, var3);
   }

   private static void a(NLoginType_008 var0, String var1, String var2, Enum<?> var3) {
      NLoginCore_193 var4 = var0.a();
      if (var4 != null) {
         var4.a(a, var3x -> {
            var3x.put(a(b, d ^ e), var1);
            var3x.put(a(f, g ^ h), var2);
            var3x.put(a(i, j), var3.name());
         });
      }
   }

   public static void a(String var0, String var1, NLoginCore_184 var2) {
      String var3 = var0 + var1;
      if (var2 != NLoginCore_184.a) {
         j.put(var3, var2);
      } else {
         j.invalidate(var3);
      }
   }

   private static void b() {
      c = 4071299666573202453L;
      long var0 = c ^ 8110583050526624548L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(56 + 12),
               (byte)(38 + 31),
               (byte)(9 + 74),
               (byte)(22 + 25),
               (byte)(52 + 15),
               (byte)(14 + 52),
               (byte)(42 + 25),
               47,
               (byte)(17 + 63),
               (byte)(7 + 68),
               (byte)(37 + 30),
               (byte)(35 + 48),
               (byte)(11 + 42),
               80,
               (byte)(43 + 54),
               (byte)(96 + 4),
               (byte)(54 + 46),
               (byte)(100 + 5),
               (byte)(34 + 76),
               (byte)(71 + 32)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(54 + 15), (byte)(55 + 28)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_553.D("վՎըըչպէՠՋհՎ՜", (byte)117, 68);
               b[1] = NLoginCore_027.E("֨ա֍֘։ժիրթծռչ", (byte)117, 69);
               b[2] = NLoginCore_397.D("ւ֍փ\u0558\u058bօև\u0590տ՞֕՜", (byte)117, 68);
               break;
            case 1:
               b[0] = NLoginCore_324.A("ǃƷǓƟƴƽǘƥǫǥƫǬƨǪǏǅƾǴǰǶǪǵƼƽ", (byte)117, 65);
               b[1] = NLoginCore_183.E("֔տ֦֜֙լ֍չփ֒իչ", (byte)117, 69);
               b[2] = NLoginCore_173.D("Ս՞֎ձՃ։՞ՌՇւի՜", (byte)117, 68);
               break;
            case 2:
               b[0] = NLoginCore_521.B("ƙǋƶƾǃǥƲǘǤƫƦǚǉƹƪǈǑǈǦǑǉǏƼƽ", (byte)117, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_559.D("ւ֍էտֆՠ֏՝՟ֆ֑՜", (byte)117, 68);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 95L;
      var1 ^= 8110583050526624548L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(37 + 31),
                     (byte)(55 + 14),
                     (byte)(74 + 9),
                     (byte)(8 + 39),
                     (byte)(26 + 41),
                     (byte)(19 + 47),
                     (byte)(6 + 61),
                     (byte)(6 + 41),
                     (byte)(18 + 62),
                     75,
                     (byte)(58 + 9),
                     (byte)(18 + 65),
                     (byte)(27 + 26),
                     (byte)(5 + 75),
                     (byte)(57 + 40),
                     (byte)(57 + 43),
                     (byte)(91 + 9),
                     (byte)(73 + 32),
                     (byte)(21 + 89),
                     (byte)(87 + 16)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(20 + 48), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_387.A("ŚŧŦĩũťŠũŴţİŮŲūŮŴĶӅӃӍҴӉӊӍӗӎ", (byte)60, 65));
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

   public static NLoginCore_184 a(String var0, InetAddress var1) {
      String var2 = var0 + var1.getHostAddress();
      NLoginCore_184 var3 = (NLoginCore_184)j.getIfPresent(var2);
      return var3 != null ? var3 : NLoginCore_184.a;
   }
}
