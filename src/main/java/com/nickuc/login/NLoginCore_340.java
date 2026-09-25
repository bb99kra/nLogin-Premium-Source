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

public class NLoginCore_340 extends NLoginCore_353 {
   private static int as = -1073741821 >>> 222 | -1073741821 << ~222 + 1;
   private static int af = 1342177280 >>> 91 | 1342177280 << -91;
   private static int bn = Integer.reverse(0);
   private static int c = Integer.reverse(0);
   private static int ai = Integer.reverse(-805306368);
   private static int bw = (786432 >>> 239 | 786432 << -239) & -1;
   private static long bi = Long.reverse(-3636772752648416107L);
   private static long u = Long.reverse(-1042699367283010411L);
   private static long ba = Long.reverse(-3636772752648416107L);
   private static int bv = Integer.reverse(0);
   private static int r = Integer.reverse(536870912);
   private static long ao = Long.reverse(-1042699367283010411L);
   private static int co = Integer.reverse(-1207959552);
   private static int ca = (25 >>> 64 | 25 << ~64 + 1) & -1;
   private static long q = Long.reverse(4323455642275676160L);
   private static int j = 0 >>> 54 | 0 << ~54 + 1;
   private static int ce = -1 >>> 238 | -1 << ~238 + 1;
   private static int bl = Integer.reverse(-1476395008);
   private static int cm = Integer.reverse(0);
   private static int i = Integer.reverse(0);
   private static int x = -1073741823 >>> 222 | -1073741823 << -222;
   private static long be = Long.reverse(-3636772752648416107L);
   private static int cd = 54525952 >>> 117 | 54525952 << ~117 + 1;
   private static int cc = 0 >>> 20 | 0 << ~20 + 1;
   private static int aa = Integer.reverse(268435456);
   private static int cj = 0 >>> 36 | 0 << -36;
   private static long ay = Long.reverse(-1042699367283010411L);
   private static int bg = (0 >>> 182 | 0 << -182) & -1;
   private static long w = Long.reverse(-1042699367283010411L);
   private static long p = Long.reverse(-3636772752648416107L);
   private static long n = Long.reverse(4323455642275676160L);
   private static long e = Long.reverse(4323455642275676160L);
   private static String[] ZKM_STR_A = new String[NLoginCore_340.cn];
   private static long al = Long.reverse(-3636772752648416107L);
   private static long cb = Long.reverse(-1042699367283010411L);
   private static String[] ZKM_STR_B = new String[co];
   private static int au = Integer.reverse(134217728);
   private static int y = Integer.reverse(-1);
   private static long ab = Long.reverse(-3636772752648416107L);
   private static int bs = -1207959552 >>> 91 | -1207959552 << ~91 + 1;
   private static int bz = 0 >>> 90 | 0 << -90;
   private static int bc = Integer.reverse(0);
   private static int ck = 1792 >>> 230 | 1792 << ~230 + 1;
   private static long at = Long.reverse(-1042699367283010411L);
   private static int bo = Integer.reverse(1744830464);
   private static int ch = Integer.reverse(-671088640);
   private static long ci = Long.reverse(-1042699367283010411L);
   private static long s = Long.reverse(-1042699367283010411L);
   private static long m = Long.reverse(-3636772752648416107L);
   private static long d = Long.reverse(-3636772752648416107L);
   private static int bk = Integer.reverse(0);
   private static int an = Integer.reverse(-1342177280);
   private static long am = Long.reverse(4323455642275676160L);
   private static int bh = 327680 >>> 14 | 327680 << -14;
   private static int k = Integer.reverse(0);
   private static long ac = Long.reverse(4323455642275676160L);
   private static long ae = Long.reverse(-1042699367283010411L);
   private static long bf = Long.reverse(4323455642275676160L);
   private static long ah = Long.reverse(4323455642275676160L);
   private static long bj = Long.reverse(4323455642275676160L);
   private static long bb = Long.reverse(4323455642275676160L);
   private static int cg = (0 >>> 246 | 0 << ~246 + 1) & -1;
   private static long bm = Long.reverse(-1042699367283010411L);
   private static long ag = Long.reverse(-3636772752648416107L);
   private static int t = Integer.reverse(-1610612736);
   private static int ax = Integer.reverse(-2013265920);
   private static long cl = Long.reverse(-1042699367283010411L);
   private static int br = 0 >>> 3 | 0 << ~3 + 1;
   private static int ak = Integer.reverse(805306368);
   private static long ar = Long.reverse(-1042699367283010411L);
   private static long cf = Long.reverse(-1042699367283010411L);
   private static long aw = Long.reverse(4323455642275676160L);
   private static int ad = (288 >>> 37 | 288 << -37) & -1;
   private static long by = Long.reverse(4323455642275676160L);
   private static long bx = Long.reverse(-3636772752648416107L);
   private static int az = Integer.reverse(1207959552);
   private static int bd = (76 >>> 98 | 76 << -98) & -1;
   private static long z = Long.reverse(-1042699367283010411L);
   private static int v = 6144 >>> 170 | 6144 << -170;
   private static long av = Long.reverse(-3636772752648416107L);
   private static int cn = Integer.reverse(-1207959552);
   private static long bq = Long.reverse(4323455642275676160L);
   private static long bt = Long.reverse(-3636772752648416107L);
   private static int f = 131072 >>> 113 | 131072 << -113;
   private static int aq = (-1 >>> 194 | -1 << -194) & -1;
   private static int l = (4194304 >>> 149 | 4194304 << -149) & -1;
   private static long h = Long.reverse(4323455642275676160L);
   private static long bp = Long.reverse(-3636772752648416107L);
   private static long g = Long.reverse(-3636772752648416107L);
   private static int o = Integer.reverse(-1073741824);
   private static int ap = '\ue000' >>> '\f' | 57344 << -12;
   private static long bu = Long.reverse(4323455642275676160L);
   private static long c;
   private static long aj = Long.reverse(-1042699367283010411L);

