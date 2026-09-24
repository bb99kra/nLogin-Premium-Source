package com.nickuc.login;

import com.nickuc.login.loader.LoaderBootstrap;
import java.io.File;
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
import lombok.Generated;

public class NLoginCore_224 {
   private static int al = (1610612737 >>> 157 | 1610612737 << -157) & -1;
   private static int bj = (Integer.MIN_VALUE >>> 95 | Integer.MIN_VALUE << ~95 + 1) & -1;
   private static long d = Long.reverse(-8561507635601222628L);
   private final File i;
   private static int i = 1024 >>> 169 | 1024 << -169;
   private static int v = (48 >>> 3 | 48 << -3) & -1;
   private static long q = Long.reverse(950094777405264924L);
   private static long az = Long.reverse(950094777405264924L);
   private static int w = Integer.reverse(-1);
   private static int p = Integer.reverse(536870912);
   private static int s = (0 >>> 64 | 0 << -64) & -1;
   private static int ay = Integer.reverse(-268435456);
   private static int bk = Integer.reverse(1207959552);
   private static int m = -1 >>> 250 | -1 << -250;
   private static long bi = Long.reverse(-8935141660703064064L);
   private static String[] b = new String[NLoginCore_224.bl];
   private static long z = Long.reverse(950094777405264924L);
   private static long aj = Long.reverse(950094777405264924L);
   private static long as = Long.reverse(-8561507635601222628L);
   private static int bc = 268435456 >>> 216 | 268435456 << ~216 + 1;
   private static int h = Integer.reverse(0);
   private static int a = Integer.reverse(0);
   private static String[] a = new String[bk];
   private static int au = (7340032 >>> 211 | 7340032 << ~211 + 1) & -1;
   private static int ab = 8 >>> 32 | 8 << ~32 + 1;
   private static int l = Integer.reverse(-1073741824);
   private static int ae = Integer.reverse(Integer.MIN_VALUE);
   private static long k = Long.reverse(-8561507635601222628L);
   private static int aq = Integer.reverse(Integer.MIN_VALUE);
   private static long r = Long.reverse(-8935141660703064064L);
   private static long x = Long.reverse(-8561507635601222628L);
   private NLoginCore_482 a;
   private static int e = 1 >>> 192 | 1 << -192;
   private static int j = (-1 >>> 158 | -1 << ~158 + 1) & -1;
   private static long aw = Long.reverse(-8935141660703064064L);
   private static long ao = Long.reverse(950094777405264924L);
   private static long ba = Long.reverse(-8935141660703064064L);
   private static int bf = (64 >>> 6 | 64 << ~6 + 1) & -1;
   private static int o = Integer.reverse(0);
   private static int b = -1 >>> 254 | -1 << ~254 + 1;
   private static long g = Long.reverse(-8935141660703064064L);
   private static int af = Integer.reverse(-1879048192);
   private static long am = Long.reverse(-8561507635601222628L);
   private static long ak = Long.reverse(-8935141660703064064L);
   private static long av = Long.reverse(950094777405264924L);
   private static int bg = (2176 >>> 167 | 2176 << -167) & -1;
   private static long ag = Long.reverse(950094777405264924L);
   private static int y = 469762048 >>> 26 | 469762048 << ~26 + 1;
   private static int at = (-1 >>> 59 | -1 << -59) & -1;
   private static long aa = Long.reverse(-8935141660703064064L);
   private static int t = (81920 >>> 14 | 81920 << -14) & -1;
   private static long bd = Long.reverse(950094777405264924L);
   private static long f = Long.reverse(950094777405264924L);
   private static long c;
   private static long ac = Long.reverse(950094777405264924L);
   private final NLoginCore_233 a;
   private static long ah = Long.reverse(-8935141660703064064L);
   private static long bh = Long.reverse(950094777405264924L);
   private static long ad = Long.reverse(-8935141660703064064L);
   private static long be = Long.reverse(-8935141660703064064L);
   private static long n = Long.reverse(-8561507635601222628L);
   private static int bb = Integer.reverse(Integer.MIN_VALUE);
   private static int ax = Integer.reverse(0);
   private static long u = Long.reverse(-8561507635601222628L);
   private static long ap = Long.reverse(-8935141660703064064L);
   private static int an = Integer.reverse(805306368);
   private static int ai = 671088640 >>> 186 | 671088640 << ~186 + 1;
   private static int bl = Integer.reverse(1207959552);
   private static int ar = Integer.reverse(-1342177280);

