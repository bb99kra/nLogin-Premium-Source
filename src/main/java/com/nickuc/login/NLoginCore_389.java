package com.nickuc.login;

import io.netty.util.AttributeKey;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_389 {
   private static int d = Integer.reverse(0);
   private static int f = (-1 >>> 252 | -1 << -252) & -1;
   private static String[] b = new String[NLoginCore_389.l];
   private static int b = Integer.reverse(0);
   private static long j = Long.reverse(6629298651489370112L);
   private static int h = (Integer.MIN_VALUE >>> 255 | Integer.MIN_VALUE << ~255 + 1) & -1;
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static long g = Long.reverse(-2694110638480533507L);
   private static String[] a = new String[NLoginCore_389.k];
   private static int e = Integer.reverse(0);
   private static int k = 131072 >>> 112 | 131072 << -112;
   private static int l = 1 >>> 127 | 1 << ~127 + 1;
   private static long i = Long.reverse(-8746948537666480131L);
   private static long c;

   private static String a(int var0, long var1) {
      var1 ^= 58L;
      var1 ^= -7832700667106501404L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(6 + 62),
                     (byte)(7 + 62),
                     (byte)(72 + 11),
                     (byte)(17 + 30),
                     (byte)(23 + 44),
                     (byte)(42 + 24),
                     (byte)(30 + 37),
                     (byte)(30 + 17),
                     (byte)(23 + 57),
                     (byte)(69 + 6),
                     (byte)(15 + 52),
                     (byte)(53 + 30),
                     (byte)(15 + 38),
                     (byte)(4 + 76),
                     (byte)(51 + 46),
                     (byte)(59 + 41),
                     (byte)(68 + 32),
                     105,
                     (byte)(25 + 85),
                     (byte)(62 + 41)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(18 + 50), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_471.E("ԥԲԱӴԴ\u0530ԫԴԿԮӻԹԽԶԹԿԁ\u0896ࢍࢇࢋ\u088f\u0892\u0892࢚\u086e࢙ࢀࡲ࢞ࢥࢢ", (byte)6, 69));
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

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_389.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(
                     NLoginCore_076.F("ԯՑՓԳ\u0557նծքհԿսճցջՄթ\u058b֊ւֈւ\u0557", (byte)75, 70), NLoginCore_389.class.getClassLoader()
                  )
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_384.E("ժշնԹչյհչքճՀվւջվքՆ࣒࣐ࣛ࣌ࣔࣗࣗࣟࢳࣞࣅࢷࣣ࣪ࣧա", (byte)75, 69) + var1 + NLoginCore_521.F("Ձ", (byte)75, 70) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = -4617838955740972703L;
      long var0 = c ^ -7832700667106501404L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(54 + 14),
               (byte)(62 + 7),
               (byte)(35 + 48),
               (byte)(14 + 33),
               (byte)(3 + 64),
               (byte)(55 + 11),
               (byte)(36 + 31),
               (byte)(46 + 1),
               (byte)(58 + 22),
               (byte)(53 + 22),
               (byte)(49 + 18),
               (byte)(4 + 79),
               (byte)(10 + 43),
               80,
               (byte)(91 + 6),
               (byte)(96 + 4),
               (byte)(78 + 22),
               (byte)(48 + 57),
               110,
               (byte)(22 + 81)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(9 + 59), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_471.E("Ճ՞ԹռբևրՅժ֊սփըըկհձժտՑբնմզ֝֞տս\u058cւվջ\u0557դգհպ֨թ֞֙֨ռհ֭\u058b֊ս֖ձֲ֧֎֨տր", (byte)80, 69);
               b[1] = NLoginCore_471.A("ŎƏţƔŦƆŪŪƊŷƜŧ", (byte)80, 65);
               break;
            case 1:
               b[0] = NLoginCore_141.E("Ճ՞ԹռբևրՅժ֊սփըըկհձժտՑբնմզ֝֞տս\u058cւվջ\u0557դգհպ֨թ֞֙֨ռ\u058cչ֡ձ֑֠֫֒֊ֈշֵ֘ճմִָ֛֙֕֔", (byte)80, 69);
               b[1] = NLoginCore_004.B("ŎƆŨŧƗžŞőŜŹƔŧ", (byte)80, 66);
               break;
            case 2:
               b[0] = NLoginCore_446.F("՜ՓՅտգ֊Նիպկ֎ՠըպՠ\u0590Ցհի\u058cցպպ֔֏ֆ\u0557֑֍\u058cխօ", (byte)80, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_387.D("ԑӝԍӓӭӾӡԘӠӿԅӻӿԃԉӻӸԭԭԤԚԋӸӹ", (byte)80, 68);
         }
      }
   }

   public static <T> AttributeKey<T> a(String var0) {
      try {
         return AttributeKey.valueOf(var0);
      } catch (NoSuchMethodError var4) {
         try {
            Class[] var10001 = new Class[a];
            var10001[b] = String.class;
            Constructor var10000 = AttributeKey.class.getConstructor(var10001);
            Object[] var5 = new Object[c];
            var5[d] = var0;
            return (AttributeKey<T>)var10000.newInstance(var5);
         } catch (ReflectiveOperationException var3) {
            throw new RuntimeException(a(e & f, g) + var0 + a(h, i ^ j), var3);
         }
      }
   }
}
