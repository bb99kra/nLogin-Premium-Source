package com.nickuc.login;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import javax.annotation.CheckReturnValue;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class πησοιΣζΩθΛδλζσ {
   private static long k = Long.reverse(4035225266123964416L);
   private static int x = 0 >>> 40 | 0 << ~40 + 1;
   private static int aw = Integer.reverse(536870912);
   private static int as = (0 >>> 119 | 0 << -119) & -1;
   private static int an = Integer.reverse(0);
   private static String[] b = new String[πησοιΣζΩθΛδλζσ.ax];
   private static int o = Integer.reverse(Integer.MIN_VALUE);
   private static int s = Integer.reverse(0);
   private static int b = Integer.reverse(-1);
   private static int ae = Integer.reverse(0);
   private static int ar = Integer.reverse(Integer.MIN_VALUE);
   private static long ah = Long.reverse(4035225266123964416L);
   private static int ab = 0 >>> 65 | 0 << ~65 + 1;
   private static int q = Integer.reverse(0);
   private static int u = Integer.reverse(0);
   private static int ak = Integer.reverse(Integer.MIN_VALUE);
   private static int av = Integer.reverse(0);
   private static long c;
   private static int ac = Integer.reverse(0);
   private static int at = 0 >>> 186 | 0 << -186;
   private static int ai = Integer.reverse(0);
   private static int aj = 0 >>> 12 | 0 << -12;
   private static long ag = Long.reverse(6313306922169161603L);
   private static int ap = Integer.reverse(0);
   private static int l = Integer.reverse(0);
   private static String[] a = new String[aw];
   private static int p = Integer.reverse(0);
   private static int t = Integer.reverse(0);
   private static int aa = (0 >>> 147 | 0 << -147) & -1;
   private static long d = Long.reverse(8042689179079432067L);
   private static int r = 0 >>> 127 | 0 << -127;
   private static int z = (2 >>> 129 | 2 << -129) & -1;
   private static int am = (0 >>> 254 | 0 << ~254 + 1) & -1;
   private static int au = 64 >>> 198 | 64 << -198;
   private static int ax = (512 >>> 135 | 512 << ~135 + 1) & -1;
   private static long j = Long.reverse(6313306922169161603L);
   private static int n = Integer.reverse(0);
   private static int y = Integer.reverse(0);
   private static int af = 3072 >>> 42 | 3072 << ~42 + 1;
   private static int i = 4096 >>> 203 | 4096 << ~203 + 1;
   private static long g = Long.reverse(4035225266123964416L);
   private static int m = Integer.reverse(Integer.MIN_VALUE);
   private static int a = Integer.reverse(0);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int ao = Integer.reverse(0);
   private static int al = Integer.reverse(0);
   private static int aq = (0 >>> 145 | 0 << -145) & -1;
   private static int h = (134217728 >>> 251 | 134217728 << -251) & -1;
   private static long f = Long.reverse(6313306922169161603L);
   private static int v = (0 >>> 157 | 0 << -157) & -1;
   private static int ad = (0 >>> 209 | 0 << ~209 + 1) & -1;
   private static int w = 0 >>> 140 | 0 << -140;

   @CheckReturnValue
   public static BufferedOutputStream a(File var0, int var1, OpenOption... var2) {
      return new BufferedOutputStream(Files.newOutputStream(var0.toPath(), var2), var1);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean a(String var0, File var1) {
      InputStream var2 = πελπφβυψεσαωοΦ.a(var0);
      boolean var6 = false /* VF: Semaphore variable */;

      int var8;
      label70: {
         try {
            var6 = true;
            if (var2 == null) {
               throw new IOException(c<"㺀">(af, ag ^ ah) + var0);
            }

            if (!b(var1)) {
               var8 = ai;
               var6 = false;
               break label70;
            }

            a(var2, var1);
            var8 = ak;
            var6 = false;
         } finally {
            if (var6) {
               if (Collections.singletonList(var2).get(am) != null) {
                  var2.close();
               }
            }
         }

         if (Collections.singletonList(var2).get(al) != null) {
            var2.close();
         }

         return (boolean)var8;
      }

      if (Collections.singletonList(var2).get(aj) != null) {
         var2.close();
      }

      return (boolean)var8;
   }

   public static boolean a(File var0) {
      if (var0.isDirectory()) {
         File[] var1 = var0.listFiles();
         if (var1 != null) {
            File[] var2 = var1;
            int var3 = var1.length;

            for (int var4 = q; var4 < var3; var4++) {
               File var5 = var2[var4];
               a(var5);
            }
         }
      }

      return var0.delete();
   }

   public static File a(File var0, String var1) {
      int var2 = n;
      File var3 = var0.getParentFile();

      File var4;
      do {
         Object[] var10004 = new Object[o];
         var10004[p] = var2++;
         var4 = new File(var3, String.format(var1, var10004));
      } while (var4.exists());

      return var4;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean c(File var0, File var1) {
      if (b(var1)) {
         BufferedInputStream var2 = a(var0);
         boolean var9 = false /* VF: Semaphore variable */;

         int var4;
         try {
            var9 = true;
            BufferedOutputStream var3 = a(var1);
            boolean var12 = false /* VF: Semaphore variable */;

            try {
               var12 = true;
               πελπφβυψεσαωοΦ.a(var2, var3);
               var4 = z;
               var12 = false;
            } finally {
               if (var12) {
                  if (Collections.singletonList(var3).get(ac) != null) {
                     var3.close();
                  }
               }
            }

            if (Collections.singletonList(var3).get(aa) != null) {
               var3.close();
               var9 = false;
            } else {
               var9 = false;
            }
         } finally {
            if (var9) {
               if (Collections.singletonList(var2).get(ad) != null) {
                  var2.close();
               }
            }
         }

         if (Collections.singletonList(var2).get(ab) != null) {
            var2.close();
         }

         return (boolean)var4;
      } else {
         return (boolean)ae;
      }
   }

   private static void b() {
      c = -4473737293995525654L;
      long var0 = c ^ -6719536005383730399L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(4 + 64),
               (byte)(16 + 53),
               (byte)(70 + 13),
               47,
               (byte)(66 + 1),
               (byte)(63 + 3),
               (byte)(32 + 35),
               (byte)(13 + 34),
               (byte)(34 + 46),
               (byte)(48 + 27),
               (byte)(66 + 1),
               (byte)(38 + 45),
               (byte)(50 + 3),
               (byte)(52 + 28),
               (byte)(8 + 89),
               (byte)(80 + 20),
               (byte)(44 + 56),
               (byte)(71 + 34),
               110,
               (byte)(21 + 82)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(41 + 28), (byte)(72 + 11)}, StandardCharsets.UTF_8));
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
               b[0] = ΣφδσΔζιΠρα.F("չք֘ֈքս\u058cծ։իւջ", (byte)119, 70);
               b[1] = ΣερμΔσατσκ.E("ֆ֧֪֠֯վվխֆճ֒ջ", (byte)119, 69);
               b[2] = δΛψπξκσβγςα.A("ƿƹƸƣǧǚǢǃǭǆǦƵ", (byte)119, 65);
               b[3] = ΠΛΨοδΩσμνΛγΦφβς.F("ցլ֗ց֢ր֎֭փְ֪֯ֈ֕ոօ֒պְֿ֣֒֝ׄվֵֹֻ\u05c8ֿֿ֧֥֚֓֘֕֟֟א֏\u058bֳׇֹׁׁ֟ה֓\u05cc\u05cf֚֟֘֞ףסםפּ֞זַ", (byte)119, 70);
               break;
            case 1:
               b[0] = πψυκΠΨμΛΩβΣφμφσ.D("ՋյքՕՉյ\u0590Ռղ։֜֙՝֗սծ֕պֆքՙ֦խծ", (byte)119, 68);
               b[1] = ΨΦνΨΦωυΩνβςμ.B("ǝǨǩƛƳƹǈǢǈǙƯƵ", (byte)119, 66);
               b[2] = ΦδφπθΩΩλζξ.D("մ՝ՐկժՠՖփՖճ֏բ", (byte)119, 68);
               b[3] = ζοηκορΦνΣθγΩ.E(
                  "ցլ֗ց֢ր֎֭փְ֪֯ֈ֕ոօ֒պְֿ֣֒֝ׄվֵֹֻ\u05c8ֿֿ֧֥֚֓֘֕֟֟א֏\u058bֳׇֹׁׁ֟ה֓\u05cc\u05cf֚סֶֹֺדֳָ\u05c9צחתו֦ׄ\u05c9שףּׁ֩סנֻ", (byte)119, 69
               );
               break;
            case 2:
               b[0] = ςΦζσμτΓσ.E("ի֧֟ժօ֚իծռ֒խջ", (byte)119, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = θεωψξβΛσσ.E("ըք֨֬֫վ֥֫փֆֲ֤֭հ֘չ֕ևָջֳ֯ֆև", (byte)119, 69);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  πησοιΣζΩθΛδλζσ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ιΠοθΩΦξκ.A("ŕŷŹřŽƜƔƪƖťƣƙƧơŪƏƱưƨƮƨŽ", (byte)87, 65), πησοιΣζΩθΛδλζσ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            φΨαξωυθανΣφυκη.D("ԝԪԩӬԬԨԣԬԷԦӳԱԵԮԱԷӹࢋࢃ\u0890ࢍ࢈ࡳࢇࡻࢋ\u086fࢉ\u0891ࢍ࢛ԓ", (byte)87, 68) + var1 + πχσδΦΦνθΔπ.E("Ս", (byte)87, 69) + var2.toString(), var4
         );
      }
   }

   public static boolean a(File var0, boolean var1) {
      if (!var1 && var0.exists()) {
         return (boolean)ar;
      } else {
         File var2 = var0.getParentFile();
         return (boolean)(var2 != null && !var2.exists() && !var2.mkdirs() ? as : var0.createNewFile());
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static String a(File var0, MessageDigest var1) {
      BufferedInputStream var2 = a(var0);
      boolean var6 = false /* VF: Semaphore variable */;

      String var3;
      try {
         var6 = true;
         var3 = πελπφβυψεσαωοΦ.a(var2, var1);
         var6 = false;
      } finally {
         if (var6) {
            if (Collections.singletonList(var2).get(w) != null) {
               var2.close();
            }
         }
      }

      if (Collections.singletonList(var2).get(v) != null) {
         var2.close();
      }

      return var3;
   }

   public static File a(Class<?> var0) {
      try {
         String var1 = var0.getProtectionDomain().getCodeSource().getLocation().getPath();
         String var2 = URLDecoder.decode(var1, c<"㺀">(a & b, d));
         return new File(var2);
      } catch (UnsupportedEncodingException var3) {
         throw new RuntimeException(var3);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 28L;
      var1 ^= -6719536005383730399L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(26 + 42),
                     (byte)(63 + 6),
                     (byte)(49 + 34),
                     (byte)(5 + 42),
                     (byte)(18 + 49),
                     (byte)(48 + 18),
                     (byte)(21 + 46),
                     (byte)(39 + 8),
                     (byte)(62 + 18),
                     (byte)(56 + 19),
                     (byte)(48 + 19),
                     (byte)(51 + 32),
                     (byte)(19 + 34),
                     (byte)(39 + 41),
                     97,
                     (byte)(89 + 11),
                     (byte)(49 + 51),
                     105,
                     (byte)(18 + 92),
                     (byte)(47 + 56)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(63 + 20)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(μεςΩΔΣγν.E("֒֟֞ա֛֡֝֘֡֬ը֦֪֣֦֬ծऀࣸअंࣰࣽࣨࣼऀࣤࣾआंऐ", (byte)115, 69));
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

   @CheckReturnValue
   public static BufferedOutputStream a(File var0, OpenOption... var1) {
      return new BufferedOutputStream(Files.newOutputStream(var0.toPath(), var1));
   }

   @CheckReturnValue
   public static BufferedInputStream a(File var0, OpenOption... var1) {
      return new BufferedInputStream(Files.newInputStream(var0.toPath(), var1));
   }

   public static boolean b(File var0) {
      return a(var0, (boolean)aq);
   }

   public static String c(File var0) {
      String var1 = var0.getName();
      String[] var2 = var1.split(c<"㺀">(e, f ^ g));
      return var2.length == h ? var1 : String.join(c<"㺃">(i, j ^ k), Arrays.copyOfRange(var2, l, var2.length - m));
   }

   static {
      b();
   }

   public static boolean a(File var0, long var1) {
      BasicFileAttributes var3 = Files.readAttributes(var0.toPath(), BasicFileAttributes.class);
      long var4 = var3.creationTime().toMillis();
      return (boolean)(System.currentTimeMillis() - var4 >= var1 ? au : av);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void a(InputStream var0, File var1) {
      BufferedOutputStream var2 = a(var1);
      boolean var5 = false /* VF: Semaphore variable */;

      try {
         var5 = true;
         πελπφβυψεσαωοΦ.a(var0, var2);
         var5 = false;
      } finally {
         if (var5) {
            if (Collections.singletonList(var2).get(ap) != null) {
               var2.close();
            }
         }
      }

      if (Collections.singletonList(var2).get(ao) != null) {
         var2.close();
      }
   }

   @CheckReturnValue
   public static BufferedInputStream a(File var0, int var1, OpenOption... var2) {
      return new BufferedInputStream(Files.newInputStream(var0.toPath(), var2), var1);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static String d(File var0) {
      BufferedInputStream var1 = a(var0);
      boolean var6 = false /* VF: Semaphore variable */;

      String var3;
      try {
         var6 = true;
         byte[] var2 = πελπφβυψεσαωοΦ.a(var1);
         var3 = new String(Base64.getEncoder().encode(var2));
         var6 = false;
      } finally {
         if (var6) {
            if (Collections.singletonList(var1).get(t) != null) {
               var1.close();
            }
         }
      }

      if (Collections.singletonList(var1).get(s) != null) {
         var1.close();
      }

      return var3;
   }
}
