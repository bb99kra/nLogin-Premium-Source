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
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.Filter.Result;
import org.apache.logging.log4j.core.filter.AbstractFilter;
import org.apache.logging.log4j.message.Message;

public final class ωΓχοΦνμφνγ extends AbstractFilter {
   private static int i = 4 >>> 2 | 4 << -2;
   private static int j = Integer.reverse(0);
   private static final Object[] b = new Object[j];
   private static int e = Integer.reverse(0);
   private static long d = Long.reverse(-8722982843324016484L);
   private static int b = Integer.reverse(-1);
   private static int a = Integer.reverse(0);
   private static int g = Integer.reverse(0);
   private static String[] b = new String[i];
   private static int f = (16 >>> 132 | 16 << ~132 + 1) & -1;
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static String[] a = new String[h];
   private boolean ac;
   private static long c;

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ωΓχοΦνμφνγ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(θεωψξβΛσσ.E("բքֆզ֊ַ֣֩֡ղְִ֦֮շ֜־ֵֵֻֽ֊", (byte)126, 69), ωΓχοΦνμφνγ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ζοηκορΦνΣθγΩ.C("֒֟֞ա֛֡֝֘֡֬ը֦֪֣֦֬ծउࣔउं࣪ंंऍअࣼք", (byte)126, 67) + var1 + μεςΩΔΣγν.B("Ƶ", (byte)126, 66) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 62L;
      var1 ^= -1754330325357709675L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(3 + 66),
                     (byte)(31 + 52),
                     (byte)(12 + 35),
                     67,
                     (byte)(19 + 47),
                     (byte)(59 + 8),
                     (byte)(41 + 6),
                     (byte)(67 + 13),
                     (byte)(60 + 15),
                     (byte)(43 + 24),
                     (byte)(10 + 73),
                     (byte)(9 + 44),
                     (byte)(50 + 30),
                     (byte)(38 + 59),
                     (byte)(95 + 5),
                     (byte)(99 + 1),
                     (byte)(88 + 17),
                     (byte)(105 + 5),
                     (byte)(101 + 2)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(4 + 65), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΠΛΨοδΩσμνΛγΦφβς.A("ĎěĚÝĝęĔĝĨėäĢĦğĢĨê҅ѐ҅ѾѦѾѾ҉ҁѸ", (byte)22, 65));
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
      b();
   }

   public Result filter(Logger var1, Level var2, Marker var3, String var4, Object... var5) {
      return this.a(var1.getName(), var4, var5);
   }

   private Result a(String var1, String var2, Object[] var3) {
      return var2 != null && !this.ac && ψΓωτιμωκχψΛΨ.d().stream().anyMatch(var4 -> {
         try {
            return var4.filter(var1, var2, var3 == null ? b : var3);
         } catch (Throwable var6) {
            ψΓωτιμωκχψΛΨ.c(c<"㺀">(a & b, d), var6);
            this.ac = (boolean)f;
            return (boolean)g;
         }
      }) ? Result.DENY : Result.NEUTRAL;
   }

   public static void as() {
      Logger var0 = (Logger)LogManager.getRootLogger();
      var0.addFilter(new ωΓχοΦνμφνγ());
   }

   public Result filter(Logger var1, Level var2, Marker var3, Message var4, Throwable var5) {
      return this.a(var1.getName(), var4, b);
   }

   public Result filter(Logger var1, Level var2, Marker var3, Object var4, Throwable var5) {
      return var4 == null ? Result.NEUTRAL : this.a(var1.getName(), var4.toString(), b);
   }

   private static void b() {
      c = 4114631447380070239L;
      long var0 = c ^ -1754330325357709675L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(6 + 62),
               (byte)(20 + 49),
               (byte)(2 + 81),
               (byte)(9 + 38),
               67,
               66,
               (byte)(31 + 36),
               (byte)(6 + 41),
               (byte)(64 + 16),
               (byte)(45 + 30),
               (byte)(53 + 14),
               (byte)(13 + 70),
               (byte)(12 + 41),
               (byte)(7 + 73),
               (byte)(27 + 70),
               (byte)(50 + 50),
               (byte)(33 + 67),
               (byte)(27 + 78),
               (byte)(2 + 108),
               (byte)(93 + 10)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(61 + 7), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = ΦδφπθΩΩλζξ.C("ыѾёѨҀѰођяѮѡѓцѓѹѿҍўѝ҂҂ѣѳ҄҃ѱѕҁҗ҂ґ҆҆ҊѮѶіҌҐѶҘҝѾѫ", (byte)26, 67);
               break;
            case 1:
               b[0] = ςπυηννναΣ.B("ûĮāĘİĠîĂÿĞđăöăĩįĽĎčĲĲēģĴĳġąıŇĲŁĶČċĞŉęěŎĭĵŃĪě", (byte)26, 66);
               break;
            case 2:
               b[0] = δΛψπξκσβγςα.A("ģãþħĝęñāīĂĖéćĸðĲĬĝĺķįįĆć", (byte)26, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = λΣΩσμφγχ.A("ÿċûċęĉąġąďđİĸāĂúĘĩĮľĐđŁĕĲĕĸÿňĦüĈ", (byte)26, 65);
         }
      }
   }

   public Result filter(LogEvent var1) {
      if (var1 == null) {
         return Result.NEUTRAL;
      } else {
         Message var2 = var1.getMessage();
         return var2 == null ? Result.NEUTRAL : this.a(var1.getLoggerName(), var2, var2.getParameters());
      }
   }

   private Result a(String var1, Message var2, Object[] var3) {
      return var2 != null ? this.a(var1, var2.getFormattedMessage(), var3) : Result.NEUTRAL;
   }
}
