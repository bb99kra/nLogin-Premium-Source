package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.wrapper.configuration.client.WrapperConfigClientPluginMessage;
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

public class NLoginCore_297 implements NLoginInterface_003 {
   private static int d = 33554432 >>> 185 | 33554432 << -185;
   private static String[] b = new String[NLoginCore_297.e];
   private static int a = Integer.reverse(0);
   private static String[] a = new String[d];
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int e = (268435456 >>> 60 | 268435456 << ~60 + 1) & -1;
   private static long c;
   private static long b = Long.reverse(693182425496388923L);

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 15L;
      var1 ^= 585071055120017033L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(18 + 50),
                     (byte)(57 + 12),
                     (byte)(64 + 19),
                     (byte)(21 + 26),
                     (byte)(53 + 14),
                     66,
                     (byte)(56 + 11),
                     (byte)(12 + 35),
                     (byte)(21 + 59),
                     (byte)(12 + 63),
                     (byte)(42 + 25),
                     (byte)(69 + 14),
                     (byte)(30 + 23),
                     (byte)(59 + 21),
                     (byte)(25 + 72),
                     100,
                     (byte)(31 + 69),
                     (byte)(94 + 11),
                     (byte)(70 + 40),
                     (byte)(27 + 76)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(5 + 63), 69, (byte)(64 + 19)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_521.E("ՅՒՑԔՔՐՋՔ՟Վԛՙ՝Ֆՙ՟ԡ\u0896ࢇࢲࢯࢪࢳࢢ࢚ࢰ\u0890ࢦ࢙ࣀࢷ", (byte)38, 69));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_297.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_092.D("ҦӈӊҪӎӭӥӻӧҶӴӪӸӲһӠԂԁӹӿӹӎ", (byte)67, 68), NLoginCore_297.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_004.F("բկծԱձխըձռիԸնպճնռԾࢳࢤ࣏࣌ࣇ࣐ࢿࢷ࣍ࢭࣃࢶࣝࣔ\u0558", (byte)67, 70) + var1 + NLoginCore_553.A("Ŀ", (byte)67, 65) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = -2548612760745969249L;
      long var0 = c ^ 585071055120017033L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(15 + 53),
               (byte)(18 + 51),
               83,
               (byte)(33 + 14),
               (byte)(7 + 60),
               (byte)(59 + 7),
               (byte)(29 + 38),
               (byte)(35 + 12),
               (byte)(13 + 67),
               (byte)(37 + 38),
               (byte)(3 + 64),
               (byte)(2 + 81),
               (byte)(20 + 33),
               (byte)(72 + 8),
               (byte)(20 + 77),
               (byte)(96 + 4),
               (byte)(25 + 75),
               (byte)(6 + 99),
               110,
               (byte)(16 + 87)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(27 + 42), (byte)(40 + 43)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_575.B("ĆķüĝĄľĚōħĉĒĩċĿńĸēċČŊĩśĢģ", (byte)40, 66);
               break;
            case 1:
               b[0] = NLoginCore_201.B("ĆķüĝĄľĚōħĉĒĉŉłīħŔĮĳĹśśĢģ", (byte)40, 66);
               break;
            case 2:
               b[0] = NLoginCore_451.E("՞ԚՙԞՐԠբՌԜԯԣ\u0530ԦԴԽԧԵ՜ԫՌՂՠԷԸ", (byte)40, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_530.B("ĥĉēŋňĦŀģħıŉġĔĐğőġħńėīĵĢģ", (byte)40, 66);
         }
      }
   }

   public NLoginCore_297(NLoginCore_502 var1) {
      this.a = var1;
   }

   @Override
   public void a(PacketReceiveEvent var1) {
      WrapperConfigClientPluginMessage var2 = new WrapperConfigClientPluginMessage(var1);
      String var3 = var2.getChannelName();
      if (var3.equals(a(a, b))) {
         Player var4 = (Player)var1.getPlayer();
         if (var4 != null) {
            var1.setCancelled((boolean)c);
            NLoginCore_502.a(this.a).a().a(NLoginCore_502.a(this.a).b().a(var4), var2.getData());
         }
      }
   }
}
