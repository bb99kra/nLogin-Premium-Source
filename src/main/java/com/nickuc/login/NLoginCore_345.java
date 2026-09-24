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

public class NLoginCore_345 extends NLoginCore_483<NLoginCore_383> {
   private static String[] d = new String[NLoginCore_345.v];
   private static int d = Integer.reverse(-1);
   private static int b = (0 >>> 18 | 0 << -18) & -1;
   private static long i = Long.reverse(2318320781899977936L);
   private static int u = Integer.reverse(-1073741824);
   private static long o = Long.reverse(-275752603465427760L);
   private static String[] c = new String[u];
   private static long p = Long.reverse(-2594073385365405696L);
   private static int v = Integer.reverse(-1073741824);
   private static int q = (0 >>> 203 | 0 << -203) & -1;
   private static long f;
   private static long t = Long.reverse(-2594073385365405696L);
   private static long s = Long.reverse(-275752603465427760L);
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static int r = 128 >>> 6 | 128 << -6;

   private static void b() {
      f = 804931691933742143L;
      long var0 = f ^ 3573141071853913842L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(51 + 17),
               (byte)(4 + 65),
               83,
               (byte)(19 + 28),
               (byte)(3 + 64),
               (byte)(27 + 39),
               (byte)(8 + 59),
               (byte)(6 + 41),
               (byte)(21 + 59),
               (byte)(23 + 52),
               (byte)(22 + 45),
               (byte)(25 + 58),
               (byte)(4 + 49),
               (byte)(75 + 5),
               97,
               (byte)(83 + 17),
               (byte)(44 + 56),
               (byte)(33 + 72),
               (byte)(43 + 67),
               (byte)(22 + 81)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(55 + 13), 69, 83}, StandardCharsets.UTF_8));
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
               d[0] = NLoginCore_110.A("ŃıÿĘăĪĘĠľīġłĽōďĎģėĶŗĮōńŚŉŖĶěıľŌĠ", (byte)39, 65);
               d[1] = NLoginCore_141.C("Ҙў҃ҀҨѴҥҪҕѪѿҎҦҎѻѯҴ҅ҪҢҨҹҩңѲҝҩұғѼӀґұҞҍӁ҄ҲҕҲӄҔ҄Ғ", (byte)39, 67);
               d[2] = NLoginCore_384.B("ĻāĦģŋėňōĸčĢıŉıĞĒŗĨōŅŋŜŌņĕŀŌŔĶğţĴŔŁİŤħŕĸŕŧķħĵ", (byte)39, 66);
               break;
            case 1:
               d[0] = NLoginCore_451.C("ҠҎќѵѠ҇ѵѽқ҈ѾҟҚҪѬѫҀѴғҴҋҧҖѵҤҔҽұҿҳҾҌ", (byte)39, 67);
               d[1] = NLoginCore_201.C("Ҙў҃ҀҨѴҥҪҕѪѿҎҦҎѻѯҴ҅ҪҢҨҹҩңѲҝҩұғѼӀґҫҹҙӆӁқӁ҇Ҵҿ҄Ғ", (byte)39, 67);
               d[2] = NLoginCore_387.A("ĻāĦģŋėňōĸčĢıŉıĞĒŗĨōŅŋŜŌņĕŀŌŔĶğţĴĳşŉěňŕŧŦĪńŦĵ", (byte)39, 65);
               break;
            case 2:
               d[0] = NLoginCore_446.E("ԽՙԯԮԽԽՌՀԸԡդԫ", (byte)39, 69);
            case 3:
            default:
               break;
            case 4:
               d[0] = NLoginCore_138.C("ѿҐџҟѷҤѴқѧҜѧҘѹѼҌҎҪѽѭҍҎҦѽѾ", (byte)39, 67);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 59L;
      var1 ^= 3573141071853913842L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(67 + 1),
                     (byte)(46 + 23),
                     (byte)(75 + 8),
                     (byte)(32 + 15),
                     (byte)(22 + 45),
                     (byte)(7 + 59),
                     (byte)(55 + 12),
                     (byte)(19 + 28),
                     (byte)(6 + 74),
                     (byte)(6 + 69),
                     (byte)(56 + 11),
                     (byte)(25 + 58),
                     (byte)(9 + 44),
                     80,
                     (byte)(71 + 26),
                     (byte)(23 + 77),
                     100,
                     (byte)(63 + 42),
                     (byte)(29 + 81),
                     (byte)(74 + 29)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(16 + 53), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_138.A("ƐƝƜşƟƛƖƟƪƙŦƤƨơƤƪŬӯԆӴӧӪԅԊӨԌӪԂ", (byte)87, 65));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         c[var0] = new String(var3.doFinal(Base64.getDecoder().decode(d[var0])), StandardCharsets.UTF_8);
      }

      return c[var0];
   }

   public NLoginCore_345(NLoginCore_383 var1) {
      super(var1);
   }

   @Override
   public void a(Object var1, Object var2) {
      if (var2 != null && !(var2 instanceof NLoginInterface_046)) {
         throw new IllegalArgumentException(a(b & d, i) + var2.getClass().getCanonicalName());
      } else if (!(var1 instanceof String)) {
         throw new IllegalArgumentException(a(n, o ^ p));
      } else {
         this.h.a().getProxy().registerChannel((String)var1);
         if (var2 != null) {
            this.h.a((NLoginInterface_013)var2, new NLoginInterface_013[q]);
         }
      }
   }

   @Override
   public void b(Object var1) {
      this.a(var1, null);
   }

   @Override
   public void c(Object var1) {
      if (!(var1 instanceof String)) {
         throw new IllegalArgumentException(a(r, s ^ t));
      } else {
         this.h.a().getProxy().unregisterChannel((String)var1);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_345.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_201.A("áăąåĉĨĠĶĢñįĥĳĭöěĽļĴĺĴĉ", (byte)29, 65), NLoginCore_345.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_397.B("ĜĩĨëīħĢīĶĥòİĴĭİĶøѻҒҀѳѶґҖѴҘѶҎď", (byte)29, 66) + var1 + NLoginCore_530.A("ó", (byte)29, 65) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }
}
