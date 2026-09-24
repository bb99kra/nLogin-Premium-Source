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
import lombok.Generated;

public class φλφυΔξθγ extends δΓβςζΣψΠ {
   private static long g = Long.reverse(-6976635012888672698L);
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private static int a = 0 >>> 221 | 0 << ~221 + 1;
   private static String[] b = new String[φλφυΔξθγ.i];
   private static String[] a = new String[φλφυΔξθγ.h];
   private static int i = Integer.reverse(1073741824);
   private static int f = -1 >>> 42 | -1 << ~42 + 1;
   public static final int c = j;
   private final String i;
   private static long d = Long.reverse(-6976635012888672698L);
   private static int b = -1 >>> 17 | -1 << ~17 + 1;
   private static long c;
   private static int h = 32 >>> 36 | 32 << ~36 + 1;
   private static int e = 8192 >>> 205 | 8192 << ~205 + 1;

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  φλφυΔξθγ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(πψυκΠΨμΛΩβΣφμφσ.D("ϣЅЇϧЋЪТиФϳбЧеЯϸНпожмжЋ", (byte)2, 68), φλφυΔξθγ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            δΛψπξκσβγςα.E("ԡԮԭӰ\u0530Ԭԧ\u0530ԻԪӷԵԹԲԵԻӽ\u0895ࢋ\u0897\u0897ࡧ\u0892ࢍࢉԑ", (byte)2, 69) + var1 + ξψθρΣΠΣς.A("½", (byte)2, 65) + var2.toString(),
            var4
         );
      }
   }

   static {
      b();
   }

   private static void b() {
      c = 7089770371003479171L;
      long var0 = c ^ -5041032954313062924L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(33 + 35),
               (byte)(13 + 56),
               (byte)(19 + 64),
               47,
               (byte)(14 + 53),
               (byte)(61 + 5),
               (byte)(44 + 23),
               (byte)(22 + 25),
               (byte)(6 + 74),
               (byte)(18 + 57),
               (byte)(37 + 30),
               (byte)(46 + 37),
               (byte)(28 + 25),
               (byte)(3 + 77),
               (byte)(4 + 93),
               (byte)(43 + 57),
               (byte)(88 + 12),
               105,
               (byte)(40 + 70),
               (byte)(41 + 62)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(20 + 48), 69, (byte)(33 + 50)}, StandardCharsets.UTF_8));
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
               b[0] = ΠΛΨοδΩσμνΛγΦφβς.B("ƆƱǐƫƌƴƬƓǒǆƥǇƲƨƶƺƚƬǖƹƳƷƻǔǟǔƣƿǁƷƫǠưƬǇǍƯǎǣǆǦǶǩǣǭǐǳǛǓǛǺǙǵǄǹȅǔȇȊǙǉȎȊǾ", (byte)108, 66);
               b[1] = πχσδΦΦνθΔπ.A("ƱǉǁǔƯƍƕƍǂƒǌƟ", (byte)108, 65);
               break;
            case 1:
               b[0] = μεςΩΔΣγν.A("ƆƱǐƫƌƴƬƓǒǆƥǇƲƨƶƺƚƬǖƹƳƷƻǔǟǔƣƿǁƷƫǠưƬǇǍƯǎǣǆǦǶǩǣǭǐǳǛǓǛǺǙǵƼǿǧȂƻǜǈȅǕǋǪ", (byte)108, 65);
               b[1] = ςπυηννναΣ.E("յ֘֗վռ֙զմ֒սզհ", (byte)108, 69);
               break;
            case 2:
               b[0] = λΣΩσμφγχ.D("դխՔ՞հձժձ՚դՋՍՍԷՊիԿ՜տՍձՒէՑռՇռժՋ՛ձժ", (byte)108, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = ζοηκορΦνΣθγΩ.D("հըՁԧԲԩ\u0558չճԻՑՋտժլՐՒՍԶշօչ՛ր՟ւ֍չվեվ֎", (byte)108, 68);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 122L;
      var1 ^= -5041032954313062924L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(67 + 2),
                     (byte)(6 + 77),
                     (byte)(24 + 23),
                     (byte)(30 + 37),
                     (byte)(18 + 48),
                     67,
                     (byte)(41 + 6),
                     (byte)(52 + 28),
                     (byte)(55 + 20),
                     (byte)(64 + 3),
                     (byte)(5 + 78),
                     (byte)(36 + 17),
                     (byte)(16 + 64),
                     (byte)(43 + 54),
                     (byte)(20 + 80),
                     (byte)(40 + 60),
                     (byte)(49 + 56),
                     (byte)(63 + 47),
                     (byte)(40 + 63)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(46 + 23), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(χφπρψπφΦθμπ.D("ԠԭԬӯԯԫԦԯԺԩӶԴԸԱԴԺӼ\u0894ࢊ\u0896\u0896ࡦ\u0891ࢌ࢈", (byte)88, 68));
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
   public String getKnownName() {
      return this.i;
   }

   @Generated
   public φλφυΔξθγ(String var1) {
      this.i = var1;
   }

   @Generated
   @Override
   public String toString() {
      return c<"㺀">(a & b, d) + this.getKnownName() + c<"㺃">(e & f, g);
   }
}
