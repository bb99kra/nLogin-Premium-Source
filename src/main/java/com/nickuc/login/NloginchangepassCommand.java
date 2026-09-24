package com.nickuc.login;

import com.nickuc.login.api.enums.event.ChangePasswordSource;
import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.api.enums.event.UpdatePasswordSource;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NloginchangepassCommand extends NLoginCore_353 {
   private static int am = Integer.reverse(-536870912);
   private static int x = Integer.reverse(1073741824);
   private static int ag = Integer.reverse(0);
   private static long az = Long.reverse(-4676797289688138773L);
   private static int ad = Integer.reverse(Integer.MIN_VALUE);
   private static long bk = Long.reverse(-4676797289688138773L);
   private static long d = Long.reverse(-4676797289688138773L);
   private static int r = (402653184 >>> 251 | 402653184 << -251) & -1;
   private static int ao = Integer.reverse(0);
   private static int as = Integer.reverse(1073741824);
   private static int br = 13631488 >>> 244 | 13631488 << ~244 + 1;
   private static int j = 0 >>> 76 | 0 << -76;
   private static int l = 0 >>> 32 | 0 << ~32 + 1;
   private static int w = Integer.reverse(0);
   private static int bo = Integer.reverse(-1);
   private static long c;
   private static int i = 64 >>> 38 | 64 << ~38 + 1;
   private static int bb = (-2147483644 >>> 63 | -2147483644 << ~63 + 1) & -1;
   private static int z = (0 >>> 99 | 0 << ~99 + 1) & -1;
   private static int bf = 2621440 >>> 82 | 2621440 << ~82 + 1;
   private static int ab = 4194304 >>> 212 | 4194304 << -212;
   private static long bc = Long.reverse(-4676797289688138773L);
   private static int av = Integer.reverse(0);
   private static int au = Integer.reverse(536870912);
   private static long bl = Long.reverse(8358680908399640576L);
   private static int o = 6291456 >>> 213 | 6291456 << ~213 + 1;
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static int bs = (27262976 >>> 85 | 27262976 << -85) & -1;
   private static int m = (128 >>> 166 | 128 << ~166 + 1) & -1;
   private static long s = Long.reverse(-3812106161233003541L);
   private static long e = Long.reverse(8358680908399640576L);
   private static int ap = Integer.reverse(-1610612736);
   private static long u = Long.reverse(-3812106161233003541L);
   private static int p = Integer.reverse(Integer.MIN_VALUE);
   private static int y = Integer.reverse(0);
   private static String[] b = new String[bs];
   private static long al = Long.reverse(-3812106161233003541L);
   private static String[] a = new String[br];
   private static long bp = Long.reverse(-3812106161233003541L);
   private static long bg = Long.reverse(-4676797289688138773L);
   private static int bq = (0 >>> 42 | 0 << -42) & -1;
   private static long n = Long.reverse(-3812106161233003541L);
   private static long ai = Long.reverse(-3812106161233003541L);
   private static int aj = Integer.reverse(1610612736);
   private static long an = Long.reverse(-3812106161233003541L);
   private static int ae = Integer.reverse(1073741824);
   private static int c = 0 >>> 220 | 0 << ~220 + 1;
   private static int ar = 268435456 >>> 92 | 268435456 << ~92 + 1;
   private static int bj = (-1073741822 >>> 254 | -1073741822 << ~254 + 1) & -1;
   private static int aq = 0 >>> 48 | 0 << -48;
   private static long g = Long.reverse(-4676797289688138773L);
   private static int bn = 50331648 >>> 22 | 50331648 << -22;
   private static int af = Integer.reverse(-1073741824);
   private static int ah = Integer.reverse(-1610612736);
   private static int aa = 0 >>> 32 | 0 << -32;
   private static long bd = Long.reverse(8358680908399640576L);
   private static float ax = Float.intBitsToFloat((2056 >>> 109 | 2056 << -109) & -1);
   private static long ba = Long.reverse(8358680908399640576L);
   private static int ak = -1 >>> 70 | -1 << ~70 + 1;
   private static int ac = Integer.reverse(0);
   private static int q = 0 >>> 37 | 0 << ~37 + 1;
   private static float aw = Float.intBitsToFloat(Integer.reverse(3714));
   private static int bi = (0 >>> 191 | 0 << -191) & -1;
   private static long bh = Long.reverse(8358680908399640576L);
   private static int k = Integer.reverse(Integer.MIN_VALUE);
   private static int t = (Integer.MIN_VALUE >>> 29 | Integer.MIN_VALUE << -29) & -1;
   private static int bm = Integer.reverse(1073741824);
   private static int be = 0 >>> 114 | 0 << ~114 + 1;
   private static int v = 2 >>> 225 | 2 << -225;
   private static long h = Long.reverse(8358680908399640576L);
   private static int ay = Integer.reverse(268435456);
   private static int at = (48 >>> 4 | 48 << ~4 + 1) & -1;

   private static void b() {
      c = -2891586168758658819L;
      long var0 = c ^ 3028743847814049683L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(33 + 35),
               (byte)(35 + 34),
               (byte)(6 + 77),
               (byte)(37 + 10),
               (byte)(23 + 44),
               (byte)(51 + 15),
               (byte)(4 + 63),
               (byte)(39 + 8),
               (byte)(43 + 37),
               (byte)(67 + 8),
               67,
               (byte)(5 + 78),
               53,
               (byte)(76 + 4),
               (byte)(83 + 14),
               (byte)(49 + 51),
               (byte)(55 + 45),
               (byte)(38 + 67),
               (byte)(43 + 67),
               (byte)(95 + 8)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(18 + 65)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_092.B("ďûāßßģĘÙĦĈõêÿüĉėĚĲĉĩĬģúû", (byte)20, 66);
               b[1] = NLoginCore_433.C("сНїѕслЮШыѠѬфьхѷъуѣѐѶнѬьѿѳѿјћпйѝ҄҇є҅ўрџ҆ъѦѿҌѳѿ҂ѶѦѱѤѯҒҐѷѤѥ", (byte)20, 67);
               b[2] = NLoginCore_141.D("љхыЩЩѭѢУѰђнѡѤѠѓѭєѩѓзѪѭфх", (byte)20, 68);
               b[3] = NLoginCore_575.C("їѧУьѨѡлйбѧфчэѳтсжіилщчфх", (byte)20, 67);
               b[4] = NLoginCore_453.B("ğĊâĂăĢāĒĞęôěĪýčĜèûĐďóĮôĉįĂČôđĆđĵúĔļčĄĜěĴėĄĚď", (byte)20, 66);
               b[5] = NLoginCore_241.D("ѪћѢеЭшяѱѱўьй", (byte)20, 68);
               b[6] = NLoginCore_451.C("ЦѝњѫюѐЬѦьѐѫЮрэщѧѺхѬѦѱѳѬѶѶђќ҅янѾљсѷџ҄щҀѤэҐ҉ѨҐѫҏєѣҌ҅ҔѺҙѷѤѥ", (byte)20, 67);
               b[7] = NLoginCore_471.C("ѪлныњмьЩѦќѐй", (byte)20, 67);
               b[8] = NLoginCore_201.B("ėøĀėÿäÞāāĄĢøěĎøăīĝüĬćóĤĤđĘĄúĽýęėþĩĜāŅăİĵąđĻĂĆěĭěĜĦłĬŁĳŗŕŋċŚĦěįĕĹ", (byte)20, 66);
               b[9] = NLoginCore_076.F("ԝԗԙԗԶՈԿԽԨՊԱԼԓԍԶԖԮՙԤՉԖՌԣԤ", (byte)20, 70);
               b[10] = NLoginCore_127.D("пѓјѝЬцѡЫФюѪй", (byte)20, 68);
               b[11] = NLoginCore_471.E("ԗԉԡԆՃԌԸՁԋՋԋԐՇԱԣԤԤԹՉՐ\u0530ԚՉԴՏԽԯբԢԼ՚ԧԥ՞ԦՄԦՋԷըեՐձԸ", (byte)20, 69);
               b[12] = NLoginCore_433.E("ԛԈԡԷՉԥԟԎԢՈԯԘ", (byte)20, 69);
               break;
            case 1:
               b[0] = NLoginCore_027.F("ԸԤԪԈԈՌՁԂՏԱԞՕՑՋԫԪՇԓԣԻԹԦԣԤ", (byte)20, 70);
               b[1] = NLoginCore_138.E("ԠӼԶԴԠԚԍԇԪԿՋԣԫԤՖԩԢՂԯՕԜՋԫ՞Ւ՞ԷԺԞԘԼգզԳդԽԟԾեԩՅ՞լը՞ՖՌՁՙՊԳԷճՆՃՄ", (byte)20, 69);
               b[2] = NLoginCore_324.F("ԸԤԪԈԈՌՁԂՏԱԜԯԏՆԉՍՂՆԻԭԥՒԾՍԼԴԭԛՄԯԧՆ", (byte)20, 70);
               b[3] = NLoginCore_451.C("їѧУьѨѡлйбѧхчфыіёзѵйнжчфх", (byte)20, 67);
               b[4] = NLoginCore_091.D("ѩєЬьэѬыќѨѣоѥѴчїѦвхњљнѸоѓѹьіоћѐћѿушѽѮҁщҌѣђѾѰљ", (byte)20, 68);
               b[5] = NLoginCore_110.C("ѕТмљХјѯыыувѭѕѧѷѴјѷщѥљїфх", (byte)20, 67);
               b[6] = NLoginCore_223.E("ԅԼԹՊԭԯԋՅԫԯՊԍԟԬԨՆՙԤՋՅՐՒՋՕՕԱԻդԮԜ՝ԸԠՖԾգԨ՟ՃԬկըՉՁխՇՄգժժՙՉԷՆՃՄ", (byte)20, 69);
               b[7] = NLoginCore_433.E("ԵՂԾՁԠԊԏԪԲԡԽԘ", (byte)20, 69);
               b[8] = NLoginCore_387.F("ՀԡԩՀԨԍԇԪԪԭՋԡՄԷԡԬՔՆԥՕ\u0530ԜՍՍԺՁԭԣզԦՂՀԧՒՅԪծԬՙ՞ԮԺդԫԯՄՖՄՅՏիՕժիՕի՚կշփհ\u0558էֈ", (byte)20, 70);
               b[9] = NLoginCore_092.A("ôîðîčğĖĔÿġĉ÷ĥğĈĀïİğĔĭîĴĕĉĒĒĵĤĵįİ", (byte)20, 65);
               b[10] = NLoginCore_232.F("ԩԨԿԄԾԤԆԢՅԦԊԘ", (byte)20, 70);
               b[11] = NLoginCore_173.B("îàøÝĚãďĘâĢâçĞĈúûûĐĠħćñĠċĦĔĆĹùēıþĴĴīĴĲÿĦĆĴĤĄĄąĪġŅňĢčČğĭĚě", (byte)20, 66);
               b[12] = NLoginCore_127.B("ñ×þĂğðģēġėěæäĘĪĝıįüĂĝģúû", (byte)20, 66);
               break;
            case 2:
               b[0] = NLoginCore_004.F("ԖԚՈԷԩԈԮԍՍՋԒԘ", (byte)20, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_427.C("ћџхнзйѨѲхѴѰввѰхдѰѬьэѦѽфх", (byte)20, 67);
         }
      }
   }

   @Override
   public void b(NLoginInterface_042 var1, String[] var2) {
      if (var2.length != o) {
         NLoginCore_487 var16 = NLoginCore_487.x;
         Object[] var18 = new Object[p];
         var18[q] = a(r, s) + this.e().toLowerCase(Locale.ENGLISH) + a(t, u);
         NLoginCore_150.a(var1, var16, var18);
      } else {
         NLoginCore_270 var3 = new NLoginCore_270();
         NLoginCore_291 var4 = this.a.a();
         ForceRegisterConfig var5 = var4.a(var1, super.l, var2, var2[v]);
         if (var5 != null) {
            if (!var5.s()) {
               NLoginCore_150.a(var1, NLoginCore_487.t);
            } else {
               String var6 = var2[x];
               int var7 = var6.length();
               if (var7 <= NLoginCore_477.T.r()) {
                  NLoginCore_150.a(var1, NLoginCore_487.L);
               } else if (var7 >= NLoginCore_477.U.r()) {
                  NLoginCore_150.a(var1, NLoginCore_487.K);
               } else if (var4.a(var5, var6)) {
                  NLoginCore_150.a(var1, NLoginCore_487.J);
               } else {
                  String var8 = var5.i();
                  NLoginCore_277 var9 = this.a.b().a(var8);
                  UUID var10 = var9 != null ? var9.a() : var5.a();
                  NLoginType_008 var10000 = this.a;
                  EventEnum var10001 = EventEnum.CHANGE_PASSWORD;
                  Object[] var10002 = new Object[ab];
                  var10002[ac] = var9;
                  var10002[ad] = var10;
                  var10002[ae] = var8;
                  var10002[af] = ChangePasswordSource.BY_ADMIN;
                  if (var10000.a(var10001, var10002)) {
                     synchronized (var5.c) {
                        if (!var4.c(var5, var6)) {
                           NLoginCore_150.a(var1, NLoginCore_487.w);
                           NLoginCore_150.a(var9, NLoginCore_194.F);
                           return;
                        }

                        NLoginCore_370.b(a(ah, ai) + var8 + a(aj & ak, al) + var1.getName() + a(am, an));
                        var10000 = this.a;
                        var10001 = EventEnum.PASSWORD_UPDATE_EVENT;
                        var10002 = new Object[ap];
                        var10002[aq] = var9;
                        var10002[ar] = var10;
                        var10002[as] = var8;
                        var10002[at] = var6;
                        var10002[au] = UpdatePasswordSource.BY_ADMIN;
                        var10000.a(var10001, var10002);
                        if (var9 != null) {
                           NLoginCore_150.a(var9, NLoginCore_487.o);
                        }

                        NLoginCore_150.a(var1, NLoginCore_194.C, aw, ax);
                        NLoginCore_150.a(var1, a(ay, az ^ ba) + var8 + a(bb, bc ^ bd));
                        NLoginCore_150.a(var1, a(bf, bg ^ bh));
                        NLoginCore_150.a(var1, a(bj, bk ^ bl) + var3.a(TimeUnit.MILLISECONDS, bm) + a(bn & bo, bp));
                     }
                  }
               }
            }
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 46L;
      var1 ^= 3028743847814049683L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(3 + 65),
                     (byte)(14 + 55),
                     (byte)(51 + 32),
                     (byte)(38 + 9),
                     (byte)(22 + 45),
                     (byte)(9 + 57),
                     (byte)(40 + 27),
                     (byte)(25 + 22),
                     80,
                     (byte)(45 + 30),
                     (byte)(50 + 17),
                     (byte)(35 + 48),
                     (byte)(15 + 38),
                     (byte)(62 + 18),
                     (byte)(17 + 80),
                     (byte)(91 + 9),
                     100,
                     (byte)(79 + 26),
                     (byte)(38 + 72),
                     (byte)(16 + 87)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(45 + 23), (byte)(4 + 65), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_397.D("пьыЎюъхюљшЕѓїѐѓљЛޟިެޮ\u07b3ޭ\u07baުޛޭޭދތް", (byte)13, 68));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NloginchangepassCommand.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_446.E("ԇԩԫԋԯՎՆ՜ՈԗՕՋՙՓԜՁգբ՚ՠ՚ԯ", (byte)35, 69), NloginchangepassCommand.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_183.D("ҁҎҍѐҐҌ҇ҐқҊїҕҙҒҕқѝߡߪ߮߰ߵ߯\u07fc߬ߝ߯߯ߍߎ߲ѷ", (byte)35, 68) + var1 + NLoginCore_201.C("ј", (byte)35, 67) + var2.toString(), var4
         );
      }
   }

   public NloginchangepassCommand(NLoginType_008 var1) {
      String var10002 = a(c, d ^ e);
      String var10003 = a(f, g ^ h);
      int var10004 = i;
      int var10005 = j;
      String[] var10006 = new String[k];
      var10006[l] = a(m, n);
      super(var1, var10002, var10003, (boolean)var10004, (boolean)var10005, var10006);
   }

   static {
      b();
   }
}
