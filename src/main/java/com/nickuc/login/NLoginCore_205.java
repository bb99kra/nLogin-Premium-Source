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
import org.bukkit.entity.Player;

public class NLoginCore_205 {
   private static int b = Integer.reverse(0);
   private static int c = 256 >>> 136 | 256 << -136;
   private static String[] b = new String[NLoginCore_205.d];
   private static String[] a = new String[c];
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int f = -1 >>> 178 | -1 << -178;
   private static long c;
   private static int h = Integer.reverse(0);
   public static final boolean j;
   private static int e = Integer.reverse(0);
   private static int j = (0 >>> 175 | 0 << ~175 + 1) & -1;
   private static int d = Integer.reverse(Integer.MIN_VALUE);
   private static long g = Long.reverse(-8176713518986332830L);

   public static void a(Player var0, boolean var1) {
      if (j) {
         var0.setGliding(var1);
      }
   }

   private static void b() {
      c = 5093278047144927585L;
      long var0 = c ^ -6253923773708946156L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(7 + 61),
               (byte)(22 + 47),
               (byte)(43 + 40),
               (byte)(21 + 26),
               67,
               (byte)(26 + 40),
               (byte)(33 + 34),
               (byte)(17 + 30),
               (byte)(67 + 13),
               75,
               (byte)(49 + 18),
               (byte)(46 + 37),
               (byte)(29 + 24),
               (byte)(16 + 64),
               (byte)(20 + 77),
               (byte)(22 + 78),
               (byte)(39 + 61),
               (byte)(55 + 50),
               (byte)(66 + 44),
               (byte)(86 + 17)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(7 + 61), 69, (byte)(53 + 30)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_232.B("ƭǕǁǌǑƮǚǛǄǅǗǔƩǨƿƭǅǞƺƿǤǳƺƻ", (byte)116, 66);
               break;
            case 1:
               b[0] = NLoginCore_397.F("ն֞֊֚֕շ֣֤֍֎ֳ֪֠լ֢֔֎ֵֺ֭կֆփք", (byte)116, 70);
               break;
            case 2:
               b[0] = NLoginCore_521.C("ֆՕՠՋք\u058bբՙք՜ժՇՓ֓չ֊խ\u0558ճ\u0557Օ֍դե", (byte)116, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_384.F("֧֔գօպ։ը֎֢դ֩ո", (byte)116, 70);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 16L;
      var1 ^= -6253923773708946156L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(29 + 39),
                     69,
                     (byte)(70 + 13),
                     (byte)(37 + 10),
                     (byte)(31 + 36),
                     (byte)(43 + 23),
                     67,
                     (byte)(25 + 22),
                     (byte)(55 + 25),
                     (byte)(17 + 58),
                     (byte)(50 + 17),
                     (byte)(12 + 71),
                     (byte)(11 + 42),
                     (byte)(23 + 57),
                     (byte)(28 + 69),
                     (byte)(40 + 60),
                     (byte)(80 + 20),
                     (byte)(75 + 30),
                     (byte)(79 + 31),
                     (byte)(75 + 28)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(23 + 46), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_004.F("\u0590֝֜՟֛֖֪֟֟֙զ֤֤֪֨֡լࣳअࣼऊऋआࣻࣿंࣛएअअऑ", (byte)113, 70));
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

   public static boolean a(Player var0) {
      return (boolean)(j && var0.isGliding() ? a : b);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_205.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_201.E("Լ՞ՠՀդփջ֑սՌ֊ր֎ֈՑն֘֗֏֕֏դ", (byte)88, 69), NLoginCore_205.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_092.F("շքփՆֆւսֆ֑րՍ\u058b֏ֈ\u058b֑Փࣱࣲࣣ࣭ࣚ࣬\u08e2ࣦࣩࣂࣶ࣬࣬ࣸխ", (byte)88, 70) + var1 + NLoginCore_553.F("Վ", (byte)88, 70) + var2.toString(), var4
         );
      }
   }

   static {
      b();
      j = (boolean)(NLoginCore_546.a(Player.class, a(e & f, g)) != null ? i : j);
   }
}
