package com.nickuc.login;

import com.nickuc.login.api.event.bukkit.auth.request.LoginRequestEvent;
import com.nickuc.login.api.event.internal.LockableEvent;
import com.nickuc.login.api.event.internal.LockableNewActionEvent;
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

public class ΛΠομχΓξσΩΔ extends ΨιβιψκωΓγ {
   private static long h = Long.reverse(864691128455135232L);
   private static int c = Integer.reverse(0);
   private static long f = Long.reverse(5071525607157180063L);
   private static String[] c = new String[ΛΠομχΓξσΩΔ.j];
   private static String[] d = new String[ΛΠομχΓξσΩΔ.m];
   private static long e;
   private static int m = 134217728 >>> 123 | 134217728 << -123;
   private static int j = Integer.reverse(Integer.MIN_VALUE);

   private static void b() {
      e = -475860013211613598L;
      long var0 = e ^ -2338025732603883783L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(64 + 4),
               (byte)(8 + 61),
               83,
               (byte)(26 + 21),
               (byte)(15 + 52),
               66,
               (byte)(23 + 44),
               (byte)(14 + 33),
               (byte)(62 + 18),
               (byte)(57 + 18),
               (byte)(56 + 11),
               (byte)(82 + 1),
               (byte)(50 + 3),
               (byte)(26 + 54),
               (byte)(24 + 73),
               (byte)(23 + 77),
               (byte)(32 + 68),
               (byte)(25 + 80),
               (byte)(61 + 49),
               (byte)(85 + 18)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(33 + 35), 69, 83}, StandardCharsets.UTF_8));
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
               d[0] = ΣερμΔσατσκ.C("ҊѸҼґҁҴҧѺңҩҿҜҖҷӈҮӆҋӀҾҫҞқҜ", (byte)49, 67);
               break;
            case 1:
               d[0] = ντθΔζβΔζ.B("ģđŕĪĚōŀēļłŖœŘğŜĤĲŕĿŕŬĭĬŀűņņĿţşĸť", (byte)49, 66);
               break;
            case 2:
               d[0] = φΨαξωυθανΣφυκη.F("ԵԺՉԧԣԼդԹԪՋ՞Ե", (byte)49, 70);
            case 3:
            default:
               break;
            case 4:
               d[0] = ξψθρΣΠΣς.A("ŚĲŉĬĶŐŝŐĪĵŃłœŦļĢţĹĵņĽīĪũŤįŇĬŊŒŘŶ", (byte)49, 65);
         }
      }
   }

   public void lockableEvent(LockableEvent var1, byte var2, byte var3) {
      if (var2 == 0) {
         LoginRequestEvent var4 = (LoginRequestEvent)var1;
         Player var5 = var4.getPlayer();
         if (!var5.isOnline()) {
            return;
         }

         switch (var3) {
            case 1:
               ωδπηξιΓΣφΨΔρΓΓ.a(this.a).callEvent(var4);
            case 2:
               break;
            default:
               throw new IllegalArgumentException(c<"㺀">(c, f ^ h) + var2);
         }
      }
   }

   public void lockableNewAction(LockableNewActionEvent<?> var1) {
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ΛΠομχΓξσΩΔ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ιΠοθΩΦξκ.E("ԤՆՈԨՌիգչեԴղընհԹ՞րտշսշՌ", (byte)64, 69), ΛΠομχΓξσΩΔ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            μζξτΩσσφυδεπλΨ.C("ӘӥӤҧӧӣӞӧӲӡҮӬӰөӬӲҴࠡࠧࡇࡅࡑࠞࡊࡐ࠷ࠣӊ", (byte)64, 67) + var1 + ΣδτΠνεγοΓορητ.B("Ĺ", (byte)64, 66) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 48L;
      var1 ^= -2338025732603883783L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(6 + 62),
                     (byte)(66 + 3),
                     (byte)(81 + 2),
                     47,
                     (byte)(62 + 5),
                     (byte)(29 + 37),
                     (byte)(64 + 3),
                     (byte)(21 + 26),
                     (byte)(65 + 15),
                     (byte)(61 + 14),
                     (byte)(50 + 17),
                     (byte)(81 + 2),
                     (byte)(23 + 30),
                     (byte)(59 + 21),
                     (byte)(73 + 24),
                     (byte)(33 + 67),
                     (byte)(85 + 15),
                     105,
                     (byte)(47 + 63),
                     (byte)(16 + 87)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(47 + 21), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(θεωψξβΛσσ.F("ՇՔՓԖՖՒՍՖաՐԝ՛՟\u0558՛աԣ\u0890\u0896ࢶࢴࣀࢍࢹࢿࢦ\u0892", (byte)40, 70));
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

   public ΛΠομχΓξσΩΔ(ωδπηξιΓΣφΨΔρΓΓ var1) {
      this.a = var1;
   }

   static {
      b();
   }
}
