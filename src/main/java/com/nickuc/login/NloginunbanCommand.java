package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NloginunbanCommand extends NLoginCore_353 {
   private static long z = Long.reverse(432345564227567616L);
   private static long bc = Long.reverse(432345564227567616L);
   private static long aq = Long.reverse(432345564227567616L);
   private static int ad = (0 >>> 160 | 0 << ~160 + 1) & -1;
   private static int k = 0 >>> 81 | 0 << -81;
   private static long ai = Long.reverse(-4948977440701066588L);
   private static int ax = (6656 >>> 137 | 6656 << ~137 + 1) & -1;
   private static long ag = Long.reverse(-4804862252625210716L);
   private static int o = Integer.reverse(1073741824);
   private static int n = Integer.reverse(0);
   private static long an = Long.reverse(-4804862252625210716L);
   private static int c = Integer.reverse(0);
   private static long at = Long.reverse(432345564227567616L);
   private static int d = Integer.reverse(-1);
   private static long h = Long.reverse(-4804862252625210716L);
   private static int l = Integer.reverse(1073741824);
   private static int m = (128 >>> 135 | 128 << ~135 + 1) & -1;
   private static long aj = Long.reverse(432345564227567616L);
   private static int x = Integer.reverse(-1610612736);
   private static int bd = 0 >>> 68 | 0 << -68;
   private static int ar = 720896 >>> 208 | 720896 << -208;
   private static long c;
   private static int af = (-1 >>> 218 | -1 << -218) & -1;
   private static long bb = Long.reverse(-4948977440701066588L);
   private static int bf = (122880 >>> 13 | 122880 << ~13 + 1) & -1;
   private static int r = Integer.reverse(-1073741824);
   private static long ap = Long.reverse(-4948977440701066588L);
   private static int u = 0 >>> 164 | 0 << ~164 + 1;
   private static String[] ZKM_STR_A = new String[NloginunbanCommand.be];
   private static long az = Long.reverse(432345564227567616L);
   private static int g = (-1 >>> 179 | -1 << ~179 + 1) & -1;
   private static long q = Long.reverse(432345564227567616L);
   private static long s = Long.reverse(-4804862252625210716L);
   private static long w = Long.reverse(-4804862252625210716L);
   private static long aw = Long.reverse(432345564227567616L);
   private static int t = 1073741824 >>> 62 | 1073741824 << -62;
   private static long ac = Long.reverse(432345564227567616L);
   private static int ah = Integer.reverse(268435456);
   private static int am = 2359296 >>> 50 | 2359296 << -50;
   private static long ay = Long.reverse(-4948977440701066588L);
   private static int v = (65536 >>> 238 | 65536 << -238) & -1;
   private static int au = Integer.reverse(805306368);
   private static long av = Long.reverse(-4948977440701066588L);
   private static int j = 0 >>> 238 | 0 << ~238 + 1;
   private static long e = Long.reverse(-4804862252625210716L);
   private static long y = Long.reverse(-4948977440701066588L);
   private static int aa = Integer.reverse(1610612736);
   private static float al = Float.intBitsToFloat(8224 >>> 47 | 8224 << ~47 + 1);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static long ab = Long.reverse(-4948977440701066588L);
   private static int ao = 41943040 >>> 86 | 41943040 << -86;
   private static int ba = Integer.reverse(1879048192);
   private static String[] ZKM_STR_B = new String[bf];
   private static long as = Long.reverse(-4948977440701066588L);
   private static float ak = Float.intBitsToFloat(Integer.reverse(3714));
   private static int i = (0 >>> 171 | 0 << -171) & -1;
   private static int be = Integer.reverse(-268435456);
   private static long p = Long.reverse(-4948977440701066588L);
   private static int ae = Integer.reverse(-536870912);

   private void a(NLoginInterface_042 var1, ForceRegisterConfig var2) {
      String var3 = var2.k();
      NLoginCore_407 var4 = var2.a();
      if (var4.b(a(v, w) + var3) == null) {
         NLoginCore_150.a(var1, this.j() ? a(x, y ^ z) : a(aa, ab ^ ac));
         NLoginCore_150.a(var1, NLoginCore_194.F);
      } else {
         var4.e(a(ae & af, ag) + var3);
         var4.e(a(ah, ai ^ aj) + var3);
         NLoginCore_150.a(var1, NLoginCore_194.C, ak, al);
         NLoginCore_150.a(
            var1,
            this.j()
               ? a(am, an) + var3 + a(ao, ap ^ aq) + var2.i() + a(ar, as ^ at)
               : a(au, av ^ aw) + var3 + a(ax, ay ^ az) + var2.i() + a(ba, bb ^ bc)
         );
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NloginunbanCommand.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_521.C("ӱԓԕӵԙԸ\u0530ՆԲԁԿԵՃԽԆԫՍՌՄՊՄԙ", (byte)92, 67), NloginunbanCommand.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_127.C("ԬԹԸӻԻԷԲԻՆԵԂՀՄԽՀՆԈ࢟\u0890࢜ࡰ\u0892\u0891ࡻࡵ\u0897ࢪࢠԟ", (byte)92, 67) + var1 + NLoginCore_223.E("Ւ", (byte)92, 69) + var2.toString(), var4
         );
      }
   }

   @Override
   public void b(NLoginInterface_042 var1, String[] var2) {
      if (var2.length != l) {
         NLoginCore_487 var10001 = NLoginCore_487.x;
         Object[] var10002 = new Object[m];
         var10002[n] = a(o, p ^ q) + this.e().toLowerCase(Locale.ENGLISH) + a(r, s);
         NLoginCore_150.a(var1, var10001, var10002);
      } else {
         String var3 = var2[t];
         NLoginCore_291 var4 = this.a.a();
         ForceRegisterConfig var5 = var4.a(var1, super.l, var2, var3);
         if (var5 != null) {
            synchronized (var5.c) {
               if (!var5.h()) {
                  NLoginCore_150.a(var1, NLoginCore_487.t);
                  NLoginCore_150.a(var1, NLoginCore_194.F);
                  return;
               }
            }

            this.a(var1, var5);
         }
      }
   }

   static {
      b();
   }

   public NloginunbanCommand(NLoginType_008 var1) {
      super(var1, a(c & d, e), a(f & g, h), (i != 0), (j != 0));
   }

   private static String a(int var0, long var1) {
      var1 ^= 96L;
      var1 ^= 3044661798731460488L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(64 + 4),
                     (byte)(3 + 66),
                     (byte)(11 + 72),
                     (byte)(3 + 44),
                     (byte)(47 + 20),
                     (byte)(62 + 4),
                     (byte)(9 + 58),
                     (byte)(16 + 31),
                     (byte)(20 + 60),
                     (byte)(39 + 36),
                     (byte)(39 + 28),
                     (byte)(61 + 22),
                     (byte)(24 + 29),
                     (byte)(25 + 55),
                     (byte)(30 + 67),
                     (byte)(26 + 74),
                     (byte)(29 + 71),
                     105,
                     (byte)(67 + 43),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(44 + 39)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_575.E("՟լիԮծժեծչըԵճշհճչԻ࣒ࣃ࣏ࢣࣅࣄࢮࢨ࣓࣊ࣝ", (byte)64, 69));
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
      c = 2687217072971025117L;
      long var0 = c ^ 3044661798731460488L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(26 + 43),
               (byte)(25 + 58),
               (byte)(12 + 35),
               (byte)(51 + 16),
               (byte)(22 + 44),
               (byte)(24 + 43),
               (byte)(20 + 27),
               (byte)(28 + 52),
               (byte)(21 + 54),
               (byte)(18 + 49),
               (byte)(58 + 25),
               (byte)(43 + 10),
               80,
               (byte)(10 + 87),
               (byte)(65 + 35),
               (byte)(23 + 77),
               (byte)(82 + 23),
               (byte)(81 + 29),
               (byte)(41 + 62)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(76 + 7)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_004.B("őŞšĴśťĴŀŚŗŦĵ", (byte)55, 66);
               ZKM_STR_B[1] = NLoginCore_183.E("ՆՠԩԼՅկՁՇՅդԵԵկՄյԭսչ՝ՉՑջտՀ՟ՀէփՃռ՛Մն\u0558֏ջդիե՝֓իՍ՛", (byte)55, 69);
               ZKM_STR_B[2] = NLoginCore_446.D("ҢґҟҖӇәӖҨґҘӒҵӚҳӋӚәӖҾҠәӀҭҮ", (byte)55, 68);
               ZKM_STR_B[3] = NLoginCore_397.B("ŏĴŒœŋŅĿŋŤĮűōĲűĬŖĲōıŅŲŃŀŁ", (byte)55, 66);
               ZKM_STR_B[4] = NLoginCore_387.A("ĘĴĠňĴĿŬĽĻŐŚĵ", (byte)55, 65);
               ZKM_STR_B[5] = NLoginCore_433.D("ҾҒӒҾҭҠҪҮӅҶӑҘәӋӎҠӘӄҺӛүӉҾҨҺҩӁӅҦӱөӟӯҳӖӋӳӴҷӅӒӹӕҶӍӏӹӳӶӛһӏӀӶӍӎ", (byte)55, 68);
               ZKM_STR_B[6] = NLoginCore_446.B("ĢŢĦŝŨħũņĺŚĻĭşţŐŕľŦņŴōţĻňĹœĶƀŝŵŃŶřƃƉŦżŖšƃŘŁźŕ", (byte)55, 66);
               ZKM_STR_B[7] = NLoginCore_076.B("ĘĴĠňĴĿŬĽĻŐŚĵ", (byte)55, 66);
               ZKM_STR_B[8] = NLoginCore_127.E("ԵՕԸԥՑՒհՂծԱ\u0530ՏղԶՆՄՈջԵռՠկՆՇ", (byte)55, 69);
               ZKM_STR_B[9] = NLoginCore_138.C("ӁӅҧӎҰҴҹҰӇүӗҫӏӌҿӗӡӓҠӣӑҨҤҼӁӟӞӛҼҽӰһ", (byte)55, 67);
               ZKM_STR_B[10] = NLoginCore_451.C("ӓӁү҈ҷӁҷҚҺӒӗҢ", (byte)55, 67);
               ZKM_STR_B[11] = NLoginCore_471.C("ӑӌҠҡғӍӘҔӄқһӞӉүӖӜӒӎҝҵңҤқҡҵҦҩӌӠөәӓ", (byte)55, 67);
               ZKM_STR_B[12] = NLoginCore_091.E("ԿԭԷըՋՁը\u0530ԴԬճբՇԵՊնչՅ՚ՕՔՠացսոս՝Ձ՝Ճգ", (byte)55, 69);
               ZKM_STR_B[13] = NLoginCore_387.E("լ՚ՈԡՐ՚ՐԳՓիհԻ", (byte)55, 69);
               ZKM_STR_B[14] = NLoginCore_004.C("ҩҪҐҞӇӑҲҖӛӍҽӑҾҰҵҲӝӤҤӥҢӁұҳҶҫҸӪҫҸҹӓ", (byte)55, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_241.D("ҟҜҿҳҲҔӐӗҶҹӛҢ", (byte)55, 68);
               ZKM_STR_B[1] = NLoginCore_453.F("ՆՠԩԼՅկՁՇՅդԵԵկՄյԭսչ՝ՉՑջտՀ՟ՀէփՃռ՛Մոբքէէծւեյ֑ծ՛", (byte)55, 70);
               ZKM_STR_B[2] = NLoginCore_530.A("ĵĤĲĩŚŬũĻĤīţŞĿŌĳšŶĿŴĵŤũŀŁ", (byte)55, 65);
               ZKM_STR_B[3] = NLoginCore_553.A("ŏĴŒœŋŅĿŋŤĮŮŲşňıŏņŴūŲŷŃŀŁ", (byte)55, 65);
               ZKM_STR_B[4] = NLoginCore_092.A("ŝŏőŃŨĩŃśŮŗŤŤĮŪŬŶšųřıŐŃŀŁ", (byte)55, 65);
               ZKM_STR_B[5] = NLoginCore_091.F("\u0557ԫի\u0557ՆԹՃՇ՞ՏժԱղդէԹձ՝ՓմՈբ\u0557ՁՓՂ՚՞Կ֊ւոֈՌկդ\u058c֍Ր՞ի֒ծեՕծֈթ՜մ\u0557՜՞թզէ", (byte)55, 70);
               ZKM_STR_B[6] = NLoginCore_201.B("ĢŢĦŝŨħũņĺŚĻĭşţŐŕľŦņŴōţĻňĹœĶƀŝŵŃŶļŇŧſļźŗţƎŏŠŕ", (byte)55, 66);
               ZKM_STR_B[7] = NLoginCore_397.B("ŖĝũŗŊťĥŖŭŨūŁŏşşňůŌŎŌųũŀŁ", (byte)55, 66);
               ZKM_STR_B[8] = NLoginCore_092.F("ԵՕԸԥՑՒհՂծԱԭԭեժՌԶոՓէՍըկՆՇ", (byte)55, 70);
               ZKM_STR_B[9] = NLoginCore_092.B("ŔŘĺšŃŇŌŃŚłŪľŢşŒŪŴŦĳŶŤķĶŌŚŷŻůĻƀŽůŲťŰŶŕłƁƄŻţžŕ", (byte)55, 66);
               ZKM_STR_B[10] = NLoginCore_521.C("ҜҎҭғҍӖҶҖӜҸұҢ", (byte)55, 67);
               ZKM_STR_B[11] = NLoginCore_076.C("ӑӌҠҡғӍӘҔӄқһӞӉүӖӜӒӎҝҵңҟӉҺӠӚңӨӮҭҼӋ", (byte)55, 67);
               ZKM_STR_B[12] = NLoginCore_141.B("ĹħıŢŅĻŢĪĮĦŭŜŁįńŰųĿŔŏŎťĺįŸůŲşŵőŸŵ", (byte)55, 66);
               ZKM_STR_B[13] = NLoginCore_241.F("բՖՂ\u0558կԪլՄձԾծՐՏյնպ՜ԺՎկԺկՆՇ", (byte)55, 70);
               ZKM_STR_B[14] = NLoginCore_127.F("ՂՃԩԷՠժՋԯմզՖժ\u0557ՉՎՋնսԽվԻՙՍծկօքևպՀԼ։ՊՖՉգջՍ֓ֆՑֆֈ՛", (byte)55, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_004.E("ՋՉՁԧձխՌբմԧՆՕՁխԱՐղՕ՞տըլժ՛՞ՔՒր\u0557՞շլ", (byte)55, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_138.E("ՙԺբ՛ԪՅՉ\u0530խՌճմէՇՉՈՔՑՕՔտղջԺբջՀՔճսՃը", (byte)55, 69);
         }
      }
   }
}
