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

public enum NLoginCore_555 {
   d,
   e,
   f;

   private static String[] a;
   private static String[] b;
   private static long c;
   private static int a = (12 >>> 34 | 12 << -34) & -1;
   private static int b = Integer.reverse(0);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int d = 8388608 >>> 86 | 8388608 << -86;
   private static int e = ('쀀' >>> 'N' | 49152 << ~78 + 1) & -1;
   private static int f = Integer.reverse(-1073741824);
   private static int g = Integer.reverse(0);
   private static int h = Integer.reverse(-1);
   private static long i = Long.reverse(3885478886694252771L);
   private static int j = Integer.reverse(0);
   private static int k = Integer.reverse(Integer.MIN_VALUE);
   private static long l = Long.reverse(-5631191353855773L);
   private static long m = Long.reverse(-3891110078048108544L);
   private static int n = 128 >>> 135 | 128 << -135;
   private static int o = 4096 >>> 139 | 4096 << -139;
   private static long p = Long.reverse(-5631191353855773L);
   private static long q = Long.reverse(-3891110078048108544L);
   private static int r = (268435456 >>> 27 | 268435456 << ~27 + 1) & -1;

   private static void b() {
      c = -4103045443573786625L;
      long var0 = c ^ -429178309420840584L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(64 + 4),
               (byte)(30 + 39),
               (byte)(52 + 31),
               47,
               (byte)(55 + 12),
               (byte)(65 + 1),
               (byte)(27 + 40),
               (byte)(42 + 5),
               (byte)(77 + 3),
               (byte)(22 + 53),
               (byte)(57 + 10),
               (byte)(70 + 13),
               (byte)(23 + 30),
               (byte)(35 + 45),
               (byte)(26 + 71),
               (byte)(10 + 90),
               (byte)(36 + 64),
               (byte)(27 + 78),
               (byte)(52 + 58),
               (byte)(77 + 26)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(14 + 55), (byte)(7 + 76)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_471.D("ՄԫճյՁՕՀԲԺՋժՁ", (byte)108, 68);
               b[1] = NLoginCore_223.B("ƝƞƨǎǄǎǀǒƪǕƓƙǅƥƶǍƨǟƙǄǠƽƪƫ", (byte)108, 66);
               b[2] = NLoginCore_091.E("֎ւճ֓յ֢֕ֆ֢ղջհ", (byte)108, 69);
               break;
            case 1:
               b[0] = NLoginCore_183.A("ƤǁƨǂƿǃǗƏƤǃƲǊǒǛƲǕƟƜƝǤƳƭƪƫ", (byte)108, 65);
               b[1] = NLoginCore_173.A("ƝƞƨǎǄǎǀǒƪǕƒǅǐƬǗƹưƓǎǕƮǣƪƫ", (byte)108, 65);
               b[2] = NLoginCore_138.D("Ձզ՜ՖկԮգկ\u0558զՄՁ", (byte)108, 68);
               break;
            case 2:
               b[0] = NLoginCore_138.E("չ֚֚ռ֔֔֕ղ֦֣ս֦է֡օկ\u0590֤֚օփ֭ք֭ձֳֹ֬ֆ֍֫շ", (byte)108, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_384.E("պժք֓ծշ֔ևֆ֢մչք֏ֲ֤֗֫\u058cֈ֢֣֯֗֨պֳֳ֥֑֭֙", (byte)108, 69);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_555.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_387.C("ϵЗЙϹНмдъжЅуйчсЊЯёѐшюшН", (byte)8, 67), NLoginCore_555.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_004.C("анмϿплжпъйІфшсфъЌޑݿޖބޅތޠހР", (byte)8, 67) + var1 + NLoginCore_521.C("Ї", (byte)8, 67) + var2.toString(), var4);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 83L;
      var1 ^= -429178309420840584L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(44 + 24),
                     (byte)(28 + 41),
                     (byte)(9 + 74),
                     (byte)(3 + 44),
                     (byte)(25 + 42),
                     (byte)(5 + 61),
                     (byte)(13 + 54),
                     (byte)(42 + 5),
                     (byte)(29 + 51),
                     (byte)(38 + 37),
                     67,
                     (byte)(65 + 18),
                     (byte)(51 + 2),
                     (byte)(47 + 33),
                     (byte)(96 + 1),
                     (byte)(94 + 6),
                     (byte)(7 + 93),
                     (byte)(5 + 100),
                     110,
                     (byte)(65 + 38)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(73 + 10)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_173.D("ӪӷӶҹӹӵӰӹԄӳӀӾԂӻӾԄӆࡋ࠹ࡐ࠾\u083fࡆ࡚࠺", (byte)70, 68));
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

   static {
      a = new String[e];
      b = new String[f];
      b();
   }
}
