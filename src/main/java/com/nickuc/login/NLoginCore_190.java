package com.nickuc.login;

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

public class NLoginCore_190 {
   private static String[] b = new String[NLoginCore_190.l];
   private static long j = Long.reverse(-6554864491979095126L);
   private static int i = Integer.reverse(-1);
   private static long d = Long.reverse(3458764513820540928L);
   private final String bU;
   private static String[] a = new String[NLoginCore_190.k];
   private static long f = Long.reverse(-7707785996585942102L);
   private static int l = 196608 >>> 16 | 196608 << ~16 + 1;
   private static long b = Long.reverse(-7707785996585942102L);
   private static int a = Integer.reverse(0);
   @Nullable
   private final String bV;
   private static long c;
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static long g = Long.reverse(3458764513820540928L);
   private static int k = Integer.reverse(-1073741824);
   private static int h = (4 >>> 33 | 4 << -33) & -1;

   static {
      b();
   }

   @Generated
   public NLoginCore_190(String var1, @Nullable String var2) {
      this.bU = var1;
      this.bV = var2;
   }

   private static String a(int var0, long var1) {
      var1 ^= 12L;
      var1 ^= 79476973327626852L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(8 + 60),
                     (byte)(34 + 35),
                     (byte)(77 + 6),
                     47,
                     (byte)(60 + 7),
                     (byte)(53 + 13),
                     (byte)(54 + 13),
                     (byte)(16 + 31),
                     (byte)(21 + 59),
                     (byte)(9 + 66),
                     (byte)(60 + 7),
                     (byte)(74 + 9),
                     (byte)(11 + 42),
                     (byte)(57 + 23),
                     97,
                     (byte)(82 + 18),
                     (byte)(45 + 55),
                     (byte)(98 + 7),
                     (byte)(79 + 31),
                     (byte)(11 + 92)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(53 + 16), (byte)(54 + 29)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_091.E("ԩԶԵӸԸԴԯԸՃԲӿԽՁԺԽՃԅ\u0892\u0890ࢂ\u0890\u0894ࡿࡱ\u0893ࡳ࢘ࢥ\u0894", (byte)10, 69));
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
   public String ar() {
      return this.bU;
   }

   @Generated
   @Override
   public String toString() {
      return a(a, b ^ d) + this.ar() + a(e, f ^ g) + this.as() + a(h & i, j);
   }

   private static void b() {
      c = 6179997667138867369L;
      long var0 = c ^ 79476973327626852L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(51 + 18),
               (byte)(18 + 65),
               (byte)(4 + 43),
               (byte)(35 + 32),
               (byte)(46 + 20),
               (byte)(66 + 1),
               (byte)(2 + 45),
               (byte)(5 + 75),
               (byte)(28 + 47),
               (byte)(57 + 10),
               (byte)(49 + 34),
               (byte)(10 + 43),
               (byte)(8 + 72),
               (byte)(74 + 23),
               (byte)(4 + 96),
               (byte)(14 + 86),
               (byte)(81 + 24),
               (byte)(31 + 79),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(34 + 35), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_173.D("ԺԺԠՋԎՁԯԷԖԓԬԚՇՖ՜ՙ՛ԾԚՠՔԱԝԞԟ՚ԼգԻԾ\u0557լԪձԾդՑ\u0557շՆաղզՍՅԻՠկՖՊփՙօմՋՌ", (byte)97, 68);
               b[1] = NLoginCore_433.D("ԼԟՌԿԾՀՏԴԘԑՙԖԻԗՍԟՋաՄԵՔդԫԬ", (byte)97, 68);
               b[2] = NLoginCore_521.C("ՇՍԴԥԔԳԗԡԬՊԚԠ", (byte)97, 67);
               break;
            case 1:
               b[0] = NLoginCore_446.A("ƣƣƉƴŷƪƘƠſżƕƃưƿǅǂǄƧƃǉƽƚƆƇƈǃƥǌƤƧǀǕƓǚƧǍƺǀǠƯǊǛǏǁǞǦǠǘƿƻǔǥǩǭƴƵ", (byte)97, 65);
               b[1] = NLoginCore_127.A("ƥƈƵƨƧƩƸƝƁźǄƕǂƐƞƂƳǅƴǀƣƗƔƕ", (byte)97, 65);
               b[2] = NLoginCore_076.F("ժգՓեՙչ֘ժմս֒ե", (byte)97, 70);
               break;
            case 2:
               b[0] = NLoginCore_183.F("Ւ\u0557գ\u058bիթ\u0558ճ՚էխ֏ս֤վգ֛֑֖֥֣֓֓\u058c֘փ֑֙տ֯օֱ", (byte)97, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_232.E("գաօՙՑՒպ֘ռ\u058bջթն՟֟֡՟ե֣րշճհձ", (byte)97, 69);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_190.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_092.B("Óõ÷×ûĚĒĨĔãġėĥğèčįĮĦĬĦû", (byte)22, 66), NLoginCore_190.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_004.C("њѧѦЩѩѥѠѩѴѣаѮѲѫѮѴж߃߁\u07b3߁߅ްޢ߄ޤ߉ߖ߅ю", (byte)22, 67) + var1 + NLoginCore_324.D("б", (byte)22, 68) + var2.toString(), var4
         );
      }
   }

   @Nullable
   @Generated
   public String as() {
      return this.bV;
   }
}
