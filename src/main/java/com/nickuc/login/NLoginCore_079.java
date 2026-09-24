package com.nickuc.login;

import io.papermc.paper.threadedregions.scheduler.ScheduledTask;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class NLoginCore_079 implements NLoginInterface_048 {
   private static long d = Long.reverse(-2028287012880967597L);
   private final boolean O;
   private static int r = (4096 >>> 108 | 4096 << -108) & -1;
   private static int s = 24 >>> 99 | 24 << ~99 + 1;
   private static long i = Long.reverse(5476377146882523136L);
   private static String[] a = new String[s];
   private static long e = Long.reverse(-5188146770730811392L);
   private static long g = Long.reverse(-2028287012880967597L);
   private static long q = Long.reverse(5476377146882523136L);
   private static int c = Integer.reverse(0);
   private static int k = Integer.reverse(1073741824);
   private ScheduledTask a;
   private static long l = Long.reverse(-2028287012880967597L);
   @Nullable
   private final Player c;
   private static int t = (1572864 >>> 115 | 1572864 << ~115 + 1) & -1;
   private static String[] b = new String[t];
   private final Consumer<ScheduledTask> a;
   private boolean M;
   private static long h = Long.reverse(-5188146770730811392L);
   private static long j = Long.reverse(5476377146882523136L);
   private final String ao;
   private static int f = (512 >>> 105 | 512 << -105) & -1;
   private static int b = Integer.reverse(1073741824);
   private static int a = Integer.reverse(1073741824);
   private static long c;
   private static long n = Long.reverse(5476377146882523136L);
   private static long p = Long.reverse(5476377146882523136L);
   private static long o = Long.reverse(5476377146882523136L);
   private static long m = Long.reverse(-5188146770730811392L);

   @Override
   public <T> T c() {
      return (T)this.a;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_079.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_223.B("ŃťŧŇūƊƂƘƄœƑƇƕƏŘŽƟƞƖƜƖū", (byte)78, 66), NLoginCore_079.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_004.A("žƋƊōƍƉƄƍƘƇŔƒƖƏƒƘŚӳӵӨӭӣӪӦӫӗӽӭű", (byte)78, 65) + var1 + NLoginCore_521.D("ә", (byte)78, 68) + var2.toString(), var4);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 29L;
      var1 ^= 9118004334000895825L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(30 + 38),
                     69,
                     (byte)(49 + 34),
                     47,
                     (byte)(59 + 8),
                     (byte)(21 + 45),
                     (byte)(29 + 38),
                     (byte)(14 + 33),
                     (byte)(29 + 51),
                     (byte)(31 + 44),
                     (byte)(66 + 1),
                     (byte)(79 + 4),
                     (byte)(26 + 27),
                     (byte)(63 + 17),
                     (byte)(49 + 48),
                     (byte)(16 + 84),
                     (byte)(26 + 74),
                     (byte)(22 + 83),
                     (byte)(38 + 72),
                     (byte)(69 + 34)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(5 + 63), (byte)(39 + 30), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_553.C("ѻ҈҇ъҊ҆ҁҊҕ҄ёҏғҌҏҕї߲߰ߥߪߠߧߣߨߔߺߪ", (byte)33, 67));
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

   public NLoginCore_079 a(JavaPlugin var1, long var2, long var4, TimeUnit var6) {
      if (var1.isEnabled()) {
         if (this.a != null) {
            throw new IllegalStateException(a(k, l ^ m));
         }

         this.a = this.c != null
            ? this.c.getScheduler().runAtFixedRate(var1, this.a, () -> this.a.accept(null), var6.toMillis(var2) / n, var6.toMillis(var4) / o)
            : (
               this.O
                  ? Bukkit.getAsyncScheduler().runAtFixedRate(var1, this.a, var2, var4, var6)
                  : Bukkit.getGlobalRegionScheduler().runAtFixedRate(var1, this.a, var6.toMillis(var2) / p, var6.toMillis(var4) / q)
            );
      }

      return this;
   }

   @Override
   public String t() {
      return this.ao;
   }

   @Override
   public void Z() {
      if (this.a != null) {
         this.a.cancel();
      }

      this.M = (boolean)r;
   }

   static void a(JavaPlugin var0) {
      Bukkit.getAsyncScheduler().cancelTasks(var0);
      Bukkit.getGlobalRegionScheduler().cancelTasks(var0);
   }

   @Override
   public boolean P() {
      return this.M;
   }

   public NLoginCore_079 a(JavaPlugin var1) {
      if (var1.isEnabled()) {
         if (this.a != null) {
            throw new IllegalStateException(a(c, d ^ e));
         }

         this.a = this.c != null
            ? this.c.getScheduler().run(var1, this.a, () -> this.a.accept(null))
            : (this.O ? Bukkit.getAsyncScheduler().runNow(var1, this.a) : Bukkit.getGlobalRegionScheduler().run(var1, this.a));
      }

      return this;
   }

   private static void b() {
      c = -3884199223645152313L;
      long var0 = c ^ 9118004334000895825L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(67 + 1),
               (byte)(53 + 16),
               (byte)(55 + 28),
               (byte)(39 + 8),
               (byte)(42 + 25),
               (byte)(4 + 62),
               67,
               (byte)(23 + 24),
               (byte)(73 + 7),
               (byte)(32 + 43),
               (byte)(5 + 62),
               (byte)(30 + 53),
               (byte)(2 + 51),
               (byte)(50 + 30),
               97,
               (byte)(9 + 91),
               (byte)(21 + 79),
               (byte)(61 + 44),
               (byte)(93 + 17),
               (byte)(73 + 30)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(51 + 18), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_324.E("ՂՅաճԫՅՌՕՓՏԯՇ\u0557ԹհՌ\u0558ՐՉՎՀԶզՆՃ\u0558Ֆդսյդ՝", (byte)58, 69);
               b[1] = NLoginCore_138.B("ĿłŞŰĨłŉŒŐŌĬńŔĶŭŉŕōņŋĽĳţŃŀŕœšźŲšŚ", (byte)58, 66);
               b[2] = NLoginCore_387.E("ՂՅաճԫՅՌՕՓՏԯՇ\u0557ԹհՌ\u0558ՐՉՎՀԶզՆՃ\u0558Ֆդսյդ՝", (byte)58, 69);
               break;
            case 1:
               b[0] = NLoginCore_138.C("үҲӎӠҘҲҹӂӀҼҜҴӄҦӝҹӅҽҶһҭұӆӝӴҳӆӠӴӤӢӶӖӴӴҸӏӯӱӯӭӼӰӋ", (byte)58, 67);
               b[1] = NLoginCore_183.E("ՂՅաճԫՅՌՕՓՏԯՇ\u0557ԹհՌ\u0558ՐՉՎՀԺգւԽքժց\u0558քսՈծի\u058bտ՞ծ֍֏\u0590ՕՔ՞", (byte)58, 69);
               b[2] = NLoginCore_451.C("үҲӎӠҘҲҹӂӀҼҜҴӄҦӝҹӅҽҶһҭүҼӳҦӪӈҩӣӭӕӭӗӹӧҽӷӠӶһӯҷӰӋ", (byte)58, 67);
               break;
            case 2:
               b[0] = NLoginCore_141.B("īŅŧřĻŏŞųŵŕıŇņŘŏĶźĶśĵŉŉņŇ", (byte)58, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_141.D("ғҲҨӑӠӢӐҕҰқӗӠҧӉҾӋӊҦҧӇҾӯҶҷ", (byte)58, 68);
         }
      }
   }

   NLoginCore_079(@Nullable Player var1, boolean var2, NLoginCore_578 var3, Consumer<NLoginInterface_048> var4) {
      this.ao = new Exception().getStackTrace()[b].toString();
      this.O = var2;
      this.c = var1;
      this.a = var3x -> {
         try {
            var3.b(this);
            var4.accept(this);
         } finally {
            var3.c(this);
         }
      };
   }

   static {
      b();
   }

   NLoginCore_079(@Nullable Player var1, boolean var2, NLoginCore_578 var3, Runnable var4) {
      this.ao = new Exception().getStackTrace()[a].toString();
      this.O = var2;
      this.c = var1;
      this.a = var3x -> {
         try {
            var3.b(this);
            var4.run();
         } finally {
            var3.c(this);
         }
      };
   }

   public NLoginCore_079 a(JavaPlugin var1, long var2, TimeUnit var4) {
      if (var1.isEnabled()) {
         if (this.a != null) {
            throw new IllegalStateException(a(f, g ^ h));
         }

         this.a = this.c != null
            ? this.c.getScheduler().runDelayed(var1, this.a, () -> this.a.accept(null), var4.toMillis(var2) / i)
            : (
               this.O
                  ? Bukkit.getAsyncScheduler().runDelayed(var1, this.a, var2, var4)
                  : Bukkit.getGlobalRegionScheduler().runDelayed(var1, this.a, var4.toMillis(var2) / j)
            );
      }

      return this;
   }
}
