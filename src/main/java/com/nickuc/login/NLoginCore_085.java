package com.nickuc.login;

import com.nickuc.login.api.event.internal.LockableEvent;
import com.nickuc.login.api.event.internal.LockableNewActionEvent;
import com.nickuc.login.api.event.velocity.auth.request.LoginRequestEvent;
import com.nickuc.login.proxy.velocity.nLoginVelocity;
import com.velocitypowered.api.proxy.Player;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_085 extends NLoginType_011 {
   private static long f = Long.reverse(248438088264159289L);
   private static String[] d = new String[NLoginCore_085.m];
   private static int c = Integer.reverse(0);
   private static int m = Integer.reverse(Integer.MIN_VALUE);
   private static long h = Long.reverse(-7493989779944505344L);
   private static long e;
   private static int j = (268435456 >>> 220 | 268435456 << ~220 + 1) & -1;
   private static String[] c = new String[j];

   public NLoginCore_085(NLoginType_013 var1) {
      this.a = var1;
   }

   static {
      b();
   }

   public void lockableNewAction(LockableNewActionEvent<?> var1) {
      nLoginVelocity var2 = this.a.a.c();
      var2.callEvent(var1);
   }

   public void lockableEvent(LockableEvent var1, byte var2, byte var3) {
      nLoginVelocity var4 = this.a.a.c();
      if (var2 == 0) {
         LoginRequestEvent var5 = (LoginRequestEvent)var1;
         Player var6 = var5.getPlayer();
         switch (var3) {
            case 1:
               var4.callEvent(var5);
               break;
            case 2:
               this.a.a.b().a().b(this.a.a.b().a(var6), var5.isCancelled());
               break;
            default:
               throw new IllegalArgumentException(a(c, f ^ h) + var2);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_085.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_575.D("ԌԮ\u0530ԐԴՓՋաՍԜ՚Ր՞\u0558ԡՆըէ՟ե՟Դ", (byte)101, 68), NLoginCore_085.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_027.C("ՇՔՓԖՖՒՍՖաՐԝ՛՟\u0558՛աԣࢾࢿࣀࢠࢪࢍࢭࢰࢹࢵࢨ\u0893ࢡࣃԽ", (byte)101, 67) + var1 + NLoginCore_453.E("՛", (byte)101, 69) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 25L;
      var1 ^= -7115232567785417472L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(11 + 57),
                     (byte)(11 + 58),
                     (byte)(34 + 49),
                     (byte)(28 + 19),
                     (byte)(50 + 17),
                     (byte)(42 + 24),
                     (byte)(14 + 53),
                     47,
                     (byte)(23 + 57),
                     (byte)(69 + 6),
                     (byte)(6 + 61),
                     (byte)(13 + 70),
                     53,
                     (byte)(14 + 66),
                     (byte)(63 + 34),
                     (byte)(93 + 7),
                     (byte)(87 + 13),
                     (byte)(48 + 57),
                     (byte)(42 + 68),
                     (byte)(46 + 57)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(2 + 67), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_471.E("ճրտՂւվչւ֍ռՉև\u058bքև֍Տ࣪࣫࣬࣌ࣖࢹࣙࣜࣥ࣡ࣔࢿ࣯࣍", (byte)84, 69));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         c[var0] = new String(var3.doFinal(Base64.getDecoder().decode(d[var0])), StandardCharsets.UTF_8);
      }

      return c[var0];
   }

   private static void b() {
      e = -7203061202383712576L;
      long var0 = e ^ -7115232567785417472L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(62 + 6),
               (byte)(31 + 38),
               (byte)(39 + 44),
               (byte)(35 + 12),
               (byte)(65 + 2),
               (byte)(30 + 36),
               (byte)(7 + 60),
               (byte)(39 + 8),
               (byte)(15 + 65),
               (byte)(41 + 34),
               67,
               (byte)(32 + 51),
               (byte)(28 + 25),
               (byte)(38 + 42),
               (byte)(83 + 14),
               (byte)(24 + 76),
               100,
               (byte)(72 + 33),
               (byte)(87 + 23),
               (byte)(59 + 44)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(3 + 80)}, StandardCharsets.UTF_8));
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
               d[0] = NLoginCore_397.A("ƟƜơƀƉŶƅƦƊƜƙƁƢƞƳŬƎƥƫƶƂƃƀƁ", (byte)87, 65);
               break;
            case 1:
               d[0] = NLoginCore_427.F("օւևզկ՜ի\u058cհւշհօ֑թ֔ֆզչթոր֛ձ֒տ֚՞ձ֦չ֓", (byte)87, 70);
               break;
            case 2:
               d[0] = NLoginCore_138.A("ƆƑŶũƖƜƭƂƬźƙƤƛƛŰƤűƭƍŴƑƃƀƁ", (byte)87, 65);
            case 3:
            default:
               break;
            case 4:
               d[0] = NLoginCore_091.D("ԅԋԓԥԧԬԢԆԪԝӽԊԌԘԎԽԮԹӾԽԓԠԍԎ", (byte)87, 68);
         }
      }
   }
}
