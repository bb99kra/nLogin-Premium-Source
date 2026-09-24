package com.nickuc.login;

import com.nickuc.login.api.event.bungee.auth.request.LoginRequestEvent;
import com.nickuc.login.api.event.internal.LockableEvent;
import com.nickuc.login.api.event.internal.LockableNewActionEvent;
import com.nickuc.login.proxy.bungee.nLoginBungee;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.md_5.bungee.api.connection.ProxiedPlayer;

public class NLoginCore_156 extends NLoginType_011 {
   private static String[] c = new String[NLoginCore_156.g];
   private static int c = Integer.reverse(0);
   private static int g = (32 >>> 229 | 32 << ~229 + 1) & -1;
   private static int j = 4 >>> 194 | 4 << -194;
   private static long e;
   private static String[] d = new String[j];
   private static long f = Long.reverse(2907829679766414447L);

   public NLoginCore_156(NLoginType_023 var1) {
      this.a = var1;
   }

   private static String a(int var0, long var1) {
      var1 ^= 2L;
      var1 ^= -772360276756096625L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(65 + 3),
                     (byte)(4 + 65),
                     (byte)(6 + 77),
                     (byte)(13 + 34),
                     (byte)(36 + 31),
                     (byte)(39 + 27),
                     (byte)(56 + 11),
                     (byte)(35 + 12),
                     (byte)(49 + 31),
                     (byte)(44 + 31),
                     (byte)(34 + 33),
                     (byte)(66 + 17),
                     (byte)(46 + 7),
                     (byte)(13 + 67),
                     (byte)(38 + 59),
                     100,
                     (byte)(98 + 2),
                     (byte)(99 + 6),
                     (byte)(74 + 36),
                     (byte)(6 + 97)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(66 + 2), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_521.A("ĚħĦéĩĥĠĩĴģðĮĲīĮĴöѫҎѝ҄ҔѭҒҕҏ", (byte)28, 65));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_156.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_427.B("ƇƩƫƋƯǎǆǜǈƗǕǋǙǓƜǁǣǢǚǠǚƯ", (byte)112, 66), NLoginCore_156.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_201.F("֏֛֜՞֚֞֕֞֩֘ե֣֧֣֠֩ի࣠ः࣒ࣹउ\u08e2इऊऄր", (byte)112, 70) + var1 + NLoginCore_183.B("ƙ", (byte)112, 66) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   public void lockableEvent(LockableEvent var1, byte var2, byte var3) {
      nLoginBungee var4 = this.a.a.c();
      if (var2 == 0) {
         LoginRequestEvent var5 = (LoginRequestEvent)var1;
         ProxiedPlayer var6 = var5.getPlayer();
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

   private static void b() {
      e = -710148584586782186L;
      long var0 = e ^ -772360276756096625L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(5 + 63),
               69,
               83,
               (byte)(45 + 2),
               (byte)(3 + 64),
               (byte)(40 + 26),
               (byte)(65 + 2),
               (byte)(36 + 11),
               (byte)(74 + 6),
               (byte)(61 + 14),
               (byte)(19 + 48),
               (byte)(54 + 29),
               (byte)(31 + 22),
               (byte)(62 + 18),
               (byte)(16 + 81),
               (byte)(84 + 16),
               (byte)(63 + 37),
               (byte)(45 + 60),
               (byte)(13 + 97),
               (byte)(96 + 7)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(56 + 27)}, StandardCharsets.UTF_8));
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
               d[0] = NLoginCore_092.C("ҧѯҝҖҧ҉ҬҊҢҼҗҘҾҔұқүҘ҄Ҿ҅ҵҌҍ", (byte)44, 67);
               break;
            case 1:
               d[0] = NLoginCore_183.F("ՖԞՌՅՖԸ՛ԹՑիՃՌգՠզզեՅՔՋ\u0530մՌՐյթղձԻԾ՜ց", (byte)44, 70);
               break;
            case 2:
               d[0] = NLoginCore_575.F("Ռՠ\u0530ԹԯՁԴԼԶ\u0557ԪՉԧՎԦԧխՆԾՈխՎԻԼ", (byte)44, 70);
            case 3:
            default:
               break;
            case 4:
               d[0] = NLoginCore_141.D("ҎҪҏ҄ҷҎҕҲ҃҆ѹҘҺҮѸҾҜҚҔҔҰҏҌҍ", (byte)44, 68);
         }
      }
   }

   public void lockableNewAction(LockableNewActionEvent<?> var1) {
      nLoginBungee var2 = this.a.a.c();
      var2.callEvent(var1);
   }
}
