package com.nickuc.login;

import java.io.File;
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
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class NLoginCore_510 {
   GameMode a;
   private static int k = (67108864 >>> 249 | 67108864 << ~249 + 1) & -1;
   private static long h = Long.reverse(144115188075855872L);
   float c;
   int h;
   private static long d = Long.reverse(-5835292847125597671L);
   final File b;
   boolean h;
   final Player a;
   Location h;
   private static long g = Long.reverse(-5835292847125597671L);
   boolean e;
   float d;
   private static String[] a = new String[NLoginCore_510.j];
   private static long e = Long.reverse(144115188075855872L);
   volatile NLoginCore_506 a = NLoginCore_506.b;
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   @Nullable
   Location g;
   boolean i;
   private static int b = 0 >>> 167 | 0 << -167;
   boolean g;
   private static long c;
   private static int j = (Integer.MIN_VALUE >>> 126 | Integer.MIN_VALUE << -126) & -1;
   boolean d;
   private static String[] b = new String[k];
   boolean f;
   int i;
   double d;
   private static int a = Integer.reverse(Integer.MIN_VALUE);

   @Generated
   public void a(@Nullable Location var1) {
      this.g = var1;
   }

   private static String a(int var0, long var1) {
      var1 ^= 64L;
      var1 ^= -536355174423105876L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(44 + 24),
                     (byte)(7 + 62),
                     83,
                     (byte)(19 + 28),
                     (byte)(48 + 19),
                     (byte)(33 + 33),
                     (byte)(54 + 13),
                     (byte)(20 + 27),
                     (byte)(10 + 70),
                     (byte)(24 + 51),
                     (byte)(25 + 42),
                     (byte)(34 + 49),
                     53,
                     (byte)(53 + 27),
                     (byte)(31 + 66),
                     (byte)(31 + 69),
                     (byte)(15 + 85),
                     (byte)(60 + 45),
                     (byte)(20 + 90),
                     (byte)(55 + 48)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(64 + 5), (byte)(49 + 34)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_387.F("ոօքՇևփվև֒ցՎ\u058c\u0590։\u058c֒Քࣲ࣏࣯࣭ࣦ࣑࣬࣬࣎", (byte)89, 70));
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
   public void b(Location var1) {
      this.h = var1;
   }

   public void h() {
      this.f = (boolean)a;
   }

   static {
      b();
   }

   private static void b() {
      c = -7471808789503074059L;
      long var0 = c ^ -536355174423105876L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(24 + 44),
               (byte)(13 + 56),
               (byte)(50 + 33),
               (byte)(17 + 30),
               (byte)(63 + 4),
               (byte)(63 + 3),
               (byte)(21 + 46),
               (byte)(24 + 23),
               80,
               (byte)(22 + 53),
               (byte)(16 + 51),
               (byte)(47 + 36),
               (byte)(5 + 48),
               80,
               (byte)(12 + 85),
               (byte)(24 + 76),
               (byte)(59 + 41),
               (byte)(17 + 88),
               (byte)(103 + 7),
               (byte)(46 + 57)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(18 + 51), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_201.E("\u0558ԴԕԘ\u0557Բ՞ԟԾԛՑԗԝ\u0558ՕՊՇԦՠՇգՆԿԩդԿ՟ՆղԶյե", (byte)37, 69);
               b[1] = NLoginCore_173.F("Չԙ՚ԬԖՎԛԬՒՓՄԩ", (byte)37, 70);
               break;
            case 1:
               b[0] = NLoginCore_183.A("ŀĜýĀĿĚņćĦăĹÿąŀĽĲįĎňįŋģēİĺřŋĺĚŀŖŞ", (byte)37, 65);
               b[1] = NLoginCore_201.C("ѭѲҗғҋҍҀѲҀҡґѬ", (byte)37, 67);
               break;
            case 2:
               b[0] = NLoginCore_553.A("ľĺŅıĦĳĴđľĽġÿČĮĦĨĄŇŋņőŅĜĝ", (byte)37, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_004.C("їѬҒѱўҙҖѲқјѤѹҪѹҟѸѪҗ҉ѦѭѤҟ҄ҞҮҮҔѹѬҪҷ", (byte)37, 67);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_510.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_575.E("ԓԵԷԗԻ՚ՒըՔԣա\u0557ե՟ԨՍկծզլզԻ", (byte)47, 69), NLoginCore_510.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_453.D("ҥҲұѴҴҰҫҴҿҮѻҹҽҶҹҿҁ\u07fcࠜ࠙࠙ࠟ\u07fbࠚࠓ߾Җ", (byte)47, 68) + var1 + NLoginCore_183.A("ė", (byte)47, 65) + var2.toString(), var4
         );
      }
   }

   public NLoginCore_510(Player var1, File var2) {
      this.a = var1;
      this.b = var2;
   }

   @Generated
   @Override
   public String toString() {
      return a(b, d ^ e) + this.a + a(f, g ^ h);
   }
}
