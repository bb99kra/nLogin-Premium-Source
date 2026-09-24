package com.nickuc.login;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class NLoginCore_272 {
   private static String[] b = new String[NLoginCore_272.ae];
   private static int h = (16384 >>> 173 | 16384 << -173) & -1;
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static long g = Long.reverse(-7638104968020361216L);
   private static long d = Long.reverse(-7638104968020361216L);
   private static int t = (201326592 >>> 217 | 201326592 << ~217 + 1) & -1;
   private static long o = Long.reverse(-3577314232617466458L);
   private static int q = Integer.reverse(-1610612736);
   private static long s = Long.reverse(-7638104968020361216L);
   private static int n = (512 >>> 135 | 512 << ~135 + 1) & -1;
   private static long p = Long.reverse(-7638104968020361216L);
   private static int m = (0 >>> 53 | 0 << ~53 + 1) & -1;
   private static long r = Long.reverse(-3577314232617466458L);
   private static int x = 0 >>> 31 | 0 << -31;
   private static int a = (0 >>> 127 | 0 << -127) & -1;
   private static long j = Long.reverse(-7638104968020361216L);
   private static int w = (1024 >>> 202 | 1024 << ~202 + 1) & -1;
   private static long aa = Long.reverse(6366633744616588710L);
   private static int k = (50331648 >>> 88 | 50331648 << -88) & -1;
   private static long i = Long.reverse(-3577314232617466458L);
   private static int z = Integer.reverse(-1);
   private static String[] a = new String[NLoginCore_272.ad];
   private static int ad = Integer.reverse(-1879048192);
   private static long b = Long.reverse(-3577314232617466458L);
   private static long c;
   private static long f = Long.reverse(-3577314232617466458L);
   private static long l = Long.reverse(6366633744616588710L);
   private static int ae = Integer.reverse(-1879048192);
   private static long v = Long.reverse(6366633744616588710L);
   private static int y = Integer.reverse(-536870912);
   private static long ac = Long.reverse(6366633744616588710L);
   private static int u = Integer.reverse(-1);
   private static int ab = Integer.reverse(268435456);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_272.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_201.F("՟ցփգևִ֦֞֠կֱ֣֭֫մֲֲָֺֻ֙և", (byte)123, 70), NLoginCore_272.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_141.F("֧֦֚թִ֥֣֩֠֩հֲִ֮֮֫նࣰࣾऍअऎऔ࣮घःऔ\u058c", (byte)123, 70) + var1 + NLoginCore_324.A("Ư", (byte)123, 65) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   public static NLoginCore_219 a(String var0, boolean var1) {
      if (var1) {
         var0 = a(a, b ^ d) + var0;
      }

      Path var2;
      try {
         var2 = Files.createTempFile(var0.replace(a(e, f ^ g), a(h, i ^ j)), a(k, l));
         if (var2 == null) {
            throw new IllegalStateException(a(n, o ^ p) + var0);
         }
      } catch (IOException var6) {
         throw new IllegalStateException(a(q, r ^ s) + var0, var6);
      }

      File var3 = var2.toFile();

      try {
         String var10000 = a(t & u, v);
         Object[] var10001 = new Object[w];
         var10001[x] = var0;
         NLoginCore_366.a(String.format(var10000, var10001), var3);
      } catch (IOException var5) {
         throw new RuntimeException(a(y & z, aa) + var0 + a(ab, ac), var5);
      }

      NLoginCore_219 var4 = new NLoginCore_219(var3);
      var3.deleteOnExit();
      return var4;
   }

   private static void b() {
      c = 7323072162356222579L;
      long var0 = c ^ -6838242460001041883L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(34 + 34),
               69,
               (byte)(4 + 79),
               (byte)(33 + 14),
               (byte)(27 + 40),
               (byte)(8 + 58),
               (byte)(41 + 26),
               (byte)(29 + 18),
               (byte)(47 + 33),
               (byte)(12 + 63),
               (byte)(64 + 3),
               (byte)(73 + 10),
               (byte)(22 + 31),
               (byte)(78 + 2),
               97,
               (byte)(62 + 38),
               (byte)(23 + 77),
               (byte)(103 + 2),
               (byte)(16 + 94),
               (byte)(84 + 19)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(14 + 54), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_110.D("ьзѯќокќєцшѐѤѡяѫѻждзљпъчш", (byte)21, 68);
               b[1] = NLoginCore_446.E("ԥՀԉՌՊԮՐԝԍԠԬԙ", (byte)21, 69);
               b[2] = NLoginCore_387.C("Пиыѐхћвѭджѓм", (byte)21, 67);
               b[3] = NLoginCore_521.D("ѕіяяйќєвѶЬѱм", (byte)21, 68);
               b[4] = NLoginCore_141.B("ďû÷ĢôÞñĔęĤėĥĢçīêèĩĪÿþõķĪčĸĴüĳċĈīāĻĶēěĔńāĜĩņđ", (byte)21, 66);
               b[5] = NLoginCore_223.D("њцтѭпЩмџѤѯѢѰѭвѶегѴѵъщр҂ѵј҃ѿчѾіѓѶь҆ҁўѦџҏьѧѴґќ", (byte)21, 68);
               b[6] = NLoginCore_530.D("щХѝѫѠпЭоѣьбыѓѣгвѵяѮѐѝюѳю҃ѷфѠџѣѓѢѝѪ҃Ѿѐы҈ыѡѰѩҔѣьѓѪѯққҐљҠѧѨ", (byte)21, 68);
               b[7] = NLoginCore_232.E("ԷԣԟՊԜԆԙԼՁՌՁՏՄՀՂՇԷԺԵԹԼՑԝՙԢբԺԟզԣԺՀԸԹԥլի\u0558լԼ՞ղժԮՒՁՃՖԸԲՍ՝Լ\u0557ՄՅ", (byte)21, 69);
               b[8] = NLoginCore_201.E("ՀԸՀԇԾՊՆՄԾԓԌ\u0530ՔԑԫՒԣՊԭՕՙԜՙԾաԹԠբԾԝՈգ", (byte)21, 69);
               break;
            case 1:
               b[0] = NLoginCore_076.F("ԩԔՌԹԛԗԹԱԣԥԬԠԍ\u0557ԓՙ\u0557ԣԬ՚ԺԧԤԥ", (byte)21, 70);
               b[1] = NLoginCore_183.D("сиљпѬсчѝгѰжм", (byte)21, 68);
               b[2] = NLoginCore_127.C("нщтюЮѧпѧаапм", (byte)21, 67);
               b[3] = NLoginCore_446.D("Ѩюѣпсѫѫттьям", (byte)21, 68);
               b[4] = NLoginCore_232.F("ԷԣԟՊԜԆԙԼՁՌԿՍՊԏՓԒԐՑՒԧԦԝ՟ՒԵՠ՜Ԥ՛Գ\u0530ՓԦՉթ՜ՇժՏդբԽԭՍՕՐ\u0530աԹՃՌՌկ\u0557ՄՅ", (byte)21, 70);
               b[5] = NLoginCore_004.D("њцтѭпЩмџѤѯѢѰѭвѶегѴѵъщр҂ѵј҃ѿчѾіѓѶҁѦцѩҒѪҒэҐҔҁѢѢѵљ҉ҊґқѬҐҐѧѨ", (byte)21, 68);
               b[6] = NLoginCore_427.B("þÚĒĠĕôâóĘāæĀĈĘèçĪĄģąĒăĨăĸĬùĕĔĘĈėĒğĸĳąĀĽĀĖĥğŋŃŁĆěŊĿŕŐńŅĜĝ", (byte)21, 66);
               b[7] = NLoginCore_027.D("њцтѭпЩмџѤѯѤѲѧѣѥѪњѝјќџѴрѼх҅ѝт҉цѝѣћќшҏҎѻҏџҁҕҐҀїҐѼҚ҉ѦѬҟѴѪѧѨ", (byte)21, 68);
               b[8] = NLoginCore_092.A("ĘĐĘßĖĢĞĜĖëäĈĬéăĪûĢąĭıóęëĉĆēČěöŀİ", (byte)21, 65);
               break;
            case 2:
               b[0] = NLoginCore_433.E("ԡԣԣԿՉԛԹԹՒԑԮԧԯԭԐԱԱ\u0558ՇԶԭ՝Ԥԥ", (byte)21, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_530.F("ԾՆԟԢԍՇԂՈՃԲԾԠԌՎԣԖՓԺԓ՜ԝԷԤԥ", (byte)21, 70);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 105L;
      var1 ^= -6838242460001041883L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(13 + 55),
                     (byte)(20 + 49),
                     (byte)(4 + 79),
                     (byte)(13 + 34),
                     (byte)(18 + 49),
                     (byte)(7 + 59),
                     (byte)(10 + 57),
                     (byte)(39 + 8),
                     (byte)(45 + 35),
                     (byte)(54 + 21),
                     (byte)(45 + 22),
                     (byte)(16 + 67),
                     53,
                     (byte)(68 + 12),
                     (byte)(28 + 69),
                     (byte)(90 + 10),
                     (byte)(66 + 34),
                     105,
                     (byte)(76 + 34),
                     (byte)(17 + 86)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_201.F("զճղԵյձլյրկԼպվշպրՂࢼ࣑࣊ࣙࣚ࣠ࢺ࣏ࣤ࣠", (byte)71, 70));
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
}
