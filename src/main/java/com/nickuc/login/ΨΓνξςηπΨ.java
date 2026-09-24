package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.wrapper.login.client.WrapperLoginClientLoginStart;
import io.netty.util.AttributeKey;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class ΨΓνξςηπΨ {
   private static String[] a;
   private static long d = Long.reverse(8253171242719629439L);
   private static long e = Long.reverse(7349874591868649472L);
   private static int b = 16777216 >>> 216 | 16777216 << ~216 + 1;
   private final String cc;
   private ωομΦδΔπνΨεβυΓ a;
   @Nullable
   private final ψΓςλνΣΠπεοψγΩσπ a;
   private static long c;
   @Nullable
   private final byte[] f;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   public static final AttributeKey<ΨΓνξςηπΨ> e;
   @Nullable
   private final στΩξξχκι e;
   private final String cb;
   private final Object i;
   private final WrapperLoginClientLoginStart a;
   private static int c = (0 >>> 179 | 0 << -179) & -1;
   private static String[] b;

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ΨΓνξςηπΨ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ςΦζσμτΓσ.E("ՀբդՄըևտ֕ցՐ֎ք֒\u058cՕպ֛֜֓֙֓ը", (byte)92, 69), ΨΓνξςηπΨ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            φδχεθοκψαλΛογλ.D("ԬԹԸӻԻԷԲԻՆԵԂՀՄԽՀՆԈࢂ\u086e࢙࢛ࢠ\u0896ࢠࢉԜ", (byte)92, 68) + var1 + χφπρψπφΦθμπ.A("ű", (byte)92, 65) + var2.toString(), var4
         );
      }
   }

   @Generated
   public Object h() {
      return this.i;
   }

   @Generated
   public ΨΓνξςηπΨ(
      @Nullable στΩξξχκι var1, String var2, String var3, Object var4, WrapperLoginClientLoginStart var5, @Nullable ψΓςλνΣΠπεοψγΩσπ var6, @Nullable byte[] var7
   ) {
      this.e = var1;
      this.cb = var2;
      this.cc = var3;
      this.i = var4;
      this.a = var5;
      this.a = var6;
      this.f = var7;
   }

   @Nullable
   @Generated
   public στΩξξχκι a() {
      return this.e;
   }

   private static String a(int var0, long var1) {
      var1 ^= 102L;
      var1 ^= -8756372245062267741L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(8 + 60),
                     (byte)(34 + 35),
                     (byte)(68 + 15),
                     (byte)(17 + 30),
                     (byte)(18 + 49),
                     (byte)(6 + 60),
                     (byte)(54 + 13),
                     (byte)(23 + 24),
                     (byte)(19 + 61),
                     75,
                     (byte)(50 + 17),
                     (byte)(53 + 30),
                     (byte)(30 + 23),
                     80,
                     (byte)(81 + 16),
                     (byte)(63 + 37),
                     (byte)(37 + 63),
                     (byte)(27 + 78),
                     (byte)(77 + 33),
                     (byte)(76 + 27)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(64 + 5), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ζοηκορΦνΣθγΩ.E("ԡԮԭӰ\u0530Ԭԧ\u0530ԻԪӷԵԹԲԵԻӽࡷࡣࢎ\u0890\u0895ࢋ\u0895ࡾ", (byte)2, 69));
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

   private static void b() {
      c = -140839720893247154L;
      long var0 = c ^ -8756372245062267741L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(14 + 54),
               (byte)(35 + 34),
               (byte)(66 + 17),
               (byte)(24 + 23),
               (byte)(22 + 45),
               (byte)(38 + 28),
               (byte)(60 + 7),
               47,
               (byte)(72 + 8),
               (byte)(58 + 17),
               (byte)(35 + 32),
               (byte)(40 + 43),
               (byte)(43 + 10),
               (byte)(39 + 41),
               (byte)(16 + 81),
               100,
               (byte)(9 + 91),
               (byte)(104 + 1),
               (byte)(46 + 64),
               (byte)(93 + 10)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(16 + 53), (byte)(54 + 29)}, StandardCharsets.UTF_8));
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
               b[0] = πχσδΦΦνθΔπ.C("ҰӤӘҵӧӠӼӛӠӟӀӎӰӿӀӇӟӼӭӢӻԊӫӾӈԑӾӬӣӕӘԋ", (byte)68, 67);
               break;
            case 1:
               b[0] = ΣερμΔσατσκ.B("ĶŪŞĻŭŦƂšŦťņŔŶƅņōťƂųŨƁƍŕųŪŏƑųŜƒƎƞ", (byte)68, 66);
               break;
            case 2:
               b[0] = ντθΔζβΔζ.D("ӌҺҹӵӾәӺӑӟӘԀӴӁԅӷөӦӼԌԄԄӨԌӨӞӛԇӵӎӿӰԘ", (byte)68, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = ΣερμΔσατσκ.E("ՉՌՏէԳձ՟՟ՔլՕւփՒեջ՝Չռփպն՜ռ֑ըՓ֑րի\u058b֊", (byte)68, 69);
         }
      }
   }

   @Generated
   public String ax() {
      return this.cb;
   }

   @Generated
   public void a(ωομΦδΔπνΨεβυΓ var1) {
      this.a = var1;
   }

   @Generated
   public WrapperLoginClientLoginStart a() {
      return this.a;
   }

   @Nullable
   @Generated
   public byte[] d() {
      return this.f;
   }

   @Generated
   public String ay() {
      return this.cc;
   }

   static {
      a = new String[a];
      b = new String[b];
      b();
      e = σιβεθκιπΓνΣΔουρ.a(c<"㺀">(ΨΓνξςηπΨ.c, d ^ e));
   }

   @Generated
   public ωομΦδΔπνΨεβυΓ a() {
      return this.a;
   }

   public ΨΓνξςηπΨ a(byte[] var1) {
      return new ΨΓνξςηπΨ(this.e, this.cb, this.cc, this.i, this.a, this.a, var1);
   }

   @Nullable
   @Generated
   public ψΓςλνΣΠπεοψγΩσπ a() {
      return this.a;
   }
}
