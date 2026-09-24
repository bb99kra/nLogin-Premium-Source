package com.nickuc.login;

import com.nickuc.login.api.event.bukkit.auth.request.LoginRequestEvent;
import com.nickuc.login.api.event.internal.LockableEvent;
import com.nickuc.login.api.event.internal.LockableNewActionEvent;
import com.nickuc.login.bukkit.nLoginBukkit;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.entity.Player;

public class NLoginCore_155 extends NLoginType_011 {
   private static long e;
   private static String[] d = new String[NLoginCore_155.j];
   private static long f = Long.reverse(-3696541810282931093L);
   private static int c = Integer.reverse(0);
   private static String[] c = new String[NLoginCore_155.g];
   private static int g = 134217728 >>> 251 | 134217728 << ~251 + 1;
   private static int j = Integer.reverse(Integer.MIN_VALUE);

   private static String a(int var0, long var1) {
      var1 ^= 104L;
      var1 ^= 1208071138250122499L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(55 + 13),
                     69,
                     (byte)(12 + 71),
                     (byte)(20 + 27),
                     (byte)(43 + 24),
                     (byte)(45 + 21),
                     (byte)(56 + 11),
                     (byte)(34 + 13),
                     (byte)(11 + 69),
                     (byte)(25 + 50),
                     (byte)(36 + 31),
                     83,
                     (byte)(49 + 4),
                     (byte)(32 + 48),
                     (byte)(38 + 59),
                     (byte)(67 + 33),
                     (byte)(81 + 19),
                     (byte)(35 + 70),
                     (byte)(78 + 32),
                     (byte)(95 + 8)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(59 + 9), 69, (byte)(53 + 30)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_232.C("ԾՋՊԍՍՉՄՍ\u0558ՇԔՒՖՏՒ\u0558Ԛࢭࢁࢦࢣࢦࢢࢶࢷࢽ࢛", (byte)98, 67));
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

   public NLoginCore_155(NLoginType_007 var1) {
      this.a = var1;
   }

   private static void b() {
      e = -3009762306419798693L;
      long var0 = e ^ 1208071138250122499L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(9 + 59),
               (byte)(14 + 55),
               (byte)(21 + 62),
               (byte)(38 + 9),
               (byte)(28 + 39),
               (byte)(25 + 41),
               (byte)(4 + 63),
               (byte)(3 + 44),
               (byte)(14 + 66),
               (byte)(46 + 29),
               (byte)(48 + 19),
               (byte)(35 + 48),
               (byte)(12 + 41),
               (byte)(31 + 49),
               (byte)(19 + 78),
               100,
               100,
               (byte)(77 + 28),
               (byte)(20 + 90),
               (byte)(7 + 96)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(54 + 15), 83}, StandardCharsets.UTF_8));
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
               d[0] = NLoginCore_138.D("ҴӉӐӍөӧӇӼӐӱӚӵӾӴӴӢӯӦӸӓӃӺӑӒ", (byte)67, 68);
               break;
            case 1:
               d[0] = NLoginCore_324.C("ҴӉӐӍөӧӇӼӐӱӚӁӫӺӮӺӔӁӨӀԆөӵӈԂԏӠӑԎӏӋӲ", (byte)67, 67);
               break;
            case 2:
               d[0] = NLoginCore_451.D("ӡӅӤӰӼӍҹӌӲӊӉәӷӱӀӏӀԇӸӂӢӔӑӒ", (byte)67, 68);
            case 3:
            default:
               break;
            case 4:
               d[0] = NLoginCore_387.C("ӅӠӒӬӘҳӑәҼӡӎһӬӓӲҸԂӲӚԊӾӨӼԈӜӏӻԎӳӔԈӭ", (byte)67, 67);
         }
      }
   }

   public void lockableEvent(LockableEvent var1, byte var2, byte var3) {
      nLoginBukkit var4 = this.a.a.c();
      if (var2 == 0) {
         LoginRequestEvent var5 = (LoginRequestEvent)var1;
         Player var6 = var5.getPlayer();
         if (!var6.isOnline()) {
            return;
         }

         switch (var3) {
            case 1:
               var4.callEvent(var5);
               break;
            case 2:
               this.a.a.b().a().b(this.a.a.b().a(var6), var5.isCancelled());
               break;
            default:
               throw new IllegalArgumentException(a(c, f) + var2);
         }
      }
   }

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_155.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_027.B("ėĹĻěĿŞŖŬŘħťśũţĬőųŲŪŰŪĿ", (byte)56, 66), NLoginCore_155.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_223.C("ӀӍӌҏӏӋӆӏӚӉҖӔӘӑӔӚҜ\u082fࠃࠨࠥࠨࠤ࠸࠹\u083fࠝҲ", (byte)56, 67) + var1 + NLoginCore_471.F("Ԯ", (byte)56, 70) + var2.toString(), var4
         );
      }
   }

   public void lockableNewAction(LockableNewActionEvent<?> var1) {
      nLoginBukkit var2 = this.a.a.c();
      var2.callEvent(var1);
   }
}
