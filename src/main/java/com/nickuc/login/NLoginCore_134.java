package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum NLoginCore_134 implements NLoginInterface_005 {
   a(a(NLoginCore_134.az, NLoginCore_134.ba), Boolean.valueOf((NLoginCore_134 != 0).bb));

   public static final int j = NLoginCore_134.av;
   private static final NLoginCore_208 a = new NLoginCore_208(a(NLoginCore_134.bc & NLoginCore_134.bd, NLoginCore_134.be), values().length);
   private final NLoginCore_474 a;
   private final Object b;
   private static String[] ZKM_STR_A = new String[NLoginCore_134.at];
   private static String[] ZKM_STR_B = new String[NLoginCore_134.au];
   private static long c;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int b = Integer.reverse(0);
   private static int c = Integer.reverse(0);
   private static int d = Integer.reverse(-1);
   private static long e = Long.reverse(-5397008329092063551L);
   private static int f = Integer.reverse(0);
   private static int g = 16 >>> 132 | 16 << -132;
   private static long h = Long.reverse(-2947050131802513727L);
   private static long i = Long.reverse(7061644215716937728L);
   private static int k = Integer.reverse(0);
   private static int l = (0 >>> 20 | 0 << -20) & -1;
   private static int m = 131072 >>> 144 | 131072 << -144;
   private static long n = Long.reverse(-5397008329092063551L);
   private static int o = Integer.reverse(-1073741824);
   private static long p = Long.reverse(-2947050131802513727L);
   private static long q = Long.reverse(7061644215716937728L);
   private static int r = (0 >>> 103 | 0 << -103) & -1;
   private static int s = Integer.reverse(Integer.MIN_VALUE);
   private static int t = Integer.reverse(536870912);
   private static long u = Long.reverse(-5397008329092063551L);
   private static int v = (163840 >>> 47 | 163840 << ~47 + 1) & -1;
   private static int w = -1 >>> 106 | -1 << -106;
   private static long x = Long.reverse(-5397008329092063551L);
   private static int y = (196608 >>> 143 | 196608 << -143) & -1;
   private static int z = Integer.reverse(-1);
   private static long aa = Long.reverse(-5397008329092063551L);
   private static int ab = (1835008 >>> 242 | 1835008 << -242) & -1;
   private static long ac = Long.reverse(-2947050131802513727L);
   private static long ad = Long.reverse(7061644215716937728L);
   private static int ae = Integer.reverse(0);
   private static int af = 8192 >>> 235 | 8192 << ~235 + 1;
   private static int ag = Integer.reverse(0);
   private static int ah = Integer.reverse(0);
   private static int ai = (65536 >>> 205 | 65536 << -205) & -1;
   private static long aj = Long.reverse(-2947050131802513727L);
   private static long ak = Long.reverse(7061644215716937728L);
   private static int al = Integer.reverse(Integer.MIN_VALUE);
   private static int am = (0 >>> 162 | 0 << ~162 + 1) & -1;
   private static int an = Integer.reverse(536870912);
   private static int ao = (8 >>> 99 | 8 << ~99 + 1) & -1;
   private static int ap = Integer.reverse(Integer.MIN_VALUE);
   private static int aq = (0 >>> 45 | 0 << -45) & -1;
   private static int ar = (67108864 >>> 218 | 67108864 << -218) & -1;
   private static int as = Integer.reverse(0);
   private static int at = 6144 >>> 73 | 6144 << -73;
   private static int au = Integer.reverse(805306368);
   private static int av = 8192 >>> 139 | 8192 << ~139 + 1;
   private static int aw = Integer.reverse(-1879048192);
   private static long ax = Long.reverse(-5397008329092063551L);
   private static int ay = (0 >>> 170 | 0 << -170) & -1;
   private static int az = 2560 >>> 104 | 2560 << -104;
   private static long ba = Long.reverse(-5397008329092063551L);
   private static int bb = 262144 >>> 242 | 262144 << ~242 + 1;
   private static int bc = (11264 >>> 10 | 11264 << -10) & -1;
   private static int bd = (-1 >>> 226 | -1 << -226) & -1;
   private static long be = Long.reverse(-5397008329092063551L);

   @Override
   public NLoginCore_208 a() {
      return a;
   }

   public static boolean a(nLoginBukkit var0, boolean var1) {
      NLoginCore_270 var2 = new NLoginCore_270();
      NLoginCore_219 var3 = var0.a();
      if (!var3.r()) {
         var3.o(a(g, h ^ i));
      } else if (!var1 && !var3.X()) {
         return (k != 0);
      }

      if (!var3.Z()) {
         return (l != 0);
      } else {
         NLoginCore_525.a(values(), a, var3);
         a(var0.a());
         NLoginCore_370.b(a(m, n) + var2.h() + a(o, p ^ q));
         return (s != 0);
      }
   }

   private static void b() {
      c = -8973099588963559189L;
      long var0 = c ^ 6496101442040311763L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(3 + 65),
               69,
               (byte)(29 + 54),
               (byte)(38 + 9),
               (byte)(33 + 34),
               (byte)(38 + 28),
               (byte)(3 + 64),
               (byte)(3 + 44),
               (byte)(2 + 78),
               (byte)(47 + 28),
               (byte)(11 + 56),
               (byte)(47 + 36),
               (byte)(26 + 27),
               (byte)(68 + 12),
               (byte)(9 + 88),
               (byte)(12 + 88),
               (byte)(86 + 14),
               (byte)(4 + 101),
               (byte)(69 + 41),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(30 + 39), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_433.C("јѿѶшѤѼѓѿѪчѧтѹѳҍѵѥғѦѭѩ҈џѠ", (byte)29, 67);
               ZKM_STR_B[1] = NLoginCore_127.F("ՎԨԩՖՈՆՅԋՆՑԔԷՆՇ՚ՁՂԺԱԣՆէՔԿթԼՇծԦԹՅծժՉՠՆԮԿչՌՙԳԺԼժկմրԿՔծ\u0557սգՈՀ՞շՉ՚ՠ\u058bգ֎", (byte)29, 70);
               ZKM_STR_B[2] = NLoginCore_384.C("ѹѯѴѰѧѳѾц҉ҏѽѦэѡҐҊҒѢѯя҂ѢѤҗ҉ѕҊҙҠҒҗҏќџңѷ҆҂ѻҍѷҚѿѴ", (byte)29, 67);
               ZKM_STR_B[3] = NLoginCore_471.C("пѿ҈ѻҀҊхѷҊѸює", (byte)29, 67);
               ZKM_STR_B[4] = NLoginCore_232.B("ĝĤîēıďôĳĻďđ÷ĕŀě÷ęęĬĮķğČč", (byte)29, 66);
               ZKM_STR_B[5] = NLoginCore_384.F("ԩԫՂՅԴՖԵԐԩԮՒԡ", (byte)29, 70);
               ZKM_STR_B[6] = NLoginCore_183.A("ąĬģõđĩĀĬėôĔýćĴŁĎġĀļģĢŅČč", (byte)29, 65);
               ZKM_STR_B[7] = NLoginCore_201.D("хѼцѦѣћѴфѣ҇ҁє", (byte)29, 68);
               ZKM_STR_B[8] = NLoginCore_173.B("ĢĩïĒħíøĳĈĔċĘıöĎŁĽĖĵĳĘĒŉāĖŌŌćĠĞĭČŋōĿľČĶıĪŐŏēĮĚĸŝĸŜĸļĸĹņľĶĢŗīĻĮįŢŢŭŭŭųőŢŦšōŬŜŴŧŽŗŭžŚĶžŗŏŌō", (byte)29, 66);
               ZKM_STR_B[9] = NLoginCore_232.B("ĈĠĐďĭĖċĶčíĪýĜĎČĻěĔĎĸĎĹŃļńąĨŊħĎłĪ", (byte)29, 66);
               ZKM_STR_B[10] = NLoginCore_092.B("ħđñĎñĩĹĴĥĐıığİĐĳĸńĥĻęĲĕēĿĂĶĉģęōĜ", (byte)29, 66);
               ZKM_STR_B[11] = NLoginCore_201.E("ՇԐԨԩՎՐԑԡԮՈՈՇԙ՞՚՞ԮԵԬդԹԯԬԭ", (byte)29, 69);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_183.D("јѿѶшѤѼѓѿѪчѨѦёўҋѾўѐѥѵјқҒѯҞҐҝћҎћҋѰ", (byte)29, 68);
               ZKM_STR_B[1] = NLoginCore_076.B("ĮĈĉĶĨĦĥëĦıôėĦħĺġĢĚđăĦŇĴğŉĜħŎĆęĥŎŊĩŀĦĎğřĬĹēĚĜŊŏŔŠğĴŎķŝňłśŔīĺŠŘŏŎĮ", (byte)29, 66);
               ZKM_STR_B[2] = NLoginCore_027.B("ĦĜġĝĔĠīóĶļĪēúĎĽķĿďĜüįďđńĶĂķņōĿńļĊłğŔŅġŅőķĦŖġ", (byte)29, 66);
               ZKM_STR_B[3] = NLoginCore_433.E("ԻԱԑԎԿԖԔԒՌՅԸԡ", (byte)29, 69);
               ZKM_STR_B[4] = NLoginCore_553.E("ԽՄԎԳՑԯԔՓ՛ԯԲԙԭՇՐ՞Ւ՚ԢԗԤԯԬԭ", (byte)29, 69);
               ZKM_STR_B[5] = NLoginCore_324.C("яюѐѨлѳѨѼҎѻѫє", (byte)29, 67);
               ZKM_STR_B[6] = NLoginCore_110.B("ąĬģõđĩĀĬėôĖĺĆēĕķĲĀĞķľğČč", (byte)29, 66);
               ZKM_STR_B[7] = NLoginCore_201.B("ĎéĪĝìċôăĶĎİķĔĭĜĹĲčıĂĖďČč", (byte)29, 66);
               ZKM_STR_B[8] = NLoginCore_004.A("ĢĩïĒħíøĳĈĔċĘıöĎŁĽĖĵĳĘĒŉāĖŌŌćĠĞĭČŋōĿľČĶıĪŐŏēĮĚĸŝĸŜĸļĸĹņľĶĢŗīĻĮįŢŢŭŭŭųőŢŦšōŬťĽŊŊĽŁŲŎŖţŮśƉũŕŹƊńřŁŨž", (byte)29, 65);
               ZKM_STR_B[9] = NLoginCore_451.C("ћѳѣѢҀѩў҉ѠрѽѐѯѡџҎѮѧѡҋѡ҈ѤѶҞѽҙҁҘҘңѻ", (byte)29, 67);
               ZKM_STR_B[10] = NLoginCore_141.A("ħđñĎñĩĹĴĥĐıığİĐĳĸńĥĻęĤıĕĘŋĨĸŋĝĘĐ", (byte)29, 65);
               ZKM_STR_B[11] = NLoginCore_387.B("ħðĈĉĮİñāĎĨħĚýĭûľĀĝĶğĂĵČč", (byte)29, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_173.A("ĳåĮıČĪóİĔĳćĜĔĎĕčđþČĔÿĵČč", (byte)29, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_232.C("҅фі҅Ѥј҄ѽ҆ћҐѽҒҁўѱҕь҃ѠҐїѳѱҌѬѬҌ҉ҕѲѡ", (byte)29, 67);
         }
      }
   }

   @Override
   public Object a() {
      return this.b;
   }

   private static String a(int var0, long var1) {
      var1 ^= 70L;
      var1 ^= 6496101442040311763L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(6 + 62),
                     69,
                     (byte)(36 + 47),
                     (byte)(12 + 35),
                     (byte)(52 + 15),
                     (byte)(13 + 53),
                     (byte)(62 + 5),
                     (byte)(16 + 31),
                     (byte)(73 + 7),
                     75,
                     (byte)(64 + 3),
                     (byte)(33 + 50),
                     (byte)(24 + 29),
                     (byte)(71 + 9),
                     (byte)(66 + 31),
                     (byte)(13 + 87),
                     (byte)(98 + 2),
                     (byte)(42 + 63),
                     (byte)(109 + 1),
                     (byte)(88 + 15)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(14 + 54), (byte)(41 + 28), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_127.A("ŔšŠģţşŚţŮŝĪŨŬťŨŮİҶӋӊҭӉӏҽӄҝ", (byte)57, 65));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_134.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_427.F("ԐԲԴԔԸ\u0557ՏեՑԠ՞Քբ՜ԥՊլիգթգԸ", (byte)44, 70), NLoginCore_134.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_553.C("ҜҩҨѫҫҧҢҫҶҥѲҰҴҭҰҶѸ߾ࠓࠒߵࠑࠗࠅࠌߥҍ", (byte)44, 67) + var1 + NLoginCore_453.D("ѳ", (byte)44, 68) + var2.toString(), var4
         );
      }
   }

   @Override
   public int a() {
      return this.ordinal();
   }

   private NLoginCore_134(String var3, Object var4) {
      String[] var10001 = new String[a];
      var10001[b] = var3;
      this.a = NLoginCore_474.a(var10001);
      this.b = var4;
   }

   @Override
   public NLoginCore_474 a() {
      return this.a;
   }

   static {
      b();
   }

   public static boolean j() {
      return a(c & d, e).equals(NLoginCore_477.b.a(new Object[f]));
   }

   private static void a(NLoginType_008 var0) {
      File var1 = new File(var0.c(), a(t, u));
      if (!var1.exists()) {
         NLoginCore_556 var14 = NLoginCore_303.a();
         if (var14 != null) {
            String var15 = var14.af();
            if (var14 == NLoginCore_556.d) {
               var15 = a(v & w, x);
            }

            BCryptHashProvider.a(NLoginCore_477.b, a(y & z, aa) + var15 + a(ab, ac ^ ad));
         }
      } else {
         try {
            label84: {
               InputStream var2 = Files.newInputStream(var1.toPath());

               label77: {
                  try {
                     DataInputStream var3 = new DataInputStream(var2);
                     if (var3.readUnsignedShort() != af) {
                        break label77;
                     }

                     int var4 = var3.readUnsignedShort();

                     for (int var5 = ag; var5 < var4; var5++) {
                        String var6 = var3.readUTF();
                        NLoginCore_477 var7 = Arrays.stream(NLoginCore_477.values()).filter(var1x -> var6.equals(var1x.h.a()[aq])).findFirst().orElse(null);
                        if (var7 != null) {
                           switch (var3.readByte()) {
                              case 0:
                                 NLoginCore_525.a(var7, NLoginCore_477.h, var3.readUTF());
                                 break;
                              case 1:
                                 NLoginCore_525.a(var7, NLoginCore_477.h, var3.readBoolean());
                                 break;
                              case 2:
                                 NLoginCore_525.a(var7, NLoginCore_477.h, var3.readInt());
                                 break;
                              case 3:
                                 int var8 = var3.readInt();
                                 String[] var9 = new String[var8];

                                 for (int var10 = ah; var10 < var8; var10++) {
                                    var9[var10] = var3.readUTF();
                                 }

                                 NLoginCore_135 var16 = NLoginCore_135.a(var9);
                                 NLoginCore_525.a(var7, NLoginCore_477.h, var16);
                           }
                        }
                     }
                  } catch (Throwable var12) {
                     if (var2 != null) {
                        try {
                           var2.close();
                        } catch (Throwable var11) {
                           var12.addSuppressed(var11);
                        }
                     }

                     throw var12;
                  }

                  if (var2 != null) {
                     var2.close();
                  }
                  break label84;
               }

               if (var2 != null) {
                  var2.close();
               }

               return;
            }
         } catch (IOException var13) {
            String var10000 = a(ai, aj ^ ak);
            Object[] var10002 = new Object[al];
            var10002[am] = an;
            NLoginCore_370.c(var10000, var13, var10002);
         }
      }

      BCryptHashProvider.c(var0, (ao != 0));
      BCryptHashProvider.e(var0, (ap != 0));
   }
}