   @Override
   public void b(NLoginInterface_042 var1, String[] var2) {
      if (var1 instanceof NLoginCore_277) {
         NLoginInterface_024 var3 = this.a.a().b((NLoginCore_277)var1).a();
         var3.a(a(l, m ^ n));
         var3.a(a(o, p ^ q));
         var3.c(a(r, s), a(t, u));
         var3.c(a(v, w), a(x & y, z));
         var3.a(a(aa, ab ^ ac));
         var3.a(a(ad, ae));
         var3.c(a(af, ag ^ ah), a(ai, aj));
         var3.c(a(ak, al ^ am), a(an, ao));
         var3.a(a(ap & aq, ar));
         if (this.a == NLoginCore_055.g) {
            var3.c(a(as, at), a(au, av ^ aw));
         }

         var3.a(a(ax, ay));
      } else {
         NLoginCore_150.a(var1, a(az, ba ^ bb));
         NLoginCore_150.a(var1, a(bd, be ^ bf));
         NLoginCore_150.a(var1, a(bh, bi ^ bj));
         NLoginCore_150.a(var1, a(bl, bm));
         NLoginCore_150.a(var1, a(bo, bp ^ bq));
         NLoginCore_150.a(var1, a(bs, bt ^ bu));
         NLoginCore_150.a(var1, a(bw, bx ^ by));
         NLoginCore_150.a(var1, a(ca, cb));
         NLoginCore_150.a(var1, a(cd & ce, cf));
         if (this.a == NLoginCore_055.g) {
            NLoginCore_150.a(var1, a(ch, ci));
         }

         NLoginCore_150.a(var1, a(ck, cl));
      }
   }

   public NLoginCore_340(NLoginType_008 var1) {
      super(var1, a(c, d ^ e), a(f, g ^ h), (i != 0), (j != 0));
   }

