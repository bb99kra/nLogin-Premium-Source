package com.nickuc.login;

import com.nickuc.login.tasks.LoginMainQueueTask;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public abstract class NLoginCore_045 implements NLoginInterface_018 {
   private static int a = 0 >>> 69 | 0 << -69;
   private static int b = -1 >>> 18 | -1 << -18;
   private static long d = Long.reverse(-5633535642304351213L);
   private final NLoginInterface_011<?> a;
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int i = Integer.reverse(0);
   private static long f = Long.reverse(-5633535642304351213L);
   private static String[] b = new String[NLoginCore_045.k];
   private static int k = 6291456 >>> 213 | 6291456 << ~213 + 1;
   private static long h = Long.reverse(-5633535642304351213L);
   private static long c;
   private static int g = Integer.reverse(1073741824);
   private static int j = (402653184 >>> 187 | 402653184 << -187) & -1;
   private static String[] a = new String[j];

   public abstract void f();

   public abstract void e();

   @Override
   public boolean a() {
      NLoginType_008 var1 = this.a.b();
      return NLoginCore_195.e(var1);
   }

   static {
      d();
   }

   private static void d() {
      c = -4022190167273665611L;
      long var0 = c ^ 4908028074845238875L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(30 + 38),
               (byte)(14 + 55),
               (byte)(25 + 58),
               (byte)(44 + 3),
               (byte)(22 + 45),
               (byte)(15 + 51),
               (byte)(66 + 1),
               (byte)(3 + 44),
               (byte)(62 + 18),
               (byte)(39 + 36),
               67,
               (byte)(38 + 45),
               (byte)(33 + 20),
               (byte)(6 + 74),
               97,
               (byte)(76 + 24),
               (byte)(65 + 35),
               (byte)(52 + 53),
               (byte)(4 + 106),
               (byte)(87 + 16)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(35 + 34), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_076.A("ƸƤǈƗƿƽǈƛǐǂƲƎơǓƕƔƶƩƜƟǟǏƦƧ", (byte)106, 65);
               b[1] = NLoginCore_553.A("ƺƉƺƊƌƩƞǀǆƬƮƶǕƑǄƭǑƩƿǍƬƹƦƧ", (byte)106, 65);
               b[2] = NLoginCore_453.F("՞ճ֍՞լկ֓ղ֡ռց֣\u058b֔֊֎֎֍թ֎լֲչպ", (byte)106, 70);
               break;
            case 1:
               b[0] = NLoginCore_092.F("\u058bշ֛ժ֒\u0590֛ծ֣֕ևշֆգ֧֫լ֊օ֭ռְ֔կր֠հ֫խ֘կ֭", (byte)106, 70);
               b[1] = NLoginCore_027.A("ƺƉƺƊƌƩƞǀǆƬưƳƔƓƧǃƴƏƞƿƲƽǜƹǣǚǀǓƟƢǦƧ", (byte)106, 65);
               b[2] = NLoginCore_027.E("՞ճ֍՞լկ֓ղ֡ռփ֜ջ֧շ֚֍վէֱֲ֒չպ", (byte)106, 69);
               break;
            case 2:
               b[0] = NLoginCore_241.D("՛ԵՖԦ՝ՅԼՔՆմՕՀՙըԲդթ՝ՑէցՉՆՇ", (byte)106, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_553.B("ƪƤƶƷǆƍƝƭƵǇƮƛ", (byte)106, 66);
         }
      }
   }

   @Override
   public void b() {
      NLoginType_008 var1 = this.a.b();
      this.e();
      NLoginCore_276 var2 = var1.a();
      var2.r();
      NLoginCore_535.a(this.a.b().a(), var2);
      LoginMainQueueTask.p(var1);
      NLoginCore_187 var3 = var1.a();
      var1.b().c().forEach(var2x -> {
         if (!var2x.S()) {
            NLoginCore_509 var3x = var3.a(var2x);
            if (var3x != null) {
               var1.b().a().c(var2x, var3.b(var2x));
            } else {
               var2x.a(NLoginCore_150.a(NLoginCore_487.R));
            }
         }
      });
      NLoginCore_374.b(var1);
      NLoginCore_203 var4 = var1.a().a();
      var4.a(a(a & b, d), var1.a().a());
      var4.a(a(e, f), NLoginCore_150.aC());
      var4.a(a(g, h), BCryptHashProvider.b().name().toLowerCase(Locale.ENGLISH));
   }

   private static Object e(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_045.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_384.B("ěĽĿğŃŢŚŰŜīũşŭŧİŕŷŶŮŴŮŃ", (byte)58, 66), NLoginCore_045.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_397.F("ՙզեԨըդ՟ըճբԯխձժխճԵࢰࢼ࣑࣒ࣆ࣑࣋ࣗࢷࢳ࣑࣎ࣉࢽࢵՐ", (byte)58, 70) + var1 + NLoginCore_027.B("ĭ", (byte)58, 66) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 56L;
      var1 ^= 4908028074845238875L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(16 + 52),
                     (byte)(23 + 46),
                     (byte)(74 + 9),
                     (byte)(14 + 33),
                     (byte)(24 + 43),
                     (byte)(44 + 22),
                     (byte)(28 + 39),
                     (byte)(12 + 35),
                     80,
                     (byte)(44 + 31),
                     (byte)(43 + 24),
                     (byte)(66 + 17),
                     (byte)(38 + 15),
                     (byte)(3 + 77),
                     (byte)(2 + 95),
                     (byte)(14 + 86),
                     (byte)(25 + 75),
                     (byte)(72 + 33),
                     (byte)(66 + 44),
                     (byte)(73 + 30)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(10 + 58), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_397.B("ƌƙƘśƛƗƒƛƦƕŢƠƤƝƠƦŨӣӯԄԅӹӾԄԊӪӦԄԁӼӰӨ", (byte)85, 66));
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

   @Generated
   public NLoginCore_045(NLoginInterface_011<?> var1) {
      this.a = var1;
   }

   @Override
   public NLoginCore_056 a() {
      return new NLoginType_031(this.a.b(), this.a.<NLoginCore_100>b().c());
   }

   @Override
   public void c() {
      this.f();
      NLoginType_010 var1 = (NLoginType_010)this.a;
      NLoginCore_199 var2 = var1.a();
      if (var2 != null) {
         var2.c();
      }
   }
}
