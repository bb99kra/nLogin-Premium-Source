package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.protocol.ConnectionState;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import com.nickuc.login.lib.packetevents.api.wrapper.configuration.server.WrapperConfigServerDisconnect;
import com.nickuc.login.lib.packetevents.api.wrapper.login.server.WrapperLoginServerDisconnect;
import com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerDisconnect;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.kyori.adventure.text.Component;

public class NLoginCore_234 {
   private static String[] ZKM_STR_B = new String[NLoginCore_234.g];
   private static int c = 33554432 >>> 89 | 33554432 << ~89 + 1;
   private static int a = Integer.reverse(0);
   private static String[] ZKM_STR_A = new String[NLoginCore_234.f];
   private static long d = Long.reverse(1531407959047433426L);
   private static long b = Long.reverse(5134287660943830226L);
   private static long c;
   private static int f = Integer.reverse(1073741824);
   private static long e = Long.reverse(5908722711110090752L);
   private static int g = (67108864 >>> 89 | 67108864 << ~89 + 1) & -1;

   private static void b() {
      c = 5419621126376850088L;
      long var0 = c ^ -2253589745355225876L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(56 + 12),
               (byte)(62 + 7),
               (byte)(72 + 11),
               (byte)(37 + 10),
               (byte)(52 + 15),
               (byte)(62 + 4),
               (byte)(5 + 62),
               47,
               (byte)(5 + 75),
               (byte)(14 + 61),
               (byte)(43 + 24),
               (byte)(79 + 4),
               (byte)(35 + 18),
               (byte)(49 + 31),
               (byte)(48 + 49),
               (byte)(67 + 33),
               (byte)(5 + 95),
               (byte)(9 + 96),
               110,
               (byte)(33 + 70)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(65 + 3), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_446.D("ԲՋՇՍՏԙԻԿՃՙ՟ՑՄէԽժՇդդթեԭՎՉԲզաիԯ\u0557ոիժ՚կ\u0558\u0558ՋցԷչ՛պջՒըՅ\u0557Չւ\u0557վ֍\u0557ՔՕ", (byte)100, 68);
               ZKM_STR_B[1] = NLoginCore_201.F("֒ՐՕզթիըֈ՞֟ձխվ֒ա֒֗յ֣ք։ֆճմ", (byte)100, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_471.E("ձ֊ֆ\u058c֎\u0558պվւ֘֞\u0590փ֦ռ֩ֆ֣֣֤֨լ֍ֈձ֥֪֠ծַ֖֪֮֩֙֗֗֊׀նָֹ֚֚֔փ֚֕֜։ׇָ֟\u05cc֓֔", (byte)100, 69);
               ZKM_STR_B[1] = NLoginCore_232.B("ƹŷżƍƐƒƏƯƅǆƙŽƆƕǃƉƋǀƧƍƯǓƚƛ", (byte)100, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_446.C("ԒԥԩԶԻՋԷԗԱՖՄԩ", (byte)100, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_173.F("ճծ՚Փխմս֔֝ճփը", (byte)100, 70);
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void a(User var0, Component var1) {
      switch (NLoginCore_444.R[var0.getEncoderState().ordinal()]) {
         case 1:
            var0.sendPacketSilently(new WrapperLoginServerDisconnect(var1));
            break;
         case 2:
            var0.sendPacketSilently(new WrapperConfigServerDisconnect(var1));
            break;
         case 3:
            var0.sendPacketSilently(new WrapperPlayServerDisconnect(var1));
            break;
         default:
            var0.closeConnection();
            throw new IllegalStateException(a(a, b) + var0.getEncoderState() + a(c, d ^ e) + var0.getDecoderState());
      }
   }

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_234.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_027.A("ēĵķėĻŚŒŨŔģšŗťşĨōůŮŦŬŦĻ", (byte)54, 65), NLoginCore_234.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_223.D("ҺӇӆ҉ӉӅӀӉӔӃҐӎӒӋӎӔҖ࠙\u082eࠦࠩ࠰࠲ࠤ࠘Ҫ", (byte)54, 68) + var1 + NLoginCore_530.C("ґ", (byte)54, 67) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 74L;
      var1 ^= -2253589745355225876L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(12 + 56),
                     (byte)(67 + 2),
                     (byte)(22 + 61),
                     47,
                     (byte)(34 + 33),
                     (byte)(9 + 57),
                     (byte)(10 + 57),
                     (byte)(36 + 11),
                     (byte)(72 + 8),
                     (byte)(32 + 43),
                     (byte)(19 + 48),
                     (byte)(29 + 54),
                     (byte)(48 + 5),
                     (byte)(15 + 65),
                     97,
                     (byte)(22 + 78),
                     (byte)(62 + 38),
                     (byte)(69 + 36),
                     (byte)(71 + 39),
                     (byte)(40 + 63)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(33 + 36), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_110.F("ԷՄՃԆՆՂԽՆՑՀԍՋՏՈՋՑԓ\u0896ࢫࢣࢦࢭࢯࢡ\u0895", (byte)24, 70));
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

   public static void j(User var0, String var1) {
      a(var0, Component.translatable(var1));
   }

   public static void i(User var0, String var1) {
      a(var0, NLoginCore_529.a(var1));
   }
}
