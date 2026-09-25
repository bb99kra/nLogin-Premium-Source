package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_546 {
   private static int l = Integer.reverse(0);
   private static int b = (0 >>> 100 | 0 << -100) & -1;
   private static long c;
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static int d = 0 >>> 17 | 0 << ~17 + 1;
   private static int m = (1 >>> 160 | 1 << ~160 + 1) & -1;
   private static long e = Long.reverse(3112719754340077518L);
   private static long k = Long.reverse(3112719754340077518L);
   private static int h = (536870912 >>> 221 | 536870912 << -221) & -1;
   private static String[] ZKM_STR_B = new String[NLoginCore_546.p];
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static int g = (0 >>> 37 | 0 << ~37 + 1) & -1;
   private static String[] ZKM_STR_A = new String[NLoginCore_546.o];
   private static int a = 32 >>> 37 | 32 << ~37 + 1;
   private static int j = Integer.reverse(-1);
   private static int o = Integer.reverse(1073741824);
   private static int f = (0 >>> 83 | 0 << -83) & -1;
   private static int c = (1048576 >>> 20 | 1048576 << ~20 + 1) & -1;
   private static int p = (4194304 >>> 149 | 4194304 << -149) & -1;

   public static <T> T b(Method var0, Object var1, Object... var2) {
      return (T)var0.invoke(var1, var2);
   }

   @Nullable
   public static <T> Constructor<T> a(Class<?> var0, Class<?>... var1) {
      try {
         return b(var0, var1);
      } catch (ClassCastException | NoSuchMethodException var3) {
         return null;
      }
   }

   @Nullable
   public static Method a(Class<?> var0, @Nullable String var1, @Nullable Class<?> var2, Class<?>... var3) {
      Method[] var4 = var0.getDeclaredMethods();
      int var5 = var4.length;

      for (int var6 = b; var6 < var5; var6++) {
         Method var7 = var4[var6];
         if ((var1 == null || var7.getName().equals(var1))
            && (var2 == null || var7.getReturnType().equals(var2))
            && Arrays.equals((Object[])var7.getParameterTypes(), (Object[])var3)) {
            var7.setAccessible((c != 0));
            return var7;
         }
      }

      return null;
   }

   @Nullable
   public static <T> T a(Method var0, Object var1, Object... var2) {
      if (var0 != null) {
         try {
            return b(var0, var1, var2);
         } catch (IllegalAccessException | ClassCastException | InvocationTargetException var4) {
         }
      }

      return null;
   }

   public static Method b(Class<?> var0, String var1, Class<?>... var2) {
      Method var3 = var0.getDeclaredMethod(var1, var2);
      var3.setAccessible((a != 0));
      return var3;
   }

   private static void b() {
      c = 8354198577321954446L;
      long var0 = c ^ -5233251952210518379L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(14 + 54),
               (byte)(2 + 67),
               (byte)(68 + 15),
               (byte)(22 + 25),
               (byte)(46 + 21),
               (byte)(11 + 55),
               (byte)(38 + 29),
               (byte)(17 + 30),
               (byte)(47 + 33),
               (byte)(59 + 16),
               (byte)(9 + 58),
               (byte)(61 + 22),
               (byte)(51 + 2),
               (byte)(53 + 27),
               97,
               (byte)(91 + 9),
               (byte)(30 + 70),
               105,
               (byte)(70 + 40),
               (byte)(81 + 22)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(10 + 59), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_138.F("Ոէ\u0558՟ցՉՒօտնժ\u0590\u0557ցմփ։՝իյ՝պ֏աբ֣֛֤֗֜֔֔", (byte)87, 70);
               ZKM_STR_B[1] = NLoginCore_384.C("ԡԠԴӳӶӪԹԗӴԼӸԦԑӲԔӽԝӼԗ\u0530ԂԙՂԩՀԋԦԬԭԩ\u0530ԟ", (byte)87, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_446.A("ŢƁŲŹƛţŬƟƙƐƄƪűƛƎƝƣŷƅƏŷƔƺƒƔŸƴƍƠƿżƄ", (byte)87, 65);
               ZKM_STR_B[1] = NLoginCore_384.C("ԡԠԴӳӶӪԹԗӴԼӸԦԑӲԔӽԝӼԗ\u0530ԂԓՃՄԔԅԣՏՏԮԩԼՎՒԪԕ\u0530ՕՇԌՖԚ\u0557Ԣ", (byte)87, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_127.D("ӪԁԎԨӲԐԲԍԜԪԨԵӸՀӽԬԭԥԭԻՁԐԍԎ", (byte)87, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_110.E("՞֍բՋջի՜՞\u0590կՐե\u058c֘Ր֔֘պ֑֍֞֏զէ", (byte)87, 69);
         }
      }
   }

   public static <T> T a(Method var0, Object... var1) {
      if (var0 != null) {
         try {
            return b(var0, var1);
         } catch (IllegalAccessException | ClassCastException | InvocationTargetException var3) {
         }
      }

      return null;
   }

   public static <T> T b(Method var0, Object... var1) {
      return b(var0, null, var1);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_546.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_453.F("ԿագՃէֆվ֔րՏ֍փ֑\u058bՔչ֛֚֒֘֒է", (byte)91, 70), NLoginCore_546.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_453.F("պևֆՉ։օր։֔փՐ֎֒\u058b֎֔Ֆࢻࣄ\u08e2ࣰࣲ࣮ࣣࣦ࣪ի", (byte)91, 70) + var1 + NLoginCore_141.A("ů", (byte)91, 65) + var2.toString(), var4
         );
      }
   }

   public static Field a(Class<?> var0, String var1) {
      Field var2 = var0.getDeclaredField(var1);
      var2.setAccessible((m != 0));
      return var2;
   }

   @Nullable
   public static Field a(Class<?> var0, @Nullable Class<?> var1, int var2) {
      if (var2 < 0) {
         throw new IllegalArgumentException(a(d, e) + var2);
      } else {
         Field[] var3 = var0.getDeclaredFields();
         if (var3.length > 0) {
            int var4 = f;
            Field[] var5 = var3;
            int var6 = var3.length;

            for (int var7 = g; var7 < var6; var7++) {
               Field var8 = var5[var7];
               if (var1 != null) {
                  Class var9 = var8.getType();
                  if (var1 == Object.class ? var9 != Object.class : var9 == Object.class || !var1.isAssignableFrom(var9)) {
                     continue;
                  }
               }

               if (var4 == var2) {
                  var8.setAccessible((h != 0));
                  return var8;
               }

               var4++;
            }
         }

         return null;
      }
   }

   @Nullable
   public static Field a(Class<?> var0, String... var1) {
      if (var1.length == 0) {
         throw new IllegalArgumentException(a(i & j, k));
      } else {
         String[] var2 = var1;
         int var3 = var1.length;

         for (int var4 = l; var4 < var3; var4++) {
            String var5 = var2[var4];

            try {
               return a(var0, var5);
            } catch (NoSuchFieldException var7) {
            }
         }

         return null;
      }
   }

   @Nullable
   public static Field a(Class<?> var0, int var1) {
      return a(var0, null, var1);
   }

   private static String a(int var0, long var1) {
      var1 ^= 90L;
      var1 ^= -5233251952210518379L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(53 + 15),
                     (byte)(27 + 42),
                     (byte)(30 + 53),
                     (byte)(28 + 19),
                     (byte)(50 + 17),
                     (byte)(23 + 43),
                     (byte)(22 + 45),
                     (byte)(9 + 38),
                     (byte)(21 + 59),
                     75,
                     (byte)(58 + 9),
                     (byte)(3 + 80),
                     (byte)(50 + 3),
                     (byte)(79 + 1),
                     (byte)(35 + 62),
                     (byte)(49 + 51),
                     (byte)(7 + 93),
                     105,
                     (byte)(33 + 77),
                     (byte)(91 + 12)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(8 + 60), 69, (byte)(79 + 4)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_530.E("ԱԾԽԀՀԼԷՀՋԺԇՅՉՂՅՋԍࡲࡻ࢙ࢥࢩ࢚ࢧ࢝ࢡ", (byte)18, 69));
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

   @Nullable
   public static Method a(Class<?> var0, String var1, Class<?>... var2) {
      try {
         return b(var0, var1, var2);
      } catch (NoSuchMethodException var4) {
         return null;
      }
   }

   public static <T> Constructor<T> b(Class<?> var0, Class<?>... var1) {
      Constructor var2 = var0.getDeclaredConstructor(var1);
      var2.setAccessible((n != 0));
      return var2;
   }

   static {
      b();
   }
}
