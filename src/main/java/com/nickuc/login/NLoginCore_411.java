package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class NLoginCore_411 extends NLoginCore_374 {
   private static long f;
   protected String P;
   private final String O;
   private static long aa = Long.reverse(-3634090411573172011L);
   private static int d = Integer.reverse(-1);
   private static long u = Long.reverse(4724590496826468565L);
   private static int s = 33554432 >>> 152 | 33554432 << -152;
   private static int y = Integer.reverse(-1);
   private static int m = Integer.reverse(-1);
   private static long n = Long.reverse(-3634090411573172011L);
   private static String[] d = new String[NLoginCore_411.ah];
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static int w = 384 >>> 167 | 384 << ~167 + 1;
   private static String[] c = new String[NLoginCore_411.af];
   private static long v = Long.reverse(-8358680908399640576L);
   private static int ae = Integer.reverse(0);
   private static long g = Long.reverse(-3634090411573172011L);
   private static int c = Integer.reverse(0);
   private static int ah = Integer.reverse(536870912);
   private static int af = Integer.reverse(536870912);

   static {
      b();
   }

   protected abstract void b(NLoginCore_219 var1);

   protected abstract void a(ResultSet var1);

   private void L() {
      if (this.P == null) {
         throw new IllegalArgumentException(a(c & d, g));
      } else if (this.P.isEmpty()) {
         throw new IllegalArgumentException(a(h & m, n));
      } else {
         this.f(this.P);
         NLoginCore_171 var1 = this.d.a(a(s, u ^ v) + this.P + a(w & y, aa));

         try {
            ResultSet var2 = var1.d();

            while (var2.next() && this.m.N()) {
               try {
                  this.a(var2);
               } finally {
                  this.l++;
               }
            }
         } catch (Throwable var9) {
            if (var1 != null) {
               try {
                  var1.close();
               } catch (Throwable var7) {
                  var9.addSuppressed(var7);
               }
            }

            throw var9;
         }

         if (var1 != null) {
            var1.close();
         }
      }
   }

   public NLoginCore_411(NLoginType_008 var1, NLoginCore_479 var2, String var3, boolean var4) {
      super(var1, var2, var4);
      this.O = var3;
   }

   private static String a(int var0, long var1) {
      var1 ^= 49L;
      var1 ^= 8116762821542811484L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(61 + 8),
                     83,
                     (byte)(18 + 29),
                     (byte)(40 + 27),
                     (byte)(43 + 23),
                     (byte)(58 + 9),
                     (byte)(32 + 15),
                     (byte)(43 + 37),
                     (byte)(25 + 50),
                     (byte)(59 + 8),
                     (byte)(6 + 77),
                     (byte)(23 + 30),
                     (byte)(22 + 58),
                     (byte)(56 + 41),
                     (byte)(40 + 60),
                     (byte)(67 + 33),
                     (byte)(72 + 33),
                     (byte)(97 + 13),
                     (byte)(43 + 60)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(52 + 16), 69, (byte)(81 + 2)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_223.F("՜թըԫիէբինեԲհմխհնԸࢰ࣋ࣅࢨࣃࣇ࣓࣒ࣕ࣍ࢯ", (byte)61, 70));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         c[var0] = new String(var3.doFinal(Base64.getDecoder().decode(d[var0])), StandardCharsets.UTF_8);
      }

      return c[var0];
   }

   private static void b() {
      f = -6119018576185095806L;
      long var0 = f ^ 8116762821542811484L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(52 + 17),
               83,
               (byte)(44 + 3),
               (byte)(4 + 63),
               (byte)(32 + 34),
               (byte)(35 + 32),
               (byte)(8 + 39),
               (byte)(55 + 25),
               (byte)(3 + 72),
               (byte)(23 + 44),
               (byte)(3 + 80),
               (byte)(8 + 45),
               (byte)(8 + 72),
               (byte)(76 + 21),
               (byte)(25 + 75),
               (byte)(47 + 53),
               (byte)(54 + 51),
               (byte)(68 + 42),
               (byte)(30 + 73)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(62 + 7), 83}, StandardCharsets.UTF_8));
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
               d[0] = NLoginCore_223.A("ńĠĀľĵĴĪńĦĿŀĸŇıŀĤńĦŎĒōĕŘĩŔĻěğĝĶĞŝĴŕĹĴĿŢĜťŞĨĺĳ", (byte)38, 65);
               d[1] = NLoginCore_433.C("ҠѼќҚґҐ҆Ҡ҂қҜҔңҍҜҀҠ҂ҪѮҩѴҰҦҏҐѷ҃ѼғҙҏѷҞҘӄѼҷҡҶґ҅Ҫҏ", (byte)38, 67);
               d[2] = NLoginCore_027.F("ԖԽԴՋԹՁԗԞՀՙ՜\u0557Ժ՞ԟԽ՞ՍՁՙե՞ԵԶ", (byte)38, 70);
               d[3] = NLoginCore_004.B("ĠĕüĜħĵĻķĕĖĦē", (byte)38, 66);
               break;
            case 1:
               d[0] = NLoginCore_553.D("ҠѼќҚґҐ҆Ҡ҂қҜҔңҍҜҀҠ҂ҪѮҩѱҴ҅ҰҗѷѻѹҒѺҹҝҝҐҺҜҘҢҢҥ҉ӈҏ", (byte)38, 68);
               d[1] = NLoginCore_223.E("՛ԷԗՕՌՋՁ՛ԽՖ\u0557Տ՞Ո\u0557Ի՛ԽեԩդԯիաՊՋԲԾԷՎՔՊԻ\u0558պզՇԾԿժջեփՊ", (byte)38, 69);
               d[2] = NLoginCore_138.C("ћ҂ѹҐѾ҆ќѣ҅Ҟҡ҉ѤҦҙ҅ҞҮҳҟѳҐҖҡҩҭѴҘҮҵҸҿ", (byte)38, 67);
               d[3] = NLoginCore_173.E("ԧԭԬԕԺՏ\u0530\u0558Ճդ\u0557Ԫ", (byte)38, 69);
               break;
            case 2:
               d[0] = NLoginCore_004.F("ԍԺԛԗ՟ԯԚԻԳԿԺԤԢԟ\u0558՞ՙխՕԤՀհլԼՓՉԭՆէՓՐթ", (byte)38, 70);
            case 3:
            default:
               break;
            case 4:
               d[0] = NLoginCore_241.F("ԗԚՓԔԘՉԓՏդՙՂԞԽ\u0530ՙԹՃԼՂՠԪ՞ԵԶ", (byte)38, 70);
         }
      }
   }

   @Override
   protected void b(NLoginInterface_042 var1) {
      NLoginCore_219 var2 = new NLoginCore_219(this.O, this.b());
      this.a(var2);
      if (this.P != null) {
         this.L();
      } else {
         this.b(var2);
      }

      this.c(var1);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_411.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_397.D("ӓӵӷӗӻԚԒԨԔӣԡԗԥԟӨԍԯԮԦԬԦӻ", (byte)82, 68), NLoginCore_411.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_446.C("ԎԛԚӝԝԙԔԝԨԗӤԢԦԟԢԨӪࡢࡽࡷ࡚ࡵࡹࢇࢅࡿࢄࡡԁ", (byte)82, 67) + var1 + NLoginCore_091.A("ŝ", (byte)82, 65) + var2.toString(), var4
         );
      }
   }

   protected abstract void a(NLoginCore_219 var1);
}
