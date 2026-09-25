package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class BedrockFloodgateHook {
   private static int ax = 1 >>> 64 | 1 << ~64 + 1;
   private static long au = Long.reverse(5764607523034234880L);
   private static int r = 1 >>> 64 | 1 << -64;
   private static int ab = -1 >>> 24 | -1 << ~24 + 1;
   private static int n = Integer.reverse(0);
   private static int l = (6144 >>> 137 | 6144 << -137) & -1;
   private static int av = Integer.reverse(1342177280);
   private static int az = Integer.reverse(-805306368);
   private static int af = 768 >>> 71 | 768 << ~71 + 1;
   private static int x = (1048576 >>> 242 | 1048576 << -242) & -1;
   private static long t = Long.reverse(2169747286645605378L);
   public static final String cH;
   private static int v = Integer.reverse(1073741824);
   private static long ba = Long.reverse(5628511800466146306L);
   private static int as = Integer.reverse(-1879048192);
   private static int f = (-1 >>> 155 | -1 << -155) & -1;
   private static String[] ZKM_STR_B = new String[l];
   private static int an = Integer.reverse(0);
   private static int ad = Integer.reverse(1073741824);
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   public static final boolean aG;
   private static int am = Integer.reverse(1073741824);
   private static long aq = Long.reverse(5628511800466146306L);
   private static long al = Long.reverse(5764607523034234880L);
   private static int ae = Integer.reverse(0);
   private static long y = Long.reverse(5628511800466146306L);
   private static int ao = Integer.reverse(268435456);
   private static long at = Long.reverse(2169747286645605378L);
   private static long d = Long.reverse(5628511800466146306L);
   private static int j = (0 >>> 243 | 0 << ~243 + 1) & -1;
   private static int i = Integer.reverse(0);
   public static boolean aE;
   private static long ah = Long.reverse(5764607523034234880L);
   private static long p = Long.reverse(2169747286645605378L);
   private static long q = Long.reverse(5764607523034234880L);
   private static int b = (-1 >>> 54 | -1 << -54) & -1;
   private static long u = Long.reverse(5764607523034234880L);
   private static int ap = Integer.reverse(-1);
   private static long g = Long.reverse(5628511800466146306L);
   public static final boolean aF;
   private static long ak = Long.reverse(2169747286645605378L);
   private static int z = 1048576 >>> 116 | 1048576 << -116;
   private static int k = Integer.reverse(805306368);
   private static int ai = Integer.reverse(Integer.MIN_VALUE);
   private static long ac = Long.reverse(5628511800466146306L);
   private static int s = (384 >>> 167 | 384 << ~167 + 1) & -1;
   private static long ag = Long.reverse(2169747286645605378L);
   public static final String cI;
   private static String[] ZKM_STR_A = new String[k];
   private static long c;
   private static long aw = Long.reverse(5628511800466146306L);
   private static int a = (0 >>> 169 | 0 << ~169 + 1) & -1;
   private static int w = 0 >>> 201 | 0 << ~201 + 1;
   private static int m = 8 >>> 130 | 8 << ~130 + 1;
   private static int ar = ('耀' >>> 'o' | 32768 << -111) & -1;
   private static int ay = Integer.reverse(0);
   private static int aa = Integer.reverse(-1610612736);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int o = Integer.reverse(1073741824);
   private static int aj = Integer.reverse(-536870912);

   private static void b() {
      c = 4620841697213823096L;
      long var0 = c ^ 5235580384486421955L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(17 + 51),
               (byte)(39 + 30),
               (byte)(29 + 54),
               (byte)(33 + 14),
               (byte)(21 + 46),
               (byte)(50 + 16),
               (byte)(55 + 12),
               (byte)(14 + 33),
               (byte)(28 + 52),
               (byte)(38 + 37),
               (byte)(18 + 49),
               (byte)(67 + 16),
               53,
               (byte)(20 + 60),
               (byte)(5 + 92),
               (byte)(74 + 26),
               (byte)(81 + 19),
               (byte)(33 + 72),
               (byte)(88 + 22),
               (byte)(6 + 97)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(60 + 9), (byte)(28 + 55)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_076.A("âùùèģĉħĦĎČĂû", (byte)26, 65);
               ZKM_STR_B[1] = NLoginCore_451.D("Ѷнѧејѳээџѓўы", (byte)26, 68);
               ZKM_STR_B[2] = NLoginCore_138.C("ѹеѯѮмѽппѮѸуѠѠёѶѼъ҉ыѦ҄ўѠѓђџѦғѦѷѭѤ҄ѳѺѝѹѝєѶҠѾѾѫ", (byte)26, 67);
               ZKM_STR_B[3] = NLoginCore_471.F("ԸՉԬԫՑՌԨԬԓՄԡԻԖԲԙԔ՚ԛՙԙՄ՟ԛ՞\u0530ՙՂԿՔ\u0558ԨդԬԨԻեՔէՍՃդԮՍԾ", (byte)26, 70);
               ZKM_STR_B[4] = NLoginCore_559.A("çíįĪâĠăăĀĔğċĊāęĐõĆôĉĕľþĳŃüĄįăĄĊĉĠŊėĹĝľńĿŒĽŐě", (byte)26, 65);
               ZKM_STR_B[5] = NLoginCore_521.A("øĚùĢīãéĪįĦċġĬčöĴĚēĖùĠĠĊġúġŇąļęĺĈōĽĘĠĻĪłċĦĦĪě", (byte)26, 65);
               ZKM_STR_B[6] = NLoginCore_433.B("ĕõęćâĐþğĄýČįĕõęĜıēįĴĻûĲĮĄāĻĄĆŉĸłĉċćĤŊņĈĻŏĞĞě", (byte)26, 66);
               ZKM_STR_B[7] = NLoginCore_232.F("ԨԬՐՂՃՊԣԷԪՍՌԪԳԥԺՍՕԮՖԝԶԖ՞Կԟ՟դ՛բԺծԩ", (byte)26, 70);
               ZKM_STR_B[8] = NLoginCore_559.F("ԝՈԥԽԽՄԱԶՁԗԤՖՋԔԩԕ՚ՀՙԸԾԛԡՄԢԟԠԜՠՇդԶ", (byte)26, 70);
               ZKM_STR_B[9] = NLoginCore_232.B("ĬĠĪęþêĢěĐĒĨĸČĲĕĳĎĭĬĉĝįĆć", (byte)26, 66);
               ZKM_STR_B[10] = NLoginCore_521.E("ԟԠՒԤԫՄՋՓԳԓԱՄ՚Զ՚՜ՔՐԝՒՎՓ\u0558ՃԷՓՃՒԶԾզՆԬ\u0530դԤՅԮԬխՏՏՔԴՍ՜ռԾՉճհԼ՞՜ՉՊ", (byte)26, 69);
               ZKM_STR_B[11] = NLoginCore_521.D("ѸѯѵѶљїџѰіѶѓёѨѽ҇фќѻѽ҅ѰҏѨ҉ҊѢҍэ҆ҒѯіҍѹѐїѱҞѠѭќ҂Ѷѫ", (byte)26, 68);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_173.D("дчыёљњюѤѹнњы", (byte)26, 68);
               ZKM_STR_B[1] = NLoginCore_453.D("кіщплєѶѤфђѼѥ҂щфѩѶїҀ҉ѧѩії", (byte)26, 68);
               ZKM_STR_B[2] = NLoginCore_232.D("ѹеѯѮмѽппѮѸуѠѠёѶѼъ҉ыѦ҄ўѠѓђџѦғѦѷѭѤѱ҅ѲѪѶѹћҒѳѽҁѡҕѿѠѹ҉ѿҏҡѭ҉Ѷѷ", (byte)26, 68);
               ZKM_STR_B[3] = NLoginCore_201.F("ԸՉԬԫՑՌԨԬԓՄԡԻԖԲԙԔ՚ԛՙԙՄ՟ԛ՞\u0530ՙՂԿՔ\u0558ԨդԬՋՍՇՔԱզէՖդՅԾ", (byte)26, 70);
               ZKM_STR_B[4] = NLoginCore_173.C("знѿѺвѰѓѓѐѤѯћњёѩѠхіфљѥҎю҃ғьєѿѓєњљҒљґѕҘљѲҁҙѭѾѫ", (byte)26, 67);
               ZKM_STR_B[5] = NLoginCore_521.A("øĚùĢīãéĪįĦċġĬčöĴĚēĖùĠĠĊġúġŇąļęĺĈċľŊŀľĮĮŀŇğńě", (byte)26, 65);
               ZKM_STR_B[6] = NLoginCore_324.E("ԸԘԼԪԅԳԡՂԧԠԯՒԸԘԼԿՔԶՒ\u0557՞ԞՕՑԧԤ՞ԧԩլ՛եԽՅ՟ճ\u0530ընհՓՙՅԾ", (byte)26, 69);
               ZKM_STR_B[7] = NLoginCore_173.A("ąĉĭğĠħĀĔćĪĩćĐĂėĪĲċĳúēāİÿĖĴēĤĿŅĊć", (byte)26, 65);
               ZKM_STR_B[8] = NLoginCore_004.F("ԝՈԥԽԽՄԱԶՁԗԤՖՋԔԩԕ՚ՀՙԸԾԛԡ՜՛ՅԿԸ\u0557ՂժՈ", (byte)26, 70);
               ZKM_STR_B[9] = NLoginCore_027.E("ՏՃՍԼԡԍՅԾԳԵՍԪ՚ՇԪ՟ԝԬՋՙԙՌԹՅԥԿՃեԢ՞իԺ", (byte)26, 69);
               ZKM_STR_B[10] = NLoginCore_471.A("üýįāĈġĨİĐðĎġķēķĹıĭúįīİĵĠĔİĠįēěŃģĉčŁāĢċĉŊĬĬıĩđŉĻėřĻĺŉěĩĦħ", (byte)26, 65);
               ZKM_STR_B[11] = NLoginCore_241.E("ՋՂՈՉԬԪԲՃԩՉԦԤԻՐ՚ԗԯՎՐ\u0558ՃբԻ՜՝ԵՠԠՙեՂԩՉՈՠԼ՝բծԮՓԸճԾ", (byte)26, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_471.C("эћкеылѿеѵзоѝѓњѤѼуѬѢѢјёѿѩҎҊѦ҅Ѩѫ҂ђ", (byte)26, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_027.F("ԺՐԩ\u0530ԩՐԍՑ\u0530ՀՊ՚՛ԓՓՙՊԚՒԠ՛ՂԗԘԻԽՄԼժ՝ՍԬ", (byte)26, 70);
         }
      }
   }

   private static String a(String var0, String... var1) {
      String[] var3 = var1;
      int var4 = var1.length;

      for (int var5 = j; var5 < var4; var5++) {
         String var6 = var3[var5];
         String var2;
         if ((var2 = System.getProperty(var6)) != null) {
            return var2;
         }
      }

      return var0;
   }

   private static String a(int var0, long var1) {
      var1 ^= 10L;
      var1 ^= 5235580384486421955L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(66 + 2),
                     (byte)(17 + 52),
                     (byte)(46 + 37),
                     47,
                     (byte)(55 + 12),
                     (byte)(36 + 30),
                     (byte)(29 + 38),
                     (byte)(40 + 7),
                     (byte)(70 + 10),
                     (byte)(39 + 36),
                     (byte)(61 + 6),
                     (byte)(68 + 15),
                     (byte)(52 + 1),
                     80,
                     (byte)(81 + 16),
                     (byte)(71 + 29),
                     (byte)(24 + 76),
                     (byte)(42 + 63),
                     (byte)(105 + 5),
                     (byte)(71 + 32)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(16 + 52), 69, (byte)(70 + 13)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_092.E("մցրՃփտպփ֎սՊֈ\u058cօֈ֎Ր࣡ࣤࣇ࣭࣬ࣨࢼࣰࣦࣚࣟࣟࣴࣴ", (byte)85, 69));
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

   private static boolean a(String... var0) {
      String var1 = a(null, var0);
      return ((!a(a & b, d) != 0).equals(var1) && !a(e & f, g).equalsIgnoreCase(var1) ? i : h);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  BedrockFloodgateHook.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_575.E("ՌծհՐմ֓\u058b֡֍՜֚\u0590֞֘աֆ֧֥֨֟֟մ", (byte)104, 69), BedrockFloodgateHook.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_004.B("ƲƿƾƁǁƽƸǁǌƻƈǆǊǃǆǌƎԟԢԅԫԪԦӺԘԝԝԲԮԤԲƨ", (byte)104, 66) + var1 + NLoginCore_530.D("ԧ", (byte)104, 68) + var2.toString(), var4
         );
      }
   }

   static {
      b();
      String[] var10000 = new String[m];
      var10000[n] = a(o, p ^ q);
      var10000[r] = a(s, t ^ u);
      aE = a(var10000);
      var10000 = new String[v];
      var10000[w] = a(x, y);
      var10000[z] = a(aa & ab, ac);
      aF = a(var10000);
      var10000 = new String[ad];
      var10000[ae] = a(af, ag ^ ah);
      var10000[ai] = a(aj, ak ^ al);
      aG = a(var10000);
      String[] var10001 = new String[am];
      var10001[an] = a(ao & ap, aq);
      var10001[ar] = a(as, at ^ au);
      cH = a(null, var10001);
      String var2 = a(av, aw);
      var10001 = new String[ax];
      var10001[ay] = a(az, ba);
      cI = a(var2, var10001);
   }
}
