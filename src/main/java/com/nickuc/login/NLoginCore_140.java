package com.nickuc.login;

import com.nickuc.login.loader.MemClassLoader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Collections;
import java.util.function.Consumer;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_140 {
   private static int j = 0 >>> 215 | 0 << -215;
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static int c = Integer.reverse(0);
   private static int m = Integer.reverse(134217728);
   private static int r = Integer.reverse(-201326592);
   private static long c;
   private static int k = Integer.reverse(-16777216);
   private static int v = Integer.reverse(524288);
   private static int b = Integer.reverse(0);
   private static int u = Integer.reverse(Integer.MIN_VALUE);
   private static int s = (376 >>> 99 | 376 << -99) & -1;
   private static long q = Long.reverse(8632653642518709203L);
   private static int p = Integer.reverse(0);
   private static int e = Integer.reverse(0);
   private static int t = Integer.reverse(Integer.MIN_VALUE);
   private static int i = (0 >>> 88 | 0 << ~88 + 1) & -1;
   private static int a = Integer.reverse(524288);
   private static String[] ZKM_STR_A = new String[t];
   private static int o = Integer.reverse(0);
   private static String[] ZKM_STR_B = new String[u];
   private static int h = (16 >>> 55 | 16 << -55) & -1;
   private static int d = 4 >>> 22 | 4 << -22;
   private static int g = 0 >>> 94 | 0 << ~94 + 1;
   private static final int ac = v;
   private static int f = Integer.reverse(-1);
   private static int l = Integer.reverse(8388608);

   public static void a(InputStream var0, OutputStream var1) {
      a(var0, var1, d);
   }

   public static String a(InputStream var0, MessageDigest var1) {
      byte[] var2 = new byte[h];

      int var3;
      while ((var3 = var0.read(var2)) > 0) {
         var1.update(var2, i, var3);
      }

      byte[] var4 = var1.digest();
      StringBuilder var5 = new StringBuilder();
      byte[] var6 = var4;
      int var7 = var4.length;

      for (int var8 = j; var8 < var7; var8++) {
         byte var9 = var6[var8];
         var5.append(Integer.toString((var9 & k) + l, m).substring(n));
      }

      return var5.toString();
   }

   @CheckReturnValue
   @Nullable
   public static InputStream a(String var0, boolean var1) {
      ClassLoader var2 = NLoginCore_140.class.getClassLoader();
      if (!(var2 instanceof MemClassLoader)) {
         throw new IllegalArgumentException(a(p, q) + var2.getClass().getCanonicalName());
      } else {
         MemClassLoader var3 = (MemClassLoader)var2;
         InputStream var4 = var1 ? var3.getParentLoader().getResourceAsStream(var0) : var3.getInJarResourceAsStream(var0);
         if (var4 == null) {
            var4 = var1 ? var3.getParentLoader().getResourceAsStream(r + var0) : var3.getInJarResourceAsStream(s + var0);
         }

         return var4;
      }
   }

   private static void b() {
      c = -3764179294589635679L;
      long var0 = c ^ -2051766061078832260L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(9 + 59),
               (byte)(18 + 51),
               (byte)(66 + 17),
               (byte)(30 + 17),
               (byte)(28 + 39),
               (byte)(24 + 42),
               67,
               (byte)(38 + 9),
               (byte)(30 + 50),
               75,
               (byte)(13 + 54),
               (byte)(64 + 19),
               (byte)(4 + 49),
               (byte)(27 + 53),
               (byte)(3 + 94),
               (byte)(76 + 24),
               (byte)(76 + 24),
               (byte)(87 + 18),
               (byte)(106 + 4),
               (byte)(21 + 82)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(7 + 62), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_427.D("ѢќѺѼтуѠѝѯљьѧҒ҃ҒѥҕѥѥқҙѴѮѶѽќѼѰѠҚ҃ѿ", (byte)30, 68);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_223.B("ĎĈĦĨîïČĉěąøēľįľđŁđđŇŅĜĥĘĈĢĖłőļīģņŏĔĔĊĴŌĵĜŅŐģ", (byte)30, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_521.B("êĔčīĪôùčđďĨă", (byte)30, 66);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_427.C("ѹѨѲѹѾѕїѾҌѮ҄ї", (byte)30, 67);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 79L;
      var1 ^= -2051766061078832260L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(12 + 57),
                     83,
                     (byte)(16 + 31),
                     (byte)(14 + 53),
                     (byte)(54 + 12),
                     (byte)(45 + 22),
                     (byte)(35 + 12),
                     (byte)(52 + 28),
                     (byte)(42 + 33),
                     (byte)(8 + 59),
                     (byte)(56 + 27),
                     (byte)(43 + 10),
                     (byte)(56 + 24),
                     (byte)(37 + 60),
                     (byte)(41 + 59),
                     (byte)(53 + 47),
                     (byte)(63 + 42),
                     (byte)(77 + 33),
                     (byte)(86 + 17)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(12 + 57), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_387.E("ֆ֓֒Օ֑֕\u058c֕֠֏՜֚֚֞֗֠բࣱࣴ࣪ࣷࣾ࣫ࣿःࣱऀ࣯ईࣿࣧ", (byte)103, 69));
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

   @CheckReturnValue
   public static ByteArrayInputStream a(String var0) {
      return a(var0, StandardCharsets.UTF_8);
   }

   static {
      b();
   }

   public static byte[] a(Consumer<NLoginCore_126> var0) {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      NLoginCore_126 var2 = new NLoginCore_126(new DataOutputStream(var1));
      var0.accept(var2);
      return var1.toByteArray();
   }

   public static void a(InputStream var0, OutputStream var1, int var2) {
      byte[] var3 = new byte[var2];

      int var4;
      while ((var4 = var0.read(var3, e, var2)) != f) {
         var1.write(var3, g, var4);
      }

      var1.flush();
   }

   @CheckReturnValue
   @Nullable
   public static InputStream a(String var0) {
      return a(var0, (o != 0));
   }

   @CheckReturnValue
   public static ByteArrayInputStream a(String var0, Charset var1) {
      return a(var0.getBytes(var1));
   }

   @CheckReturnValue
   public static ByteArrayInputStream a(byte[] var0) {
      return new ByteArrayInputStream(Base64.getDecoder().decode(var0));
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_140.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_127.E("\u0558պռ՜ր֭֟֗֙ը֦֪֤֜խֱֳִ֒֫֫ր", (byte)116, 69), NLoginCore_140.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_076.D("մցրՃփտպփ֎սՊֈ\u058cօֈ֎Ր\u08e2ࣱ࣭࣮ࣶ࣭ࣘࣟࣥ࣬ࣙࣟࣝࣕժ", (byte)116, 68) + var1 + NLoginCore_110.C("Ջ", (byte)116, 67) + var2.toString(), var4
         );
      }
   }

   @CheckReturnValue
   public static byte[] a(InputStream var0) {
      return b(var0, a);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @CheckReturnValue
   public static byte[] b(InputStream var0, int var1) {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      boolean var6 = false /* VF: Semaphore variable */;

      byte[] var3;
      try {
         var6 = true;
         a(var0, var2, var1);
         var3 = var2.toByteArray();
         var6 = false;
      } finally {
         if (var6) {
            if (Collections.singletonList(var2).get(c) != null) {
               var2.close();
            }
         }
      }

      if (Collections.singletonList(var2).get(b) != null) {
         var2.close();
      }

      return var3;
   }
}
