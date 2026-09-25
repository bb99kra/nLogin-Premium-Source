package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.wrapper.play.client.WrapperPlayClientChatCommand;
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

public class NLoginCore_361 implements NLoginInterface_003 {
   private static int o = Integer.reverse(0);
   private static int q = 1024 >>> 170 | 1024 << -170;
   private static int e = Integer.reverse(-201326592);
   private static String[] ZKM_STR_A = new String[NLoginCore_361.p];
   private static int l = (1024 >>> 42 | 1024 << -42) & -1;
   private static int m = (67108864 >>> 58 | 67108864 << ~58 + 1) & -1;
   private static int p = Integer.reverse(Integer.MIN_VALUE);
   private static int d = (0 >>> 54 | 0 << -54) & -1;
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static long i = Long.reverse(-133995776645343884L);
   private static int b = Integer.reverse(-201326592);
   private static int n = (0 >>> 91 | 0 << ~91 + 1) & -1;
   private static long c;
   private static String[] ZKM_STR_B = new String[q];
   private static int c = 8192 >>> 77 | 8192 << ~77 + 1;
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private static int k = (0 >>> 49 | 0 << -49) & -1;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int f = 128 >>> 135 | 128 << -135;
   private static int h = Integer.reverse(0);

   private static String a(int var0, long var1) {
      var1 ^= 73L;
      var1 ^= -1604801141519867054L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(13 + 55),
                     (byte)(40 + 29),
                     (byte)(37 + 46),
                     (byte)(39 + 8),
                     (byte)(50 + 17),
                     (byte)(62 + 4),
                     (byte)(4 + 63),
                     (byte)(20 + 27),
                     80,
                     (byte)(52 + 23),
                     (byte)(59 + 8),
                     (byte)(81 + 2),
                     (byte)(7 + 46),
                     (byte)(58 + 22),
                     (byte)(49 + 48),
                     (byte)(78 + 22),
                     100,
                     (byte)(60 + 45),
                     (byte)(79 + 31),
                     (byte)(73 + 30)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(16 + 52), (byte)(32 + 37), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_553.E("ղտվՁցսոց\u058cջՈֆ֊փֆ\u058cՎࣟࣄࢽࣤ࣠ࣤࣤࣟ\u08e2", (byte)83, 69));
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

   private static void b() {
      c = 3362893459413255222L;
      long var0 = c ^ -1604801141519867054L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(36 + 32),
               (byte)(41 + 28),
               (byte)(63 + 20),
               (byte)(8 + 39),
               (byte)(28 + 39),
               (byte)(22 + 44),
               (byte)(26 + 41),
               47,
               (byte)(70 + 10),
               (byte)(12 + 63),
               (byte)(4 + 63),
               (byte)(45 + 38),
               (byte)(38 + 15),
               (byte)(24 + 56),
               (byte)(20 + 77),
               (byte)(68 + 32),
               100,
               (byte)(3 + 102),
               (byte)(21 + 89),
               (byte)(45 + 58)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(67 + 2), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_110.A("ŌĻŊřŌőƇłƁĿŉŏ", (byte)68, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_521.E("ՇՍՍզՓՈպոՔԸչՈ", (byte)68, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_201.D("ӛҸӳӱӦӒԁӑӛӛӚӂԂӗӰһԋӦӅӬӆԅԈӺӱӟӱӢԋӴӬԓ", (byte)68, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_384.A("ūŞŘšžšŢŰŨżłƉŅſŦƈšƋŦƌƐƃŚś", (byte)68, 65);
         }
      }
   }

   @Generated
   private NLoginCore_361(NLoginCore_346 var1) {
      this.a = var1;
   }

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_361.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_530.B("šƃƅťƉƨƠƶƢűƯƥƳƭŶƛƽƼƴƺƴƉ", (byte)93, 66), NLoginCore_361.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_027.C("ԯԼԻӾԾԺԵԾՉԸԅՃՇՀՃՉԋ࢜ࢁࡺࢡ࢝ࢡࢡ࢜࢟Ԡ", (byte)93, 67) + var1 + NLoginCore_141.E("Փ", (byte)93, 69) + var2.toString(), var4);
      }
   }

   @Override
   public void a(PacketReceiveEvent var1) {
      Object var2 = var1.getPlayer();
      if (var2 != null) {
         NLoginCore_277 var3 = NLoginCore_346.a(this.a).b().a(var1.getPlayer());
         NLoginCore_509 var4 = NLoginCore_346.a(this.a).a().a(var3);
         if (var4 == null) {
            var1.setCancelled((a != 0));
         } else {
            WrapperPlayClientChatCommand var5 = new WrapperPlayClientChatCommand(var1);
            String var6 = var5.getCommand().trim();
            if (!var6.isEmpty()) {
               String var7 = NLoginCore_346.a(this.a).b().a(var3, b + var6);
               if (var7 == null) {
                  var1.setCancelled((c != 0));
               } else {
                  if (var7.charAt(d) == e) {
                     var7 = var7.substring(f);
                  }

                  if (var5.getMessageSignData().getSaltSignature().getSignature().length == 0 && var5.getMessageSignData().getSaltSignature().getSalt() == 0L) {
                     var5.setCommand(var7);
                     var1.markForReEncode((g != 0));
                  }

                  String[] var8 = var6.split(a(h, i));
                  if (var8.length >= j) {
                     NLoginCore_466 var9 = NLoginCore_346.a(this.a).a().a(var8[k].toLowerCase(Locale.ENGLISH));
                     if (var9 != null) {
                        String[] var10 = new String[var8.length - l];
                        if (var10.length > 0) {
                           System.arraycopy(var8, m, var10, n, var10.length);
                        }

                        var9.a(var3, var4, var8[o], var10);
                     }
                  }
               }
            }
         }
      }
   }
}
