package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.wrapper.play.client.WrapperPlayClientChatCommandUnsigned;
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

public class NLoginCore_099 implements NLoginInterface_003 {
   private static int q = 524288 >>> 211 | 524288 << -211;
   private static String[] ZKM_STR_B = new String[NLoginCore_099.r];
   private static int m = Integer.reverse(Integer.MIN_VALUE);
   private static int p = 0 >>> 39 | 0 << ~39 + 1;
   private static int k = (536870912 >>> 61 | 536870912 << ~61 + 1) & -1;
   private static int f = (16384 >>> 206 | 16384 << -206) & -1;
   private static int l = (0 >>> 228 | 0 << ~228 + 1) & -1;
   private static int r = (512 >>> 105 | 512 << -105) & -1;
   private static int o = Integer.reverse(0);
   private static int n = (4096 >>> 204 | 4096 << ~204 + 1) & -1;
   private static long i = Long.reverse(1576659477577277511L);
   private static long c;
   private static long j = Long.reverse(-3746994889972252672L);
   private static String[] ZKM_STR_A = new String[q];
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int h = (0 >>> 195 | 0 << -195) & -1;
   private static int b = Integer.reverse(-201326592);
   private static int d = Integer.reverse(0);
   private static int e = Integer.reverse(-201326592);

   @Override
   public void a(PacketReceiveEvent var1) {
      Object var2 = var1.getPlayer();
      if (var2 != null) {
         NLoginCore_277 var3 = NLoginCore_346.a(this.b).b().a(var2);
         NLoginCore_509 var4 = NLoginCore_346.a(this.b).a().a(var3);
         if (var4 == null) {
            var1.setCancelled((a != 0));
         } else {
            WrapperPlayClientChatCommandUnsigned var5 = new WrapperPlayClientChatCommandUnsigned(var1);
            String var6 = var5.getCommand().trim();
            if (!var6.isEmpty()) {
               String var7 = NLoginCore_346.a(this.b).b().a(var3, b + var6);
               if (var7 == null) {
                  var1.setCancelled((c != 0));
               } else {
                  if (var7.charAt(d) == e) {
                     var7 = var7.substring(f);
                  }

                  var5.setCommand(var7);
                  var1.markForReEncode((g != 0));
                  String[] var8 = var6.split(a(h, i ^ j));
                  if (var8.length >= k) {
                     NLoginCore_466 var9 = NLoginCore_346.a(this.b).a().a(var8[l].toLowerCase(Locale.ENGLISH));
                     if (var9 != null) {
                        String[] var10 = new String[var8.length - m];
                        if (var10.length > 0) {
                           System.arraycopy(var8, n, var10, o, var10.length);
                        }

                        var9.a(var3, var4, var8[p], var10);
                     }
                  }
               }
            }
         }
      }
   }

   static {
      b();
   }

   private static void b() {
      c = -2160323473957288024L;
      long var0 = c ^ 6664509851917338479L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(40 + 28),
               (byte)(58 + 11),
               (byte)(13 + 70),
               (byte)(26 + 21),
               (byte)(20 + 47),
               (byte)(10 + 56),
               (byte)(37 + 30),
               (byte)(26 + 21),
               (byte)(27 + 53),
               75,
               (byte)(19 + 48),
               (byte)(15 + 68),
               53,
               (byte)(76 + 4),
               (byte)(35 + 62),
               (byte)(12 + 88),
               (byte)(17 + 83),
               (byte)(64 + 41),
               (byte)(104 + 6),
               (byte)(70 + 33)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(60 + 8), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_384.A("ǇƢǋǃƟƜƍǎƿƟƪƗ", (byte)104, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_397.D("՟ԠՐ\u0557ԿՔթՈԿհԫԵ", (byte)104, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_183.F("ո֏՝Ֆջձաո՞֧֚տբ֨դ֤֞ջլցօ\u058b֢ւ֖ղ֤ժ֪\u058bֽ֖", (byte)104, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_241.C("էԵԼՄՂԾԹծՠծԫ\u0530լթ՟ՒՍՊ\u0558Ճ\u0558ՓՀՁ", (byte)104, 67);
         }
      }
   }

   @Generated
   private NLoginCore_099(NLoginCore_346 var1) {
      this.b = var1;
   }

   private static String a(int var0, long var1) {
      var1 ^= 51L;
      var1 ^= 6664509851917338479L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(45 + 23),
                     (byte)(54 + 15),
                     (byte)(4 + 79),
                     (byte)(19 + 28),
                     (byte)(44 + 23),
                     (byte)(54 + 12),
                     (byte)(14 + 53),
                     (byte)(29 + 18),
                     (byte)(38 + 42),
                     (byte)(8 + 67),
                     (byte)(32 + 35),
                     (byte)(40 + 43),
                     (byte)(5 + 48),
                     (byte)(42 + 38),
                     (byte)(91 + 6),
                     (byte)(25 + 75),
                     100,
                     (byte)(32 + 73),
                     (byte)(63 + 47),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(59 + 24)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_127.B("ĊėĖÙęĕĐęĤēàĞĢěĞĤæўќѝяѸѰѸ҇Ѿ҈", (byte)20, 66));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_099.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_091.C("ՎհղՒն֕֍֣֏՞֚֜֒֠գֈ֪֧֩֡֡ն", (byte)123, 67), NLoginCore_099.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_110.C("։֖֕\u0558֘֔֏֣֘֒՟֣֚֝֡֝ե࣯ࣝࣛࣜ࣎ࣷࣷआࣽइջ", (byte)123, 67) + var1 + NLoginCore_397.C("ՠ", (byte)123, 67) + var2.toString(), var4
         );
      }
   }
}
