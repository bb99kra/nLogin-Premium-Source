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

public enum ωλΛνρκηΦηβζ {
   a,
   b;

   private static String[] a = new String[ωλΛνρκηΦηβζ.d];
   private static String[] b = new String[ωλΛνρκηΦηβζ.e];
   private static long c;
   private static int a = Integer.reverse(1073741824);
   private static int b = Integer.reverse(0);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int d = Integer.reverse(1073741824);
   private static int e = Integer.reverse(1073741824);
   private static int f = Integer.reverse(0);
   private static long g = Long.reverse(-9128685406433065828L);
   private static int h = Integer.reverse(0);
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static long j = Long.reverse(-1490580438412704612L);
   private static long k = Long.reverse(7638104968020361216L);
   private static int l = Integer.reverse(Integer.MIN_VALUE);

   private static void b() {
      c = 4117348720522431191L;
      long var0 = c ^ 602647630170730654L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(48 + 20),
               (byte)(62 + 7),
               (byte)(35 + 48),
               (byte)(29 + 18),
               (byte)(60 + 7),
               (byte)(15 + 51),
               (byte)(44 + 23),
               (byte)(36 + 11),
               (byte)(66 + 14),
               (byte)(61 + 14),
               (byte)(47 + 20),
               (byte)(45 + 38),
               (byte)(6 + 47),
               80,
               (byte)(28 + 69),
               (byte)(68 + 32),
               (byte)(96 + 4),
               (byte)(83 + 22),
               (byte)(106 + 4),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(60 + 23)}, StandardCharsets.UTF_8));
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
               b[0] = ντθΔζβΔζ.D("ДювЛдксѐѕЯЧЭ", (byte)16, 68);
               b[1] = ςπυηννναΣ.C("џЕѠёПрЖўждіѩмсЧоъїкѡфыий", (byte)16, 67);
               break;
            case 1:
               b[0] = οοθδΨιοΦΠβδζ.C("їзсрџвэРУхѠѨѨѝѣіжўТѠѩлий", (byte)16, 67);
               b[1] = φδχεθοκψαλΛογλ.D("џЕѠёПрЖўждїѥѩшѫЫщѨѫѲуѱий", (byte)16, 68);
               break;
            case 2:
               b[0] = λΣΩσμφγχ.E("ԳԦԳ\u0530ՇՂՋՌԡՄԧ\u0530Մԯ\u0530ՓԓԳԥՁԘՔՏՉ՜ԐՐԚ\u0530Լ՛Է", (byte)16, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = ςπυηννναΣ.B("ĄĎęĐÙėïûāýČç", (byte)16, 66);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 86L;
      var1 ^= 602647630170730654L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(51 + 17),
                     (byte)(5 + 64),
                     (byte)(54 + 29),
                     (byte)(39 + 8),
                     (byte)(15 + 52),
                     (byte)(48 + 18),
                     (byte)(22 + 45),
                     (byte)(30 + 17),
                     (byte)(4 + 76),
                     75,
                     (byte)(39 + 28),
                     (byte)(53 + 30),
                     (byte)(37 + 16),
                     (byte)(23 + 57),
                     (byte)(48 + 49),
                     (byte)(11 + 89),
                     (byte)(60 + 40),
                     (byte)(52 + 53),
                     (byte)(6 + 104),
                     (byte)(84 + 19)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(35 + 48)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(πψυκΠΨμΛΩβΣφμφσ.D("ԯԼԻӾԾԺԵԾՉԸԅՃՇՀՃՉԋࢦ࢙ࡺ࢝ࢢ࢚࢜ࢊ࢜࢘࢝", (byte)93, 68));
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
                  ωλΛνρκηΦηβζ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(δΛψπξκσβγςα.A("ƅƧƩƉƭǌǄǚǆƕǓǉǗǑƚƿǡǠǘǞǘƭ", (byte)111, 65), ωλΛνρκηΦηβζ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΨφιωσρΓδΔθ.B("ǀǍǌƏǏǋǆǏǚǉƖǔǘǑǔǚƜԷԪԋԮԳԭԫԛԭԩԮƳ", (byte)111, 66) + var1 + δΛψπξκσβγςα.C("Լ", (byte)111, 67) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }
}
