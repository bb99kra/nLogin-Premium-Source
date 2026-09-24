package com.nickuc.login;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.GameMode;
import org.bukkit.Location;

public class NLoginCore_301 {
   private static String[] a = new String[NLoginCore_301.aq];
   private static int s = 16777216 >>> 152 | 16777216 << ~152 + 1;
   private static int t = 524288 >>> 145 | 524288 << ~145 + 1;
   private static long l = Long.reverse(-8502796096475496448L);
   private static int y = Integer.reverse(536870912);
   private static int m = 16384 >>> 237 | 16384 << ~237 + 1;
   private static int ak = 3145728 >>> 52 | 3145728 << ~52 + 1;
   private static long c;
   private static int au = (12288 >>> 140 | 12288 << -140) & -1;
   private static int aa = Integer.reverse(-1610612736);
   private static int al = 0 >>> 95 | 0 << -95;
   private static int ap = Integer.reverse(536870912);
   private static int ai = 0 >>> 181 | 0 << ~181 + 1;
   private static int j = (524288 >>> 211 | 524288 << -211) & -1;
   private static String[] b = new String[NLoginCore_301.ar];
   private static long b = Long.reverse(-860842507935668741L);
   private static int ad = Integer.reverse(0);
   private static int as = Integer.reverse(Integer.MIN_VALUE);
   private static int u = Integer.reverse(0);
   private static int at = Integer.reverse(536870912);
   private static long ac = Long.reverse(-8502796096475496448L);
   private static int v = Integer.reverse(536870912);
   private static int h = (0 >>> 52 | 0 << -52) & -1;
   private static long q = Long.reverse(9083105469298386427L);
   private static int aq = 6291456 >>> 212 | 6291456 << -212;
   private static long k = Long.reverse(-860842507935668741L);
   private static long d = Long.reverse(-8502796096475496448L);
   private static final int g = at;
   private static final int f = NLoginCore_301.av;
   private static long ab = Long.reverse(-860842507935668741L);
   private static int ae = (8388608 >>> 85 | 8388608 << ~85 + 1) & -1;
   private static final int e = as;
   private final NLoginCore_456 b;
   private static int ag = (0 >>> 115 | 0 << ~115 + 1) & -1;
   private static int an = 0 >>> 184 | 0 << ~184 + 1;
   private static int a = 0 >>> 26 | 0 << -26;
   private static long z = Long.reverse(9083105469298386427L);
   private static long o = Long.reverse(-8502796096475496448L);
   private static int i = Integer.reverse(-1073741824);
   private static final int d = au;
   private static int ao = 8192 >>> 140 | 8192 << ~140 + 1;
   private static int av = 16 >>> 3 | 16 << -3;
   private static int p = (-1073741824 >>> 62 | -1073741824 << -62) & -1;
   private static int af = Integer.reverse(0);
   private static int r = 196608 >>> 176 | 196608 << -176;
   private static int ah = Integer.reverse(0);
   private static long n = Long.reverse(-860842507935668741L);
   private static int x = Integer.reverse(1073741824);
   private static int aj = (0 >>> 4 | 0 << -4) & -1;
   private static int am = Integer.reverse(0);
   private static int ar = (24576 >>> 76 | 24576 << ~76 + 1) & -1;
   private static int w = (1073741824 >>> 29 | 1073741824 << -29) & -1;

   private int a(NLoginCore_510 var1) {
      int var2 = an;
      if (var1.a != null) {
         var2 |= ao;
      }

      if (var1.g != null) {
         var2 |= ap;
      }

      return var2;
   }

