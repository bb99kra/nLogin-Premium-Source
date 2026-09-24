package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class ΠιγμμΓΨλς extends δΓβςζΣψΠ {
   private static String[] b = new String[ΠιγμμΓΨλς.l];
   public static final int b = ΠιγμμΓΨλς.m;
   private static long c;
   private static int a = 0 >>> 184 | 0 << -184;
   private static int h = Integer.reverse(-1073741824);
   private final String h;
   private static long f = Long.reverse(-6993628010271547640L);
   private static int k = '耀' >>> 'm' | 32768 << -109;
   private static int c = (65536 >>> 80 | 65536 << -80) & -1;
   @Nullable
   private final UUID a;
   private static int l = Integer.reverse(536870912);
   private static String[] a = new String[k];
   private static long j = Long.reverse(-9079256848778919936L);
   private static long g = Long.reverse(-9079256848778919936L);
   private static int m = Integer.reverse(0);
   private static long b = Long.reverse(2085628838507372296L);
   private static long d = Long.reverse(2085628838507372296L);
   private static int e = Integer.reverse(1073741824);
   private static long i = Long.reverse(-6993628010271547640L);
   @Nullable
   private final UUID b;

   @Generated
   public String getName() {
      return this.h;
   }

   @Nullable
   @Generated
   public UUID getBedrockId() {
      return this.b;
   }

   @Generated
   public ΠιγμμΓΨλς(String var1, @Nullable UUID var2, @Nullable UUID var3) {
      this.h = var1;
      this.a = var2;
      this.b = var3;
   }

   static {
      b();
   }

   @Nullable
   @Generated
   public UUID getMojangId() {
      return this.a;
   }

   @Generated
   @Override
   public String toString() {
      return c<"㺀">(a, b) + this.getName() + c<"㺃">(c, d) + this.getMojangId() + c<"㺆">(e, f ^ g) + this.getBedrockId() + c<"㺉">(h, i ^ j);
   }

   private static String a(int var0, long var1) {
      var1 ^= 65L;
      var1 ^= 9107418385360234161L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(61 + 7),
                     (byte)(44 + 25),
                     (byte)(36 + 47),
                     (byte)(7 + 40),
                     (byte)(29 + 38),
                     (byte)(23 + 43),
                     (byte)(39 + 28),
                     47,
                     (byte)(21 + 59),
                     (byte)(16 + 59),
                     (byte)(9 + 58),
                     83,
                     (byte)(22 + 31),
                     (byte)(16 + 64),
                     (byte)(93 + 4),
                     (byte)(34 + 66),
                     (byte)(8 + 92),
                     (byte)(7 + 98),
                     (byte)(101 + 9),
                     (byte)(30 + 73)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(63 + 20)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(θεωψξβΛσσ.C("իոշԺպնձպօմՁտփռտօՇࢹ࣓࣎ࣘࣙࢱࣇࣣࣛ", (byte)113, 67));
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
                  ΠιγμμΓΨλς.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(πψυκΠΨμΛΩβΣφμφσ.A("ËíïÏóĒĊĠČÛęďĝėàąħĦĞĤĞó", (byte)18, 65), ΠιγμμΓΨλς.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            δΛψπξκσβγςα.D("юћњНѝљєѝѨїФѢѦџѢѨЪޜ\u07b6ޱ\u07bb\u07bcޔު\u07be߆п", (byte)18, 68) + var1 + χΠξΦιζΨΣωΦσΨζ.E("Ԉ", (byte)18, 69) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = 1223660951809920889L;
      long var0 = c ^ 9107418385360234161L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(39 + 30),
               (byte)(68 + 15),
               (byte)(32 + 15),
               67,
               (byte)(38 + 28),
               (byte)(36 + 31),
               (byte)(43 + 4),
               (byte)(57 + 23),
               (byte)(40 + 35),
               (byte)(44 + 23),
               (byte)(47 + 36),
               (byte)(45 + 8),
               (byte)(64 + 16),
               (byte)(7 + 90),
               (byte)(21 + 79),
               (byte)(76 + 24),
               (byte)(104 + 1),
               (byte)(87 + 23),
               (byte)(65 + 38)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(9 + 60), 83}, StandardCharsets.UTF_8));
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
               b[0] = ΦδφπθΩΩλζξ.A("ŐŇŒŒńōŬňŧżŊĵŭźżŏųĽſŘňƄŷŖšŦťƃšŇŌŧƌŞŤŭƓŏŐƘŸƐŧŹřƙŹźűşƘƥƇƁŮů", (byte)62, 65);
               b[1] = ΠΛΨοδΩσμνΛγΦφβς.C("ӇӒҤҴҽӭӬҪһӐӃӆӟӎӫӊӒӏӢҺӽӻӂӃ", (byte)62, 67);
               b[2] = ΨΦνΨΦωυΩνβςμ.D("ңӄҴҳҷӨӇүӪӰӋӐӵҳҶӓӔӁӦӰӰӅӂӃ", (byte)62, 68);
               b[3] = βεξΠθρρςΔΦμ.F("՛\u0530իՇէա\u0530ԺյԼԸՂ", (byte)62, 70);
               break;
            case 1:
               b[0] = φδχεθοκψαλΛογλ.B("ŐŇŒŒńōŬňŧżŊĵŭźżŏųĽſŘňƄŷŖšŦťƃšŇŌŧƌŞŤŭƓŏŐƘŸƐŨųśŹƚžŚƏƅƓƣƁŮů", (byte)62, 66);
               b[1] = χφπρψπφΦθμπ.E("Ւ՝ԯԿՈոշԵՆ՛ՏոԹԷրփմՏքււնՍՎ", (byte)62, 69);
               b[2] = δΛψπξκσβγςα.A("įŐŀĿŃŴœĻŶżŘŪŚűŕŚŗŲűźŹƇŎŏ", (byte)62, 65);
               b[3] = ΣδτΠνεγοΓορητ.D("ӠҥӀӔӕӊӌҭҿӇӂҷ", (byte)62, 68);
               break;
            case 2:
               b[0] = οοθδΨιοΦΠβδζ.D("ҶҼӋӜҞҸҩӝӇҫҩҽҮӡӥҷӸҲӧӔӺӕӂӃ", (byte)62, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = ΦδφπθΩΩλζξ.B("ŦŭņķŎŗŧŐřťĺźŜŌūĻŀŃŖŠźőŎŏ", (byte)62, 66);
         }
      }
   }
}
