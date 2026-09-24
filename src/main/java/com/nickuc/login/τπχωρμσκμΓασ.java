package com.nickuc.login;

import com.nickuc.login.lib.hikari.HikariConfig;
import com.nickuc.login.lib.hikari.HikariDataSource;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class τπχωρμσκμΓασ {
   private static long b = Long.reverse(-4233710832601742260L);
   private static long d = Long.reverse(-7116014594118859700L);
   private static int f = 512 >>> 104 | 512 << -104;
   private static String[] a = new String[f];
   private static String[] b = new String[τπχωρμσκμΓασ.g];
   private static int a = 0 >>> 5 | 0 << -5;
   private static int g = (4 >>> 193 | 4 << -193) & -1;
   private final HikariDataSource a;
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static long e = Long.reverse(6341068275337658368L);
   private static long c;

   private static void b() {
      c = 3612784874499046585L;
      long var0 = c ^ -7525113790918164601L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(6 + 62),
               (byte)(35 + 34),
               (byte)(76 + 7),
               47,
               (byte)(65 + 2),
               (byte)(53 + 13),
               (byte)(33 + 34),
               (byte)(13 + 34),
               (byte)(66 + 14),
               (byte)(70 + 5),
               67,
               (byte)(17 + 66),
               (byte)(27 + 26),
               (byte)(26 + 54),
               (byte)(41 + 56),
               (byte)(44 + 56),
               (byte)(66 + 34),
               (byte)(97 + 8),
               (byte)(80 + 30),
               (byte)(89 + 14)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(8 + 60), (byte)(30 + 39), 83}, StandardCharsets.UTF_8));
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
               b[0] = ζοηκορΦνΣθγΩ.C("рФЪјЩѡсѤёѨѱцбђѦѻмєњѬѱє҂ѱмѷѓ҃ѺффѫѠѧѮэѮҏѮьѬҐіќ", (byte)21, 67);
               b[1] = ντθΔζβΔζ.D("ѨѨѭЦЫхЯѦдѬѭгѦѐѧјмћѬяйѻрпзѿҀѱ҄ѥф҇ѻіѣ҆ѧғѬѬѴяііѭҔѕѕҐҟѧѻҊѫҖҟѤҀҜҐѣҗҟҢ", (byte)21, 68);
               break;
            case 1:
               b[0] = ςΦζσμτΓσ.B("õÙßčÞĖöęĆĝĦûæćěİñĉďġĦĉķĦñĬĈĸįùùĠĶİĄįŇęĨÿĒĩŊđ", (byte)21, 66);
               b[1] = πψυκΠΨμΛΩβΣφμφσ.B("ĝĝĢÛàúäěéġĢèěąĜčñĐġĄîİõôìĴĵĦĹĚùļİċĘĻĜňġġĩĄċċĢŉĊĊŅŔĜİĿĥđİēīęęňľįĻ", (byte)21, 66);
               break;
            case 2:
               b[0] = πχσδΦΦνθΔπ.D("ѨпѠЩёўЪѮоѱщЪаѴжвѶѴзѿћну҃ѝсйѺфѣѸ҅", (byte)21, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = βθκςνθΩθυμςτκχ.C("учХйѤыЬѮѬѱёѸгёћђўѕѻѸўѰчш", (byte)21, 67);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  τπχωρμσκμΓασ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ςπυηννναΣ.E("Էՙ՛Ի՟վն\u058cոՇօջ։փՌձ֓֒֊\u0590֊՟", (byte)83, 69), τπχωρμσκμΓασ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(πηγμΣΔκκ.D("ԑԞԝӠԠԜԗԠԫԚӧԥԩԢԥԫӭࢃࢀ࢈ࢋࢄࢀ࢈ࢀࢃ࡛ࡺࢍԅ", (byte)83, 68) + var1 + πχσδΦΦνθΔπ.C("Ө", (byte)83, 67) + var2.toString(), var4);
      }
   }

   public τπχωρμσκμΓασ(HikariConfig var1) {
      this.a = new HikariDataSource(var1);
   }

   private static String a(int var0, long var1) {
      var1 ^= 26L;
      var1 ^= -7525113790918164601L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(25 + 43),
                     (byte)(18 + 51),
                     (byte)(33 + 50),
                     (byte)(44 + 3),
                     (byte)(49 + 18),
                     (byte)(7 + 59),
                     (byte)(62 + 5),
                     (byte)(3 + 44),
                     (byte)(34 + 46),
                     (byte)(58 + 17),
                     (byte)(5 + 62),
                     83,
                     (byte)(6 + 47),
                     80,
                     (byte)(84 + 13),
                     (byte)(66 + 34),
                     (byte)(60 + 40),
                     (byte)(75 + 30),
                     (byte)(64 + 46),
                     (byte)(75 + 28)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(23 + 45), (byte)(51 + 18), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(οοθδΨιοΦΠβδζ.F("ւ֏֎Ց֑֍ֈ֑֜\u058b\u0558֖֖֚֓֜՞ࣱࣱࣱࣹࣹࣴࣼࣵࣴ࣌࣫ࣾ", (byte)99, 70));
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

   @Generated
   public HikariDataSource a() {
      return this.a;
   }

   public Connection d() {
      try {
         return this.a.getConnection();
      } catch (Exception var2) {
         throw new SQLException(c<"㺀">(c, d ^ e), var2);
      }
   }

   public void c() {
      if (this.a.isClosed()) {
         throw new IllegalStateException(c<"㺀">(a, b));
      } else {
         this.a.close();
      }
   }

   static {
      b();
   }
}
