package com.nickuc.login;

import com.nickuc.login.proxy.velocity.nLoginVelocity;
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

public class δαηςλαΛΓξμθ implements ΛΠπδσηδωαΠαΓκρ {
   private static long f = Long.reverse(6548221958800251987L);
   private static long g = Long.reverse(4467570830351532032L);
   private static int a = 0 >>> 107 | 0 << -107;
   private static int b = -1 >>> 34 | -1 << -34;
   private static long c;
   private static int i = (2097152 >>> 20 | 2097152 << -20) & -1;
   private αεθζδβΨξςρπΩζθδ a;
   private static String[] b = new String[i];
   private νΦβκιψωζςεοει a;
   private final nLoginVelocity b;
   private final δςσυτσφωςλφΛΠολ b;
   private static long d = Long.reverse(7268797899179531347L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int h = Integer.reverse(1073741824);
   private static String[] a = new String[h];

   @Generated
   @Override
   public νΦβκιψωζςεοει a() {
      return this.a;
   }

   private static void b() {
      c = -3874840403891979430L;
      long var0 = c ^ -7442420564017763429L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(7 + 61),
               (byte)(39 + 30),
               (byte)(44 + 39),
               (byte)(40 + 7),
               (byte)(41 + 26),
               (byte)(10 + 56),
               (byte)(23 + 44),
               (byte)(13 + 34),
               (byte)(39 + 41),
               (byte)(42 + 33),
               (byte)(44 + 23),
               (byte)(18 + 65),
               (byte)(19 + 34),
               80,
               (byte)(31 + 66),
               100,
               (byte)(48 + 52),
               (byte)(55 + 50),
               (byte)(20 + 90),
               (byte)(30 + 73)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(64 + 4), (byte)(30 + 39), 83}, StandardCharsets.UTF_8));
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
               b[0] = οοθδΨιοΦΠβδζ.B("ǇƠƹƙǍƻƬǏƦƾƢƴơƠƱƓǅƭǅǕǚǋƢƣ", (byte)104, 66);
               b[1] = βθκςνθΩθυμςτκχ.C("ԘՙԲՂգՙէԾգԡԫԵ", (byte)104, 67);
               break;
            case 1:
               b[0] = φΨαξωυθανΣφυκη.A("ǇƠƹƙǍƻƬǏƦƾƣƽƨǍƷǊǌǓǗƭǌƥƢƣ", (byte)104, 65);
               b[1] = δΛψπξκσβγςα.D("աԠԻՠ՜ՇԨ՞Ս՝ՄՃԾԲեՁՋոծՑՃթՀՁ", (byte)104, 68);
               break;
            case 2:
               b[0] = φδχεθοκψαλΛογλ.C("ԲԝԱԽՇՂԪԪԧՁՇծԯաՅհԲշըէզչՀՁ", (byte)104, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = ςΦζσμτΓσ.A("ƓƶƘǊƈƻƙǎǍƹƍƗ", (byte)104, 65);
         }
      }
   }

   @Override
   public void l() {
      if (this.a != null) {
         αχΔνβκκδεΔ var1 = this.b.a();
         var1.c(δςσυτσφωςλφΛΠολ.a);
         var1.c(δςσυτσφωςλφΛΠολ.b);
      }

      this.a = null;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  δαηςλαΛΓξμθ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(χφπρψπφΦθμπ.A("ýğġāĥńļŒľčŋŁŏŉĒķřŘŐŖŐĥ", (byte)43, 65), δαηςλαΛΓξμθ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            πχσδΦΦνθΔπ.A("ĸŅńćŇŃľŇŒŁĎŌŐŉŌŒĔҚҘҟҫҥҜ҇ҀҬҫҨī", (byte)43, 65) + var1 + πψυκΠΨμΛΩβΣφμφσ.C("Ѱ", (byte)43, 67) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 124L;
      var1 ^= -7442420564017763429L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(64 + 4),
                     (byte)(60 + 9),
                     (byte)(31 + 52),
                     (byte)(25 + 22),
                     67,
                     (byte)(49 + 17),
                     (byte)(55 + 12),
                     47,
                     (byte)(39 + 41),
                     (byte)(41 + 34),
                     (byte)(18 + 49),
                     (byte)(7 + 76),
                     (byte)(28 + 25),
                     (byte)(15 + 65),
                     (byte)(38 + 59),
                     (byte)(59 + 41),
                     (byte)(93 + 7),
                     (byte)(104 + 1),
                     (byte)(37 + 73),
                     (byte)(90 + 13)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(70 + 13)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΨΦνΨΦωυΩνβςμ.E("գհկԲղծթղսլԹշջմշսԿࣅࣃ࣐࣊ࣖࣇࢲࢫ࣓ࣗࣖ", (byte)68, 69));
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
   public void k() {
      ΨγημιδξΓτοθαζ var1 = this.b.a();
      if (this.b.b().j(c<"㺀">(a & b, d))) {
         this.a = new ωΓΛΨΠωΦπΨχφβ(var1);
      } else if (this.b.b().j(c<"㺃">(e, f ^ g))) {
         this.a = new ψΓπαξβΩισεωκφΔμ();
      } else {
         this.a = null;
      }

      if (this.a == null) {
         αχΔνβκκδεΔ var2 = this.b.a();
         var2.a(δςσυτσφωςλφΛΠολ.a, this.b);
         var2.a(δςσυτσφωςλφΛΠολ.b, this.b);
         this.a = new νΦβκιψωζςεοει(var1);
      }
   }

   static {
      b();
   }

   @Generated
   public δαηςλαΛΓξμθ(nLoginVelocity var1, δςσυτσφωςλφΛΠολ var2) {
      this.b = var1;
      this.b = var2;
   }

   @Override
   public void a(ΨγημιδξΓτοθαζ var1, boolean var2) {
      this.k();
   }

   @Generated
   @Override
   public αεθζδβΨξςρπΩζθδ a() {
      return this.a;
   }
}
