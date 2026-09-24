package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageListener;
import org.jetbrains.annotations.NotNull;

public class NLoginCore_504 implements PluginMessageListener {
   private static long b = Long.reverse(-9068905926125636227L);
   private static int e = (262144 >>> 50 | 262144 << -50) & -1;
   private static int f = 4194304 >>> 86 | 4194304 << ~86 + 1;
   private static long d = Long.reverse(-1441151880758558720L);
   private static int a = (0 >>> 242 | 0 << -242) & -1;
   private static long c;
   private static String[] b = new String[f];
   private static String[] a = new String[e];

   private static void b() {
      c = -4707075387310267327L;
      long var0 = c ^ -3483668304783071438L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(9 + 59),
               (byte)(17 + 52),
               (byte)(23 + 60),
               (byte)(28 + 19),
               (byte)(24 + 43),
               (byte)(45 + 21),
               67,
               (byte)(5 + 42),
               (byte)(53 + 27),
               (byte)(6 + 69),
               (byte)(66 + 1),
               (byte)(20 + 63),
               (byte)(16 + 37),
               (byte)(6 + 74),
               (byte)(85 + 12),
               (byte)(14 + 86),
               (byte)(86 + 14),
               105,
               (byte)(22 + 88),
               (byte)(83 + 20)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(19 + 50), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_232.A("ǍƬǂǆǆǆǴǣǯǕǬǇǇǐƲǷǕƹƾǱǑǏǌǍ", (byte)125, 65);
               break;
            case 1:
               b[0] = NLoginCore_223.A("ǍƬǂǆǆǆǴǣǯǕǪƵǔǧƶǕǸǺǙǜǟǏǌǍ", (byte)125, 65);
               break;
            case 2:
               b[0] = NLoginCore_324.B("ǐƥǳǬƴǠǬƯƺǏǐǆǙǩǛȂƿǑǒȂǐǵǌǍ", (byte)125, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_092.D("՛֥֑֤֤֚֙իլ֙պըր\u058c֛փ֖֑փ֗ց֨տր", (byte)125, 68);
         }
      }
   }

   public void onPluginMessageReceived(@NotNull String var1, Player var2, byte[] var3) {
      if (var1.equals(a(a, b ^ d))) {
         this.c.a(NLoginType_018.a(this.c).b().a(var2), var3);
      }
   }

   static {
      b();
   }

   @Generated
   public NLoginCore_504(NLoginType_018 var1) {
      this.c = var1;
   }

   private static String a(int var0, long var1) {
      var1 ^= 55L;
      var1 ^= -3483668304783071438L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(15 + 53),
                     (byte)(55 + 14),
                     (byte)(68 + 15),
                     (byte)(34 + 13),
                     67,
                     (byte)(65 + 1),
                     (byte)(47 + 20),
                     (byte)(40 + 7),
                     (byte)(5 + 75),
                     75,
                     (byte)(66 + 1),
                     (byte)(30 + 53),
                     (byte)(13 + 40),
                     (byte)(53 + 27),
                     (byte)(9 + 88),
                     (byte)(96 + 4),
                     (byte)(22 + 78),
                     (byte)(40 + 65),
                     (byte)(5 + 105),
                     (byte)(76 + 27)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(65 + 3), (byte)(62 + 7), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_223.B("ĎěĚÝĝęĔĝĨėäĢĦğĢĨêѸ҃ѹѹѶѧѺѹҋљѯ҂Ҍҋѭ", (byte)22, 66));
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
                  NLoginCore_504.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_004.D("уѥѧчѫҊ҂Ҙ҄ѓґ҇ҕҏјѽҟҞҖҜҖѫ", (byte)34, 68), NLoginCore_504.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_092.C("ѾҋҊэҍ҉҄ҍҘ҇єҒҖҏҒҘњߨ߳ߩߩߦߗߪߩ\u07fb߉ߟ߲\u07fc\u07fbߝѵ", (byte)34, 67) + var1 + NLoginCore_138.E("Ԙ", (byte)34, 69) + var2.toString(), var4
         );
      }
   }
}
