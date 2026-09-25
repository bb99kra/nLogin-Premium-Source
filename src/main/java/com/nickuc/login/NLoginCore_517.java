package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.util.crypto.SignatureData;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.PublicKey;
import java.time.Instant;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_517 {
   private static long u = Long.reverse(-72057594037927936L);
   private final SignatureData a;
   private static int f = 1024 >>> 10 | 1024 << ~10 + 1;
   private final UUID h;
   private static int k = Integer.reverse(0);
   private static int b = 0 >>> 150 | 0 << ~150 + 1;
   private static long c;
   private static long e = Long.reverse(-2305843009213693952L);
   private static long n = Long.reverse(-2305843009213693952L);
   private static int s = Integer.reverse(268435456);
   private static int t = 458752 >>> 112 | 458752 << ~112 + 1;
   private static String[] ZKM_STR_A = new String[NLoginCore_517.w];
   private static long i = Long.reverse(-2644304578639025914L);
   private static int l = (1024 >>> 9 | 1024 << ~9 + 1) & -1;
   private static int p = Integer.reverse(0);
   private static int q = Integer.reverse(Integer.MIN_VALUE);
   private static int v = Integer.reverse(268435456);
   private static int w = Integer.reverse(-1073741824);
   private static int g = Integer.reverse(0);
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private static int o = (8192 >>> 140 | 8192 << ~140 + 1) & -1;
   private static int x = 6144 >>> 75 | 6144 << ~75 + 1;
   private static int r = Integer.reverse(0);
   private static int h = Integer.MIN_VALUE >>> 255 | Integer.MIN_VALUE << -255;
   private static long m = Long.reverse(4273224449002055942L);
   private static long d = Long.reverse(4273224449002055942L);
   private static String[] ZKM_STR_B = new String[x];
   private static int a = Integer.reverse(402653184);

   static {
      b();
   }

   private byte[] a(long var1) {
      byte[] var3 = new byte[s];

      for (int var4 = t; var4 >= 0; var4--) {
         var3[var4] = (byte)(var1 & u);
         var1 >>= v;
      }

      return var3;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_517.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_453.C("ӍӯӱӑӵԔԌԢԎӝԛԑԟԙӢԇԩԨԠԦԠӵ", (byte)80, 67), NLoginCore_517.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_530.C("ԈԕԔӗԗԓԎԗԢԑӞԜԠԙԜԢӤࡾࡊࡺࡴࡷ࡞\u085cࡽࡳࡾ࢈ࡴ\u086bࢆࢄӿ", (byte)80, 67) + var1 + NLoginCore_173.E("Ն", (byte)80, 69) + var2.toString(), var4
         );
      }
   }

   @Generated
   public NLoginCore_517(SignatureData var1, UUID var2) {
      this.a = var1;
      this.h = var2;
   }

   public boolean aA() {
      return this.a.getTimestamp().isBefore(Instant.now());
   }

   public boolean a(byte[] var1, byte[] var2, long var3) {
      try {
         PublicKey var5 = this.a.getPublicKey();
         String var10000 = a(l, m ^ n);
         byte[][] var10003 = new byte[o][];
         var10003[p] = var2;
         var10003[q] = this.a(var3);
         return NLoginCore_496.a(var10000, var5, var1, var10003);
      } catch (IllegalArgumentException var6) {
         return (r != 0);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 7L;
      var1 ^= -3936542736834880727L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(21 + 47),
                     (byte)(42 + 27),
                     (byte)(60 + 23),
                     (byte)(39 + 8),
                     67,
                     (byte)(11 + 55),
                     (byte)(47 + 20),
                     (byte)(5 + 42),
                     (byte)(71 + 9),
                     (byte)(19 + 56),
                     (byte)(43 + 24),
                     (byte)(54 + 29),
                     (byte)(29 + 24),
                     (byte)(52 + 28),
                     (byte)(12 + 85),
                     (byte)(74 + 26),
                     (byte)(41 + 59),
                     105,
                     (byte)(25 + 85),
                     (byte)(54 + 49)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(30 + 38), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_446.A("ƠƭƬůƯƫƦƯƺƩŶƴƸƱƴƺżԖӢԒԌԏӶӴԕԋԖԠԌԃԞԜ", (byte)95, 65));
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

   private static void b() {
      c = 6959207181964128988L;
      long var0 = c ^ -3936542736834880727L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(55 + 13),
               (byte)(40 + 29),
               83,
               (byte)(20 + 27),
               (byte)(26 + 41),
               66,
               (byte)(58 + 9),
               (byte)(10 + 37),
               (byte)(23 + 57),
               (byte)(40 + 35),
               (byte)(32 + 35),
               (byte)(61 + 22),
               (byte)(25 + 28),
               (byte)(32 + 48),
               (byte)(91 + 6),
               (byte)(12 + 88),
               (byte)(5 + 95),
               (byte)(69 + 36),
               (byte)(43 + 67),
               (byte)(45 + 58)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(28 + 41), (byte)(37 + 46)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_173.E("Օ\u0557աևՉՁՄցՇՇՐօ֏֏֔ըՏզչձ֘։ՠա", (byte)81, 69);
               ZKM_STR_B[1] = NLoginCore_324.E("Օ\u0557աևՉՁՄցՇՇՐօ֏֏֔ըՏզչձ֘։ՠա", (byte)81, 69);
               ZKM_STR_B[2] = NLoginCore_110.D("ӮԝӷӾԗԗӧԥԡԥӿԀӧӷԮԞӾ\u0530ԔԑԲԤӻӼ", (byte)81, 68);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_384.F("Օ\u0557աևՉՁՄցՇՇՂֈփՑՊկքղր\u0557ևգՠա", (byte)81, 70);
               ZKM_STR_B[1] = NLoginCore_076.C("ӰӲӼԢӤӜӟԜӢӢӝөӹԜӪӺԍөԪӿԋԤӻӼ", (byte)81, 67);
               ZKM_STR_B[2] = NLoginCore_027.D("ӮԝӷӾԗԗӧԥԡԥӿԆԟԌԪӧԬԭӳԩԥԠԶԂԙԛӱӴӻԒӽԩ", (byte)81, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_446.D("ԠӹӽԟԎԧԈԚԡӦԉԅԢԗԘԫԟԐԇԨԖԌԦԄԗԷԩӴԅԷӸԷ", (byte)81, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_453.B("ŹųŷŬŶŪŸƛřŰơƑŻŢƚƩťƇƀŨƂƝŴŵ", (byte)81, 66);
         }
      }
   }

   public boolean aB() {
      byte[] var1 = this.a.getSignature();
      if (this.h != null) {
         byte[] var5 = this.a.getPublicKey().getEncoded();
         byte[] var3 = new byte[var5.length + a];
         ByteBuffer var4 = ByteBuffer.wrap(var3).order(ByteOrder.BIG_ENDIAN);
         var4.putLong(this.h.getMostSignificantBits());
         var4.putLong(this.h.getLeastSignificantBits());
         var4.putLong(this.a.getTimestamp().toEpochMilli());
         var4.put(var5);
         String var6 = a(b, d ^ e);
         PublicKey var7 = NLoginCore_496.a();
         byte[][] var8 = new byte[f][];
         var8[g] = var3;
         return NLoginCore_496.a(var6, var7, var1, var8);
      } else {
         byte[] var2 = this.a.getSignature();
         String var10000 = a(h, i);
         PublicKey var10001 = NLoginCore_496.a();
         byte[][] var10003 = new byte[j][];
         var10003[k] = var2;
         return NLoginCore_496.a(var10000, var10001, var1, var10003);
      }
   }
}
