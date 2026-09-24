package com.nickuc.login;

import com.velocitypowered.api.proxy.ConsoleCommandSource;
import com.velocitypowered.api.proxy.ProxyServer;
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

public class νωδΠΛσμμφζκΠ implements εςοεωζφπωΨ {
   private static int d = Integer.reverse(Integer.MIN_VALUE);
   private final ProxyServer b;
   private static int e = Integer.reverse(0);
   private static int b = Integer.reverse(0);
   private static int i = 1024 >>> 138 | 1024 << -138;
   private static String[] a = new String[νωδΠΛσμμφζκΠ.h];
   private static int c = (-2147483625 >>> 255 | -2147483625 << -255) & -1;
   private static long c;
   private static int a = (16 >>> 195 | 16 << ~195 + 1) & -1;
   private static String[] b = new String[i];
   private final ConsoleCommandSource a;
   private static long g = Long.reverse(-4153938131572995779L);
   private static int h = (8 >>> 35 | 8 << -35) & -1;
   private static int f = (-1 >>> 46 | -1 << -46) & -1;

   @Override
   public void l(String var1) {
      if (var1.length() >= a && var1.charAt(b) == c) {
         var1 = var1.substring(d);
      }

      this.b.getCommandManager().executeImmediatelyAsync(this.a, var1);
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 107L;
      var1 ^= -211588504712205062L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(64 + 4),
                     (byte)(4 + 65),
                     (byte)(36 + 47),
                     (byte)(9 + 38),
                     (byte)(60 + 7),
                     (byte)(56 + 10),
                     (byte)(54 + 13),
                     (byte)(39 + 8),
                     (byte)(59 + 21),
                     (byte)(14 + 61),
                     (byte)(52 + 15),
                     83,
                     (byte)(25 + 28),
                     (byte)(73 + 7),
                     (byte)(96 + 1),
                     (byte)(77 + 23),
                     (byte)(67 + 33),
                     (byte)(99 + 6),
                     110,
                     (byte)(23 + 80)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(48 + 21), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(δΛψπξκσβγςα.C("ҮһҺѽҽҹҴҽӈҷ҄ӂӆҿӂӈҊ࠙ࠦࠒ߿\u07fbࠤࠞࠟࠪࠛࠠࠇ", (byte)50, 67));
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

   @Override
   public String getName() {
      return c<"㺀">(e & f, g);
   }

   public static νωδΠΛσμμφζκΠ a(ProxyServer var0, ConsoleCommandSource var1) {
      return new νωδΠΛσμμφζκΠ(var0, var1);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  νωδΠΛσμμφζκΠ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΦδφπθΩΩλζξ.A("ƍƯƱƑƵǔǌǢǎƝǛǑǟǙƢǇǩǨǠǦǠƵ", (byte)115, 65), νωδΠΛσμμφζκΠ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΣφδσΔζιΠρα.F("֒֟֞ա֛֡֝֘֡֬ը֦֪֣֦֬ծࣽऊࣶࣣࣟईंःऎࣿऄ࣫ֆ", (byte)115, 70) + var1 + ΦδφπθΩΩλζξ.F("թ", (byte)115, 70) + var2.toString(), var4
         );
      }
   }

   @Override
   public <T> T c() {
      return (T)this.a;
   }

   @Override
   public boolean i(String var1) {
      return this.a.hasPermission(var1);
   }

   private static void b() {
      c = -4858780345061058040L;
      long var0 = c ^ -211588504712205062L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(58 + 10),
               (byte)(48 + 21),
               83,
               (byte)(41 + 6),
               (byte)(16 + 51),
               (byte)(47 + 19),
               (byte)(28 + 39),
               (byte)(27 + 20),
               (byte)(45 + 35),
               (byte)(41 + 34),
               (byte)(42 + 25),
               (byte)(57 + 26),
               (byte)(52 + 1),
               (byte)(52 + 28),
               (byte)(68 + 29),
               (byte)(13 + 87),
               (byte)(28 + 72),
               (byte)(11 + 94),
               (byte)(43 + 67),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(62 + 6), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = φδχεθοκψαλΛογλ.C("суРМцЦчТэБЪЛ", (byte)10, 67);
               break;
            case 1:
               b[0] = ΨφιωσρΓδΔθ.E("ԧӻԑՂԿԡՆԶԹԾԪԷӽԞՂՋԥԱԚՂՊԜԙԚ", (byte)10, 69);
               break;
            case 2:
               b[0] = ξψθρΣΠΣς.A("ĀîûÇËîþĐĀĕñãîĘäóÛċæĒğôģĢĂĖäøôęõĘ", (byte)10, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = δΛψπξκσβγςα.D("ЖЙФъТКѓшвЦЮЛ", (byte)10, 68);
         }
      }
   }

   @Generated
   private νωδΠΛσμμφζκΠ(ProxyServer var1, ConsoleCommandSource var2) {
      this.b = var1;
      this.a = var2;
   }

   @Override
   public void k(String var1) {
      this.a.sendMessage(ΩτωνοφχεΠ.a(var1));
   }
}
