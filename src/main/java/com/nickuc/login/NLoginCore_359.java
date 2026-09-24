package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.wrapper.play.client.WrapperPlayClientPluginMessage;
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

public class NLoginCore_359 implements NLoginInterface_003 {
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static long d = Long.reverse(3059632426199961607L);
   private static long c;
   private static int a = Integer.reverse(0);
   private static String[] a = new String[f];
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int b = Integer.reverse(-1);
   private static String[] b = new String[g];

   private static void b() {
      c = -2302932306135896487L;
      long var0 = c ^ -6380308540587134010L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(31 + 37),
               69,
               (byte)(73 + 10),
               (byte)(26 + 21),
               (byte)(9 + 58),
               66,
               (byte)(34 + 33),
               (byte)(18 + 29),
               (byte)(66 + 14),
               (byte)(39 + 36),
               (byte)(59 + 8),
               (byte)(38 + 45),
               (byte)(28 + 25),
               (byte)(55 + 25),
               (byte)(25 + 72),
               (byte)(90 + 10),
               (byte)(16 + 84),
               (byte)(7 + 98),
               (byte)(97 + 13),
               (byte)(64 + 39)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(10 + 73)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_004.B("ŕęĹšŠĹŞĝĢŕšœŜśĬřĩŪŐĬųųĺĻ", (byte)52, 66);
               break;
            case 1:
               b[0] = NLoginCore_387.E("՞ԢՂժթՂէԦԫ՞թի\u0530նՁգՋԹդ\u0558՚ՆՃՄ", (byte)52, 69);
               break;
            case 2:
               b[0] = NLoginCore_530.C("ӆӄ҈ҧҚҊҾҤӌҩӕӀҍӉҨҮҨҍҭҬҦҧҤҥ", (byte)52, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_138.E("ԼՕԸԧՀդԺ՛ՑՈթԸ", (byte)52, 69);
         }
      }
   }

   public NLoginCore_359(NLoginCore_502 var1) {
      this.b = var1;
   }

   @Override
   public void a(PacketReceiveEvent var1) {
      WrapperPlayClientPluginMessage var2 = new WrapperPlayClientPluginMessage(var1);
      String var3 = var2.getChannelName();
      if (var3.equals(a(a & b, d))) {
         Player var4 = (Player)var1.getPlayer();
         if (var4 != null) {
            var1.setCancelled((boolean)e);
            NLoginCore_502.a(this.b).a().a(NLoginCore_502.a(this.b).b().a(var4), var2.getData());
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 13L;
      var1 ^= -6380308540587134010L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(26 + 42),
                     (byte)(33 + 36),
                     (byte)(13 + 70),
                     (byte)(22 + 25),
                     67,
                     (byte)(59 + 7),
                     (byte)(30 + 37),
                     (byte)(43 + 4),
                     (byte)(3 + 77),
                     (byte)(50 + 25),
                     (byte)(5 + 62),
                     (byte)(50 + 33),
                     (byte)(51 + 2),
                     80,
                     (byte)(87 + 10),
                     (byte)(52 + 48),
                     (byte)(43 + 57),
                     (byte)(73 + 32),
                     (byte)(37 + 73),
                     (byte)(77 + 26)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(75 + 8)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_241.B("ĎěĚÝĝęĔĝĨėäĢĦğĢĨêѯѵѴѰ҆ѷѽѣѵѹ҆", (byte)22, 66));
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
                  NLoginCore_359.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_232.B("ùěĝýġŀĸŎĺĉŇĽŋŅĎĳŕŔŌŒŌġ", (byte)41, 66), NLoginCore_359.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_559.F("ՈՕՔԗ\u0557ՓՎ\u0557բՑԞ՜ՠՙ՜բԤࢩࢯࢮࢪࣀࢱࢷ࢝ࢯࢳࣀԻ", (byte)41, 70) + var1 + NLoginCore_471.E("ԟ", (byte)41, 69) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }
}