   private static void b() {
      c = -2331721857071992785L;
      long var0 = c ^ -4893524788261587766L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(11 + 57),
               (byte)(50 + 19),
               (byte)(12 + 71),
               (byte)(43 + 4),
               (byte)(42 + 25),
               (byte)(19 + 47),
               (byte)(16 + 51),
               (byte)(15 + 32),
               (byte)(43 + 37),
               (byte)(50 + 25),
               (byte)(38 + 29),
               (byte)(74 + 9),
               (byte)(5 + 48),
               (byte)(52 + 28),
               (byte)(28 + 69),
               (byte)(15 + 85),
               100,
               (byte)(32 + 73),
               (byte)(27 + 83),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(61 + 7), 69, (byte)(79 + 4)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_575.F("ԼԾթզՂՅԺկԲՑԿծՏԮՉձԭՒԽսԶ՛ՉղյՍչԼռչ։ՀփֆիՖըջ֊Պմղյծքճկ֒ռՒ\u0557ՙնոեզ", (byte)54, 70);
               b[1] = NLoginCore_427.F("ԢաԸՋեՠՊՑըղՀգ՟ՏԸԲթԹ՛խՍվՅՆ", (byte)54, 70);
               b[2] = NLoginCore_471.B("ĶŅĞŤĠħťĥŠŊťĻţŰłœūūŊűŴŧİŲŮœŹĿŀũţŷńŲşŶƃƄŗŃśƎŧƌŸŬŉŴŒŠƉťŘƍƎŧƏƆžŞŴųŘƚ", (byte)54, 66);
               b[3] = NLoginCore_471.D("ӂӉҚҏҫңӈӈӔӓҺҟ", (byte)54, 68);
               b[4] = NLoginCore_127.B("ōşłľğŠĿŧŅŌřĥŭŃţşūŅŀŘŌŧľĿ", (byte)54, 66);
               b[5] = NLoginCore_141.D("ӉӃӎӃҨҰӇӂӍӉҵҵҼҝҚҾӠӊҳҙҭҤүҟӧҨӛӞӕҷӈӇҼӤһҽӴӑӏӢӔӸӆҿ", (byte)54, 68);
               break;
            case 1:
               b[0] = NLoginCore_091.E("ԼԾթզՂՅԺկԲՑԿծՏԮՉձԭՒԽսԶ՛ՉղյՍչԼռչ։ՀփֆիՖըջ֊ՊմղյՒ\u0557չֈհղճխչ֎ըեզ", (byte)54, 69);
               b[1] = NLoginCore_127.E("ԢաԸՋեՠՊՑըղԽԯկմԷժձխկՑխչպղյԿՠԼոտճև", (byte)54, 69);
               b[2] = NLoginCore_183.A("ĶŅĞŤĠħťĥŠŊťĻţŰłœūūŊűŴŧİŲŮœŹĿŀũţŷńŲşŶƃƄŗŃśƎŧƌŸŬŉŴŒŠƉťŘƉƑƙƙƇŴūźŭƠţ", (byte)54, 65);
               b[3] = NLoginCore_004.B("ŎĿŁĿĺŇĩġņŭņĳ", (byte)54, 66);
               b[4] = NLoginCore_521.C("ҹӋҮҪҋӌҫӓұҸӅҒҖҘӌҰҚҶҜӗӒҭҪҫ", (byte)54, 67);
               b[5] = NLoginCore_183.A("ŝŗŢŗļńśŖšŝŉŉŐıĮŒŴŞŇĭŁĸŃĳŻļůŲũŋŜśżŞšƄŘſŕłŶƀŮœ", (byte)54, 65);
               break;
            case 2:
               b[0] = NLoginCore_091.B("ţņĴŕģĺŒĹŉřŃļņŏńŔńŬŨıūŧľĿ", (byte)54, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_559.A("şťĹţşġĽŦīĹůĦšŢūŎĿŨŧĶŕűŖĸůŬŔŎŻŐĸŸ", (byte)54, 65);
         }
      }
   }

   static {
      b();
   }

   @Generated
   public NLoginCore_301(NLoginCore_456 var1) {
      this.b = var1;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_301.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_183.D("ϠЂЄϤЈЧПеСϰЮФвЬϵКмлгйгЈ", (byte)1, 68), NLoginCore_301.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_384.F("ԠԭԬӯԯԫԦԯԺԩӶԴԸԱԴԺӼ\u0891࢘ࢌࢂࡦ࢛\u0896ࡩࡶࡷࡸࢋࡺ࢙࢚ԗ", (byte)1, 70) + var1 + NLoginCore_223.F("ӷ", (byte)1, 70) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 81L;
      var1 ^= -4893524788261587766L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(11 + 57),
                     (byte)(26 + 43),
                     (byte)(65 + 18),
                     47,
                     (byte)(27 + 40),
                     (byte)(8 + 58),
                     (byte)(56 + 11),
                     (byte)(37 + 10),
                     (byte)(79 + 1),
                     (byte)(2 + 73),
                     (byte)(48 + 19),
                     (byte)(30 + 53),
                     (byte)(41 + 12),
                     (byte)(51 + 29),
                     (byte)(6 + 91),
                     (byte)(20 + 80),
                     (byte)(60 + 40),
                     (byte)(27 + 78),
                     (byte)(26 + 84),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(15 + 53), 69, (byte)(56 + 27)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_553.B("ƘƥƤŧƧƣƞƧƲơŮƬưƩƬƲŴԉԐԄӺӞԓԎӡӮӯӰԃӲԑԒ", (byte)91, 66));
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

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void a(NLoginCore_510 var1, boolean var2) {
      File var3 = var1.b;
      if (!var3.exists()) {
         throw new IllegalStateException(a(a, b ^ d));
      } else {
         BufferedInputStream var4 = NLoginCore_366.a(var3);
         boolean var15 = false /* VF: Semaphore variable */;

         try {
            var15 = true;
            DataInputStream var5 = new DataInputStream(var4);
            boolean var19 = false /* VF: Semaphore variable */;

            try {
               var19 = true;
               int var6 = var5.readInt();
               if (var6 > i) {
                  throw new UnsupportedOperationException(a(j, k ^ l) + var3 + a(m, n ^ o) + var6 + a(p, q) + r);
               }

               int var7 = var5.readInt();
               if ((var7 & s) != 0) {
                  var5.skipBytes(t);

                  for (int var8 = u; var8 < var5.readInt(); var8++) {
                     var5.skipBytes(v);
                     var5.skipBytes(var5.readInt());
                  }
               }

               var1.g = var5.readBoolean();
               if (var6 >= w) {
                  var1.h = var5.readBoolean();
                  var1.i = var5.readBoolean();
               }

               if ((var7 & x) != 0) {
                  String var23 = var5.readUTF();

                  try {
                     var1.a = GameMode.valueOf(var23);
                  } catch (IllegalArgumentException var20) {
                     var1.a = GameMode.SURVIVAL;
                     NLoginCore_370.d(a(y, z) + var23 + a(aa, ab ^ ac) + var1.a);
                  }
               }

               var1.h = var5.readInt();
               var1.i = var5.readInt();
               var1.d = var5.readDouble();
               var1.c = var5.readFloat();
               var1.d = var5.readFloat();
               var1.e = var2;
               if (!var2) {
                  if ((var7 & ae) != 0) {
                     var1.g = NLoginCore_393.a().a(var5);
                     var19 = false;
                  } else {
                     var19 = false;
                  }
               } else {
                  var19 = false;
               }
            } finally {
               if (var19) {
                  if (Collections.singletonList(var5).get(ag) != null) {
                     var5.close();
                  }
               }
            }

            if (Collections.singletonList(var5).get(af) != null) {
               var5.close();
               var15 = false;
            } else {
               var15 = false;
            }
         } finally {
            if (var15) {
               if (Collections.singletonList(var4).get(ai) != null) {
                  var4.close();
               }
            }
         }

         if (Collections.singletonList(var4).get(ah) != null) {
            var4.close();
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void c(NLoginCore_510 var1) {
      File var2 = var1.b;
      if (!var2.exists()) {
         NLoginCore_366.b(var2);
         DataOutputStream var3 = new DataOutputStream(NLoginCore_366.a(var2));
         boolean var8 = false /* VF: Semaphore variable */;

         try {
            var8 = true;
            var3.writeInt(ak);
            var3.writeInt(this.a(var1));
            var3.writeBoolean(var1.g);
            var3.writeBoolean(var1.h);
            var3.writeBoolean(var1.i);
            GameMode var4 = var1.a;
            if (var4 != null) {
               var3.writeUTF(var4.name().toUpperCase(Locale.ENGLISH));
            }

            var3.writeInt(var1.h);
            var3.writeInt(var1.i);
            var3.writeDouble(var1.d);
            var3.writeFloat(var1.c);
            var3.writeFloat(var1.d);
            Location var5 = var1.g;
            if (var5 != null) {
               NLoginCore_393.a().a(var5, var3);
            }

            var3.flush();
            var8 = false;
         } finally {
            if (var8) {
               if (Collections.singletonList(var3).get(am) != null) {
                  var3.close();
               }
            }
         }

         if (Collections.singletonList(var3).get(al) != null) {
            var3.close();
         }
      }
   }
}
