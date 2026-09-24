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

public final class ηΩρεψωΛΔκιλ extends εΩχτδανΦχμΨγκως {
   private static int e = Integer.reverse(-1);
   private static int af = 2097152 >>> 116 | 2097152 << -116;
   private static long m;
   private static int ab = Integer.reverse(1073741824);
   private static String[] f = new String[af];
   private static long z = Long.reverse(1873497444986126336L);
   private static long y = Long.reverse(-8817720248976552763L);
   private static int d = Integer.reverse(0);
   private static int x = Integer.reverse(Integer.MIN_VALUE);
   private static String[] e = new String[ab];
   private static long n = Long.reverse(-6944222803990426427L);

   private static void b() {
      m = -6686755300657822303L;
      long var0 = m ^ 746812964394444689L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(40 + 28),
               (byte)(11 + 58),
               83,
               (byte)(19 + 28),
               (byte)(21 + 46),
               (byte)(5 + 61),
               (byte)(66 + 1),
               (byte)(21 + 26),
               (byte)(56 + 24),
               (byte)(27 + 48),
               (byte)(65 + 2),
               (byte)(9 + 74),
               (byte)(9 + 44),
               80,
               (byte)(65 + 32),
               (byte)(59 + 41),
               (byte)(54 + 46),
               (byte)(80 + 25),
               (byte)(19 + 91),
               (byte)(17 + 86)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(6 + 62), 69, 83}, StandardCharsets.UTF_8));
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
               f[0] = ΣδτΠνεγοΓορητ.C("ҏѯѴҕѴғіѳѮѷѵѦ", (byte)35, 67);
               f[1] = χφπρψπφΦθμπ.D("ѷ҄҄іҍ҄ѩѾҟҕѹѦ", (byte)35, 68);
               break;
            case 1:
               f[0] = ΣερμΔσατσκ.C("ҕҍѱѓѲҒҏҎҀҚҁҔқҌѴҜ҃ҒҦҙѿҪѱѲ", (byte)35, 67);
               f[1] = ΣδτΠνεγοΓορητ.E("ԶԙԥՕԱՒԸԴԵԭՋԽԾ՝բԻ՟ԧԨԺԞ՛ԲԳ", (byte)35, 69);
               break;
            case 2:
               f[0] = ςΦζσμτΓσ.D("ѥєїѨѺѰѩѾҌҠҞѵѱҁҔѽґѢѦҙѶ҄ѱѲ", (byte)35, 68);
            case 3:
            default:
               break;
            case 4:
               f[0] = οοθδΨιοΦΠβδζ.B("ĸĽĭĔĳğĮĎāĴĺč", (byte)35, 66);
         }
      }
   }

   public ηΩρεψωΛΔκιλ() {
      super(c<"㺀">(d & e, n), c<"㺃">(x, y ^ z));
   }

   private static String a(int var0, long var1) {
      var1 ^= 88L;
      var1 ^= 746812964394444689L;
      if (e[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(40 + 28),
                     (byte)(52 + 17),
                     (byte)(39 + 44),
                     (byte)(23 + 24),
                     (byte)(18 + 49),
                     (byte)(14 + 52),
                     (byte)(36 + 31),
                     (byte)(32 + 15),
                     (byte)(38 + 42),
                     (byte)(53 + 22),
                     (byte)(44 + 23),
                     (byte)(78 + 5),
                     (byte)(23 + 30),
                     (byte)(43 + 37),
                     (byte)(23 + 74),
                     100,
                     (byte)(89 + 11),
                     (byte)(33 + 72),
                     110,
                     (byte)(4 + 99)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(13 + 70)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(μζξτΩσσφυδεπλΨ.A("źƇƆŉƉƅƀƉƔƃŐƎƒƋƎƔŖӟӒӫӠӴӶӉӃӪӪӭ", (byte)76, 65));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         e[var0] = new String(var3.doFinal(Base64.getDecoder().decode(f[var0])), StandardCharsets.UTF_8);
      }

      return e[var0];
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ηΩρεψωΛΔκιλ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(φΨαξωυθανΣφυκη.E("ԤՆՈԨՌիգչեԴղընհԹ՞րտշսշՌ", (byte)64, 69), ηΩρεψωΛΔκιλ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ζοηκορΦνΣθγΩ.D("ӘӥӤҧӧӣӞӧӲӡҮӬӰөӬӲҴ࠽࠰ࡉ࠾ࡒࡔࠧࠡࡈࡈࡋӋ", (byte)64, 68) + var1 + χφπρψπφΦθμπ.D("ү", (byte)64, 68) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }
}
