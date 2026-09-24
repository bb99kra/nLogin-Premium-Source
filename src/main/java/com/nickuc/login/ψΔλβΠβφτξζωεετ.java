package com.nickuc.login;

import com.destroystokyo.paper.profile.PlayerProfile;
import com.destroystokyo.paper.profile.ProfileProperty;
import com.nickuc.login.bukkit.nLoginBukkit;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent.Result;

public class ψΔλβΠβφτξζωεετ implements ΦοιυξχςΩΦψξΓΣΨ {
   private static int o = 0 >>> 162 | 0 << ~162 + 1;
   private static int e = Integer.reverse(-1073741824);
   private static long k = Long.reverse(-5002149641758738106L);
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static long d = Long.reverse(Long.MIN_VALUE);
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   public static final boolean r;
   private static int f = (3 >>> 64 | 3 << -64) & -1;
   private static int a = (0 >>> 253 | 0 << -253) & -1;
   private static long c;
   private static String[] b = new String[f];
   private static int j = 8192 >>> 204 | 8192 << -204;
   private static long b = Long.reverse(-5002149641758738106L);
   private final nLoginBukkit j;
   private static String[] a = new String[e];
   private static final String m = c<"㺀">(g, ψΔλβΠβφτξζωεετ.h ^ ψΔλβΠβφτξζωεετ.i);
   private static int m = (0 >>> 171 | 0 << -171) & -1;
   private static long i = Long.reverse(Long.MIN_VALUE);
   private static long h = Long.reverse(-5002149641758738106L);
   private static long l = Long.reverse(Long.MIN_VALUE);

   static {
      b();
      r = (boolean)(ΓΛθσφζςηκ.a(AsyncPlayerPreLoginEvent.class, c<"㺃">(j, k ^ l)) != null ? n : o);
   }

   private static String a(int var0, long var1) {
      var1 ^= 1L;
      var1 ^= -3528483182182512142L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(54 + 14),
                     (byte)(10 + 59),
                     (byte)(55 + 28),
                     47,
                     (byte)(7 + 60),
                     (byte)(29 + 37),
                     (byte)(54 + 13),
                     (byte)(12 + 35),
                     (byte)(50 + 30),
                     (byte)(4 + 71),
                     (byte)(8 + 59),
                     (byte)(72 + 11),
                     (byte)(33 + 20),
                     (byte)(51 + 29),
                     (byte)(24 + 73),
                     (byte)(31 + 69),
                     (byte)(49 + 51),
                     (byte)(49 + 56),
                     (byte)(75 + 35),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), 69, (byte)(25 + 58)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΨΦνΨΦωυΩνβςμ.A("ƖƣƢťƥơƜƥưƟŬƪƮƧƪưŲԌәԁӹӨӻԐԏԊԃԗԄԅԕ", (byte)90, 65));
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
                  ψΔλβΠβφτξζωεετ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(φΨαξωυθανΣφυκη.E("ՉիխՍձ\u0590ֈ֞֊ՙ֗֍֛֕՞փ֥֤֢֜֜ձ", (byte)101, 69), ψΔλβΠβφτξζωεετ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            βθκςνθΩθυμςτκχ.F("ք֑\u0590Փ֓֏֊֓֞֍՚֘֜֕֘֞ՠࣺࣇࣱ࣯ࣩࣧࣖࣾࣽࣸअࣲࣳःպ", (byte)101, 70) + var1 + ΨφιωσρΓδΔθ.F("՛", (byte)101, 70) + var2.toString(), var4
         );
      }
   }

   @Generated
   public ψΔλβΠβφτξζωεετ(nLoginBukkit var1) {
      this.j = var1;
   }

   @EventHandler(
      priority = EventPriority.HIGHEST
   )
   public void b(AsyncPlayerPreLoginEvent var1) {
      if (var1.getLoginResult() == Result.ALLOWED) {
         InetAddress var2 = var1.getAddress();

         InetAddress var3;
         try {
            var3 = var1.getRawAddress();
         } catch (NoSuchMethodError var8) {
            var3 = null;
         }

         com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ var4 = com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ.a(var1.getName(), var2, var3);
         if (var4 != null) {
            UUID var5 = var4.c;
            ωομΦδΔπνΨεβυΓ var6 = var4.a;
            if (var5 != null || var6 != null) {
               PlayerProfile var7 = var1.getPlayerProfile();
               if (var5 != null) {
                  var7.setId(var5);
               }

               if (var6 != null) {
                  var7.setProperty(new ProfileProperty(c<"㺀">(a, b ^ d), var6.ce, var6.cf));
               }
            }
         }
      }
   }

   private static void b() {
      c = 7106391602650884445L;
      long var0 = c ^ -3528483182182512142L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(67 + 1),
               (byte)(18 + 51),
               (byte)(28 + 55),
               (byte)(21 + 26),
               (byte)(54 + 13),
               (byte)(6 + 60),
               (byte)(59 + 8),
               (byte)(13 + 34),
               (byte)(20 + 60),
               (byte)(50 + 25),
               (byte)(26 + 41),
               (byte)(53 + 30),
               (byte)(15 + 38),
               (byte)(64 + 16),
               (byte)(38 + 59),
               (byte)(39 + 61),
               (byte)(16 + 84),
               105,
               110,
               (byte)(2 + 101)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(50 + 18), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = ντθΔζβΔζ.F("ԯ՞ՒձծզմմիՇճբճՖճԶՖռՙ՟ււՉՊ", (byte)58, 70);
               b[1] = θεωψξβΛσσ.C("ҜӋҿӞӛӓӡӡӘҴӠӏӠӃӠңӃөӆӌӯӯҶҷ", (byte)58, 67);
               b[2] = βεξΠθρρςΔΦμ.B("ŖŝňōŨıĽšŝĵŬŗŏœńţļŰķūŖŷŔſłŐŅſŠŁŖŅ", (byte)58, 66);
               break;
            case 1:
               b[0] = ςΦζσμτΓσ.E("ԯ՞ՒձծզմմիՇճՋռյԯՐՙԼ՞ՒՍ՜ՉՊ", (byte)58, 69);
               b[1] = οοθδΨιοΦΠβδζ.F("ԯ՞ՒձծզմմիՇմպչղԯՇԽՎԸպձՌՉՊ", (byte)58, 70);
               b[2] = ΨΦνΨΦωυΩνβςμ.A("ŖŝňōŨıĽšŝĵŬŗŏœńţļŰķūŖźōĵœŏĸŐőŇŨŸ", (byte)58, 65);
               break;
            case 2:
               b[0] = ιΠοθΩΦξκ.A("ĞŜĩşĦŤŮŎńĬŅŪŴıŭōŉŸśŐŜſņŇ", (byte)58, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = πηγμΣΔκκ.B("ŚŚĩśūħņŞŊŋŴűįōņŋŔśŴŰűřņŇ", (byte)58, 66);
         }
      }
   }
}
