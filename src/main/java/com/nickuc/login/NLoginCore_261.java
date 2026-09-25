package com.nickuc.login;

import com.nickuc.login.loader.platform.VelocityLoader;
import com.velocitypowered.api.scheduler.ScheduledTask;
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
import lombok.Generated;

public class NLoginCore_261 implements NLoginInterface_048 {
   private boolean M;
   private final String bT;
   private static int b = Integer.reverse(1073741824);
   private static long d = Long.reverse(1515893292477510530L);
   private static long c;
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private static long i = Long.reverse(-5545750923239427198L);
   private static long g = Long.reverse(-5545750923239427198L);
   private final Runnable d;
   private static int l = Integer.reverse(-1073741824);
   private static String[] ZKM_STR_B = new String[l];
   private static String[] ZKM_STR_A = new String[NLoginCore_261.k];
   private ScheduledTask a;
   private static long e = Long.reverse(-6485183463413514240L);
   private static int c = 0 >>> 244 | 0 << -244;
   private static int a = Integer.reverse(1073741824);
   private static int k = (3072 >>> 106 | 3072 << -106) & -1;
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static int h = Integer.MIN_VALUE >>> 94 | Integer.MIN_VALUE << ~94 + 1;

   @Override
   public String t() {
      return this.bT;
   }

   @Override
   public <T> T c() {
      return (T)this.a;
   }

   @Override
   public boolean P() {
      return this.M;
   }

   @Generated
   NLoginCore_261(Runnable var1, String var2) {
      this.d = var1;
      this.bT = var2;
   }

   public NLoginCore_261 a(VelocityLoader var1) {
      if (this.a != null) {
         throw new IllegalStateException(a(c, d ^ e));
      } else {
         this.a = var1.getServer().getScheduler().buildTask(var1, this.d).schedule();
         return this;
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 101L;
      var1 ^= -5739007689949146342L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(20 + 48),
                     (byte)(55 + 14),
                     (byte)(26 + 57),
                     (byte)(25 + 22),
                     (byte)(14 + 53),
                     (byte)(10 + 56),
                     (byte)(32 + 35),
                     (byte)(39 + 8),
                     (byte)(79 + 1),
                     (byte)(30 + 45),
                     (byte)(36 + 31),
                     (byte)(49 + 34),
                     53,
                     (byte)(44 + 36),
                     (byte)(88 + 9),
                     (byte)(83 + 17),
                     (byte)(78 + 22),
                     (byte)(9 + 96),
                     (byte)(11 + 99),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(47 + 36)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_004.F("թնյԸոմկոփղԿսցպսփՅ࣓࣒࣓ࣝࣟࣙࣜࣙࣟࣔ࣪ࣗࣜ\u08e2", (byte)74, 70));
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
      c = 4742046313205567656L;
      long var0 = c ^ -5739007689949146342L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(54 + 15),
               (byte)(48 + 35),
               (byte)(41 + 6),
               (byte)(30 + 37),
               (byte)(19 + 47),
               (byte)(42 + 25),
               (byte)(7 + 40),
               (byte)(45 + 35),
               75,
               (byte)(51 + 16),
               (byte)(5 + 78),
               (byte)(27 + 26),
               (byte)(56 + 24),
               (byte)(95 + 2),
               (byte)(78 + 22),
               (byte)(51 + 49),
               (byte)(46 + 59),
               (byte)(49 + 61),
               (byte)(76 + 27)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(62 + 6), (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_092.C("ՉԫԪՋՃ\u0557ԴԚԲՁ\u0558Ԣ՝աաՔԱԶՂԪ\u0557՞՚՝ԯլԩՇՑՒՑԯ", (byte)99, 67);
               ZKM_STR_B[1] = NLoginCore_004.E("֊լի\u058cք֘յ՛ճւ֙գ֢֢֞֕ղշփի֛֘֟֞հ֭ժֈ֒֓֒հ", (byte)99, 69);
               ZKM_STR_B[2] = NLoginCore_427.A("ưƒƑƲƪƾƛƁƙƨƿƉǄǈǈƻƘƝƩƑƾǅǁǄƖǓƐƮƸƹƸƖ", (byte)99, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_004.B("ưƒƑƲƪƾƛƁƙƨƿƉǄǈǈƻƘƝƩƑƾǁǆƧǌƿƤƏƫƻƧƙƴƽǙƹƞǄƜǅƵǟƟƭ", (byte)99, 66);
               ZKM_STR_B[1] = NLoginCore_241.A("ưƒƑƲƪƾƛƁƙƨƿƉǄǈǈƻƘƝƩƑƾǃƲưƍƤƮƴǒǅƧƴǋǚǉƝǜƚƖƶǦǑƣƭ", (byte)99, 65);
               ZKM_STR_B[2] = NLoginCore_091.B("ưƒƑƲƪƾƛƁƙƨƿƉǄǈǈƻƘƝƩƑƾǉƊǖƪǕƯƓǃƚǕǒ", (byte)99, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_387.A("ŽƮƀƮƣƑżƍƓƛơƝƿǋƪǎƅƗƹƊƩƫƘƙ", (byte)99, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_324.F("֖ղձոո֔֎֙՝֒ղ֛֚ջևց֕֓ջ֪֠յղճ", (byte)99, 70);
         }
      }
   }

   public NLoginCore_261 a(VelocityLoader var1, long var2, long var4, TimeUnit var6) {
      if (this.a != null) {
         throw new IllegalStateException(a(h, i));
      } else {
         this.a = var1.getServer().getScheduler().buildTask(var1, this.d).delay(var2, var6).repeat(var4, var6).schedule();
         return this;
      }
   }

   @Override
   public void Z() {
      if (this.a != null) {
         this.a.cancel();
      }

      this.M = (j != 0);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_261.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_575.F("ӪԌԎӮԒԱԩԿԫӺԸԮԼԶӿԤՆՅԽՃԽԒ", (byte)6, 70), NLoginCore_261.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_433.A("îûú½ýùôýĈ÷ÄĂĆÿĂĈÊѢјѤўѡўїѤјљѯќѡѧä", (byte)6, 65) + var1 + NLoginCore_384.E("Ӽ", (byte)6, 69) + var2.toString(), var4
         );
      }
   }

   NLoginCore_261(NLoginCore_578 var1, Consumer<NLoginInterface_048> var2) {
      this.bT = new Exception().getStackTrace()[b].toString();
      this.d = () -> {
         try {
            var1.b(this);
            var2.accept(this);
         } finally {
            var1.c(this);
         }
      };
   }

   NLoginCore_261(NLoginCore_578 var1, Runnable var2) {
      this.bT = new Exception().getStackTrace()[a].toString();
      this.d = () -> {
         try {
            var1.b(this);
            var2.run();
         } finally {
            var1.c(this);
         }
      };
   }

   public NLoginCore_261 a(VelocityLoader var1, long var2, TimeUnit var4) {
      if (this.a != null) {
         throw new IllegalStateException(a(f, g));
      } else {
         this.a = var1.getServer().getScheduler().buildTask(var1, this.d).delay(var2, var4).schedule();
         return this;
      }
   }
}
