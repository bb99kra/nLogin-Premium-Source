package com.nickuc.login;

import com.nickuc.login.proxy.bungee.nLoginBungee;
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

public class NLoginCore_284 implements NLoginInterface_030 {
   private static int j = 786432 >>> 82 | 786432 << ~82 + 1;
   private static int n = 8388608 >>> 85 | 8388608 << -85;
   private static long i = Long.reverse(-6360206534972665437L);
   private static int m = 512 >>> 103 | 512 << -103;
   private static long l = Long.reverse(-6917529027641081856L);
   private static int e = (16 >>> 36 | 16 << ~36 + 1) & -1;
   private static long g = Long.reverse(-6360206534972665437L);
   private static String[] ZKM_STR_A = new String[m];
   private static long d = Long.reverse(-6917529027641081856L);
   private static long b = Long.reverse(557322492668416419L);
   private static long c;
   private final NLoginCore_017 b;
   private NLoginInterface_031 a;
   private static int a = Integer.reverse(0);
   private static long k = Long.reverse(557322492668416419L);
   private static String[] ZKM_STR_B = new String[n];
   private static int f = Integer.reverse(-1);
   private static int h = Integer.reverse(1073741824);
   private final nLoginBungee b;
   private NLoginCore_033 a;

   @Generated
   @Override
   public NLoginCore_033 a() {
      return this.a;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_284.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_223.F("Օշչՙս֪֖֜֔ե֣֧֙֡ժ֏ְֱ֮֨֨ս", (byte)113, 70), NLoginCore_284.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_559.E("\u0590֝֜՟֛֖֪֟֟֙զ֤֤֪֨֡լࣲࣨइऊࣺࣿࣷࣷअऋआࣼք", (byte)113, 69) + var1 + NLoginCore_453.A("ƛ", (byte)113, 65) + var2.toString(), var4
         );
      }
   }

   @Override
   public void l() {
      if (this.a != null) {
         NLoginCore_345 var1 = this.b.a();
         var1.c(a(j, k ^ l));
      }

      this.a = null;
   }

   @Generated
   @Override
   public NLoginInterface_031 a() {
      return this.a;
   }

   @Generated
   public NLoginCore_284(nLoginBungee var1, NLoginCore_017 var2) {
      this.b = var1;
      this.b = var2;
   }

   static {
      b();
   }

   @Override
   public void k() {
      NLoginType_008 var1 = this.b.a();
      if (this.b.b().j(a(a, b ^ d))) {
         this.a = new NLoginCore_418(var1);
      } else if (this.b.b().j(a(e & f, g))) {
         this.a = new NLoginCore_185();
      } else {
         this.a = null;
      }

      if (this.a == null) {
         NLoginCore_345 var2 = this.b.a();
         var2.a(a(h, i), this.b);
         this.a = new NLoginCore_033(var1);
      }
   }

   private static void b() {
      c = -4212999746291221024L;
      long var0 = c ^ 6421758366609053645L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(37 + 31),
               (byte)(48 + 21),
               (byte)(5 + 78),
               (byte)(5 + 42),
               (byte)(21 + 46),
               66,
               (byte)(38 + 29),
               (byte)(36 + 11),
               (byte)(61 + 19),
               75,
               (byte)(50 + 17),
               (byte)(32 + 51),
               (byte)(5 + 48),
               (byte)(62 + 18),
               (byte)(66 + 31),
               (byte)(25 + 75),
               (byte)(8 + 92),
               (byte)(37 + 68),
               (byte)(27 + 83),
               (byte)(2 + 101)
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
               ZKM_STR_B[0] = NLoginCore_127.B("ƿǉǈƥƚƜƟƩưǋǍƳǛƦƗǌǇǀǙǞǐƻƨƩ", (byte)107, 66);
               ZKM_STR_B[1] = NLoginCore_324.E("՜֛խփշ֡ղօ֟չ֦֡շր֨ստ֏ս֨\u058bր֭շօ֑փ֥֛֨ֈ֏", (byte)107, 69);
               ZKM_STR_B[2] = NLoginCore_433.D("ՏըՇԽթՈթէ\u0557ԴծՉԵՓվ՚Ֆ՝՞Ռ՜՜ՉՊ", (byte)107, 68);
               ZKM_STR_B[3] = NLoginCore_110.B("ƮǇƦƜǈƧǈǆƶƓǍƨƔƲǝƹƵƼƽƫƻƻƨƩ", (byte)107, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_427.A("ƿǉǈƥƚƜƟƩưǋǋǒǊǜǘƼƝǒǌƚǝƫƨƩ", (byte)107, 65);
               ZKM_STR_B[1] = NLoginCore_559.F("՜֛խփշ֡ղօ֟չ֦֡շր֨ստ֏ս֨\u058bևք֨օն֤֕ճּֿ֕", (byte)107, 70);
               ZKM_STR_B[2] = NLoginCore_092.D("ՏըՇԽթՈթէ\u0557ԴծՍՑլռոմձ\u0558խՋՎյսֆՓըքփվ\u0557Շ", (byte)107, 68);
               ZKM_STR_B[3] = NLoginCore_471.F("ր֙ոծ֚չ֚֘ֈե֝֫վ\u058cջ֡պ֊֦֤֠֡խִ֣ճղִֹ֥֝ջ", (byte)107, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_138.C("ԽՂաՉԩԭՔՋՠ\u0558ՍԾ", (byte)107, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_138.B("ǌƟƍƠƜƿǔƍƶƟƐƋǆƶƙƔƯƱǐƛǐǟǅǂǅƦǦǈǇǌǖǮ", (byte)107, 66);
         }
      }
   }

   @Override
   public void a(NLoginType_008 var1, boolean var2) {
      this.k();
   }

   private static String a(int var0, long var1) {
      var1 ^= 5L;
      var1 ^= 6421758366609053645L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(47 + 21),
                     69,
                     (byte)(60 + 23),
                     (byte)(7 + 40),
                     (byte)(58 + 9),
                     (byte)(27 + 39),
                     (byte)(27 + 40),
                     47,
                     (byte)(44 + 36),
                     (byte)(55 + 20),
                     (byte)(17 + 50),
                     (byte)(19 + 64),
                     (byte)(9 + 44),
                     (byte)(32 + 48),
                     (byte)(82 + 15),
                     (byte)(89 + 11),
                     (byte)(18 + 82),
                     (byte)(49 + 56),
                     (byte)(22 + 88),
                     (byte)(5 + 98)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(40 + 43)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_127.B("ĎěĚÝĝęĔĝĨėäĢĦğĢĨêѰѦ҅҈Ѹѽѵѵ҃҉҄Ѻ", (byte)22, 66));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         ZKM_STR_A[var0] = new String(var3.doFinal(Base64.getDecoder().decode(ZKM_STR_B[var0])), StandardCharsets.UTF_8);
      }

      return ZKM_STR_A[var0];
   }
}
