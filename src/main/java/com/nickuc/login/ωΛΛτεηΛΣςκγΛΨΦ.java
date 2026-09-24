package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import javax.annotation.CheckReturnValue;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class ωΛΛτεηΛΣςκγΛΨΦ {
   private static long e = Long.reverse(-6052837899185946624L);
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static long d = Long.reverse(-3573723020870811392L);
   private static int j = Integer.reverse(1073741824);
   private static int f = 16777216 >>> 24 | 16777216 << -24;
   private static int a = (33554432 >>> 153 | 33554432 << ~153 + 1) & -1;
   private final Object[] a;
   private static String[] a = new String[ωΛΛτεηΛΣςκγΛΨΦ.i];
   private static int i = Integer.reverse(1073741824);
   private final String Z;
   private static int b = (0 >>> 102 | 0 << -102) & -1;
   private static long c;
   private static long g = Long.reverse(7090800896742523136L);
   private static String[] b = new String[j];

   public long a(ΨδΨξξοζεΦεςνδς var1) {
      νξΓωΔΔγλκμ var2 = var1.a();

      long var6;
      try {
         PreparedStatement var3 = var2.b().prepareStatement(this.Z, a);

         try {
            var1.a(var3, this.a);
            int var4 = var3.executeUpdate();
            if (var4 == 0) {
               throw new RuntimeException(c<"㺀">(b, d ^ e) + var4);
            }

            ResultSet var5 = var3.getGeneratedKeys();
            if (!var5.next()) {
               throw new SQLException(c<"㺃">(f, g));
            }

            var6 = var5.getLong(h);
         } catch (Throwable var10) {
            if (var3 != null) {
               try {
                  var3.close();
               } catch (Throwable var9) {
                  var10.addSuppressed(var9);
               }
            }

            throw var10;
         }

         if (var3 != null) {
            var3.close();
         }
      } catch (Throwable var11) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var8) {
               var11.addSuppressed(var8);
            }
         }

         throw var11;
      }

      if (var2 != null) {
         var2.close();
      }

      return var6;
   }

   static {
      b();
   }

   @CheckReturnValue
   public θβυσωφιλτπχΓμ<ResultSet> a(ΨδΨξξοζεΦεςνδς var1) {
      return var1.a(this.Z, this.a);
   }

   private static void b() {
      c = 36093612834547315L;
      long var0 = c ^ 7167257007601741778L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(32 + 36),
               (byte)(27 + 42),
               83,
               (byte)(36 + 11),
               (byte)(37 + 30),
               (byte)(5 + 61),
               (byte)(16 + 51),
               47,
               (byte)(63 + 17),
               (byte)(8 + 67),
               (byte)(39 + 28),
               (byte)(47 + 36),
               (byte)(35 + 18),
               (byte)(3 + 77),
               (byte)(18 + 79),
               (byte)(58 + 42),
               (byte)(97 + 3),
               (byte)(39 + 66),
               (byte)(84 + 26),
               (byte)(31 + 72)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(50 + 33)}, StandardCharsets.UTF_8));
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
               b[0] = οΩνΩρωλΨηΛδωδ.F("ԧԼՋԾ՛աՒըԾԪՄՊթՈՒՃոՊժչՌԷՙղիտՠՆգՓց՜ֈգ՜Շ։ց՞հւՎթղբժշնՖըեֈսՠ\u0557\u0590մծ\u0557ջ֝ր֪ֈ", (byte)54, 70);
               b[1] = πχσδΦΦνθΔπ.A("ĠĵńķŔŚŋšķģĻōūŏĻĥŔľňĴŃŹśœũĻŻŐĹŎƃŋŃŘƄŔŶŲŁƂřŹƅūŢőŧŒŒŐƄſšƗŞş", (byte)54, 65);
               break;
            case 1:
               b[0] = ξψθρΣΠΣς.B("ĠĵńķŔŚŋšķģĽŃŢŁŋļűŃţŲŅİŒūŤŸřĿŜŌźŕƁŜŕŀƂźŗũŻŇŢūśţŰůŏšŞƁŶŒƈŻŕƌƇŴƜơŴƙ", (byte)54, 66);
               b[1] = ςΦζσμτΓσ.F("ԧԼՋԾ՛աՒըԾԪՂՔղՖՂԬ՛ՅՏԻՊրբ՚հՂւ\u0557ՀՕ֊ՒՊ՟\u058b՛սչՈ։ՠր֍Տլ\u058cծխղ֜Տ֔\u058bըեզ", (byte)54, 70);
               break;
            case 2:
               b[0] = βεξΠθρρςΔΦμ.B("ōĺĞšļĶŁīŬĺĶŊİĬūŝŮŢŭŠřŭŏŲŽžŕŠƁŒĴŻ", (byte)54, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = μζξτΩσσφυδεπλΨ.E("ԡԤՙԾ՚ՋձԯՃմզէՆէաԸՎչԹէ՞վՅՆ", (byte)54, 69);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 53L;
      var1 ^= 7167257007601741778L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(19 + 50),
                     (byte)(46 + 37),
                     (byte)(18 + 29),
                     67,
                     (byte)(37 + 29),
                     (byte)(42 + 25),
                     (byte)(6 + 41),
                     (byte)(47 + 33),
                     (byte)(35 + 40),
                     (byte)(45 + 22),
                     (byte)(70 + 13),
                     (byte)(24 + 29),
                     (byte)(13 + 67),
                     (byte)(81 + 16),
                     (byte)(33 + 67),
                     (byte)(31 + 69),
                     (byte)(78 + 27),
                     (byte)(25 + 85),
                     (byte)(44 + 59)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(55 + 28)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(βθκςνθΩθυμςτκχ.B("żƉƈŋƋƇƂƋƖƅŒƐƔƍƐƖŘӳӆӇӱӣӦӋӔӴӭӧӐӞӝ", (byte)77, 66));
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
                  ωΛΛτεηΛΣςκγΛΨΦ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΣδτΠνεγοΓορητ.E("ӷԙԛӻԟԾԶՌԸԇՅԻՉՃԌԱՓՒՊՐՊԟ", (byte)19, 69), ωΛΛτεηΛΣςκγΛΨΦ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            χΠξΦιζΨΣωΦσΨζ.E("ԲԿԾԁՁԽԸՁՌԻԈՆՊՃՆՌԎࢩࡼࡽࢧ࢙࢜ࢁࢊࢪࢣ࢝ࢆ\u0894\u0893Ԩ", (byte)19, 69) + var1 + ΣδτΠνεγοΓορητ.B("ß", (byte)19, 66) + var2.toString(), var4
         );
      }
   }

   public boolean a(ΨδΨξξοζεΦεςνδς var1) {
      return var1.a(this.Z, this.a).d();
   }

   public int a(ΨδΨξξοζεΦεςνδς var1) {
      return var1.b(this.Z, this.a).d();
   }

   @Generated
   public ωΛΛτεηΛΣςκγΛΨΦ(String var1, Object[] var2) {
      this.Z = var1;
      this.a = var2;
   }
}
