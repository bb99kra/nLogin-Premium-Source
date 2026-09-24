package com.nickuc.login;

import com.nickuc.login.api.types.Location;
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

public class NLoginCore_457 implements Location {
   private static long n = Long.reverse(-2511312255429602951L);
   private static long q = Long.reverse(-1729382256910270464L);
   private final double b;
   private static long p = Long.reverse(3829756019908055417L);
   private static int g = Integer.reverse(1073741824);
   private static int a = 0 >>> 179 | 0 << ~179 + 1;
   private static String[] a = new String[NLoginCore_457.u];
   private final double c;
   private static String[] b = new String[NLoginCore_457.v];
   private static int m = Integer.reverse(536870912);
   private static long k = Long.reverse(3829756019908055417L);
   private static int r = (384 >>> 70 | 384 << ~70 + 1) & -1;
   private final double a;
   private static int b = Integer.reverse(-1);
   private static long h = Long.reverse(3829756019908055417L);
   private final float b;
   private static long c;
   private static long i = Long.reverse(-1729382256910270464L);
   private static int j = (24 >>> 131 | 24 << ~131 + 1) & -1;
   private static int e = '耀' >>> 207 | 32768 << -207;
   private static long f = Long.reverse(-2511312255429602951L);
   private static int v = Integer.reverse(-536870912);
   private static long d = Long.reverse(-2511312255429602951L);
   private static int o = Integer.reverse(-1610612736);
   private static long t = Long.reverse(-1729382256910270464L);
   private static long s = Long.reverse(3829756019908055417L);
   private final float a;
   private static long l = Long.reverse(-1729382256910270464L);
   private static int u = Integer.reverse(-536870912);
   private final String j;

   @Generated
   public double getX() {
      return this.a;
   }

   private static String a(int var0, long var1) {
      var1 ^= 23L;
      var1 ^= -2302671695000257621L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(4 + 64),
                     (byte)(46 + 23),
                     (byte)(30 + 53),
                     (byte)(7 + 40),
                     (byte)(7 + 60),
                     (byte)(64 + 2),
                     (byte)(19 + 48),
                     (byte)(37 + 10),
                     (byte)(38 + 42),
                     (byte)(37 + 38),
                     67,
                     83,
                     (byte)(49 + 4),
                     (byte)(74 + 6),
                     (byte)(31 + 66),
                     (byte)(35 + 65),
                     (byte)(78 + 22),
                     (byte)(98 + 7),
                     (byte)(59 + 51),
                     (byte)(99 + 4)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(53 + 16), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_076.C("Պ\u0557ՖԙՙՕՐՙդՓԠ՞բ՛՞դԦࢫࢭࢮ\u0896ࢲࢥࣄࢳࢠ࢜", (byte)102, 67));
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
   @Override
   public String toString() {
      return a(a & b, d)
         + this.getWorldName()
         + a(e, f)
         + this.getX()
         + a(g, h ^ i)
         + this.getY()
         + a(j, k ^ l)
         + this.getZ()
         + a(m, n)
         + this.getYaw()
         + a(o, p ^ q)
         + this.getPitch()
         + a(r, s ^ t);
   }

   @Generated
   public String getWorldName() {
      return this.j;
   }

   @Generated
   public double getZ() {
      return this.c;
   }

   private static void b() {
      c = -7023063568385809236L;
      long var0 = c ^ -2302671695000257621L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(10 + 58),
               (byte)(35 + 34),
               (byte)(17 + 66),
               (byte)(44 + 3),
               (byte)(45 + 22),
               (byte)(54 + 12),
               (byte)(39 + 28),
               47,
               (byte)(54 + 26),
               75,
               (byte)(3 + 64),
               (byte)(82 + 1),
               (byte)(47 + 6),
               (byte)(8 + 72),
               (byte)(42 + 55),
               (byte)(5 + 95),
               (byte)(35 + 65),
               (byte)(81 + 24),
               (byte)(80 + 30),
               (byte)(66 + 37)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(39 + 44)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_453.D("ӝұңӞҴӡӏӚӑңұӟұӴҶҵӆөӍұӱәӚҵӀӒӲӰԂӱԂӶ", (byte)62, 68);
               b[1] = NLoginCore_559.C("ӗұҶҨҷӅҩҮҿӄӎҷ", (byte)62, 67);
               b[2] = NLoginCore_453.F("ԬԦժագՐղէՆժ՝Ղ", (byte)62, 70);
               b[3] = NLoginCore_451.E("ծՅըբԱՂՋմՆճԸՂ", (byte)62, 69);
               b[4] = NLoginCore_110.B("ŦľłŕŶŋŪŇœŭŨŃ", (byte)62, 66);
               b[5] = NLoginCore_138.A("ŴŋšŤŒłŖűźũŕůŀŪļőťłŝůźšŎŏ", (byte)62, 65);
               b[6] = NLoginCore_027.B("ĮŶŨĩŅœťŰŪĳŖŃ", (byte)62, 66);
               break;
            case 1:
               b[0] = NLoginCore_223.B("ũĽįŪŀŭśŦŝįĽūĽƀłŁŒŵřĽŽűŝŉŵŪŗŬŬŭőůƇƌŎŒƔœƛŚƎŮƈţ", (byte)62, 66);
               b[1] = NLoginCore_223.E("ՅԬԱՁհՆէՉՍղՙՂ", (byte)62, 69);
               b[2] = NLoginCore_553.E("ՂԲՔմԿԯպխՌՊչտ՛Զ՛հծՠցՑֈՠՍՎ", (byte)62, 69);
               b[3] = NLoginCore_324.D("ӆӨәҵңҶӇҦӘӧӆҷ", (byte)62, 68);
               b[4] = NLoginCore_076.F("ՈԾՍըՍՔաթՓԮԸՕՇսՑչՐտՄնքֆՍՎ", (byte)62, 70);
               b[5] = NLoginCore_521.C("ӨҿӕӘӆҶӊӥӮӝӆӊөөӏұӹӌӓӫӗӻӂӃ", (byte)62, 67);
               b[6] = NLoginCore_091.F("ԯիզլ\u0557ղՏոհՒշՂ", (byte)62, 70);
               break;
            case 2:
               b[0] = NLoginCore_141.B("ŅĬŦŃŠŖŬśŎŬżŃ", (byte)62, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_183.D("ӅӅҵҽӠӕӨҫҩӉұӨӂӈҮӤӰҸӳҭӷӫӂӃ", (byte)62, 68);
         }
      }
   }

   @Generated
   public double getY() {
      return this.b;
   }

   static {
      b();
   }

   @Generated
   public float getPitch() {
      return this.b;
   }

   @Generated
   public NLoginCore_457(String var1, double var2, double var4, double var6, float var8, float var9) {
      this.j = var1;
      this.a = var2;
      this.b = var4;
      this.c = var6;
      this.a = var8;
      this.b = var9;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_457.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_530.D("ՑճյՕչ֘\u0590֦֒ա֣֟֕֝զ\u058b֤֪֤֭֬չ", (byte)124, 68), NLoginCore_457.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_110.A("ǚǧǦƩǩǥǠǩǴǣưǮǲǫǮǴƶԻԽԾԦՂԵՔՃ\u0530Ԭǌ", (byte)124, 65) + var1 + NLoginCore_324.F("ղ", (byte)124, 70) + var2.toString(), var4
         );
      }
   }

   @Generated
   public float getYaw() {
      return this.a;
   }
}