   private static void b() {
      c = -6257107691371896397L;
      long var0 = c ^ 8277913482860960968L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(16 + 52),
               (byte)(2 + 67),
               83,
               47,
               (byte)(58 + 9),
               (byte)(2 + 64),
               (byte)(19 + 48),
               (byte)(12 + 35),
               (byte)(77 + 3),
               (byte)(3 + 72),
               (byte)(12 + 55),
               (byte)(22 + 61),
               (byte)(24 + 29),
               (byte)(27 + 53),
               (byte)(86 + 11),
               (byte)(62 + 38),
               (byte)(77 + 23),
               (byte)(43 + 62),
               (byte)(63 + 47),
               (byte)(60 + 43)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(9 + 59), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_384.A("Ę÷ĈúČþģĔġāĄí", (byte)19, 65);
               ZKM_STR_B[1] = NLoginCore_453.C("ЧзТѨЩШјѠЯлрѣяюѓщѓєъюффст", (byte)19, 67);
               ZKM_STR_B[2] = NLoginCore_575.C("љшѕсџўеѩтЯѣж", (byte)19, 67);
               ZKM_STR_B[3] = NLoginCore_141.F("ԝՆՈՁԆԈԨԾԦՁՁՑԲԢՊԍՈԒ՛ՔԎԙԽԛԛՐՃՄԾԥ՞Ե", (byte)19, 70);
               ZKM_STR_B[4] = NLoginCore_110.B("×ĠĜáÿġĀĚÞôėĂùèĄþĆīīïăħĮĦġġĒęĒĖĻěĬĞŁėāĵĵıŅęĘĘāĥĹĢĎĻĎĈņīĘę", (byte)19, 66);
               ZKM_STR_B[5] = NLoginCore_387.F("ՅԦԶԽԇԆԦՏԐԙՒՂՐՒԔԔՋՈԳ՚ԭԜԭԝ\u0557ՍԼՠ՜ԶբԤ", (byte)19, 70);
               ZKM_STR_B[6] = NLoginCore_553.E("ԅՇԼԗՈԥԊԩԹ\u0530ԒԥՉՄ\u0557ՉՃԵԑՉԴՋԕԶՓՓ՛ԠԖԿ\u0557՚ՑՁ\u0557՚\u0558Ղԫ\u0558՟ՃԨէՀՁհ\u0530ԮՖլԴոԴՋԼԸԽՂդՠզռա", (byte)19, 69);
               ZKM_STR_B[7] = NLoginCore_076.C("ѤхѕќЦХхѮЯиѲћшыфѮыѹъявюѝѝѫоѫѯэнлѠ҇Ѱє҂҈є҅ф҂ѝџѿёѩҎѶҐѱѐҊѰҚѡѢ", (byte)19, 67);
               ZKM_STR_B[8] = NLoginCore_453.D("љшѕсџўеѩтЯѣж", (byte)19, 68);
               ZKM_STR_B[9] = NLoginCore_091.F("ՅԩԕԛԃԶՈԁՍԌՓԫ\u0530ՒԈԗՊՅԹԒԷԯԱԘՓԳՙԳԤՙԦԧՅՔԪԫԻԣԫԬՙԭդԷ", (byte)19, 70);
               ZKM_STR_B[10] = NLoginCore_127.C("ѦКхдъїУѠфЯѝуѥншсђтвѣѮѮыѴёѫпяюѭоѯѤѺѲцѕфҊѢћҀѦўѼѽяі҈҉ѭҘѻѭѾѳҗѬўѻҁҚҀҗҔҔғ҃ҞѦҠѮѫҁ҉Ѷ", (byte)19, 67);
               ZKM_STR_B[11] = NLoginCore_397.B("ěüČēÝÜüĥæïĩöĪùþĚëĐīûĝĝāñīòĂĆĔúĨöĈĈöĵÿĿþüĝĨĶč", (byte)19, 66);
               ZKM_STR_B[12] = NLoginCore_521.E("ՆӿԣԔԾԥՋԸԏԞԞՒՅՅԪՆԬ\u0557ԥԲԮՉՎԑԸ\u0558՞ԚԲԞԥՃԤ՛եԪԧդԪՌԾ՞՛ՁՐԫգկՊՕշԺՄԺ\u0558էաԺՌց\u0557ւռր", (byte)19, 69);
               ZKM_STR_B[13] = NLoginCore_092.B("ěüČēÝÜüĥæïĨĘĦĨêêġĞĉİăïĉċĕĬĘĔďĩļĈĮěÿüāĻĘľĔđĘč", (byte)19, 66);
               ZKM_STR_B[14] = NLoginCore_004.B("ĆÝÝĚĠî÷ĚĔĆġćàĖĕçĎĈèģĂĭĳāăĄĂĊĢĒĭįįĴĎĎĒúĽđėňĽěğēĩĹĞċĊŉőŁĘę", (byte)19, 66);
               ZKM_STR_B[15] = NLoginCore_076.B("ĞěýüþâúóĞĕĈĊÿĀģğįġČĞąĦĠăčĢĀĈđĨĄąėľùĺċčğĚĹĘļĪŉłĩĹĝĭİĿőŁĘę", (byte)19, 66);
               ZKM_STR_B[16] = NLoginCore_201.F("ՅԦԶԽԇԆԦՏԐԙՒՂՐՒԔԔՋՈԳ՚ԭԜԴԭԪԗՍԡՠՂՑԷ՛ՙԦՂՄՋՅՀեԿՎԷ", (byte)19, 70);
               ZKM_STR_B[17] = NLoginCore_427.C("љшѕсџўеѩтЯѣж", (byte)19, 67);
               ZKM_STR_B[18] = NLoginCore_127.C("љшѕсџўеѩтЯѣж", (byte)19, 67);
               ZKM_STR_B[19] = NLoginCore_183.E("ԝՆՈՁԆԈԨԾԦՁՁՑԲԢՊԍՈԒ՛ՔԎԙԽԛԛՐՃՄԾԥ՞Ե", (byte)19, 69);
               ZKM_STR_B[20] = NLoginCore_004.C("РѩѥЪшѪщѣЧнѠытбэчяѴѴиьѰѷѯѪѪћѢћџ҄ѤѵѧҊѠъѾѾѺҎѢѡѡъѮ҂ѫї҄їёҏѴѡѢ", (byte)19, 67);
               ZKM_STR_B[21] = NLoginCore_559.D("ФѦћжѧфЩшјябфѨѣѶѨѢєаѨѓѪдѕѲѲѺпеўѶѹѰѠѶѹѷѡъѷѾѢч҆џѠҏяэѵҋѓҗѓѪћїќѡ҃ѿ҅қҀ", (byte)19, 68);
               ZKM_STR_B[22] = NLoginCore_433.A("ĐÿČøĖĕìĠùæĚí", (byte)19, 65);
               ZKM_STR_B[23] = NLoginCore_183.E("ՅԩԕԛԃԶՈԁՍԌՓԫ\u0530ՒԈԗՊՅԹԒԷԯԱԘՓԳՙԳԤՙԦԧՅՔԪԫԻԣԫԬՙԭդԷ", (byte)19, 69);
               ZKM_STR_B[24] = NLoginCore_138.C("ѦКхдъїУѠфЯѝуѥншсђтвѣѮѮыѴёѫпяюѭоѯѤѺѲцѕфҊѢћҀѦўѼѽяі҈҉ѭҘѻѭѾѳҗѬўѻҁҚҀҗҔҔғ҃ҞѦҠѮѫҁ҉Ѷ", (byte)19, 67);
               ZKM_STR_B[25] = NLoginCore_138.C("ѥОтгѝфѪїЮннѱѤѤщѥыѶфёэѨѭаїѷѽйёнфѢуѺ҄щц҃щѫѝѽѺѠѯъ҂ҎѩѴҖљѣљѷ҆ҀљѫҠѶҡқҟ", (byte)19, 67);
               ZKM_STR_B[26] = NLoginCore_223.B("ĆÝÝĚĠî÷ĚĔĆġćàĖĕçĎĈèģĂĭĳāăĄĂĊĢĒĭįįĴĎĎĒúĽđėňĽěğēĩĹĞċĊŉőŁĘę", (byte)19, 66);
               ZKM_STR_B[27] = NLoginCore_091.A("ĞěýüþâúóĞĕĈĊÿĀģğįġČĞąĦĠăčĢĀĈđĨĄąėľùĺċčğĚĹĘļĪŉłĩĹĝĭİĿőŁĘę", (byte)19, 65);
               ZKM_STR_B[28] = NLoginCore_232.F("ԺԩԶԢՀԿԖՊԣԐՄԗ", (byte)19, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_201.E("ՆԡՉՊԈԘԉԦՆԈԐԲՌԑՐԒԘԖՎԕԨՋԢԣ", (byte)19, 69);
               ZKM_STR_B[1] = NLoginCore_223.D("ЧзТѨЩШјѠЯлрѩыѤпѮѓтеяѬѪст", (byte)19, 68);
               ZKM_STR_B[2] = NLoginCore_451.A("ëČüõĢāġðãßĚí", (byte)19, 65);
               ZKM_STR_B[3] = NLoginCore_397.A("óĜĞėÜÞþĔüėėħĈøĠãĞèıĪäåĝāïĠĔĄķĳĈĝ", (byte)19, 65);
               ZKM_STR_B[4] = NLoginCore_232.C("РѩѥЪшѪщѣЧнѠытбэчяѴѴиьѰѷѯѪѪћѢћџ҄ѤѵѧҊѠъѾѾѺҎѢѤђҊќҐ҂єґґѰ҄ҊѡѢ", (byte)19, 67);
               ZKM_STR_B[5] = NLoginCore_427.C("ѤхѕќЦХхѮЯиѱѡѯѱггѪѧђѹьѽѐьѨѠщєѢнтҀфуѡсѬшцџх҇ѝі", (byte)19, 67);
               ZKM_STR_B[6] = NLoginCore_575.C("ФѦћжѧфЩшјябфѨѣѶѨѢєаѨѓѪдѕѲѲѺпеўѶѹѰѠѶѹѷѡъѷѾѢч҆џѠҏяэѵҋѓҗќѲҗ҉ҠҀ҃ҙҡѵҙ", (byte)19, 67);
               ZKM_STR_B[7] = NLoginCore_173.A("ěüČēÝÜüĥæïĩĒÿĂûĥĂİāĆéąĔĔĢõĢĦĄôòėľħċĹĿċļûĹĔĖěüěīÿąŏČĮĲīĘę", (byte)19, 65);
               ZKM_STR_B[8] = NLoginCore_530.A("ēÞîĖøûóáġĐĖí", (byte)19, 65);
               ZKM_STR_B[9] = NLoginCore_241.C("ѤшдкТѕѧРѬЫѲъяѱЧжѩѤјбіюѐзѲђѸђуѸхцњііѧѤѫѺѮцѠюѫћѝѽғѦҘ҇Ҕ҈ѴѡѢ", (byte)19, 67);
               ZKM_STR_B[10] = NLoginCore_433.C("ѦКхдъїУѠфЯѝуѥншсђтвѣѮѮыѴёѫпяюѭоѯѤѺѲцѕфҊѢћҀѦўѼѽяі҈҉ѭҘѻѭѾѳҗѬўѻҁҚҀҗ҅Ѿқ҃҃҃ҁѮ҇҉ѺҞүѰҬұѵҳ҃ҤҩҔҁ҂", (byte)19, 67);
               ZKM_STR_B[11] = NLoginCore_004.F("ՅԦԶԽԇԆԦՏԐԙՓԠՔԣԨՄԕԺՕԥՇՇԫԛՕԜԬ\u0530ԾԤՒԠբՑԡՅՁլի՞կԩխաԳՇՀԲՀՆԳՎԵջՂՃ", (byte)19, 70);
               ZKM_STR_B[12] = NLoginCore_141.E("ՆӿԣԔԾԥՋԸԏԞԞՒՅՅԪՆԬ\u0557ԥԲԮՉՎԑԸ\u0558՞ԚԲԞԥՃԤ՛եԪԧդԪՌԾ՞՛ՁՐԫգկՊՕշԺՄԼ\u0557՜ցՙՑ՛բՁգ՝", (byte)19, 69);
               ZKM_STR_B[13] = NLoginCore_453.F("ՅԦԶԽԇԆԦՏԐԙՒՂՐՒԔԔՋՈԳ՚ԭԙԳԵԿՖՂԾԹՓզԲՉՄբժէԷԮաձԺԾեԦ՝Մ՟ճը\u0558լպիՂՃ", (byte)19, 70);
               ZKM_STR_B[14] = NLoginCore_471.C("яЦЦѣѩзрѣѝяѪѐЩџўаїёбѬыѶѼъьэыѓѫћѶѸѸѽїїћу҆њѠґ҄҆эўҔҋҁѯѮѪљѴѡѢ", (byte)19, 67);
               ZKM_STR_B[15] = NLoginCore_092.A("ĞěýüþâúóĞĕĈĊÿĀģğįġČĞąĦĠăčĢĀĈđĨĄąėľùĺċčğĚĹĘĺĴĘĚľľčĬćċœīĘę", (byte)19, 65);
               ZKM_STR_B[16] = NLoginCore_530.B("ěüČēÝÜüĥæïĨĘĦĨêêġĞĉİăòĊăĀíģ÷ĶĘħčĩĔČĊĻĞĵļğĤÿč", (byte)19, 66);
               ZKM_STR_B[17] = NLoginCore_453.D("сџидзлщлцуэж", (byte)19, 68);
               ZKM_STR_B[18] = NLoginCore_110.B("ÚĊúċùĐēāõĖĄí", (byte)19, 66);
               ZKM_STR_B[19] = NLoginCore_141.B("óĜĞėÜÞþĔüėėħĈøĠãĞèıĪäñčĒóıħįĄñĹĬ", (byte)19, 66);
               ZKM_STR_B[20] = NLoginCore_223.C("РѩѥЪшѪщѣЧнѠытбэчяѴѴиьѰѷѯѪѪћѢћџ҄ѤѵѧҊѠъѾѾѺҎѢѣҒѝџҖҔ҄҈Ѭ҈ѱҊѡѢ", (byte)19, 67);
               ZKM_STR_B[21] = NLoginCore_004.E("ԅՇԼԗՈԥԊԩԹ\u0530ԒԥՉՄ\u0557ՉՃԵԑՉԴՋԕԶՓՓ՛ԠԖԿ\u0557՚ՑՁ\u0557՚\u0558Ղԫ\u0558՟ՃԨէՀՁհ\u0530ԮՖլԴոջՉԽթ՟ԻվպաՄը", (byte)19, 69);
               ZKM_STR_B[22] = NLoginCore_453.C("тзріољѡѩЪщэж", (byte)19, 67);
               ZKM_STR_B[23] = NLoginCore_201.B("ěÿëñÙČĞ×ģâĩāĆĨÞíĠěďèčąćîĩĉįĉúįüýĜÿĬČĞĢĽņĕĔęąĺćĜŅąĸĞĥņīĘę", (byte)19, 66);
               ZKM_STR_B[24] = NLoginCore_127.F(
                  "ՇӻԦԕԫԸԄՁԥԐԾԤՆԞԩԢԳԣԓՄՏՏԬՕԲՌԠ\u0530ԯՎԟՐՅ՛ՓԧԶԥիՃԼաՇԿ՝՞\u0530ԷթժՎչ՜Վ՟ՔոՍԿ՜բջաոոՆ\u058bևՠ՛եթ՚ձՏժ֏Ցց\u0590լՓՕ֍ՙեբգ", (byte)19, 70
               );
               ZKM_STR_B[25] = NLoginCore_232.F("ՆӿԣԔԾԥՋԸԏԞԞՒՅՅԪՆԬ\u0557ԥԲԮՉՎԑԸ\u0558՞ԚԲԞԥՃԤ՛եԪԧդԪՌԾ՞՛ՁՐԫգկՊՕշԺՄԹպԷ\u0557ՖւգսԿԼՁ", (byte)19, 70);
               ZKM_STR_B[26] = NLoginCore_559.C("яЦЦѣѩзрѣѝяѪѐЩџўаїёбѬыѶѼъьэыѓѫћѶѸѸѽїїћу҆њѠґ҆ҋщҒѽґѸҐѳҘҔҚѡѢ", (byte)19, 67);
               ZKM_STR_B[27] = NLoginCore_138.F("ՈՅԧԦԨԌԤԝՈԿԲԴԩԪՍՉՙՋԶՈԯՐՊԭԷՌԪԲԻՒԮԯՁըԣդԵԷՉՄգՂզ՟ԳիԳՖիե\u0558նԶՅՂՃ", (byte)19, 70);
               ZKM_STR_B[28] = NLoginCore_446.A("ĘĞĐÞđÞďóüăĄí", (byte)19, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_575.B("ĚČĖëĐĕģĆþĆģüęùġĈäĘīĭûĉċđĮąĈĈĻăĩĕ", (byte)19, 66);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_446.E("ӿՈԂԥՍԪԡԌԯՆԪԗ", (byte)19, 69);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 60L;
      var1 ^= 8277913482860960968L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(39 + 29),
                     (byte)(15 + 54),
                     (byte)(82 + 1),
                     (byte)(40 + 7),
                     67,
                     (byte)(7 + 59),
                     67,
                     (byte)(25 + 22),
                     (byte)(67 + 13),
                     (byte)(50 + 25),
                     (byte)(31 + 36),
                     (byte)(2 + 81),
                     (byte)(18 + 35),
                     (byte)(4 + 76),
                     (byte)(59 + 38),
                     (byte)(46 + 54),
                     (byte)(85 + 15),
                     (byte)(42 + 63),
                     (byte)(104 + 6),
                     (byte)(32 + 71)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(13 + 55), (byte)(65 + 4), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_127.A("ŶƃƂŅƅƁżƅƐſŌƊƎƇƊƐŒӚӘӉӥһӏӅӋ", (byte)74, 65));
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

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_340.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_138.A("ƛƽƿƟǃǢǚǰǜƫǩǟǭǧưǕǷǶǮǴǮǃ", (byte)122, 65), NLoginCore_340.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_232.D("ֆ֓֒Օ֑֕\u058c֕֠֏՜֚֚֞֗֠բ࣪ࣨࣙࣵ࣋ࣟࣕࣛն", (byte)122, 68) + var1 + NLoginCore_453.F("հ", (byte)122, 70) + var2.toString(), var4
         );
      }
   }
}