   @Generated
   public NLoginCore_482 a() {
      return this.a;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_224.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_223.D("ҸӚӜҼӠӿӷԍӹӈԆӼԊԄӍӲԔԓԋԑԋӠ", (byte)73, 68), NLoginCore_224.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_027.B("ŴƁƀŃƃſźƃƎŽŊƈƌƅƈƎŐӤӠӨӣӜӨӦӑӢӎŦ", (byte)73, 66) + var1 + NLoginCore_183.E("Կ", (byte)73, 69) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = 4047483108496700592L;
      long var0 = c ^ -5328213943662994246L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(14 + 54),
               (byte)(61 + 8),
               (byte)(74 + 9),
               (byte)(20 + 27),
               (byte)(65 + 2),
               (byte)(45 + 21),
               (byte)(24 + 43),
               (byte)(41 + 6),
               (byte)(70 + 10),
               (byte)(3 + 72),
               (byte)(8 + 59),
               (byte)(40 + 43),
               (byte)(24 + 29),
               80,
               (byte)(59 + 38),
               100,
               (byte)(31 + 69),
               (byte)(61 + 44),
               (byte)(88 + 22),
               (byte)(15 + 88)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(20 + 48), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_076.C("ԸԶԼӿԲӼԥԽӿԇԝԺԢӾԻԝԩԬՒԳԳՀԲՁՏՎՆՅԥ՚ԝԳԨԹԪՑՂՒ՚ՠԦ\u0558\u0558Յ՟ԢՕՄԮեԬխՅՏեՄԶիբՐձդ\u0558վ", (byte)91, 67);
               b[1] = NLoginCore_521.D("ԖՀԱԚԜՂԙՃԇԵԹՄՁԦԬՀԜԚԑԉԓԒԱԠԡՕ՚ԑ\u0530ՕԼՓՓՈՕԻՙԿԟ\u0558՝Կ՝ԩՁԻծՈԥգհԮԾԯՈՕՂՠզՂՒՓհՖ", (byte)91, 68);
               b[2] = NLoginCore_553.E("ա\u058cժճգցբոձզՙ՟", (byte)91, 69);
               b[3] = NLoginCore_384.E("է֑ւիխ֓ժ֔\u0558ֆ֊֕֒շս֑խիբ՚դգւձղ֦֫բց֦֍֤֞ֆլ֣ձֵֈַ֑֔հ֤֯մ֞֓ֈ֛\u0590ֲտֵֶֻ֢֖֗֟\u05cbַֽ\u05cf", (byte)91, 69);
               b[4] = NLoginCore_559.D("ԬԫԶԫԹԃԁԹՅӺԻԎ", (byte)91, 68);
               b[5] = NLoginCore_138.E("ցդջիյ՞եեցգ֕ջմլ՛֕հ֗պքք֓ժի", (byte)91, 69);
               b[6] = NLoginCore_173.F("ՊՋ\u0590զ\u0590Տ։ևձևշ֊է\u058bձծ֖ճռ՜֥սժի", (byte)91, 70);
               b[7] = NLoginCore_559.B("ƟƂƙƉƓżƃƃƟƁƳƙƒƊŹƳƎƵƘƢƢƱƈƉ", (byte)91, 66);
               b[8] = NLoginCore_387.B("ƟƂƙƉƓżƃƃƟƁƳƙƒƊŹƳƎƵƘƢƢƱƈƉ", (byte)91, 66);
               b[9] = NLoginCore_076.B("ŮƭŧŹƌũƮŭŶƔƴƹŬŷƴŻƲưƮſƼƛƈƉ", (byte)91, 66);
               b[10] = NLoginCore_397.E("րՑ՞Վ՟Օ՟ղ\u0558ցև\u0557\u058b֞\u0590ղՙխ֢֘՜֣ժի", (byte)91, 69);
               b[11] = NLoginCore_138.B("ŮƭŧŹƌũƮŭŶƔƴƹŬŷƴŻƲưƮſƼƛƈƉ", (byte)91, 66);
               b[12] = NLoginCore_004.C("ӿԾӸԊԝӺԿӾԇԥՅՊӽԈՅԌՃՁԿԐՍԬԙԚ", (byte)91, 67);
               b[13] = NLoginCore_241.F("ՊՋ\u0590զ\u0590Տ։ևձևշ֊է\u058bձծ֖ճռ՜֥սժի", (byte)91, 70);
               b[14] = NLoginCore_004.E("ք֒՚էց՝իՔգւ\u0590՟", (byte)91, 69);
               b[15] = NLoginCore_433.C("ԱԞԱԓԞԎԽՄԛԟՄԔԗԉԮԘԢԥԝԠ\u0530ԬԙԚ", (byte)91, 67);
               b[16] = NLoginCore_241.E("ՊՋ\u0590զ\u0590Տ։ևձևշ֊է\u058bձծ֖ճռ՜֥սժի", (byte)91, 69);
               b[17] = NLoginCore_076.D("ӹӺԿԕԿӾԸԶԠԶԦԹԖԺԠԝՅԢԫԋՔԬԙԚ", (byte)91, 68);
               break;
            case 1:
               b[0] = NLoginCore_427.A("ƧƥƫŮơūƔƬŮŶƌƩƑŭƪƌƘƛǁƢƢƯơưƾƽƵƴƔǉƌƢƗƨƙǀƱǁǉǏƕǇǇƴǎƑǄƳƝǔƛǜƴǎƼƴƹǕƹƦǣƩǍǥ", (byte)91, 65);
               b[1] = NLoginCore_451.C("ԖՀԱԚԜՂԙՃԇԵԹՄՁԦԬՀԜԚԑԉԓԒԱԠԡՕ՚ԑ\u0530ՕԼՓՓՈՕԻՙԿԟ\u0558՝Կ՝ԩՁԻծՈԥգհԮԾղՃՔՖեԸզՋի\u0557ՓՑԸ\u0557ԹԿՌծԽ\u0557քՙՎ", (byte)91, 67);
               b[2] = NLoginCore_092.A("ƬƊƩƀƜŮƬƥƵƃƊơƇƉƘƜŰƓƜƎƙƋƈƉ", (byte)91, 65);
               b[3] = NLoginCore_451.D("ԖՀԱԚԜՂԙՃԇԵԹՄՁԦԬՀԜԚԑԉԓԒԱԠԡՕ՚ԑ\u0530ՕԼՓՍԵԛՒԠդԷՀՃզԟՓ՞ԣՍՂԷՊԿաԮէՍԲՅդԹՓ՜՝ժզ", (byte)91, 68);
               b[4] = NLoginCore_453.F("ր՚Ւ֏՞դՖ֒֒֒ւհծռֈ։֙ՙ՚֛՟֣ժի", (byte)91, 70);
               b[5] = NLoginCore_530.A("ƟƂƙƉƓżƃƃƟƁƲƳƏƸƻŹƻƋƴƍƵƚƞǀƁƚƽƛƉƋǁƚ", (byte)91, 65);
               b[6] = NLoginCore_453.C("ӹӺԿԕԿӾԸԶԠԶԨԕՀԾՀԛԊԡԽՌԲԑԪԖԡՈԱՎՐՖԘՓ", (byte)91, 67);
               b[7] = NLoginCore_110.C("\u0530ԓԪԚԤԍԔԔ\u0530ԒՃԩԚԗԦԯԹԏԽԒԪԑԣԨԥԪՋՙԓ\u0558ԩԧ", (byte)91, 67);
               b[8] = NLoginCore_027.E("ցդջիյ՞եեցգ֖֗\u058cնմ։\u0590՛֕ւճ֢տև֘֨շն֫է\u058bը", (byte)91, 69);
               b[9] = NLoginCore_521.E("Ր֏Չ՛ծՋ\u0590Տ\u0558ն֕ծժ֏ծՖ֠կ֑\u0590֏խժի", (byte)91, 69);
               b[10] = NLoginCore_397.B("ƞůżŬŽųŽƐŶƟƥƒƐƅŹƞƓŻƶƮƞƋƈƉ", (byte)91, 66);
               b[11] = NLoginCore_223.A("ŮƭŧŹƌũƮŭŶƔƴƊŲƷƶƷƗƔžƶƟƱƈƉ", (byte)91, 65);
               b[12] = NLoginCore_241.E("Ր֏Չ՛ծՋ\u0590Տ\u0558ն֖յֆ\u0558՜֊Ւպ՛ճ֖սժի", (byte)91, 69);
               b[13] = NLoginCore_384.E("ՊՋ\u0590զ\u0590Տ։ևձևոն֊Փ\u058bՕՖ֗֝չ֣֏՟վ։֛֩մդ֫չ֜", (byte)91, 69);
               b[14] = NLoginCore_397.B("ƟƆƚƩƫƦŭƎſƲƅƈűƦƔƨŽƯŽƶǀǁƈƉ", (byte)91, 66);
               b[15] = NLoginCore_201.D("ԱԞԱԓԞԎԽՄԛԟՃԕԼԆԌԆԯԐԝԩԯՒԙԚ", (byte)91, 68);
               b[16] = NLoginCore_027.D("ӹӺԿԕԿӾԸԶԠԶԧԺԝՋԗՊԦՁԛՈԱԱՋՖՍՍՓԴԬԯԗԷ", (byte)91, 68);
               b[17] = NLoginCore_575.E("ՊՋ\u0590զ\u0590Տ։ևձևչէևը֛ճ֚֍֣֛֒ս֙֟ոևաո֧֝ֈց", (byte)91, 69);
               break;
            case 2:
               b[0] = NLoginCore_384.C("ՀԈԬԎԿԓԑԻՁ\u0530ԥӼԠԾՈԀԋԠԱՄԩՄԐՒԓՍԱՍՒ՚ԴԜ", (byte)91, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_076.C("ԏԌԸԚӼՂԜԀԴԳԩԗԡԶԹԻՎՋԈԞՂԡԵՊԔԡԺԙԱՎԻԲ", (byte)91, 67);
         }
      }
   }

   static {
      b();
   }

   @Generated
   public File f() {
      return this.i;
   }

   public NLoginCore_224(NLoginInterface_011<?> var1) {
      try {
         this.i = NLoginCore_366.a(LoaderBootstrap.class);
      } catch (Exception var10) {
         throw new RuntimeException(a(a & b, d), var10);
      }

      this.a = new NLoginCore_233(var1);
      File var2 = var1.e();
      if (!var2.exists() && !var2.mkdirs()) {
         NLoginCore_370.d(a(e, f ^ g));
      } else {
         File var3 = new File(var2, a(i & j, k));
         if (!var3.exists() && !var3.mkdirs()) {
            NLoginCore_370.d(a(l & m, n));
         } else {
            String var4 = var1.q();
            File var5 = new File(var3, var4.toLowerCase(Locale.ENGLISH) + a(p, q ^ r));
            this.a = new NLoginCore_482(var4, var5);
            int var6 = s;
            if (this.a.c(a(t, u))) {
               this.a.a(a(v & w, x), this.a.a(a(y, z ^ aa)));
               this.a.a(a(ab, ac ^ ad));
               var6 = ae;
            }

            if (this.a.c(a(af, ag ^ ah))) {
               this.a.a(a(ai, aj ^ ak), this.a.a(a(al, am)));
               this.a.a(a(an, ao ^ ap));
               var6 = aq;
            }

            String var7 = this.a.k(a(ar, as));
            if (var7 != null) {
               int var9 = at;
               switch (var7.hashCode()) {
                  case -892499141:
                     if (var7.equals(a(au, av ^ aw))) {
                        var9 = ax;
                     }
                     break;
                  case -224813765:
                     if (var7.equals(a(ay, az ^ ba))) {
                        var9 = bb;
                     }
               }

               switch (var9) {
                  case 0:
                     this.a.a(a(bc, bd ^ be), (byte)NLoginCore_204.b.ordinal());
                     var6 = bf;
                     break;
                  case 1:
                     this.a.a(a(bg, bh ^ bi), (byte)NLoginCore_204.c.ordinal());
                     var6 = bj;
               }
            }

            if (var6 != 0) {
               this.a.ag();
            }
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 33L;
      var1 ^= -5328213943662994246L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(34 + 34),
                     (byte)(33 + 36),
                     (byte)(25 + 58),
                     (byte)(12 + 35),
                     (byte)(32 + 35),
                     (byte)(27 + 39),
                     (byte)(56 + 11),
                     (byte)(14 + 33),
                     (byte)(57 + 23),
                     (byte)(70 + 5),
                     (byte)(60 + 7),
                     (byte)(28 + 55),
                     53,
                     (byte)(2 + 78),
                     (byte)(15 + 82),
                     (byte)(95 + 5),
                     (byte)(92 + 8),
                     (byte)(36 + 69),
                     (byte)(100 + 10),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(42 + 26), 69, (byte)(37 + 46)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_241.F("զճղԵյձլյրկԼպվշպրՂ࣒ࣖࣚࣕ࣎ࣚࣘࣃࣔࣀ", (byte)71, 70));
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
   public NLoginCore_233 a() {
      return this.a;
   }
}
