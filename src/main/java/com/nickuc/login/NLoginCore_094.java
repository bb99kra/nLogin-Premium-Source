package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public class NLoginCore_094 implements NLoginInterface_048 {
   private static int g = (-1 >>> 203 | -1 << ~203 + 1) & -1;
   private static int s = (-1073741824 >>> 62 | -1073741824 << -62) & -1;
   private static long n = Long.reverse(5476377146882523136L);
   private static int c = 0 >>> 100 | 0 << -100;
   private static int a = Integer.reverse(1073741824);
   private static String[] ZKM_STR_B = new String[NLoginCore_094.t];
   private static long i = Long.reverse(5476377146882523136L);
   private static long o = Long.reverse(5476377146882523136L);
   private final Runnable b;
   private static int r = Integer.reverse(Integer.MIN_VALUE);
   private static long l = Long.reverse(-3009994268975215361L);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static String[] ZKM_STR_A = new String[s];
   private static long m = Long.reverse(6052837899185946624L);
   private static long h = Long.reverse(-9062832168161161985L);
   private final boolean L;
   private static long c;
   private static long q = Long.reverse(5476377146882523136L);
   private boolean M;
   private BukkitTask a;
   private static long p = Long.reverse(5476377146882523136L);
   private final String an;
   private static int b = Integer.reverse(1073741824);
   private static long j = Long.reverse(5476377146882523136L);
   private static int k = Integer.reverse(1073741824);
   private static long e = Long.reverse(6052837899185946624L);
   private static long d = Long.reverse(-3009994268975215361L);
   private static int t = Integer.reverse(-1073741824);

   public NLoginCore_094 a(JavaPlugin var1, long var2, TimeUnit var4) {
      if (var1.isEnabled()) {
         if (this.a != null) {
            throw new IllegalStateException(a(f & g, h));
         }

         this.a = this.L
            ? var1.getServer().getScheduler().runTaskLaterAsynchronously(var1, this.b, var4.toMillis(var2) / i)
            : var1.getServer().getScheduler().runTaskLater(var1, this.b, var4.toMillis(var2) / j);
      }

      return this;
   }

   public NLoginCore_094 a(JavaPlugin var1) {
      if (var1.isEnabled()) {
         if (this.a != null) {
            throw new IllegalStateException(a(c, d ^ e));
         }

         this.a = this.L ? var1.getServer().getScheduler().runTaskAsynchronously(var1, this.b) : var1.getServer().getScheduler().runTask(var1, this.b);
      }

      return this;
   }

   private static String a(int var0, long var1) {
      var1 ^= 42L;
      var1 ^= 6306856239368580023L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(44 + 25),
                     (byte)(73 + 10),
                     (byte)(32 + 15),
                     (byte)(7 + 60),
                     (byte)(63 + 3),
                     (byte)(55 + 12),
                     (byte)(28 + 19),
                     (byte)(76 + 4),
                     75,
                     (byte)(13 + 54),
                     (byte)(73 + 10),
                     (byte)(11 + 42),
                     (byte)(60 + 20),
                     (byte)(35 + 62),
                     (byte)(80 + 20),
                     (byte)(26 + 74),
                     (byte)(40 + 65),
                     (byte)(16 + 94),
                     (byte)(75 + 28)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(64 + 19)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_241.C("ѵ҂ҁф҄Ҁѻ҄ҏѾы҉ҍ҆҉ҏёߡߢ߭ߙߥߨߢ߳", (byte)31, 67));
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
   public boolean P() {
      return this.M;
   }

   @Override
   public <T> T c() {
      return (T)this.a;
   }

   static {
      b();
   }

   NLoginCore_094(boolean var1, NLoginCore_578 var2, Consumer<NLoginInterface_048> var3) {
      this.an = new Exception().getStackTrace()[b].toString();
      this.L = var1;
      this.b = () -> {
         try {
            var2.b(this);
            var3.accept(this);
         } finally {
            var2.c(this);
         }
      };
   }

   public NLoginCore_094 a(JavaPlugin var1, long var2, long var4, TimeUnit var6) {
      if (var1.isEnabled()) {
         if (this.a != null) {
            throw new IllegalStateException(a(k, l ^ m));
         }

         this.a = this.L
            ? var1.getServer().getScheduler().runTaskTimerAsynchronously(var1, this.b, var6.toMillis(var2) / n, var6.toMillis(var4) / o)
            : var1.getServer().getScheduler().runTaskTimer(var1, this.b, var6.toMillis(var2) / p, var6.toMillis(var4) / q);
      }

      return this;
   }

   static void a(JavaPlugin var0) {
      var0.getServer().getScheduler().cancelTasks(var0);
   }

   @Override
   public void Z() {
      if (this.a != null) {
         this.a.cancel();
      }

      this.M = (r != 0);
   }

   private static void b() {
      c = -57803872846324629L;
      long var0 = c ^ 6306856239368580023L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(49 + 19),
               (byte)(34 + 35),
               (byte)(2 + 81),
               (byte)(42 + 5),
               67,
               (byte)(6 + 60),
               (byte)(18 + 49),
               47,
               (byte)(26 + 54),
               (byte)(66 + 9),
               (byte)(3 + 64),
               (byte)(48 + 35),
               (byte)(13 + 40),
               (byte)(5 + 75),
               (byte)(80 + 17),
               (byte)(65 + 35),
               (byte)(40 + 60),
               (byte)(13 + 92),
               (byte)(4 + 106),
               (byte)(37 + 66)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(28 + 41), (byte)(25 + 58)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_141.A("÷ĤĉėúĎüĘĘĒĎēāġıāĄĿĦĺČĦŋĤİıĞĠĩŅĲŊ", (byte)33, 65);
               ZKM_STR_B[1] = NLoginCore_223.E("ԓՀԥԳԖԪԘԴԴԮԪԯԝԽՍԝԠ՛ՂՖԨՂէՀՌՍԺԼՅաՎզ", (byte)33, 69);
               ZKM_STR_B[2] = NLoginCore_521.B("÷ĤĉėúĎüĘĘĒĎēāġıāĄĿĦĺČĦŋĤİıĞĠĩŅĲŊ", (byte)33, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_530.F("ԓՀԥԳԖԪԘԴԴԮԪԯԝԽՍԝԠ՛ՂՖԨԽ՚ԸՖԽԮ՛աձկՇԾԷԳՎՖՆՌՏԼղվՅ", (byte)33, 70);
               ZKM_STR_B[1] = NLoginCore_453.F("ԓՀԥԳԖԪԘԴԴԮԪԯԝԽՍԝԠ՛ՂՖԨԴ\u0557ԶՁԪհՃԮՓԿաՓՒնղԬՈինՐԵծՅ", (byte)33, 70);
               ZKM_STR_B[2] = NLoginCore_553.D("юѻѠѮёѥѓѯѯѩѥѪјѸ҈јћҖѽґѣѵѾҨҥѡҫ҃ѹҢҊқҌҢѭѿѳѲҗѮ҂҈ѲҀ", (byte)33, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_110.D("ѽҍѫѠҏэѶђѬҚҍѠ", (byte)33, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_324.B("ðąĮúüĈĈŁĖľĔĉ", (byte)33, 66);
         }
      }
   }

   NLoginCore_094(boolean var1, NLoginCore_578 var2, Runnable var3) {
      this.an = new Exception().getStackTrace()[a].toString();
      this.L = var1;
      this.b = () -> {
         try {
            var2.b(this);
            var3.run();
         } finally {
            var2.c(this);
         }
      };
   }

   @Override
   public String t() {
      return this.an;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_094.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_387.A("ŅŧũŉŭƌƄƚƆŕƓƉƗƑŚſơƠƘƞƘŭ", (byte)79, 65), NLoginCore_094.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_575.D("ԅԒԑӔԔԐԋԔԟԎӛԙԝԖԙԟӡࡱࡲࡽࡩࡵࡸࡲࢃӵ", (byte)79, 68) + var1 + NLoginCore_232.A("ŗ", (byte)79, 65) + var2.toString(), var4);
      }
   }
}
